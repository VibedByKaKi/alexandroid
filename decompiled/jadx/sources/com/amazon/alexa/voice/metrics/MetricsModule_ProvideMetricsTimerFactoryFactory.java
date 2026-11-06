package com.amazon.alexa.voice.metrics;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class MetricsModule_ProvideMetricsTimerFactoryFactory implements Factory<MetricsTimerFactory> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MetricsModule_ProvideMetricsTimerFactoryFactory INSTANCE = new MetricsModule_ProvideMetricsTimerFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static MetricsModule_ProvideMetricsTimerFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MetricsTimerFactory provideMetricsTimerFactory() {
        return (MetricsTimerFactory) Preconditions.checkNotNullFromProvides(MetricsModule.provideMetricsTimerFactory());
    }

    @Override // javax.inject.Provider
    public MetricsTimerFactory get() {
        return provideMetricsTimerFactory();
    }
}
