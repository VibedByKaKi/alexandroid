package com.amazon.whispercloak.tlv;

import android.util.Log;
import com.amazon.whispercloak.SecureMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TLV {
    private static final String TAG = "com.amazon.whispercloak.tlv.TLV";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TYPE {
        ENCRYPTED_DATA(0),
        IV(1),
        MAC(2),
        AAD(3);

        public final int id;

        TYPE(int i) {
            this.id = i;
        }
    }

    public static SecureMessage decode(byte[] bArr) {
        HashMap hashMap = new HashMap(TYPE.values().length);
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            try {
                byte b = bArr[i];
                if (b > TYPE.values().length - 1) {
                    Log.w(TAG, String.format("Invalid TLV input. TLV Type (%d) is unkown", Integer.valueOf(b)));
                    throw new IllegalArgumentException(String.format("Invalid TLV input. TLV Type (%d) is unkown", Integer.valueOf(b)));
                }
                TYPE type = TYPE.values()[b];
                short s = ByteBuffer.wrap(bArr, i2, 2).getShort();
                type.name();
                int i3 = i + 3;
                int i4 = s + i3;
                hashMap.put(type, Arrays.copyOfRange(bArr, i3, i4));
                i = i4;
            } catch (ArrayIndexOutOfBoundsException unused) {
                Log.w(TAG, "ArrayIndexOutOfBoundsException. Invalid TLV data: " + Arrays.toString(bArr));
                Single$$ExternalSyntheticBUOutline0.m$3("Invalid TLV input, Expected data length does not match actual data length");
                return null;
            }
        }
        return new SecureMessage((byte[]) hashMap.get(TYPE.IV), (byte[]) hashMap.get(TYPE.ENCRYPTED_DATA), (byte[]) hashMap.get(TYPE.MAC), (byte[]) hashMap.get(TYPE.AAD));
    }

    public static byte[] encode(SecureMessage secureMessage) {
        byte[] iv = secureMessage.getIv();
        byte[] mac = secureMessage.getMac();
        byte[] aad = secureMessage.getAad();
        byte[] cipherText = secureMessage.getCipherText();
        int length = iv.length + mac.length + cipherText.length + 9;
        if (aad != null) {
            length += aad.length + 3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[length]);
        putData(wrap, TYPE.IV.id, iv);
        putData(wrap, TYPE.MAC.id, mac);
        if (aad != null) {
            putData(wrap, TYPE.AAD.id, aad);
        }
        putData(wrap, TYPE.ENCRYPTED_DATA.id, cipherText);
        return wrap.array();
    }

    private static void putData(ByteBuffer byteBuffer, int i, byte[] bArr) {
        byteBuffer.put((byte) (i & 255));
        byteBuffer.putShort((short) bArr.length);
        byteBuffer.put(bArr);
    }
}
