package org.apache.thrift.orig.transport.layered;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.thrift.orig.TByteArrayOutputStream;
import org.apache.thrift.orig.TConfiguration;
import org.apache.thrift.orig.transport.TMemoryInputTransport;
import org.apache.thrift.orig.transport.TTransport;
import org.apache.thrift.orig.transport.TTransportException;
import org.apache.thrift.orig.transport.TTransportFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TFramedTransport extends TLayeredTransport {
    private static final byte[] sizeFiller_ = {0, 0, 0, 0};
    private final byte[] i32buf;
    private final TMemoryInputTransport readBuffer_;
    private final TByteArrayOutputStream writeBuffer_;

    public TFramedTransport(TTransport tTransport, int i) throws TTransportException {
        super(tTransport);
        TByteArrayOutputStream tByteArrayOutputStream = new TByteArrayOutputStream(1024);
        this.writeBuffer_ = tByteArrayOutputStream;
        this.i32buf = new byte[4];
        TConfiguration tConfiguration = tTransport.getConfiguration() == null ? new TConfiguration() : tTransport.getConfiguration();
        tConfiguration.setMaxFrameSize(i);
        tByteArrayOutputStream.write(sizeFiller_, 0, 4);
        this.readBuffer_ = new TMemoryInputTransport(tConfiguration, new byte[0]);
    }

    public static int decodeFrameSize(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static void encodeFrameSize(int i, byte[] bArr) {
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
    }

    private void readFrame() throws TTransportException {
        getInnerTransport().readAll(this.i32buf, 0, 4);
        int decodeFrameSize = decodeFrameSize(this.i32buf);
        if (decodeFrameSize < 0) {
            close();
            throw new TTransportException(5, a$$ExternalSyntheticOutline0.m(decodeFrameSize, "Read a negative frame size (", ")!"));
        }
        if (decodeFrameSize <= getInnerTransport().getConfiguration().getMaxFrameSize()) {
            byte[] bArr = new byte[decodeFrameSize];
            getInnerTransport().readAll(bArr, 0, decodeFrameSize);
            this.readBuffer_.reset(bArr);
        } else {
            close();
            StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(decodeFrameSize, "Frame size (", ") larger than max length (");
            m0m.append(getInnerTransport().getConfiguration().getMaxFrameSize());
            m0m.append(")!");
            throw new TTransportException(5, m0m.toString());
        }
    }

    public void clear() {
        this.readBuffer_.clear();
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getInnerTransport().close();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void consumeBuffer(int i) {
        this.readBuffer_.consumeBuffer(i);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void flush() throws TTransportException {
        byte[] bArr = this.writeBuffer_.get();
        int len = this.writeBuffer_.len();
        this.writeBuffer_.reset();
        this.writeBuffer_.write(sizeFiller_, 0, 4);
        encodeFrameSize(len - 4, bArr);
        getInnerTransport().write(bArr, 0, len);
        getInnerTransport().flush();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public byte[] getBuffer() {
        return this.readBuffer_.getBuffer();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int getBufferPosition() {
        return this.readBuffer_.getBufferPosition();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int getBytesRemainingInBuffer() {
        return this.readBuffer_.getBytesRemainingInBuffer();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return getInnerTransport().isOpen();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
        getInnerTransport().open();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        int read = this.readBuffer_.read(bArr, i, i2);
        if (read > 0) {
            return read;
        }
        readFrame();
        return this.readBuffer_.read(bArr, i, i2);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        this.writeBuffer_.write(bArr, i, i2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Factory extends TTransportFactory {
        private final int maxLength_;

        public Factory() {
            this.maxLength_ = TConfiguration.DEFAULT_MAX_FRAME_SIZE;
        }

        @Override // org.apache.thrift.orig.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) throws TTransportException {
            return new TFramedTransport(tTransport, this.maxLength_);
        }

        public Factory(int i) {
            this.maxLength_ = i;
        }
    }

    public TFramedTransport(TTransport tTransport) throws TTransportException {
        this(tTransport, TConfiguration.DEFAULT_MAX_FRAME_SIZE);
    }
}
