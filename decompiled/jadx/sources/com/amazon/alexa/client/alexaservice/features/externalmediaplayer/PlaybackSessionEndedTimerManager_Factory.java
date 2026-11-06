package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

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
public final class PlaybackSessionEndedTimerManager_Factory implements Factory<PlaybackSessionEndedTimerManager> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;
    private final Provider<PlayerStatePersister> playerStatePersisterProvider;

    public PlaybackSessionEndedTimerManager_Factory(Provider<AlexaClientEventBus> provider, Provider<PlayerStatePersister> provider2) {
        this.alexaClientEventBusProvider = provider;
        this.playerStatePersisterProvider = provider2;
    }

    public static PlaybackSessionEndedTimerManager_Factory create(Provider<AlexaClientEventBus> provider, Provider<PlayerStatePersister> provider2) {
        return new PlaybackSessionEndedTimerManager_Factory(provider, provider2);
    }

    public static PlaybackSessionEndedTimerManager newInstance(AlexaClientEventBus alexaClientEventBus, Object obj) {
        return new PlaybackSessionEndedTimerManager(alexaClientEventBus, (PlayerStatePersister) obj);
    }

    @Override // javax.inject.Provider
    public PlaybackSessionEndedTimerManager get() {
        return newInstance(this.alexaClientEventBusProvider.get(), this.playerStatePersisterProvider.get());
    }
}
