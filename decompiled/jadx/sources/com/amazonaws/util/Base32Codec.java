package com.amazonaws.util;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class Base32Codec extends AbstractBase32Codec {
    private static final int OFFSET = 26;
    private static final int OFFSET_OF_2 = 24;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i = 0; i <= 122; i++) {
                if (i >= 65 && i <= 90) {
                    bArr[i] = (byte) (i - 65);
                } else if (i >= 50 && i <= 55) {
                    bArr[i] = (byte) (i - 24);
                } else if (i < 97 || i > 122) {
                    bArr[i] = -1;
                } else {
                    bArr[i] = (byte) (i - 97);
                }
            }
            return bArr;
        }
    }

    public Base32Codec() {
        super(alphabets());
    }

    private static byte[] alphabets() {
        return CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
    }

    @Override // com.amazonaws.util.AbstractBase32Codec
    public int pos(byte b) {
        byte b2 = LazyHolder.DECODED[b];
        if (b2 > -1) {
            return b2;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m((char) b, "'", new StringBuilder("Invalid base 32 character: '")));
        return 0;
    }
}
