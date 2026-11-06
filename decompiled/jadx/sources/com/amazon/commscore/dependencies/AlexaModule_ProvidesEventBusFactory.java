package com.amazon.commscore.dependencies;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AlexaModule_ProvidesEventBusFactory implements Factory<EventBus> {
    private final AlexaModule module;

    public AlexaModule_ProvidesEventBusFactory(AlexaModule alexaModule) {
        this.module = alexaModule;
    }

    public static AlexaModule_ProvidesEventBusFactory create(AlexaModule alexaModule) {
        return new AlexaModule_ProvidesEventBusFactory(alexaModule);
    }

    public static EventBus providesEventBus(AlexaModule alexaModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(alexaModule.providesEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return providesEventBus(this.module);
    }
}
