package org.apache.thrift.orig.transport.sasl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DataFrameHeaderReader extends FixedSizeHeaderReader {
    public static final int PAYLOAD_LENGTH_BYTES = 4;
    private int payloadSize;

    @Override // org.apache.thrift.orig.transport.sasl.FixedSizeHeaderReader
    public int headerSize() {
        return 4;
    }

    @Override // org.apache.thrift.orig.transport.sasl.FixedSizeHeaderReader
    public void onComplete() throws TInvalidSaslFrameException {
        int i = this.byteBuffer.getInt(0);
        this.payloadSize = i;
        if (i >= 0) {
            return;
        }
        throw new TInvalidSaslFrameException("Payload size is negative: " + this.payloadSize);
    }

    @Override // org.apache.thrift.orig.transport.sasl.FrameHeaderReader
    public int payloadSize() {
        return this.payloadSize;
    }
}
