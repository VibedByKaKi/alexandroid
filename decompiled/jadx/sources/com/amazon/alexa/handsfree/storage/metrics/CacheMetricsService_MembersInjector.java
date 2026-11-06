package com.amazon.alexa.handsfree.storage.metrics;

import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.storage.metrics.database.MetricsCacheDatabaseHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class CacheMetricsService_MembersInjector implements MembersInjector<CacheMetricsService> {
    private final Provider<Initializer> mInitializerProvider;
    private final Provider<MetricsCacheDatabaseHelper> mMetricsCacheDatabaseHelperProvider;

    public CacheMetricsService_MembersInjector(Provider<Initializer> provider, Provider<MetricsCacheDatabaseHelper> provider2) {
        this.mInitializerProvider = provider;
        this.mMetricsCacheDatabaseHelperProvider = provider2;
    }

    public static MembersInjector<CacheMetricsService> create(Provider<Initializer> provider, Provider<MetricsCacheDatabaseHelper> provider2) {
        return new CacheMetricsService_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.CacheMetricsService.mInitializer")
    public static void injectMInitializer(CacheMetricsService cacheMetricsService, Initializer initializer) {
        cacheMetricsService.mInitializer = initializer;
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.CacheMetricsService.mMetricsCacheDatabaseHelper")
    public static void injectMMetricsCacheDatabaseHelper(CacheMetricsService cacheMetricsService, MetricsCacheDatabaseHelper metricsCacheDatabaseHelper) {
        cacheMetricsService.mMetricsCacheDatabaseHelper = metricsCacheDatabaseHelper;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CacheMetricsService cacheMetricsService) {
        injectMInitializer(cacheMetricsService, this.mInitializerProvider.get());
        injectMMetricsCacheDatabaseHelper(cacheMetricsService, this.mMetricsCacheDatabaseHelperProvider.get());
    }
}
