package com.amazon.crypto.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Time {
    private Time() {
        UtilityInstanceAttempt.in(this);
    }

    public static long afterNow(long j) {
        return now() + j;
    }

    public static long beforeNow(long j) {
        return now() - j;
    }

    public static long now() {
        return System.currentTimeMillis();
    }
}
