package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.mobilytics.Mobilytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class MetricsModule_ProvideMobilyticsFactory implements Factory<Mobilytics> {
    private final MetricsModule module;

    public MetricsModule_ProvideMobilyticsFactory(MetricsModule metricsModule) {
        this.module = metricsModule;
    }

    public static MetricsModule_ProvideMobilyticsFactory create(MetricsModule metricsModule) {
        return new MetricsModule_ProvideMobilyticsFactory(metricsModule);
    }

    public static Mobilytics provideMobilytics(MetricsModule metricsModule) {
        return (Mobilytics) Preconditions.checkNotNullFromProvides(metricsModule.provideMobilytics());
    }

    @Override // javax.inject.Provider
    public Mobilytics get() {
        return provideMobilytics(this.module);
    }
}
