package com.amazon.alexa.voice.events;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.voice.ra.RaConversationBroadcastReceiver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class EventsModule_ProvideRaConversationBroadcastReceiverFactory implements Factory<RaConversationBroadcastReceiver> {
    private final Provider<EventBus> eventBusProvider;

    public EventsModule_ProvideRaConversationBroadcastReceiverFactory(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static EventsModule_ProvideRaConversationBroadcastReceiverFactory create(Provider<EventBus> provider) {
        return new EventsModule_ProvideRaConversationBroadcastReceiverFactory(provider);
    }

    public static RaConversationBroadcastReceiver provideRaConversationBroadcastReceiver(EventBus eventBus) {
        return (RaConversationBroadcastReceiver) Preconditions.checkNotNullFromProvides(EventsModule.provideRaConversationBroadcastReceiver(eventBus));
    }

    @Override // javax.inject.Provider
    public RaConversationBroadcastReceiver get() {
        return provideRaConversationBroadcastReceiver(this.eventBusProvider.get());
    }
}
