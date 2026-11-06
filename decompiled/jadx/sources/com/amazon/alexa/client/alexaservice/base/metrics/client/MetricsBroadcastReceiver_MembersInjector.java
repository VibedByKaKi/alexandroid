package com.amazon.alexa.client.alexaservice.base.metrics.client;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MetricsBroadcastReceiver_MembersInjector implements MembersInjector<MetricsBroadcastReceiver> {
    private final Provider<ClientMetricsDao> clientMetricsDaoProvider;

    public MetricsBroadcastReceiver_MembersInjector(Provider<ClientMetricsDao> provider) {
        this.clientMetricsDaoProvider = provider;
    }

    public static MembersInjector<MetricsBroadcastReceiver> create(Provider<ClientMetricsDao> provider) {
        return new MetricsBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.base.metrics.client.MetricsBroadcastReceiver.clientMetricsDao")
    public static void injectClientMetricsDao(MetricsBroadcastReceiver metricsBroadcastReceiver, ClientMetricsDao clientMetricsDao) {
        metricsBroadcastReceiver.clientMetricsDao = clientMetricsDao;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MetricsBroadcastReceiver metricsBroadcastReceiver) {
        injectClientMetricsDao(metricsBroadcastReceiver, this.clientMetricsDaoProvider.get());
    }
}
