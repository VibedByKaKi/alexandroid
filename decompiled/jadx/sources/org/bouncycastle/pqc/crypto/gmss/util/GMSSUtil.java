package org.bouncycastle.pqc.crypto.gmss.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class GMSSUtil {
    public int bytesToIntLittleEndian(byte[] bArr, int i) {
        int i2 = i + 2;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public byte[] concatenateArray(byte[][] bArr) {
        byte[] bArr2 = new byte[bArr.length * bArr[0].length];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, bArr2, i, bArr3.length);
            i += bArr[i2].length;
        }
        return bArr2;
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public byte[] intToBytesLittleEndian(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public void printArray(String str, byte[][] bArr) {
        System.out.println(str);
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                PrintStream printStream = System.out;
                StringBuilder m7635m = AppLaunchChecker$$ExternalSyntheticOutline0.m7635m(i, "; ");
                m7635m.append((int) bArr2[i2]);
                printStream.println(m7635m.toString());
                i++;
            }
        }
    }

    public boolean testPowerOfTwo(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        return i == i2;
    }

    public int bytesToIntLittleEndian(byte[] bArr) {
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
    }

    public void printArray(String str, byte[] bArr) {
        System.out.println(str);
        int i = 0;
        for (byte b : bArr) {
            PrintStream printStream = System.out;
            StringBuilder m7635m = AppLaunchChecker$$ExternalSyntheticOutline0.m7635m(i, "; ");
            m7635m.append((int) b);
            printStream.println(m7635m.toString());
            i++;
        }
    }
}
