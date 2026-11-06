package org.apache.thrift.orig.transport.sasl;

import org.apache.thrift.orig.transport.sasl.TSaslNegotiationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SaslNegotiationHeaderReader extends FixedSizeHeaderReader {
    public static final int PAYLOAD_LENGTH_BYTES = 4;
    public static final int STATUS_BYTES = 1;
    private NegotiationStatus negotiationStatus;
    private int payloadSize;

    public NegotiationStatus getStatus() {
        return this.negotiationStatus;
    }

    @Override // org.apache.thrift.orig.transport.sasl.FixedSizeHeaderReader
    public int headerSize() {
        return 5;
    }

    @Override // org.apache.thrift.orig.transport.sasl.FixedSizeHeaderReader
    public void onComplete() throws TSaslNegotiationException {
        this.negotiationStatus = NegotiationStatus.byValue(this.byteBuffer.get(0));
        int i = this.byteBuffer.getInt(1);
        this.payloadSize = i;
        if (i >= 0) {
            return;
        }
        throw new TSaslNegotiationException(TSaslNegotiationException.ErrorType.PROTOCOL_ERROR, "Payload size is negative: " + this.payloadSize);
    }

    @Override // org.apache.thrift.orig.transport.sasl.FrameHeaderReader
    public int payloadSize() {
        return this.payloadSize;
    }
}
