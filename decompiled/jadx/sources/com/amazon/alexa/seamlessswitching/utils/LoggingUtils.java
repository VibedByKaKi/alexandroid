package com.amazon.alexa.seamlessswitching.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class LoggingUtils {
    private LoggingUtils() {
    }

    public static String getTag(Class cls) {
        return "SeamlessSwitching-".concat(cls.getSimpleName());
    }
}
