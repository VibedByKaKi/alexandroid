package com.amazon.alexa.handsfree.storage.metrics;

import com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MetricsEnabledStatusStore_Factory implements Factory<MetricsEnabledStatusStore> {
    private final Provider<ProcessMetricsCacheService.ServiceHelper> processMetricsCacheServiceHelperProvider;

    public MetricsEnabledStatusStore_Factory(Provider<ProcessMetricsCacheService.ServiceHelper> provider) {
        this.processMetricsCacheServiceHelperProvider = provider;
    }

    public static MetricsEnabledStatusStore_Factory create(Provider<ProcessMetricsCacheService.ServiceHelper> provider) {
        return new MetricsEnabledStatusStore_Factory(provider);
    }

    public static MetricsEnabledStatusStore newInstance(ProcessMetricsCacheService.ServiceHelper serviceHelper) {
        return new MetricsEnabledStatusStore(serviceHelper);
    }

    @Override // javax.inject.Provider
    public MetricsEnabledStatusStore get() {
        return newInstance(this.processMetricsCacheServiceHelperProvider.get());
    }
}
