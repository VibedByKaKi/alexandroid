package com.amazon.dee.app.dependencies;

import com.amazon.alexa.component.api.ServiceLifecycle;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public final class EventBusModule {
    @Provides
    @ApplicationScope
    public EventBus provideEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }

    @Provides
    @ApplicationScope
    public ServiceLifecycle provideEventBusService(EventBus eventBus) {
        return (ServiceLifecycle) eventBus;
    }
}
