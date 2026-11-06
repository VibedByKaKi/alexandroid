package com.amazon.alexa.handsfree.metrics;

import com.amazon.alexa.handsfree.metrics.FirstStartupMetricJobService;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FirstStartupMetricJobService_Helper_Factory implements Factory<FirstStartupMetricJobService.Helper> {
    private static final FirstStartupMetricJobService_Helper_Factory INSTANCE = new FirstStartupMetricJobService_Helper_Factory();

    public static Factory<FirstStartupMetricJobService.Helper> create() {
        return INSTANCE;
    }

    public static FirstStartupMetricJobService.Helper newHelper() {
        return new FirstStartupMetricJobService.Helper();
    }

    @Override // javax.inject.Provider
    public FirstStartupMetricJobService.Helper get() {
        return new FirstStartupMetricJobService.Helper();
    }
}
