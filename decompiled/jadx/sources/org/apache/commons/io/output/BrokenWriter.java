package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class BrokenWriter extends Writer {
    private final IOException exception;

    public BrokenWriter() {
        this(new IOException("Broken writer"));
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        throw this.exception;
    }

    public BrokenWriter(IOException iOException) {
        this.exception = iOException;
    }
}
