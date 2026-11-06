package com.amazon.alexa.mobilytics.configuration;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class RegionResolver_Factory implements Factory<RegionResolver> {
    private final Provider<EndpointManager> endpointManagerProvider;

    public RegionResolver_Factory(Provider<EndpointManager> provider) {
        this.endpointManagerProvider = provider;
    }

    public static RegionResolver_Factory create(Provider<EndpointManager> provider) {
        return new RegionResolver_Factory(provider);
    }

    public static RegionResolver newInstance(EndpointManager endpointManager) {
        return new RegionResolver(endpointManager);
    }

    @Override // javax.inject.Provider
    public RegionResolver get() {
        return newInstance(this.endpointManagerProvider.get());
    }
}
