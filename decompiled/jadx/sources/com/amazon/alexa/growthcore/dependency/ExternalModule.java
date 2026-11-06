package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentGetter;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ExternalModule {
    private final ComponentGetter componentGetter;

    public ExternalModule(ComponentGetter componentGetter) {
        this.componentGetter = componentGetter;
    }

    @Provides
    @Singleton
    public ConfigService providesConfigService() {
        return (ConfigService) this.componentGetter.get(ConfigService.class).get();
    }

    @Provides
    @Singleton
    public EnvironmentService providesEnvironmentService() {
        return (EnvironmentService) this.componentGetter.get(EnvironmentService.class).get();
    }

    @Provides
    @Singleton
    public EventBus providesEventBus() {
        return (EventBus) this.componentGetter.get(EventBus.class).get();
    }

    @Provides
    @Singleton
    public Mobilytics providesMobilytics() {
        return (Mobilytics) this.componentGetter.get(Mobilytics.class).get();
    }
}
