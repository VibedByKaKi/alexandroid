package com.amazon.whisperjoin.devicesetupserviceandroidclient.util;

import java.time.Duration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Iso8601TimeConverter {
    public static long convertDurationToMs(String str) {
        if (str == null) {
            return 0L;
        }
        return Duration.parse(str).toMillis();
    }
}
