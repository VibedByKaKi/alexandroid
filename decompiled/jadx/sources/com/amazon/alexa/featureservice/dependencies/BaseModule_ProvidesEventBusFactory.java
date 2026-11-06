package com.amazon.alexa.featureservice.dependencies;

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
public final class BaseModule_ProvidesEventBusFactory implements Factory<EventBus> {
    private final BaseModule module;

    public BaseModule_ProvidesEventBusFactory(BaseModule baseModule) {
        this.module = baseModule;
    }

    public static BaseModule_ProvidesEventBusFactory create(BaseModule baseModule) {
        return new BaseModule_ProvidesEventBusFactory(baseModule);
    }

    public static EventBus providesEventBus(BaseModule baseModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(baseModule.providesEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return providesEventBus(this.module);
    }
}
