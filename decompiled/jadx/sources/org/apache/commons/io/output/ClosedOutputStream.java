package org.apache.commons.io.output;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ClosedOutputStream extends OutputStream {
    public static final ClosedOutputStream CLOSED_OUTPUT_STREAM = new ClosedOutputStream();

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        throw new IOException(a$$ExternalSyntheticOutline0.m(i, "write(", ") failed: stream is closed"));
    }
}
