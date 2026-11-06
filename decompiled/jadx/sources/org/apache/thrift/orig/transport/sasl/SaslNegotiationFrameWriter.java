package org.apache.thrift.orig.transport.sasl;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import org.apache.thrift.orig.EncodingUtils;
import org.apache.thrift.orig.utils.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SaslNegotiationFrameWriter extends FrameWriter {
    public static final int HEADER_BYTES = 5;

    @Override // org.apache.thrift.orig.transport.sasl.FrameWriter
    public ByteBuffer buildFrame(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (bArr == null || i2 != 1) {
            OnnxMap$$ExternalSyntheticBUOutline0.m$1("Header ", StringUtils.bytesToHexString(bArr), " does not have expected length 1");
            return null;
        }
        byte[] bArr3 = new byte[i4 + 5];
        System.arraycopy(bArr, i, bArr3, 0, 1);
        EncodingUtils.encodeBigEndian(i4, bArr3, 1);
        System.arraycopy(bArr2, i3, bArr3, 5, i4);
        return ByteBuffer.wrap(bArr3);
    }

    @Override // org.apache.thrift.orig.transport.sasl.FrameWriter
    public void withOnlyPayload(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("Status byte is expected for sasl frame header.");
    }
}
