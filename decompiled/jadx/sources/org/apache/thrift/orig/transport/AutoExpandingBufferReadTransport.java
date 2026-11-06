package org.apache.thrift.orig.transport;

import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AutoExpandingBufferReadTransport extends TEndpointTransport {
    private final AutoExpandingBuffer buf;
    private int limit;
    private int pos;

    public AutoExpandingBufferReadTransport(TConfiguration tConfiguration, int i) throws TTransportException {
        super(tConfiguration);
        this.pos = 0;
        this.limit = 0;
        this.buf = new AutoExpandingBuffer(i);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public final void consumeBuffer(int i) {
        this.pos += i;
    }

    public void fill(TTransport tTransport, int i) throws TTransportException {
        this.buf.resizeIfNecessary(i);
        tTransport.readAll(this.buf.array(), 0, i);
        this.pos = 0;
        this.limit = i;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public final byte[] getBuffer() {
        return this.buf.array();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public final int getBufferPosition() {
        return this.pos;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public final int getBytesRemainingInBuffer() {
        return this.limit - this.pos;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public final int read(byte[] bArr, int i, int i2) throws TTransportException {
        int min = Math.min(i2, getBytesRemainingInBuffer());
        if (min > 0) {
            System.arraycopy(this.buf.array(), this.pos, bArr, i, min);
            consumeBuffer(min);
        }
        return min;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
    }
}
