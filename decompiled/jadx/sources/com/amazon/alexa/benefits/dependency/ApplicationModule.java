package com.amazon.alexa.benefits.dependency;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.tasks.api.TaskManager;
import com.dee.app.http.CoralService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public final class ApplicationModule {
    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public AlexaMobileFrameworkApisV2 provideAlexaMobileFrameworkApis(Context context) {
        return new AlexaMobileFrameworkApisV2(context, ApplicationModule.class.getName());
    }

    @Provides
    @Singleton
    public ConfigService provideConfigService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ConfigService.class).get();
        return (ConfigService) obj;
    }

    @Provides
    public Context provideContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public CoralService provideCoralService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CoralService.class).get();
        return (CoralService) obj;
    }

    @Provides
    @Singleton
    public DeviceInformation provideDeviceInformation() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(DeviceInformation.class).get();
        return (DeviceInformation) obj;
    }

    @Provides
    @Singleton
    public EnvironmentService provideEnvironmentService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EnvironmentService.class).get();
        return (EnvironmentService) obj;
    }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }

    @Provides
    @Singleton
    public FeatureServiceV2 provideFeatureServiceV2() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(FeatureServiceV2.class).get();
        return (FeatureServiceV2) obj;
    }

    @Provides
    @Singleton
    public IdentityService provideIdentityService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(IdentityService.class).get();
        return (IdentityService) obj;
    }

    @Provides
    @Singleton
    public Mobilytics provideMobilytics() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(Mobilytics.class).get();
        return (Mobilytics) obj;
    }

    @Provides
    @Singleton
    public NetworkService provideNetworkService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(NetworkService.class).get();
        return (NetworkService) obj;
    }

    @Provides
    @Singleton
    public PersistentStorage.Factory providePersistentStorageFactory() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(PersistentStorage.Factory.class).get();
        return (PersistentStorage.Factory) obj;
    }

    @Provides
    @Singleton
    public RoutingService provideRoutingService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(RoutingService.class).get();
        return (RoutingService) obj;
    }

    @Provides
    @Singleton
    public TaskManager provideTaskManager() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(TaskManager.class).get();
        return (TaskManager) obj;
    }
}
