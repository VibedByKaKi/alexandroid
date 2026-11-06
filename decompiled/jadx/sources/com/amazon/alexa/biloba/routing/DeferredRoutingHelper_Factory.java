package com.amazon.alexa.biloba.routing;

import com.amazon.alexa.routing.api.RoutingService;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DeferredRoutingHelper_Factory implements Factory<DeferredRoutingHelper> {
    private final Provider<RoutingService> routingServiceProvider;

    public DeferredRoutingHelper_Factory(Provider<RoutingService> provider) {
        this.routingServiceProvider = provider;
    }

    public static DeferredRoutingHelper_Factory create(Provider<RoutingService> provider) {
        return new DeferredRoutingHelper_Factory(provider);
    }

    public static DeferredRoutingHelper newInstance() {
        return new DeferredRoutingHelper();
    }

    @Override // javax.inject.Provider
    public DeferredRoutingHelper get() {
        DeferredRoutingHelper deferredRoutingHelper = new DeferredRoutingHelper();
        DeferredRoutingHelper_MembersInjector.injectRoutingService(deferredRoutingHelper, DoubleCheck.lazy(this.routingServiceProvider));
        return deferredRoutingHelper;
    }
}
