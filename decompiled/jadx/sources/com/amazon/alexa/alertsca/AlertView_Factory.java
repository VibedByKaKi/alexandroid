package com.amazon.alexa.alertsca;

import android.content.Context;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertView_Factory implements Factory<AlertView> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public AlertView_Factory(Provider<Context> provider, Provider<MetricsService> provider2) {
        this.contextProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static AlertView_Factory create(Provider<Context> provider, Provider<MetricsService> provider2) {
        return new AlertView_Factory(provider, provider2);
    }

    public static AlertView newInstance(Context context, MetricsService metricsService) {
        return new AlertView(context, metricsService);
    }

    @Override // javax.inject.Provider
    public AlertView get() {
        return newInstance(this.contextProvider.get(), this.metricsServiceProvider.get());
    }
}
