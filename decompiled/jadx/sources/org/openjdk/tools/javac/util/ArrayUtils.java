package org.openjdk.tools.javac.util;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ArrayUtils {
    private static int calculateNewLength(int i, int i2) {
        while (i < i2 + 1) {
            i *= 2;
        }
        return i;
    }

    public static <T> T[] ensureCapacity(T[] tArr, int i) {
        if (i < tArr.length) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) DoubleList$$ExternalSyntheticOutline0.m(tArr, calculateNewLength(tArr.length, i)));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i) {
        if (i < bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[calculateNewLength(bArr.length, i)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static char[] ensureCapacity(char[] cArr, int i) {
        if (i < cArr.length) {
            return cArr;
        }
        char[] cArr2 = new char[calculateNewLength(cArr.length, i)];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static int[] ensureCapacity(int[] iArr, int i) {
        if (i < iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[calculateNewLength(iArr.length, i)];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }
}
