package com.amazon.alexa.client.alexaservice.base.interactions;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.Channels;
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
public final class BecomingNoisyManager_Factory implements Factory<BecomingNoisyManager> {
    private final Provider<Channels> channelsProvider;
    private final Provider<Context> contextProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public BecomingNoisyManager_Factory(Provider<Context> provider, Provider<AlexaClientEventBus> provider2, Provider<Channels> provider3) {
        this.contextProvider = provider;
        this.eventBusProvider = provider2;
        this.channelsProvider = provider3;
    }

    public static BecomingNoisyManager_Factory create(Provider<Context> provider, Provider<AlexaClientEventBus> provider2, Provider<Channels> provider3) {
        return new BecomingNoisyManager_Factory(provider, provider2, provider3);
    }

    public static BecomingNoisyManager newInstance(Context context, AlexaClientEventBus alexaClientEventBus, Channels channels) {
        return new BecomingNoisyManager(context, alexaClientEventBus, channels);
    }

    @Override // javax.inject.Provider
    public BecomingNoisyManager get() {
        return newInstance(this.contextProvider.get(), this.eventBusProvider.get(), this.channelsProvider.get());
    }
}
