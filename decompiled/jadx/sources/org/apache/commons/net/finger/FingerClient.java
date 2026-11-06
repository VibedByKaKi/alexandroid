package org.apache.commons.net.finger;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.util.Charsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FingerClient extends SocketClient {
    public static final int DEFAULT_PORT = 79;
    private static final String LONG_FLAG = "/W ";
    private final transient char[] buffer = new char[1024];

    public FingerClient() {
        setDefaultPort(79);
    }

    public InputStream getInputStream(boolean z, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(64);
        if (z) {
            sb.append(LONG_FLAG);
        }
        byte[] bytes = a$$ExternalSyntheticOutline0.m(sb, str, "\r\n").getBytes(Charsets.toCharset(str2).name());
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this._output_, 1024));
        dataOutputStream.write(bytes, 0, bytes.length);
        dataOutputStream.flush();
        return this._input_;
    }

    public String query(boolean z, String str) throws IOException {
        StringBuilder sb = new StringBuilder(this.buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getInputStream(z, str), getCharset()));
        while (true) {
            try {
                char[] cArr = this.buffer;
                int read = bufferedReader.read(cArr, 0, cArr.length);
                if (read <= 0) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(this.buffer, 0, read);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public InputStream getInputStream(boolean z, String str) throws IOException {
        return getInputStream(z, str, null);
    }

    public InputStream getInputStream(boolean z) throws IOException {
        return getInputStream(z, "");
    }

    public String query(boolean z) throws IOException {
        return query(z, "");
    }
}
