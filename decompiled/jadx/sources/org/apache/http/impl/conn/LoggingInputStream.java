package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class LoggingInputStream extends InputStream {
    private final InputStream in;
    private final Wire wire;

    public LoggingInputStream(InputStream inputStream, Wire wire) {
        this.in = inputStream;
        this.wire = wire;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.in.available();
        } catch (IOException e) {
            this.wire.input("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.in.close();
        } catch (IOException e) {
            this.wire.input("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        super.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.in.read(bArr);
            if (read == -1) {
                this.wire.input("end of stream");
                return read;
            }
            if (read > 0) {
                this.wire.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            this.wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        super.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            this.wire.input("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.in.read();
            Wire wire = this.wire;
            if (read == -1) {
                wire.input("end of stream");
                return read;
            }
            wire.input(read);
            return read;
        } catch (IOException e) {
            this.wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.in.read(bArr, i, i2);
            if (read == -1) {
                this.wire.input("end of stream");
                return read;
            }
            if (read > 0) {
                this.wire.input(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            this.wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
