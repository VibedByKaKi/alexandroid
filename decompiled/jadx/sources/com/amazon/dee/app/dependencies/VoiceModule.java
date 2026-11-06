package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.identity.api.AccountUpgradeService;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.voice.app.LatencyReportingDelegate;
import com.amazon.alexa.voice.model.VoiceService;
import com.amazon.alexa.voice.model.VoiceServiceFactory;
import com.amazon.dee.app.services.core.DefaultApplicationLifecycleService;
import com.amazon.regulator.Component;
import com.dee.app.metrics.MetricsService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public final class VoiceModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Context lambda$provideVoiceService$0(Lazy lazy) {
        return (Context) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DeviceInformation lambda$provideVoiceService$1(Lazy lazy) {
        return (DeviceInformation) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ EnvironmentService lambda$provideVoiceService$10(Lazy lazy) {
        return (EnvironmentService) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IdentityService lambda$provideVoiceService$2(Lazy lazy) {
        return (IdentityService) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AccountUpgradeService lambda$provideVoiceService$3(Lazy lazy) {
        return (AccountUpgradeService) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NetworkService lambda$provideVoiceService$4(Lazy lazy) {
        return (NetworkService) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PersistentStorage.Factory lambda$provideVoiceService$5(Lazy lazy) {
        return (PersistentStorage.Factory) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LatencyReportingDelegate lambda$provideVoiceService$6(Lazy lazy) {
        return (LatencyReportingDelegate) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MetricsService lambda$provideVoiceService$7(Lazy lazy) {
        return (MetricsService) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApplicationLifecycleService lambda$provideVoiceService$8(Lazy lazy) {
        return (ApplicationLifecycleService) lazy.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RoutingService lambda$provideVoiceService$9(Lazy lazy) {
        return (RoutingService) lazy.get();
    }

    @Provides
    @ApplicationScope
    public LatencyReportingDelegate provideLatencyReportingDelegate() {
        return new VoiceModule$$ExternalSyntheticLambda11();
    }

    @Provides
    @ApplicationScope
    @IntoSet
    public MessagingReceiver provideVoiceMessagingReceiver(VoiceService voiceService) {
        return voiceService.getMessagingReceiver();
    }

    @Provides
    @ApplicationScope
    public VoiceService provideVoiceService(Lazy<Context> lazy, Lazy<DeviceInformation> lazy2, Lazy<IdentityService> lazy3, Lazy<AccountUpgradeService> lazy4, Lazy<NetworkService> lazy5, Lazy<PersistentStorage.Factory> lazy6, Lazy<LatencyReportingDelegate> lazy7, Lazy<MetricsService> lazy8, Lazy<RoutingService> lazy9, Lazy<DefaultApplicationLifecycleService> lazy10, Lazy<EnvironmentService> lazy11) {
        Component component = new Component();
        component.provide(Context.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy, 8)).register();
        component.provide(DeviceInformation.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy2, 11)).register();
        component.provide(IdentityService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy3, 12)).register();
        component.provide(AccountUpgradeService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy4, 13)).register();
        component.provide(NetworkService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy5, 14)).register();
        component.provide(PersistentStorage.Factory.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy6, 15)).register();
        component.provide(LatencyReportingDelegate.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy7, 16)).register();
        component.provide(MetricsService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy8, 17)).register();
        component.provide(ApplicationLifecycleService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy10, 18)).register();
        component.provide(RoutingService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy9, 9)).register();
        component.provide(EnvironmentService.class, (Component.Provider) new HomeModule$$ExternalSyntheticLambda1(lazy11, 10)).register();
        return VoiceServiceFactory.create(component);
    }
}
