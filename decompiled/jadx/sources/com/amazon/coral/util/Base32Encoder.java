package com.amazon.coral.util;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public class Base32Encoder {
    private static final int[] base32DecodeChars = {255, 255, 26, 27, 28, 29, 30, 31, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255};
    private static final String base32EncodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";

    public byte[] decode(CharSequence charSequence) {
        if (charSequence == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int length = (charSequence.length() * 5) / 8;
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            int charAt = charSequence.charAt(i3) - '0';
            if (charAt >= 0) {
                int[] iArr = base32DecodeChars;
                if (charAt < iArr.length) {
                    int i4 = iArr[charAt];
                    if (i4 == 255) {
                        throw new IllegalArgumentException("Attempt to decode non-Base32 character: " + charSequence.charAt(i3));
                    }
                    if (i <= 3) {
                        i = (i + 5) % 8;
                        if (i == 0) {
                            bArr[i2] = (byte) (i4 | bArr[i2]);
                            i2++;
                            if (i2 >= length) {
                                break;
                            }
                        } else {
                            bArr[i2] = (byte) ((i4 << (8 - i)) | bArr[i2]);
                        }
                    } else {
                        i = (i + 5) % 8;
                        bArr[i2] = (byte) (bArr[i2] | (i4 >>> i));
                        i2++;
                        if (i2 >= length) {
                            break;
                        }
                        bArr[i2] = (byte) ((i4 << (8 - i)) | bArr[i2]);
                    }
                }
            }
            throw new IllegalArgumentException("Attempt to decode non-Base32 character: " + charSequence.charAt(i3));
        }
        return bArr;
    }

    public String encode(byte[] bArr) {
        int i;
        int i2;
        if (bArr == 0) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        StringBuilder sb = new StringBuilder(((bArr.length + 7) * 8) / 5);
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = bArr[i3];
            if (i5 < 0) {
                i5 += 256;
            }
            if (i4 <= 3) {
                int i6 = i4 + 5;
                i2 = (i5 >> (8 - i6)) & 31;
                i4 = i6 % 8;
                if (i4 == 0) {
                    i3++;
                }
            } else {
                i3++;
                if (i3 < bArr.length) {
                    i = bArr[i3];
                    if (i < 0) {
                        i += 256;
                    }
                } else {
                    i = 0;
                }
                int i7 = i5 & (255 >> i4);
                i4 = (i4 + 5) % 8;
                i2 = (i7 << i4) | (i >> (8 - i4));
            }
            sb.append(base32EncodeChars.charAt(i2));
        }
        return sb.toString();
    }
}
