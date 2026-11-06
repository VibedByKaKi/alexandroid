package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class JavaFloatBitsFromCharArray extends AbstractJavaFloatingPointBitsFromCharArray {
    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharArray
    public long nan() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharArray
    public long negativeInfinity() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharArray
    public long positiveInfinity() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharArray
    public long valueOfFloatLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float tryDecFloatToFloatTruncated = FastFloatMath.tryDecFloatToFloatTruncated(z, j, i3, z2, i4);
        if (Float.isNaN(tryDecFloatToFloatTruncated)) {
            tryDecFloatToFloatTruncated = Float.parseFloat(new String(cArr, i, i2 - i));
        }
        return Float.floatToRawIntBits(tryDecFloatToFloatTruncated);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharArray
    public long valueOfHexLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float tryHexFloatToFloatTruncated = FastFloatMath.tryHexFloatToFloatTruncated(z, j, i3, z2, i4);
        if (Float.isNaN(tryHexFloatToFloatTruncated)) {
            tryHexFloatToFloatTruncated = Float.parseFloat(new String(cArr, i, i2 - i));
        }
        return Float.floatToRawIntBits(tryHexFloatToFloatTruncated);
    }
}
