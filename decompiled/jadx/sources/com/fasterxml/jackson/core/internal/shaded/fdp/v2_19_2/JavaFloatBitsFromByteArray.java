package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class JavaFloatBitsFromByteArray extends AbstractJavaFloatingPointBitsFromByteArray {
    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromByteArray
    public long nan() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromByteArray
    public long negativeInfinity() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromByteArray
    public long positiveInfinity() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromByteArray
    public long valueOfFloatLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float tryDecFloatToFloatTruncated = FastFloatMath.tryDecFloatToFloatTruncated(z, j, i3, z2, i4);
        if (Float.isNaN(tryDecFloatToFloatTruncated)) {
            tryDecFloatToFloatTruncated = Float.parseFloat(new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1));
        }
        return Float.floatToRawIntBits(tryDecFloatToFloatTruncated);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromByteArray
    public long valueOfHexLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float tryHexFloatToFloatTruncated = FastFloatMath.tryHexFloatToFloatTruncated(z, j, i3, z2, i4);
        if (Float.isNaN(tryHexFloatToFloatTruncated)) {
            tryHexFloatToFloatTruncated = Float.parseFloat(new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1));
        }
        return Float.floatToRawIntBits(tryHexFloatToFloatTruncated);
    }
}
