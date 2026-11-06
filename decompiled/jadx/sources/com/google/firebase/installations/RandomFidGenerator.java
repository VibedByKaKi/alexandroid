package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class RandomFidGenerator {
    private static final int FID_LENGTH = 22;
    private static final byte FID_4BIT_PREFIX = Byte.parseByte("01110000", 2);
    private static final byte REMOVE_PREFIX_MASK = Byte.parseByte("00001111", 2);

    private static String encodeFidBase64UrlSafe(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] getBytesFromUUID(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    public String createRandomFid() {
        byte[] bytesFromUUID = getBytesFromUUID(UUID.randomUUID(), new byte[17]);
        byte b = bytesFromUUID[0];
        bytesFromUUID[16] = b;
        bytesFromUUID[0] = (byte) ((b & REMOVE_PREFIX_MASK) | FID_4BIT_PREFIX);
        return encodeFidBase64UrlSafe(bytesFromUUID);
    }
}
