package org.apache.thrift.orig.transport.sasl;

import java.nio.ByteBuffer;
import org.apache.thrift.orig.EncodingUtils;
import org.apache.thrift.orig.utils.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DataFrameWriter extends FrameWriter {
    private ByteBuffer buildFrameWithPayload(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        EncodingUtils.encodeBigEndian(i2, bArr2, 0);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return ByteBuffer.wrap(bArr2);
    }

    @Override // org.apache.thrift.orig.transport.sasl.FrameWriter
    public ByteBuffer buildFrame(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (bArr == null || i2 <= 0) {
            return buildFrameWithPayload(bArr2, i3, i4);
        }
        throw new IllegalArgumentException("Extra header [" + StringUtils.bytesToHexString(bArr) + "] offset " + i3 + " length " + i4);
    }

    @Override // org.apache.thrift.orig.transport.sasl.FrameWriter
    public void withOnlyPayload(byte[] bArr, int i, int i2) {
        if (isComplete()) {
            this.frameBytes = buildFrameWithPayload(bArr, i, i2);
            return;
        }
        throw new IllegalStateException("Previous write is not yet complete, with " + this.frameBytes.remaining() + " bytes left.");
    }
}
