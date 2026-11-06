package com.airbnb.lottie.utils;

import com.airbnb.lottie.LottieLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class Logger {
    private static LottieLogger INSTANCE = new LogcatLogger();

    public static void debug(String str) {
        INSTANCE.debug(str);
    }

    public static void error(String str, Throwable th) {
        INSTANCE.error(str, th);
    }

    public static void setInstance(LottieLogger lottieLogger) {
        INSTANCE = lottieLogger;
    }

    public static void warning(String str) {
        INSTANCE.warning(str);
    }

    public static void debug(String str, Throwable th) {
        INSTANCE.debug(str, th);
    }

    public static void warning(String str, Throwable th) {
        INSTANCE.warning(str, th);
    }
}
