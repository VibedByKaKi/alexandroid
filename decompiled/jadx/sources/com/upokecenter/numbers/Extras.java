package com.upokecenter.numbers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class Extras {
    private Extras() {
    }

    public static String CharsConcat(String str, int i, int i2, String str2, int i3, int i4) {
        return str.substring(i, i2 + i).concat(str2.substring(i3, i4 + i3));
    }

    public static int[] DoubleToIntegers(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        return new int[]{(int) (doubleToRawLongBits & 4294967295L), (int) ((doubleToRawLongBits >> 32) & 4294967295L)};
    }

    public static double IntegersToDouble(int i, int i2) {
        return Double.longBitsToDouble(((i2 & 4294967295L) << 32) | (i & 4294967295L));
    }

    public static byte[] CharsConcat(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3 = new byte[i2 + i4];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        System.arraycopy(bArr2, i3, bArr3, i2, i4);
        return bArr3;
    }

    public static char[] CharsConcat(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4) {
        char[] cArr3 = new char[i2 + i4];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        System.arraycopy(cArr2, i3, cArr3, i2, i4);
        return cArr3;
    }

    public static double IntegersToDouble(int[] iArr) {
        return IntegersToDouble(iArr[0], iArr[1]);
    }
}
