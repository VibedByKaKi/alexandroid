package com.amazon.appmanager.lib.metrics;

import android.content.Context;
import com.amazon.maft.metrics.PreloadMetricsFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MaftMetricsFactory {
    private static PreloadMetricsFactory instance;
    private static PreloadMetricsFactory noOpInstance;

    private MaftMetricsFactory() {
    }

    public static synchronized PreloadMetricsFactory getInstance(Context context) {
        PreloadMetricsFactory preloadMetricsFactory;
        synchronized (MaftMetricsFactory.class) {
            try {
                try {
                    if (instance == null) {
                        instance = new MaftPreloadMetricsFactory(context);
                    }
                    preloadMetricsFactory = instance;
                } catch (Exception unused) {
                    return getNoOpInstance();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return preloadMetricsFactory;
    }

    public static synchronized PreloadMetricsFactory getNoOpInstance() {
        PreloadMetricsFactory preloadMetricsFactory;
        synchronized (MaftMetricsFactory.class) {
            try {
                if (noOpInstance == null) {
                    noOpInstance = new NoOpMaftPreloadMetricsFactory();
                }
                preloadMetricsFactory = noOpInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preloadMetricsFactory;
    }

    public static synchronized void setInstance(PreloadMetricsFactory preloadMetricsFactory) {
        synchronized (MaftMetricsFactory.class) {
            instance = preloadMetricsFactory;
        }
    }
}
