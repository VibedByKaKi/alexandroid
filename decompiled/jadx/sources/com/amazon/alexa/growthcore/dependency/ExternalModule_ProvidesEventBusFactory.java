package com.amazon.alexa.growthcore.dependency;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ExternalModule_ProvidesEventBusFactory implements Factory<EventBus> {
    private final ExternalModule module;

    public ExternalModule_ProvidesEventBusFactory(ExternalModule externalModule) {
        this.module = externalModule;
    }

    public static ExternalModule_ProvidesEventBusFactory create(ExternalModule externalModule) {
        return new ExternalModule_ProvidesEventBusFactory(externalModule);
    }

    public static EventBus providesEventBus(ExternalModule externalModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(externalModule.providesEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return providesEventBus(this.module);
    }
}
