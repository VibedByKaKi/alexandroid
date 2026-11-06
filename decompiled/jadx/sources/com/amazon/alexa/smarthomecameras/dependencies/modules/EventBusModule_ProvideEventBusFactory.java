package com.amazon.alexa.smarthomecameras.dependencies.modules;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class EventBusModule_ProvideEventBusFactory implements Factory<EventBus> {
    private static final EventBusModule_ProvideEventBusFactory INSTANCE = new EventBusModule_ProvideEventBusFactory();

    public static EventBusModule_ProvideEventBusFactory create() {
        return INSTANCE;
    }

    public static EventBus provideEventBus() {
        return (EventBus) Preconditions.checkNotNull(EventBusModule.provideEventBus(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return provideEventBus();
    }
}
