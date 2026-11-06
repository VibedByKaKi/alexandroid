package com.amazonaws.util;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum CodecUtils {
    ;

    public static int sanitize(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char c = charArray[i2];
            if (c != '\r' && c != '\n' && c != ' ') {
                if (c > 127) {
                    Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(i2, "Invalid character found at position ", " for ", str));
                    return 0;
                }
                bArr[i] = (byte) c;
                i++;
            }
        }
        return i;
    }

    public static void sanityCheckLastPos(int i, int i2) {
        if ((i & i2) == 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid last non-pad character detected");
    }

    public static byte[] toBytesDirect(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c > 127) {
                Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(i, "Invalid character found at position ", " for ", str));
                return null;
            }
            bArr[i] = (byte) c;
        }
        return bArr;
    }

    public static String toStringDirect(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            cArr[i2] = (char) bArr[i];
            i++;
            i2++;
        }
        return new String(cArr);
    }
}
