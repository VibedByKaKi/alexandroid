package com.dee.app.contactsLibrary.dagger.modules;

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
/* loaded from: classes6.dex */
public final class EventBusModule_ProvideEventBusFactory implements Factory<EventBus> {
    private final EventBusModule module;

    public EventBusModule_ProvideEventBusFactory(EventBusModule eventBusModule) {
        this.module = eventBusModule;
    }

    public static EventBusModule_ProvideEventBusFactory create(EventBusModule eventBusModule) {
        return new EventBusModule_ProvideEventBusFactory(eventBusModule);
    }

    public static EventBus provideEventBus(EventBusModule eventBusModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(eventBusModule.provideEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return provideEventBus(this.module);
    }
}
