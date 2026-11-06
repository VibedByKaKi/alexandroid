package org.apache.http.impl.auth;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class HttpEntityDigester extends OutputStream {
    private boolean closed;
    private byte[] digest;
    private final MessageDigest digester;

    public HttpEntityDigester(MessageDigest messageDigest) {
        this.digester = messageDigest;
        messageDigest.reset();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.digest = this.digester.digest();
        super.close();
    }

    public byte[] getDigest() {
        return this.digest;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Stream has been already closed");
        } else {
            this.digester.update((byte) i);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.closed) {
            this.digester.update(bArr, i, i2);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Stream has been already closed");
        }
    }
}
