package com.amazon.dee.app.dependencies;

import com.amazon.alexa.component.api.ServiceLifecycle;
import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class EventBusModule_ProvideEventBusServiceFactory implements Factory<ServiceLifecycle> {
    private final Provider<EventBus> eventBusProvider;
    private final EventBusModule module;

    public EventBusModule_ProvideEventBusServiceFactory(EventBusModule eventBusModule, Provider<EventBus> provider) {
        this.module = eventBusModule;
        this.eventBusProvider = provider;
    }

    public static EventBusModule_ProvideEventBusServiceFactory create(EventBusModule eventBusModule, Provider<EventBus> provider) {
        return new EventBusModule_ProvideEventBusServiceFactory(eventBusModule, provider);
    }

    public static ServiceLifecycle provideEventBusService(EventBusModule eventBusModule, EventBus eventBus) {
        return (ServiceLifecycle) Preconditions.checkNotNullFromProvides(eventBusModule.provideEventBusService(eventBus));
    }

    @Override // javax.inject.Provider
    public ServiceLifecycle get() {
        return provideEventBusService(this.module, this.eventBusProvider.get());
    }
}
