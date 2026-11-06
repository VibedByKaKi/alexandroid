package org.eclipse.paho.client.mqttv3.internal.websocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class WebSocketHandshake {
    private static final String ACCEPT_SALT = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private static final String EMPTY = "";
    private static final String HTTP_HEADER_CONNECTION = "connection";
    private static final String HTTP_HEADER_CONNECTION_VALUE = "upgrade";
    private static final String HTTP_HEADER_SEC_WEBSOCKET_ACCEPT = "sec-websocket-accept";
    private static final String HTTP_HEADER_SEC_WEBSOCKET_PROTOCOL = "sec-websocket-protocol";
    private static final String HTTP_HEADER_UPGRADE = "upgrade";
    private static final String HTTP_HEADER_UPGRADE_WEBSOCKET = "websocket";
    private static final String LINE_SEPARATOR = "\r\n";
    private static final String SHA1_PROTOCOL = "SHA1";
    Properties customWebSocketHeaders;
    String host;
    InputStream input;
    OutputStream output;
    int port;
    String uri;

    public WebSocketHandshake(InputStream inputStream, OutputStream outputStream, String str, String str2, int i, Properties properties) {
        this.input = inputStream;
        this.output = outputStream;
        this.uri = str;
        this.host = str2;
        this.port = i;
        this.customWebSocketHeaders = properties;
    }

    private Map<String, String> getHeaders(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i < arrayList.size(); i++) {
            String[] split = arrayList.get(i).split(":");
            hashMap.put(split[0].toLowerCase(), split[1]);
        }
        return hashMap;
    }

    private void receiveHandshakeResponse(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.input));
        ArrayList<String> arrayList = new ArrayList<>();
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("WebSocket Response header: Invalid response from Server, It may not support WebSockets.");
            return;
        }
        while (!readLine.equals("")) {
            arrayList.add(readLine);
            readLine = bufferedReader.readLine();
        }
        Map<String, String> headers = getHeaders(arrayList);
        String str2 = headers.get(HTTP_HEADER_CONNECTION);
        if (str2 == null || str2.equalsIgnoreCase("upgrade")) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("WebSocket Response header: Incorrect connection header");
            return;
        }
        String str3 = headers.get("upgrade");
        if (str3 == null || !str3.toLowerCase().contains(HTTP_HEADER_UPGRADE_WEBSOCKET)) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("WebSocket Response header: Incorrect upgrade.");
            return;
        }
        if (headers.get(HTTP_HEADER_SEC_WEBSOCKET_PROTOCOL) == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("WebSocket Response header: empty sec-websocket-protocol");
            return;
        }
        if (!headers.containsKey(HTTP_HEADER_SEC_WEBSOCKET_ACCEPT)) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("WebSocket Response header: Missing Sec-WebSocket-Accept");
            return;
        }
        try {
            verifyWebSocketKey(str, headers.get(HTTP_HEADER_SEC_WEBSOCKET_ACCEPT));
        } catch (NoSuchAlgorithmException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
        } catch (HandshakeFailedException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("WebSocket Response header: Incorrect Sec-WebSocket-Key");
        }
    }

    private void sendHandshakeRequest(String str) throws IOException {
        try {
            String str2 = "/mqtt";
            URI uri = new URI(this.uri);
            if (uri.getRawPath() != null && !uri.getRawPath().isEmpty()) {
                str2 = uri.getRawPath();
                if (uri.getRawQuery() != null && !uri.getRawQuery().isEmpty()) {
                    str2 = String.valueOf(str2) + "?" + uri.getRawQuery();
                }
            }
            PrintWriter printWriter = new PrintWriter(this.output);
            printWriter.print("GET " + str2 + " HTTP/1.1\r\n");
            if (this.port != 80) {
                printWriter.print("Host: " + this.host + ":" + this.port + "\r\n");
            } else {
                printWriter.print("Host: " + this.host + "\r\n");
            }
            printWriter.print("Upgrade: websocket\r\n");
            printWriter.print("Connection: Upgrade\r\n");
            printWriter.print("Sec-WebSocket-Key: " + str + "\r\n");
            printWriter.print("Sec-WebSocket-Protocol: mqtt\r\n");
            printWriter.print("Sec-WebSocket-Version: 13\r\n");
            Properties properties = this.customWebSocketHeaders;
            if (properties != null) {
                for (String str3 : properties.keySet()) {
                    printWriter.print(String.valueOf(str3) + ": " + this.customWebSocketHeaders.getProperty(str3) + "\r\n");
                }
            }
            String userInfo = uri.getUserInfo();
            if (userInfo != null) {
                printWriter.print("Authorization: Basic " + Base64.encode(userInfo) + "\r\n");
            }
            printWriter.print("\r\n");
            printWriter.flush();
        } catch (URISyntaxException e) {
            Single$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
        }
    }

    private byte[] sha1(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(SHA1_PROTOCOL).digest(str.getBytes());
    }

    private void verifyWebSocketKey(String str, String str2) throws NoSuchAlgorithmException, HandshakeFailedException {
        if (!Base64.encodeBytes(sha1(String.valueOf(str).concat("258EAFA5-E914-47DA-95CA-C5AB0DC85B11"))).trim().equals(str2.trim())) {
            throw new HandshakeFailedException();
        }
    }

    public void execute() throws IOException {
        byte[] bArr = new byte[16];
        System.arraycopy(UUID.randomUUID().toString().getBytes(), 0, bArr, 0, 16);
        String encodeBytes = Base64.encodeBytes(bArr);
        sendHandshakeRequest(encodeBytes);
        receiveHandshakeResponse(encodeBytes);
    }
}
