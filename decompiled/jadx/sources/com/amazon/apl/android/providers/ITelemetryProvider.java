package com.amazon.apl.android.providers;

import com.amazon.apl.android.IDocumentLifecycleListener;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ITelemetryProvider extends IDocumentLifecycleListener {
    public static final String APL_DOMAIN = "APL-Android";
    public static final String EXTENSION_DISCONNECTION_COUNT = "Extension.disconnectCount";
    public static final String FAIL_SUFFIX = ".fail";
    public static final String LIBRARY_INITIALIZATION_FAILED = "libraryInitializationFailed";
    public static final String METRIC_TIMER_EXTENSION_REGISTRATION = "Extensions.register";
    public static final String RENDER_DOCUMENT = "renderDocument";
    public static final int UNKNOWN_METRIC_ID = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        COUNTER,
        TIMER
    }

    int createMetricId(String str, String str2, Type type);

    void fail(int i);

    int getMetricId(String str, String str2);

    void incrementCount(int i);

    void incrementCount(int i, int i2);

    default void reportTimer(int i, TimeUnit timeUnit, long j) {
        startTimer(i, timeUnit, j);
        stopTimer(i);
    }

    void startTimer(int i);

    void startTimer(int i, TimeUnit timeUnit, long j);

    void stopTimer(int i);

    default void stopTimer(int i, TimeUnit timeUnit, long j) {
        stopTimer(i);
    }

    default void incrementCount(int i, double d) {
    }
}
