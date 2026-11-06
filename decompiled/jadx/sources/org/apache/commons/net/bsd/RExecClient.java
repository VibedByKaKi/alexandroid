package org.apache.commons.net.bsd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.SocketInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RExecClient extends SocketClient {
    public static final int DEFAULT_PORT = 512;
    protected static final char NULL_CHAR = 0;
    protected InputStream _errorStream_ = null;
    private boolean remoteVerificationEnabled;

    public RExecClient() {
        setDefaultPort(512);
    }

    public InputStream createErrorStream() throws IOException {
        ServerSocket createServerSocket = this._serverSocketFactory_.createServerSocket(0, 1, getLocalAddress());
        this._output_.write(Integer.toString(createServerSocket.getLocalPort()).getBytes(StandardCharsets.UTF_8));
        this._output_.write(0);
        this._output_.flush();
        Socket accept = createServerSocket.accept();
        createServerSocket.close();
        if (!this.remoteVerificationEnabled || verifyRemote(accept)) {
            return new SocketInputStream(accept, accept.getInputStream());
        }
        accept.close();
        Path$$ExternalSyntheticBUOutline0.m((Object) accept.getInetAddress().getHostAddress(), "Security violation: unexpected connection attempt by ");
        return null;
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        InputStream inputStream = this._errorStream_;
        if (inputStream != null) {
            inputStream.close();
        }
        this._errorStream_ = null;
        super.disconnect();
    }

    public InputStream getErrorStream() {
        return this._errorStream_;
    }

    public InputStream getInputStream() {
        return this._input_;
    }

    public OutputStream getOutputStream() {
        return this._output_;
    }

    public final boolean isRemoteVerificationEnabled() {
        return this.remoteVerificationEnabled;
    }

    public void rexec(String str, String str2, String str3, boolean z) throws IOException {
        if (z) {
            this._errorStream_ = createErrorStream();
        } else {
            this._output_.write(0);
        }
        this._output_.write(str.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.write(str2.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.write(str3.getBytes(getCharset()));
        this._output_.write(0);
        this._output_.flush();
        int read = this._input_.read();
        if (read <= 0) {
            if (read >= 0) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$2("Server closed connection.");
        } else {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read2 = this._input_.read();
                if (read2 == -1 || read2 == 10) {
                    break;
                } else {
                    sb.append((char) read2);
                }
            }
            throw new IOException(sb.toString());
        }
    }

    public final void setRemoteVerificationEnabled(boolean z) {
        this.remoteVerificationEnabled = z;
    }

    public void rexec(String str, String str2, String str3) throws IOException {
        rexec(str, str2, str3, false);
    }
}
