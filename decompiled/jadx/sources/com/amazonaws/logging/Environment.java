package com.amazonaws.logging;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class Environment {
    private static final String JUNIT_PACKAGE_PREFIX = "org.junit.";

    private Environment() {
    }

    public static boolean isJUnitTest() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().startsWith(JUNIT_PACKAGE_PREFIX)) {
                return true;
            }
        }
        return false;
    }
}
