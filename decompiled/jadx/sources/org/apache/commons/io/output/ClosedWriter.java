package org.apache.commons.io.output;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ClosedWriter extends Writer {
    public static final ClosedWriter CLOSED_WRITER = new ClosedWriter();

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        StringBuilder sb = new StringBuilder("write(");
        sb.append(new String(cArr));
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        throw new IOException(a$$ExternalSyntheticOutline0.m(sb, i2, ") failed: stream is closed"));
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
