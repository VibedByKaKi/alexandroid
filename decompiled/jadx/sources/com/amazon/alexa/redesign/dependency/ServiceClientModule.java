package com.amazon.alexa.redesign.dependency;

import com.amazon.alexa.notification.api.NotificationCenterFetchProtocol;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.redesign.HomeServiceInterface;
import com.amazon.alexa.redesign.client.CosmoServiceClient;
import com.amazon.alexa.redesign.client.HomeFeedServiceClient;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class ServiceClientModule {
    @Provides
    @Singleton
    public CosmoServiceClient provideCosmoServiceClient(HomeServiceInterface homeServiceInterface) {
        return homeServiceInterface.cosmoServiceClient();
    }

    @Provides
    @Singleton
    public HomeFeedServiceClient provideHomeFeedServiceClient(HomeServiceInterface homeServiceInterface) {
        return homeServiceInterface.getHomeServiceClient();
    }

    @Provides
    @Singleton
    public HomeServiceInterface provideHomeServiceInterface() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(HomeServiceInterface.class).get();
        return (HomeServiceInterface) obj;
    }

    @Provides
    @Singleton
    public NotificationCenterFetchProtocol provideNotificationCenterFetchProtocol() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(NotificationCenterFetchProtocol.class).get();
        return (NotificationCenterFetchProtocol) obj;
    }
}
