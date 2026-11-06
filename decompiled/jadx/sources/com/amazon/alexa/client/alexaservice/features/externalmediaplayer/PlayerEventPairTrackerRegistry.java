package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PlayerEventPairTrackerRegistry {
    private final Map<ExternalPlayerIdentifier, PlayerEventPairTracker> trackers = new HashMap();

    @Inject
    public PlayerEventPairTrackerRegistry() {
    }

    public PlayerEventPairTracker get(ExternalPlayerIdentifier externalPlayerIdentifier) {
        PlayerEventPairTracker playerEventPairTracker = this.trackers.get(externalPlayerIdentifier);
        if (playerEventPairTracker != null) {
            return playerEventPairTracker;
        }
        PlayerEventPairTracker playerEventPairTracker2 = new PlayerEventPairTracker();
        this.trackers.put(externalPlayerIdentifier, playerEventPairTracker2);
        return playerEventPairTracker2;
    }
}
