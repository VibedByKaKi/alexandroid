package com.amazon.alexa.biloba.view.infoModal;

import com.amazon.alexa.routing.api.RoutingService;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class InfoModalViewModel_MembersInjector implements MembersInjector<InfoModalViewModel> {
    private final Provider<RoutingService> routingServiceProvider;

    public InfoModalViewModel_MembersInjector(Provider<RoutingService> provider) {
        this.routingServiceProvider = provider;
    }

    public static MembersInjector<InfoModalViewModel> create(Provider<RoutingService> provider) {
        return new InfoModalViewModel_MembersInjector(provider);
    }

    public static void injectRoutingService(InfoModalViewModel infoModalViewModel, Lazy<RoutingService> lazy) {
        infoModalViewModel.routingService = lazy;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InfoModalViewModel infoModalViewModel) {
        injectRoutingService(infoModalViewModel, DoubleCheck.lazy(this.routingServiceProvider));
    }
}
