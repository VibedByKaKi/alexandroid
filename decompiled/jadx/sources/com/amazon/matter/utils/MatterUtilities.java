package com.amazon.matter.utils;

import chip.devicecontroller.NetworkCredentials;
import com.google.common.primitives.Bytes;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MatterUtilities {
    public static final int CONTROLLER_VENDOR_ID = 4631;

    private MatterUtilities() {
    }

    public static byte[] buildTLVByteArray(byte b, byte b2, byte[] bArr) {
        return Bytes.concat(new byte[]{b, b2}, bArr);
    }

    public static NetworkCredentials getWifiNetworkCredentials(String str, String str2) {
        return NetworkCredentials.forWiFi(new NetworkCredentials.WiFiCredentials(str, str2));
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static byte[] stringToHexByteArray(String str) {
        return hexStringToByteArray(String.format("%x", new BigInteger(1, str.getBytes(StandardCharsets.UTF_8))));
    }
}
