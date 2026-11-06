package com.amazon.coral.model.xml;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SourceReader extends Reader {
    private final Reader reader;
    private final String source;

    public SourceReader(String str, Reader reader) {
        if (str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (reader == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.source = str;
        this.reader = reader;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    public String getSource() {
        return this.source;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        this.reader.mark(i);
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.reader.markSupported();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        return this.reader.read(charBuffer);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        return this.reader.ready();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.reader.reset();
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        return this.reader.skip(j);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        return this.reader.read();
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return this.reader.read(cArr);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return this.reader.read(cArr, i, i2);
    }
}
