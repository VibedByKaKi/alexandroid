package org.apache.commons.net.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class CRLFLineReader extends BufferedReader {
    private static final char CR = '\r';
    private static final char LF = '\n';

    public CRLFLineReader(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z = false;
            while (true) {
                try {
                    int read = read();
                    if (read == -1) {
                        String sb2 = sb.toString();
                        if (sb2.isEmpty()) {
                            return null;
                        }
                        return sb2;
                    }
                    if (z && read == 10) {
                        return sb.substring(0, sb.length() - 1);
                    }
                    z = read == 13;
                    sb.append((char) read);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
