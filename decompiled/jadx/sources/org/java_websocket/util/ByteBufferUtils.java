package org.java_websocket.util;

import java.nio.ByteBuffer;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ByteBufferUtils {
    private ByteBufferUtils() {
    }

    public static ByteBuffer getEmptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }

    public static int transferByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer == null || byteBuffer2 == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining <= remaining2) {
            byteBuffer2.put(byteBuffer);
            return remaining;
        }
        int min = Math.min(remaining, remaining2);
        byteBuffer.limit(min);
        byteBuffer2.put(byteBuffer);
        return min;
    }
}
