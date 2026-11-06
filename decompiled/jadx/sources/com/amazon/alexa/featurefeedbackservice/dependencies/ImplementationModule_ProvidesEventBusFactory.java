package com.amazon.alexa.featurefeedbackservice.dependencies;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ImplementationModule_ProvidesEventBusFactory implements Factory<EventBus> {
    private final ImplementationModule module;

    public ImplementationModule_ProvidesEventBusFactory(ImplementationModule implementationModule) {
        this.module = implementationModule;
    }

    public static ImplementationModule_ProvidesEventBusFactory create(ImplementationModule implementationModule) {
        return new ImplementationModule_ProvidesEventBusFactory(implementationModule);
    }

    public static EventBus providesEventBus(ImplementationModule implementationModule) {
        return (EventBus) Preconditions.checkNotNull(implementationModule.providesEventBus(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return providesEventBus(this.module);
    }
}
