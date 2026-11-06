package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class RemoteConfigDeserializer_Factory implements Factory<RemoteConfigDeserializer> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsReporter> metricsReporterProvider;

    public RemoteConfigDeserializer_Factory(Provider<Context> provider, Provider<MetricsReporter> provider2) {
        this.contextProvider = provider;
        this.metricsReporterProvider = provider2;
    }

    public static RemoteConfigDeserializer_Factory create(Provider<Context> provider, Provider<MetricsReporter> provider2) {
        return new RemoteConfigDeserializer_Factory(provider, provider2);
    }

    public static RemoteConfigDeserializer newInstance(Context context, MetricsReporter metricsReporter) {
        return new RemoteConfigDeserializer(context, metricsReporter);
    }

    @Override // javax.inject.Provider
    public RemoteConfigDeserializer get() {
        return new RemoteConfigDeserializer(this.contextProvider.get(), this.metricsReporterProvider.get());
    }
}
