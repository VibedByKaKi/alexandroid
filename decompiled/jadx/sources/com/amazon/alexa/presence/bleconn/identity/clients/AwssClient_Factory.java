package com.amazon.alexa.presence.bleconn.identity.clients;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class AwssClient_Factory implements Factory<AwssClient> {
    private final Provider<MetricsServiceV2> metricsServiceProvider;
    private final Provider<Mobilytics> mobilyticsProvider;

    public AwssClient_Factory(Provider<MetricsServiceV2> provider, Provider<Mobilytics> provider2) {
        this.metricsServiceProvider = provider;
        this.mobilyticsProvider = provider2;
    }

    public static AwssClient_Factory create(Provider<MetricsServiceV2> provider, Provider<Mobilytics> provider2) {
        return new AwssClient_Factory(provider, provider2);
    }

    public static AwssClient newInstance(MetricsServiceV2 metricsServiceV2, Mobilytics mobilytics) {
        return new AwssClient(metricsServiceV2, mobilytics);
    }

    @Override // javax.inject.Provider
    public AwssClient get() {
        return newInstance(this.metricsServiceProvider.get(), this.mobilyticsProvider.get());
    }
}
