package com.amazon.minerva.client.thirdparty.utils;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CustomMath {
    public static long addExact(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Long overflow if value added, value dropped");
        return 0L;
    }
}
