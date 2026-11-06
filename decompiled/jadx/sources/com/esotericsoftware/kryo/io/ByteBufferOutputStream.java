package com.esotericsoftware.kryo.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ByteBufferOutputStream extends OutputStream {
    private ByteBuffer byteBuffer;

    public ByteBufferOutputStream(int i) {
        this(ByteBuffer.allocate(i));
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!this.byteBuffer.hasRemaining()) {
            flush();
        }
        this.byteBuffer.put((byte) i);
    }

    public ByteBufferOutputStream() {
    }

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.byteBuffer.remaining() < i2) {
            flush();
        }
        this.byteBuffer.put(bArr, i, i2);
    }
}
