package com.amazon.alexa.accessory.internal.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Int64Util {
    private static final long MASK = 4294967295L;

    private Int64Util() {
    }

    public static int getHigh32(long j) {
        return (int) (j >>> 32);
    }

    public static long getLong(int i, int i2) {
        return (i2 & MASK) | ((i & MASK) << 32);
    }

    public static int getLow32(long j) {
        return (int) (j & MASK);
    }
}
