package com.amazon.whisperjoin.common.sharedtypes.utility;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HexStringConverter {
    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format(Locale.ENGLISH, "%02X", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static String byteArrayToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format(Locale.ENGLISH, "%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static boolean isHexString(String str) {
        return str.matches("^\\p{XDigit}+$") && str.length() % 2 == 0;
    }

    public static byte[] stringToHexArray(String str) {
        if (!isHexString(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " is not a valid hex string"));
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }
}
