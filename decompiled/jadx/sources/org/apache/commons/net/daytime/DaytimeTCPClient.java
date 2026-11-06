package org.apache.commons.net.daytime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class DaytimeTCPClient extends SocketClient {
    public static final int DEFAULT_PORT = 13;
    private final char[] buffer = new char[64];

    public DaytimeTCPClient() {
        setDefaultPort(13);
    }

    public String getTime() throws IOException {
        StringBuilder sb = new StringBuilder(this.buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this._input_, getCharset()));
        while (true) {
            char[] cArr = this.buffer;
            int read = bufferedReader.read(cArr, 0, cArr.length);
            if (read <= 0) {
                return sb.toString();
            }
            sb.append(this.buffer, 0, read);
        }
    }
}
