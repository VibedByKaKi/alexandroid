package com.amazon.alexa.benefits.dependency;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideEventBusFactory implements Factory<EventBus> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideEventBusFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideEventBusFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideEventBusFactory(applicationModule);
    }

    public static EventBus provideEventBus(ApplicationModule applicationModule) {
        return (EventBus) Preconditions.checkNotNull(applicationModule.provideEventBus(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return provideEventBus(this.module);
    }
}
