package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ContentLengthOutputStream extends OutputStream {
    private boolean closed;
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        this.out = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.contentLength = Args.notNegative(j, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.out.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Attempted write to closed stream.");
            return;
        }
        long j = this.total;
        long j2 = this.contentLength;
        if (j < j2) {
            long j3 = j2 - j;
            if (i2 > j3) {
                i2 = (int) j3;
            }
            this.out.write(bArr, i, i2);
            this.total += i2;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            this.out.write(i);
            this.total++;
        }
    }
}
