package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.playbacksession;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class TransitionalPlaybackSessionIdStore {
    private static final String TAG = "TransitionalPlaybackSessionIdStore";
    private final Map<ExternalPlayerIdentifier, PlaybackSessionIdentifier> transitionalPlaybackSessionIds = new HashMap();

    @Inject
    public TransitionalPlaybackSessionIdStore() {
    }

    public synchronized void clearPlaybackSessionId(ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.transitionalPlaybackSessionIds.remove(externalPlayerIdentifier);
    }

    @Nullable
    public synchronized PlaybackSessionIdentifier getPlaybackSessionId(ExternalPlayerIdentifier externalPlayerIdentifier) {
        return this.transitionalPlaybackSessionIds.get(externalPlayerIdentifier);
    }

    public synchronized void setPlaybackSessionId(ExternalPlayerIdentifier externalPlayerIdentifier, PlaybackSessionIdentifier playbackSessionIdentifier) {
        this.transitionalPlaybackSessionIds.put(externalPlayerIdentifier, playbackSessionIdentifier);
    }
}
