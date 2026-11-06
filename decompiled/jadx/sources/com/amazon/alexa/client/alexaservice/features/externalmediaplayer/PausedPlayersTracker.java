package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PausedPlayersTracker {
    private final Set<ExternalPlayerIdentifier> pausedPlayers = new HashSet();
    private final Set<ExternalPlayerIdentifier> stoppedPlayers = new HashSet();

    public void addPausedPlayer(ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.pausedPlayers.add(externalPlayerIdentifier);
    }

    public void addStoppedPlayer(ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.stoppedPlayers.add(externalPlayerIdentifier);
    }

    public boolean isPlayerPaused(ExternalPlayerIdentifier externalPlayerIdentifier) {
        return this.pausedPlayers.contains(externalPlayerIdentifier);
    }

    public boolean isPlayerStopped(ExternalPlayerIdentifier externalPlayerIdentifier) {
        return this.stoppedPlayers.contains(externalPlayerIdentifier);
    }

    public void removePlayer(ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.pausedPlayers.remove(externalPlayerIdentifier);
        this.stoppedPlayers.remove(externalPlayerIdentifier);
    }
}
