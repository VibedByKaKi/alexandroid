package com.amazon.alexa.accessory.internal.util;

import com.amazon.deecomms.common.metrics.MetricKeys;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ByteUtils {
    private static final int BYTE_MASK = 255;
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    private ByteUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static String bytesToHex(byte[] bArr, char c) {
        if (bArr == null) {
            return "null";
        }
        if (bArr.length == 0) {
            return MetricKeys.EMPTY_VALUE;
        }
        int length = (bArr.length * 3) - 1;
        char[] cArr = new char[length];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = HEX_ARRAY;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            int i3 = i2 + 2;
            if (i3 < length) {
                cArr[i3] = c;
            }
        }
        return new String(cArr);
    }

    public static byte toByte(int i) {
        return (byte) (i & 255);
    }

    public static String bytesToHex(byte[] bArr) {
        return bytesToHex(bArr, ' ');
    }
}
