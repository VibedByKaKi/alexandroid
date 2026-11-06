package org.apache.thrift.orig.transport;

import org.apache.thrift.orig.TConfiguration;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class AutoExpandingBufferWriteTransport extends TEndpointTransport {
    private final AutoExpandingBuffer buf;
    private int pos;
    private int res;

    public AutoExpandingBufferWriteTransport(TConfiguration tConfiguration, int i, int i2) throws TTransportException {
        super(tConfiguration);
        if (i < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("initialCapacity");
            throw null;
        }
        if (i2 < 0 || i < i2) {
            Single$$ExternalSyntheticBUOutline0.m$3("frontReserve");
            throw null;
        }
        this.buf = new AutoExpandingBuffer(i);
        this.pos = i2;
        this.res = i2;
    }

    public AutoExpandingBuffer getBuf() {
        return this.buf;
    }

    public int getLength() {
        return this.pos;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        throw new UnsupportedOperationException();
    }

    public void reset() {
        this.pos = this.res;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        this.buf.resizeIfNecessary(this.pos + i2);
        System.arraycopy(bArr, i, this.buf.array(), this.pos, i2);
        this.pos += i2;
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
    }
}
