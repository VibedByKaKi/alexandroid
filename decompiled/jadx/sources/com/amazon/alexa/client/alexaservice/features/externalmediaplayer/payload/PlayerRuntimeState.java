package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.AutoValue_PlayerRuntimeState;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.C$AutoValue_PlayerRuntimeState;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PlayerRuntimeState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PlayerRuntimeState build();

        public abstract Builder setInactiveAvsPlaybackSessionId(PlaybackSessionIdentifier playbackSessionIdentifier);

        public abstract Builder setPlayerId(ExternalPlayerIdentifier externalPlayerIdentifier);
    }

    public static Builder builder(PlayerRuntimeState playerRuntimeState) {
        return new C$AutoValue_PlayerRuntimeState.Builder().setPlayerId(playerRuntimeState.getPlayerId()).setInactiveAvsPlaybackSessionId(playerRuntimeState.getInactiveAvsPlaybackSessionId());
    }

    public static TypeAdapter<PlayerRuntimeState> typeAdapter(Gson gson) {
        return new AutoValue_PlayerRuntimeState.GsonTypeAdapter(gson);
    }

    public abstract PlaybackSessionIdentifier getInactiveAvsPlaybackSessionId();

    public abstract ExternalPlayerIdentifier getPlayerId();

    public static Builder builder(ExternalPlayerIdentifier externalPlayerIdentifier) {
        return new C$AutoValue_PlayerRuntimeState.Builder().setPlayerId(externalPlayerIdentifier).setInactiveAvsPlaybackSessionId(PlaybackSessionIdentifier.NONE);
    }
}
