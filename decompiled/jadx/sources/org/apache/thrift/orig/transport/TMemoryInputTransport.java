package org.apache.thrift.orig.transport;

import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TMemoryInputTransport extends TEndpointTransport {
    private byte[] buf_;
    private int endPos_;
    private int pos_;

    public TMemoryInputTransport(TConfiguration tConfiguration, byte[] bArr, int i, int i2) throws TTransportException {
        super(tConfiguration);
        reset(bArr, i, i2);
        updateKnownMessageSize(i2);
    }

    public void clear() {
        this.buf_ = null;
        try {
            resetConsumedMessageSize(-1L);
        } catch (TTransportException unused) {
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void consumeBuffer(int i) {
        this.pos_ += i;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public byte[] getBuffer() {
        return this.buf_;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int getBufferPosition() {
        return this.pos_;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int getBytesRemainingInBuffer() {
        return this.endPos_ - this.pos_;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        int bytesRemainingInBuffer = getBytesRemainingInBuffer();
        if (i2 > bytesRemainingInBuffer) {
            i2 = bytesRemainingInBuffer;
        }
        if (i2 > 0) {
            System.arraycopy(this.buf_, this.pos_, bArr, i, i2);
            consumeBuffer(i2);
            countConsumedMessageBytes(i2);
        }
        return i2;
    }

    public void reset(byte[] bArr, int i, int i2) {
        this.buf_ = bArr;
        this.pos_ = i;
        this.endPos_ = i + i2;
        try {
            resetConsumedMessageSize(-1L);
        } catch (TTransportException unused) {
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public TMemoryInputTransport(TConfiguration tConfiguration) throws TTransportException {
        this(tConfiguration, new byte[0]);
    }

    public TMemoryInputTransport(byte[] bArr) throws TTransportException {
        this(new TConfiguration(), bArr);
    }

    public TMemoryInputTransport(TConfiguration tConfiguration, byte[] bArr) throws TTransportException {
        this(tConfiguration, bArr, 0, bArr.length);
    }

    public void reset(byte[] bArr) {
        reset(bArr, 0, bArr.length);
    }

    public TMemoryInputTransport(byte[] bArr, int i, int i2) throws TTransportException {
        this(new TConfiguration(), bArr, i, i2);
    }

    public TMemoryInputTransport() throws TTransportException {
        this(new TConfiguration());
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
    }
}
