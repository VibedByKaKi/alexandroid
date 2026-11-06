package org.apache.thrift.orig.transport;

import java.nio.charset.Charset;
import org.apache.thrift.orig.TByteArrayOutputStream;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TMemoryBuffer extends TEndpointTransport {
    private TByteArrayOutputStream arr_;
    private int pos_;

    public TMemoryBuffer(int i) throws TTransportException {
        super(new TConfiguration());
        this.arr_ = new TByteArrayOutputStream(i);
        updateKnownMessageSize(i);
    }

    public byte[] getArray() {
        return this.arr_.get();
    }

    public String inspect() {
        StringBuilder sb = new StringBuilder();
        byte[] byteArray = this.arr_.toByteArray();
        int i = 0;
        while (i < byteArray.length) {
            sb.append(this.pos_ == i ? "==>" : "");
            sb.append(Integer.toHexString(byteArray[i] & 255));
            sb.append(" ");
            i++;
        }
        return sb.toString();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    public int length() {
        return this.arr_.size();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        checkReadBytesAvailable(i2);
        byte[] bArr2 = this.arr_.get();
        if (i2 > this.arr_.len() - this.pos_) {
            i2 = this.arr_.len() - this.pos_;
        }
        if (i2 > 0) {
            System.arraycopy(bArr2, this.pos_, bArr, i, i2);
            this.pos_ += i2;
        }
        return i2;
    }

    public String toString(Charset charset) {
        return this.arr_.toString(charset);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) {
        this.arr_.write(bArr, i, i2);
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() {
    }

    public TMemoryBuffer(TConfiguration tConfiguration, int i) throws TTransportException {
        super(tConfiguration);
        this.arr_ = new TByteArrayOutputStream(i);
        updateKnownMessageSize(i);
    }
}
