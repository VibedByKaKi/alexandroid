package com.amazon.coral.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.coral.metrics.Metrics;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public final class CoralContextMetrics {
    private static final ThreadLocal<Metrics> METRICS = new ThreadLocal<>();
    private static final CoralContextMetrics INSTANCE = new CoralContextMetrics();
    private static final boolean ENABLED = Boolean.parseBoolean(System.getProperty("com.amazon.coral.contextmetrics.enabled", "false"));

    private CoralContextMetrics() {
    }

    @Deprecated
    public static CoralContextMetrics getAccess() {
        if (AppLaunchChecker$$ExternalSyntheticOutline0.m()[1].getClassName().startsWith("com.amazon.coral.")) {
            return INSTANCE;
        }
        Single$$ExternalSyntheticBUOutline0.m("This is only available to Coral code");
        return null;
    }

    public void clearMetrics() {
        if (ENABLED) {
            METRICS.set(null);
        }
    }

    public Metrics getMetrics() {
        if (ENABLED) {
            return METRICS.get();
        }
        return null;
    }

    public void setMetrics(Metrics metrics) {
        if (ENABLED) {
            METRICS.set(metrics);
        }
    }
}
