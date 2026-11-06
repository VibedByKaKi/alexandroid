package com.amazon.alexa.benefits.util;

import java.time.Clock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class TimeUtils {
    private static final String TAG = "com.amazon.alexa.benefits.util.TimeUtils";

    private TimeUtils() {
    }

    public static long getEpochTimeInSeconds(Clock clock) {
        return clock.millis() / 1000;
    }

    public static boolean shouldShowDisclaimer(Long l, long j, Clock clock) {
        if (l != null) {
            return getEpochTimeInSeconds(clock) - l.longValue() >= j;
        }
        LogUtils.i(TAG, "No disclaimerRenderedTimeDate, returning true for shouldShowDisclaimer as it may not have been shown before.");
        return true;
    }
}
