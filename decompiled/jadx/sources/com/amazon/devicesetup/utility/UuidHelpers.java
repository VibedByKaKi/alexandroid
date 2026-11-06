package com.amazon.devicesetup.utility;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UuidHelpers {
    public static UUID decodeIntoUuid(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new UUID(order.getLong(), order.getLong());
    }

    public static byte[] encodeIntoByteArray(UUID uuid) {
        ByteBuffer order = ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN);
        order.putLong(uuid.getLeastSignificantBits());
        order.putLong(uuid.getMostSignificantBits());
        return order.array();
    }
}
