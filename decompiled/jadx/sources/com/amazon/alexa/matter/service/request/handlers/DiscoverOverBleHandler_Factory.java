package com.amazon.alexa.matter.service.request.handlers;

import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.matter.discovery.DiscoveryService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class DiscoverOverBleHandler_Factory implements Factory<DiscoverOverBleHandler> {
    private final Provider<DiscoveryService> discoveryServiceProvider;
    private final Provider<MatterLogger> loggerProvider;

    public DiscoverOverBleHandler_Factory(Provider<DiscoveryService> provider, Provider<MatterLogger> provider2) {
        this.discoveryServiceProvider = provider;
        this.loggerProvider = provider2;
    }

    public static DiscoverOverBleHandler_Factory create(Provider<DiscoveryService> provider, Provider<MatterLogger> provider2) {
        return new DiscoverOverBleHandler_Factory(provider, provider2);
    }

    public static DiscoverOverBleHandler newInstance(DiscoveryService discoveryService, MatterLogger matterLogger) {
        return new DiscoverOverBleHandler(discoveryService, matterLogger);
    }

    @Override // javax.inject.Provider
    public DiscoverOverBleHandler get() {
        return newInstance(this.discoveryServiceProvider.get(), this.loggerProvider.get());
    }
}
