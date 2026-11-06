package org.apache.thrift.orig.transport.sasl;

import java.nio.ByteBuffer;
import org.apache.thrift.orig.transport.TTransport;
import org.apache.thrift.orig.transport.TTransportException;
import org.apache.thrift.orig.utils.StringUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class FixedSizeHeaderReader implements FrameHeaderReader {
    protected final ByteBuffer byteBuffer = ByteBuffer.allocate(headerSize());

    @Override // org.apache.thrift.orig.transport.sasl.FrameHeaderReader
    public void clear() {
        this.byteBuffer.clear();
    }

    public abstract int headerSize();

    @Override // org.apache.thrift.orig.transport.sasl.FrameHeaderReader
    public boolean isComplete() {
        return !this.byteBuffer.hasRemaining();
    }

    public abstract void onComplete() throws TTransportException;

    @Override // org.apache.thrift.orig.transport.sasl.FrameHeaderReader
    public boolean read(TTransport tTransport) throws TTransportException {
        FrameReader.readAvailable(tTransport, this.byteBuffer);
        if (this.byteBuffer.hasRemaining()) {
            return false;
        }
        onComplete();
        return true;
    }

    @Override // org.apache.thrift.orig.transport.sasl.FrameHeaderReader
    public byte[] toBytes() {
        boolean isComplete = isComplete();
        ByteBuffer byteBuffer = this.byteBuffer;
        if (isComplete) {
            return byteBuffer.array();
        }
        Single$$ExternalSyntheticBUOutline0.m(StringUtils.bytesToHexString(byteBuffer.array(), 0, this.byteBuffer.position()), "Header is not yet complete ");
        return null;
    }
}
