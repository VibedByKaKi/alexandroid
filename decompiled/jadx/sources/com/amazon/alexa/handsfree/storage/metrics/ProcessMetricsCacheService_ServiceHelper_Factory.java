package com.amazon.alexa.handsfree.storage.metrics;

import com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ProcessMetricsCacheService_ServiceHelper_Factory implements Factory<ProcessMetricsCacheService.ServiceHelper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ProcessMetricsCacheService_ServiceHelper_Factory INSTANCE = new ProcessMetricsCacheService_ServiceHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static ProcessMetricsCacheService_ServiceHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProcessMetricsCacheService.ServiceHelper newInstance() {
        return new ProcessMetricsCacheService.ServiceHelper();
    }

    @Override // javax.inject.Provider
    public ProcessMetricsCacheService.ServiceHelper get() {
        return newInstance();
    }
}
