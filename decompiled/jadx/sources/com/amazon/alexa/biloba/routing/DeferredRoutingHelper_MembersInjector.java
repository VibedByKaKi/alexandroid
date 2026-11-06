package com.amazon.alexa.biloba.routing;

import com.amazon.alexa.routing.api.RoutingService;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DeferredRoutingHelper_MembersInjector implements MembersInjector<DeferredRoutingHelper> {
    private final Provider<RoutingService> routingServiceProvider;

    public DeferredRoutingHelper_MembersInjector(Provider<RoutingService> provider) {
        this.routingServiceProvider = provider;
    }

    public static MembersInjector<DeferredRoutingHelper> create(Provider<RoutingService> provider) {
        return new DeferredRoutingHelper_MembersInjector(provider);
    }

    public static void injectRoutingService(DeferredRoutingHelper deferredRoutingHelper, Lazy<RoutingService> lazy) {
        deferredRoutingHelper.routingService = lazy;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DeferredRoutingHelper deferredRoutingHelper) {
        injectRoutingService(deferredRoutingHelper, DoubleCheck.lazy(this.routingServiceProvider));
    }
}
