package com.amazon.alexa.handsfree.metrics;

import com.amazon.alexa.handsfree.metrics.StandbyBucketMetricJobService;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class StandbyBucketMetricJobService_Helper_Factory implements Factory<StandbyBucketMetricJobService.Helper> {
    private static final StandbyBucketMetricJobService_Helper_Factory INSTANCE = new StandbyBucketMetricJobService_Helper_Factory();

    public static Factory<StandbyBucketMetricJobService.Helper> create() {
        return INSTANCE;
    }

    public static StandbyBucketMetricJobService.Helper newHelper() {
        return new StandbyBucketMetricJobService.Helper();
    }

    @Override // javax.inject.Provider
    public StandbyBucketMetricJobService.Helper get() {
        return new StandbyBucketMetricJobService.Helper();
    }
}
