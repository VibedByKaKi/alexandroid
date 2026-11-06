package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.base.device.data.CachingPersister;
import com.amazon.alexa.client.alexaservice.base.device.data.PersistedDataLoader;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlayerRuntimeState;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class PlayerRuntimeStatePersister extends CachingPersister<ExternalPlayerIdentifier, PlayerRuntimeState> {
    @Inject
    public PlayerRuntimeStatePersister(@Named("player_runtime_state_loader") Lazy<PersistedDataLoader> lazy) {
        super(PlayerRuntimeState.class, new ExternalPlayerIdentifierKeyFactory(), lazy);
    }
}
