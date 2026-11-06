package com.amazon.alexa.voice.ra;

import com.amazon.alexa.eventbus.api.EventBus;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class RaConversationBroadcastReceiver_MembersInjector implements MembersInjector<RaConversationBroadcastReceiver> {
    private final Provider<EventBus> eventBusProvider;

    public RaConversationBroadcastReceiver_MembersInjector(Provider<EventBus> provider) {
        this.eventBusProvider = provider;
    }

    public static MembersInjector<RaConversationBroadcastReceiver> create(Provider<EventBus> provider) {
        return new RaConversationBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.voice.ra.RaConversationBroadcastReceiver.eventBus")
    public static void injectEventBus(RaConversationBroadcastReceiver raConversationBroadcastReceiver, EventBus eventBus) {
        raConversationBroadcastReceiver.eventBus = eventBus;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RaConversationBroadcastReceiver raConversationBroadcastReceiver) {
        injectEventBus(raConversationBroadcastReceiver, this.eventBusProvider.get());
    }
}
