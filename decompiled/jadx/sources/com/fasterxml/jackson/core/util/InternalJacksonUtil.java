package com.fasterxml.jackson.core.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class InternalJacksonUtil {
    public static int addOverflowSafe(int i, int i2) {
        int i3 = i + i2;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
