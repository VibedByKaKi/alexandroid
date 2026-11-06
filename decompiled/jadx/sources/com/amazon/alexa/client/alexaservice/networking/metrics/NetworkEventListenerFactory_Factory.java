package com.amazon.alexa.client.alexaservice.networking.metrics;

import com.amazon.alexa.utils.TimeProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class NetworkEventListenerFactory_Factory implements Factory<NetworkEventListenerFactory> {
    private final Provider<NetworkEventListenerReporter> networkEventListenerReporterProvider;
    private final Provider<TimeProvider> timeProvider;

    public NetworkEventListenerFactory_Factory(Provider<NetworkEventListenerReporter> provider, Provider<TimeProvider> provider2) {
        this.networkEventListenerReporterProvider = provider;
        this.timeProvider = provider2;
    }

    public static NetworkEventListenerFactory_Factory create(Provider<NetworkEventListenerReporter> provider, Provider<TimeProvider> provider2) {
        return new NetworkEventListenerFactory_Factory(provider, provider2);
    }

    public static NetworkEventListenerFactory newInstance(NetworkEventListenerReporter networkEventListenerReporter, TimeProvider timeProvider) {
        return new NetworkEventListenerFactory(networkEventListenerReporter, timeProvider);
    }

    @Override // javax.inject.Provider
    public NetworkEventListenerFactory get() {
        return newInstance(this.networkEventListenerReporterProvider.get(), this.timeProvider.get());
    }
}
