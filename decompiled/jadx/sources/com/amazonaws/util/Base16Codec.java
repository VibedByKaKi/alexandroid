package com.amazonaws.util;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class Base16Codec implements Codec {
    private static final int BITS_4 = 4;
    private static final int MASK_4BITS = 15;
    private static final int OFFSET_OF_A = 55;
    private static final int OFFSET_OF_a = 87;
    private static final int OFFSET_VALUE = 10;
    private final byte[] alpahbets = CodecUtils.toBytesDirect("0123456789ABCDEF");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[103];
            for (int i = 0; i <= 102; i++) {
                if (i >= 48 && i <= 57) {
                    bArr[i] = (byte) (i - 48);
                } else if (i >= 65 && i <= 70) {
                    bArr[i] = (byte) (i - 55);
                } else if (i < 97 || i > 102) {
                    bArr[i] = -1;
                } else {
                    bArr[i] = (byte) (i - 87);
                }
            }
            return bArr;
        }
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i) {
        if (i % 2 != 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Input is expected to be encoded in multiple of 2 bytes but found: "));
            return null;
        }
        int i2 = i / 2;
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            int pos = pos(bArr[i3]) << 4;
            i3 += 2;
            bArr2[i4] = (byte) (pos(bArr[i5]) | pos);
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            byte[] bArr3 = this.alpahbets;
            bArr2[i] = bArr3[(b >>> 4) & 15];
            i += 2;
            bArr2[i2] = bArr3[b & 15];
        }
        return bArr2;
    }

    public int pos(byte b) {
        byte b2 = LazyHolder.DECODED[b];
        if (b2 > -1) {
            return b2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m((char) b, "'", new StringBuilder("Invalid base 16 character: '")));
        return 0;
    }
}
