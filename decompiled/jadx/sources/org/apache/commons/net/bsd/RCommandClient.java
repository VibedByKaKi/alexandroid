package org.apache.commons.net.bsd;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.net.io.SocketInputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RCommandClient extends RExecClient {
    public static final int DEFAULT_PORT = 514;
    public static final int MAX_CLIENT_PORT = 1023;
    public static final int MIN_CLIENT_PORT = 512;

    public RCommandClient() {
        setDefaultPort(DEFAULT_PORT);
    }

    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2) throws SocketException, BindException, IOException {
        int i2 = 1023;
        while (i2 >= 512) {
            try {
                this._socket_ = this._socketFactory_.createSocket(inetAddress, i, inetAddress2, i2);
                break;
            } catch (SocketException unused) {
                i2--;
            }
        }
        if (i2 < 512) {
            throw new BindException("All ports in use or insufficient permssion.");
        }
        _connectAction_();
    }

    @Override // org.apache.commons.net.bsd.RExecClient
    public InputStream createErrorStream() throws IOException {
        ServerSocket serverSocket;
        int i = 1023;
        while (true) {
            if (i < 512) {
                serverSocket = null;
                break;
            }
            try {
                serverSocket = this._serverSocketFactory_.createServerSocket(i, 1, getLocalAddress());
                break;
            } catch (SocketException unused) {
                i--;
            }
        }
        if (serverSocket == null) {
            throw new BindException("All ports in use.");
        }
        this._output_.write(Integer.toString(serverSocket.getLocalPort()).getBytes(StandardCharsets.UTF_8));
        this._output_.write(0);
        this._output_.flush();
        Socket accept = serverSocket.accept();
        serverSocket.close();
        if (!isRemoteVerificationEnabled() || verifyRemote(accept)) {
            return new SocketInputStream(accept, accept.getInputStream());
        }
        accept.close();
        Path$$ExternalSyntheticBUOutline0.m((Object) accept.getInetAddress().getHostAddress(), "Security violation: unexpected connection attempt by ");
        return null;
    }

    public void rcommand(String str, String str2, String str3) throws IOException {
        rcommand(str, str2, str3, false);
    }

    public void rcommand(String str, String str2, String str3, boolean z) throws IOException {
        rexec(str, str2, str3, z);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i) throws SocketException, IOException {
        connect(inetAddress, i, InetAddress.getLocalHost());
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i) throws SocketException, IOException, UnknownHostException {
        connect(InetAddress.getByName(str), i, InetAddress.getLocalHost());
    }

    public void connect(String str, int i, InetAddress inetAddress) throws SocketException, IOException {
        connect(InetAddress.getByName(str), i, inetAddress);
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException, IOException, IllegalArgumentException {
        if (i2 >= 512 && i2 <= 1023) {
            super.connect(inetAddress, i, inetAddress2, i2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Invalid port number "));
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public void connect(String str, int i, InetAddress inetAddress, int i2) throws SocketException, IOException, IllegalArgumentException, UnknownHostException {
        if (i2 >= 512 && i2 <= 1023) {
            super.connect(str, i, inetAddress, i2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Invalid port number "));
        }
    }
}
