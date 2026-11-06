package com.bugsnag.android.repackaged.dslplatform.json;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
abstract class Base64 {
    private static final byte[] BA;
    private static final char[] CA;
    private static final byte[] EMPTY_ARRAY;
    private static final int[] IA;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        CA = charArray;
        int[] iArr = new int[256];
        IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            IA[CA[i]] = i;
        }
        IA[61] = 0;
        BA = new byte[CA.length];
        int i2 = 0;
        while (true) {
            char[] cArr = CA;
            if (i2 >= cArr.length) {
                EMPTY_ARRAY = new byte[0];
                return;
            } else {
                BA[i2] = (byte) cArr[i2];
                i2++;
            }
        }
    }

    public static byte[] decodeFast(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        if (i4 == 0) {
            return EMPTY_ARRAY;
        }
        int i5 = i2 - 1;
        int i6 = i;
        while (i6 < i5 && IA[bArr[i6] & 255] < 0) {
            i6++;
        }
        while (i5 > 0 && IA[bArr[i5] & 255] < 0) {
            i5--;
        }
        int i7 = 0;
        int i8 = bArr[i5] == 61 ? bArr[i5 + (-1)] == 61 ? 2 : 1 : 0;
        int i9 = (i5 - i6) + 1;
        if (i4 > 76) {
            i3 = (bArr[76] == 13 ? i9 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i10 = (((i9 - i3) * 6) >> 3) - i8;
        byte[] bArr2 = new byte[i10];
        int i11 = (i10 / 3) * 3;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int[] iArr = IA;
            int i14 = i6 + 4;
            int i15 = iArr[bArr[i6 + 3]] | (iArr[bArr[i6 + 1]] << 12) | (iArr[bArr[i6]] << 18) | (iArr[bArr[i6 + 2]] << 6);
            bArr2[i12] = (byte) (i15 >> 16);
            int i16 = i12 + 2;
            bArr2[i12 + 1] = (byte) (i15 >> 8);
            i12 += 3;
            bArr2[i16] = (byte) i15;
            if (i3 <= 0 || (i13 = i13 + 1) != 19) {
                i6 = i14;
            } else {
                i6 += 6;
                i13 = 0;
            }
        }
        if (i12 < i10) {
            int i17 = 0;
            while (i6 <= i5 - i8) {
                i7 |= IA[bArr[i6]] << (18 - (i17 * 6));
                i17++;
                i6++;
            }
            int i18 = 16;
            while (i12 < i10) {
                bArr2[i12] = (byte) (i7 >> i18);
                i18 -= 8;
                i12++;
            }
        }
        return bArr2;
    }

    public static int encodeToBytes(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length;
        int i2 = (length / 3) * 3;
        int i3 = length - 1;
        int i4 = ((i3 / 3) + 1) << 2;
        int i5 = i;
        int i6 = 0;
        while (i6 < i2) {
            int i7 = i6 + 2;
            int i8 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
            i6 += 3;
            int i9 = i8 | (bArr[i7] & 255);
            byte[] bArr3 = BA;
            bArr2[i5] = bArr3[(i9 >>> 18) & 63];
            bArr2[i5 + 1] = bArr3[(i9 >>> 12) & 63];
            int i10 = i5 + 3;
            bArr2[i5 + 2] = bArr3[(i9 >>> 6) & 63];
            i5 += 4;
            bArr2[i10] = bArr3[i9 & 63];
        }
        int i11 = length - i2;
        if (i11 > 0) {
            int i12 = ((bArr[i2] & 255) << 10) | (i11 == 2 ? (bArr[i3] & 255) << 2 : 0);
            int i13 = i + i4;
            byte[] bArr4 = BA;
            bArr2[i13 - 4] = bArr4[i12 >> 12];
            bArr2[i13 - 3] = bArr4[(i12 >>> 6) & 63];
            bArr2[i13 - 2] = i11 == 2 ? bArr4[i12 & 63] : (byte) 61;
            bArr2[i13 - 1] = 61;
        }
        return i4;
    }

    public static int findEnd(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (IA[bArr[i] & 255] < 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }
}
