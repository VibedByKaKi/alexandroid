package org.apache.commons.io;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class ByteOrderParser {
    private ByteOrderParser() {
    }

    public static ByteOrder parseByteOrder(String str) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        if (byteOrder.toString().equals(str)) {
            return byteOrder;
        }
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        if (byteOrder2.toString().equals(str)) {
            return byteOrder2;
        }
        Gson$$ExternalSyntheticBUOutline0.m("Unsupported byte order setting: ", str, ", expected one of ", byteOrder2, ", ", byteOrder);
        return null;
    }
}
