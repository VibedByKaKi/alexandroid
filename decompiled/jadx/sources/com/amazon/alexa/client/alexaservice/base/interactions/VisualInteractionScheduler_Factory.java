package com.amazon.alexa.client.alexaservice.base.interactions;

import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannels;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VisualInteractionScheduler_Factory implements Factory<VisualInteractionScheduler> {
    private final Provider<VisualChannels> channelsProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public VisualInteractionScheduler_Factory(Provider<VisualChannels> provider, Provider<AlexaClientEventBus> provider2) {
        this.channelsProvider = provider;
        this.eventBusProvider = provider2;
    }

    public static VisualInteractionScheduler_Factory create(Provider<VisualChannels> provider, Provider<AlexaClientEventBus> provider2) {
        return new VisualInteractionScheduler_Factory(provider, provider2);
    }

    public static VisualInteractionScheduler newInstance(VisualChannels visualChannels, AlexaClientEventBus alexaClientEventBus) {
        return new VisualInteractionScheduler(visualChannels, alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public VisualInteractionScheduler get() {
        return newInstance(this.channelsProvider.get(), this.eventBusProvider.get());
    }
}
