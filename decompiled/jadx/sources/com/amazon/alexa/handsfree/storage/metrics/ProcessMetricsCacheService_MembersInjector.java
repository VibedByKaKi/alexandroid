package com.amazon.alexa.handsfree.storage.metrics;

import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.metrics.MetricsEmitter;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.metrics.caching.MetricSerializer;
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
public final class ProcessMetricsCacheService_MembersInjector implements MembersInjector<ProcessMetricsCacheService> {
    private final Provider<Initializer> mInitializerProvider;
    private final Provider<MetricSerializer> mMetricSerializerProvider;
    private final Provider<MetricsBuilderProvider> mMetricsBuilderProvider;
    private final Provider<MetricsCacheDatabaseHelper> mMetricsCacheDatabaseHelperProvider;
    private final Provider<MetricsEmitter> mMetricsEmitterProvider;

    public ProcessMetricsCacheService_MembersInjector(Provider<Initializer> provider, Provider<MetricsCacheDatabaseHelper> provider2, Provider<MetricsEmitter> provider3, Provider<MetricsBuilderProvider> provider4, Provider<MetricSerializer> provider5) {
        this.mInitializerProvider = provider;
        this.mMetricsCacheDatabaseHelperProvider = provider2;
        this.mMetricsEmitterProvider = provider3;
        this.mMetricsBuilderProvider = provider4;
        this.mMetricSerializerProvider = provider5;
    }

    public static MembersInjector<ProcessMetricsCacheService> create(Provider<Initializer> provider, Provider<MetricsCacheDatabaseHelper> provider2, Provider<MetricsEmitter> provider3, Provider<MetricsBuilderProvider> provider4, Provider<MetricSerializer> provider5) {
        return new ProcessMetricsCacheService_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService.mInitializer")
    public static void injectMInitializer(ProcessMetricsCacheService processMetricsCacheService, Initializer initializer) {
        processMetricsCacheService.mInitializer = initializer;
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService.mMetricSerializer")
    public static void injectMMetricSerializer(ProcessMetricsCacheService processMetricsCacheService, MetricSerializer metricSerializer) {
        processMetricsCacheService.mMetricSerializer = metricSerializer;
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService.mMetricsBuilderProvider")
    public static void injectMMetricsBuilderProvider(ProcessMetricsCacheService processMetricsCacheService, MetricsBuilderProvider metricsBuilderProvider) {
        processMetricsCacheService.mMetricsBuilderProvider = metricsBuilderProvider;
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService.mMetricsCacheDatabaseHelper")
    public static void injectMMetricsCacheDatabaseHelper(ProcessMetricsCacheService processMetricsCacheService, MetricsCacheDatabaseHelper metricsCacheDatabaseHelper) {
        processMetricsCacheService.mMetricsCacheDatabaseHelper = metricsCacheDatabaseHelper;
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.ProcessMetricsCacheService.mMetricsEmitter")
    public static void injectMMetricsEmitter(ProcessMetricsCacheService processMetricsCacheService, MetricsEmitter metricsEmitter) {
        processMetricsCacheService.mMetricsEmitter = metricsEmitter;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ProcessMetricsCacheService processMetricsCacheService) {
        injectMInitializer(processMetricsCacheService, this.mInitializerProvider.get());
        injectMMetricsCacheDatabaseHelper(processMetricsCacheService, this.mMetricsCacheDatabaseHelperProvider.get());
        injectMMetricsEmitter(processMetricsCacheService, this.mMetricsEmitterProvider.get());
        injectMMetricsBuilderProvider(processMetricsCacheService, this.mMetricsBuilderProvider.get());
        injectMMetricSerializer(processMetricsCacheService, this.mMetricSerializerProvider.get());
    }
}
