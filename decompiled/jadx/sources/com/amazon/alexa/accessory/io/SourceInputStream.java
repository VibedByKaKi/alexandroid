package com.amazon.alexa.accessory.io;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SourceInputStream extends InputStream {
    private final byte[] single;
    private final Source source;

    public SourceInputStream(Source source) {
        Preconditions.notNull(source, "source");
        this.source = source;
        this.single = new byte[1];
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        Source source = this.source;
        if (source instanceof SizedSource) {
            return ((SizedSource) source).size();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = read(this.single);
        return read < 0 ? read : this.single[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.source.read(bArr, i, i2);
    }
}
