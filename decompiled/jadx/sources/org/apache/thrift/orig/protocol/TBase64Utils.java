package org.apache.thrift.orig.protocol;

import com.amazon.alexa.accessory.internal.bluetooth.GenericAccessProfile;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import okio.Utf8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class TBase64Utils {
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, JsonWriter.SEMI, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, GenericAccessProfile.SERVICE_DATA_128BIT, 34, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, GenericAccessProfile.URI, GenericAccessProfile.INDOOR_POSITIONING, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, GenericAccessProfile.LE_SUPPORTED_FEATURES, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, GenericAccessProfile.PB_ADV, GenericAccessProfile.MESH_MESSAGE, GenericAccessProfile.MESH_BEACON, JsonWriter.COMMA, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final String ENCODE_TABLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void decode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = DECODE_TABLE;
        int i4 = i + 1;
        bArr2[i3] = (byte) ((bArr3[bArr[i] & 255] << 2) | (bArr3[bArr[i4] & 255] >> 4));
        if (i2 > 2) {
            int i5 = i + 2;
            bArr2[i3 + 1] = (byte) (((bArr3[bArr[i4] & 255] << 4) & 240) | (bArr3[bArr[i5] & 255] >> 2));
            if (i2 > 3) {
                bArr2[i3 + 2] = (byte) (bArr3[bArr[i + 3] & 255] | ((bArr3[bArr[i5] & 255] << 6) & 192));
            }
        }
    }

    public static void encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        bArr2[i3] = (byte) ENCODE_TABLE.charAt((bArr[i] >> 2) & 63);
        if (i2 == 3) {
            int i4 = i + 1;
            bArr2[i3 + 1] = (byte) ENCODE_TABLE.charAt(((bArr[i] << 4) & 48) | ((bArr[i4] >> 4) & 15));
            int i5 = i + 2;
            bArr2[i3 + 2] = (byte) ENCODE_TABLE.charAt(((bArr[i5] >> 6) & 3) | ((bArr[i4] << 2) & 60));
            bArr2[i3 + 3] = (byte) ENCODE_TABLE.charAt(bArr[i5] & Utf8.REPLACEMENT_BYTE);
            return;
        }
        if (i2 != 2) {
            bArr2[i3 + 1] = (byte) ENCODE_TABLE.charAt((bArr[i] << 4) & 48);
            return;
        }
        int i6 = (bArr[i] << 4) & 48;
        int i7 = i + 1;
        bArr2[i3 + 1] = (byte) ENCODE_TABLE.charAt(i6 | ((bArr[i7] >> 4) & 15));
        bArr2[i3 + 2] = (byte) ENCODE_TABLE.charAt((bArr[i7] << 2) & 60);
    }
}
