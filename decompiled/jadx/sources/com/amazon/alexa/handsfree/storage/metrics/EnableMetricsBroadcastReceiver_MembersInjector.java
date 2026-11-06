package com.amazon.alexa.handsfree.storage.metrics;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class EnableMetricsBroadcastReceiver_MembersInjector implements MembersInjector<EnableMetricsBroadcastReceiver> {
    private final Provider<MetricsEnabledStatusStore> mMetricsEnabledStatusStoreProvider;

    public EnableMetricsBroadcastReceiver_MembersInjector(Provider<MetricsEnabledStatusStore> provider) {
        this.mMetricsEnabledStatusStoreProvider = provider;
    }

    public static MembersInjector<EnableMetricsBroadcastReceiver> create(Provider<MetricsEnabledStatusStore> provider) {
        return new EnableMetricsBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.storage.metrics.EnableMetricsBroadcastReceiver.mMetricsEnabledStatusStore")
    public static void injectMMetricsEnabledStatusStore(EnableMetricsBroadcastReceiver enableMetricsBroadcastReceiver, MetricsEnabledStatusStore metricsEnabledStatusStore) {
        enableMetricsBroadcastReceiver.mMetricsEnabledStatusStore = metricsEnabledStatusStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EnableMetricsBroadcastReceiver enableMetricsBroadcastReceiver) {
        injectMMetricsEnabledStatusStore(enableMetricsBroadcastReceiver, this.mMetricsEnabledStatusStoreProvider.get());
    }
}
