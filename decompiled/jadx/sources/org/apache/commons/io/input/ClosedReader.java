package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ClosedReader extends Reader {
    public static final ClosedReader CLOSED_READER = new ClosedReader();

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        return -1;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
