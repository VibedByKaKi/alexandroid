package com.amazon.commscore.dependencies;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class AlexaModule {
    private Lazy<EventBus> eventBusLazy;

    public AlexaModule(Lazy<EventBus> lazy) {
        this.eventBusLazy = lazy;
    }

    @Provides
    public EventBus providesEventBus() {
        return this.eventBusLazy.get();
    }
}
