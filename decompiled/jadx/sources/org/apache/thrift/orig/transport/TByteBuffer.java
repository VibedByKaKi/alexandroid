package org.apache.thrift.orig.transport;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TByteBuffer extends TEndpointTransport {
    private final ByteBuffer byteBuffer;

    public TByteBuffer(TConfiguration tConfiguration, ByteBuffer byteBuffer) throws TTransportException {
        super(tConfiguration);
        this.byteBuffer = byteBuffer;
        updateKnownMessageSize(byteBuffer.capacity());
    }

    public TByteBuffer clear() {
        this.byteBuffer.clear();
        return this;
    }

    public TByteBuffer flip() {
        this.byteBuffer.flip();
        return this;
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        checkReadBytesAvailable(i2);
        int min = Math.min(this.byteBuffer.remaining(), i2);
        if (min <= 0) {
            return min;
        }
        try {
            this.byteBuffer.get(bArr, i, min);
            return min;
        } catch (BufferUnderflowException e) {
            throw new TTransportException("Unexpected end of input buffer", e);
        }
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[this.byteBuffer.remaining()];
        this.byteBuffer.slice().get(bArr);
        return bArr;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        try {
            this.byteBuffer.put(bArr, i, i2);
        } catch (BufferOverflowException e) {
            throw new TTransportException("Not enough room in output buffer", e);
        }
    }

    public TByteBuffer(ByteBuffer byteBuffer) throws TTransportException {
        this(new TConfiguration(), byteBuffer);
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() {
    }
}
