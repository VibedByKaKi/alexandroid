package com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class JavaDoubleBitsFromCharSequence extends AbstractJavaFloatingPointBitsFromCharSequence {
    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharSequence
    public long nan() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharSequence
    public long negativeInfinity() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharSequence
    public long positiveInfinity() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharSequence
    public long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double tryDecFloatToDoubleTruncated = FastDoubleMath.tryDecFloatToDoubleTruncated(z, j, i3, z2, i4);
        if (Double.isNaN(tryDecFloatToDoubleTruncated)) {
            tryDecFloatToDoubleTruncated = Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return Double.doubleToRawLongBits(tryDecFloatToDoubleTruncated);
    }

    @Override // com.fasterxml.jackson.core.internal.shaded.fdp.v2_19_2.AbstractJavaFloatingPointBitsFromCharSequence
    public long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double tryHexFloatToDoubleTruncated = FastDoubleMath.tryHexFloatToDoubleTruncated(z, j, i3, z2, i4);
        if (Double.isNaN(tryHexFloatToDoubleTruncated)) {
            tryHexFloatToDoubleTruncated = Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return Double.doubleToRawLongBits(tryHexFloatToDoubleTruncated);
    }
}
