package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlaybackEventInterpreter {
    private static final String TAG = "PlaybackEventInterpreter";
    private boolean isPlaying;
    private final PlaybackSessionEndedTimerManager timerManager;

    @VisibleForTesting
    public PlaybackEventInterpreter(boolean z, PlaybackSessionEndedTimerManager playbackSessionEndedTimerManager) {
        this.isPlaying = z;
        this.timerManager = playbackSessionEndedTimerManager;
    }

    private void setPlaying(ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.isPlaying = true;
        this.timerManager.cancelPlaybackSessionEndedTimer(externalPlayerIdentifier);
    }

    private void setStopped(PlaybackSessionIdentifier playbackSessionIdentifier, ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.isPlaying = false;
        this.timerManager.setPlaybackSessionEndedTimer(playbackSessionIdentifier, externalPlayerIdentifier);
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public Set<PlayerEvent> process(int i, int i2, ExternalPlayerIdentifier externalPlayerIdentifier, PlaybackSessionIdentifier playbackSessionIdentifier) {
        HashSet hashSet = new HashSet();
        String str = TAG;
        Log.i(str, String.format("currentState: %d, newState: %d.", Integer.valueOf(i), Integer.valueOf(i2)));
        if (i2 == 7) {
            Log.i(str, String.format("eventToSend: %s.", hashSet));
            return hashSet;
        }
        if (i == i2) {
            Log.i(str, String.format("eventToSend: %s.", hashSet));
            return hashSet;
        }
        boolean z = this.isPlaying;
        if (!z && i2 == 3) {
            setPlaying(externalPlayerIdentifier);
            hashSet.add(PlayerEvent.PLAYBACK_STARTED);
            Log.i(str, String.format("eventToSend: %s.", hashSet));
            return hashSet;
        }
        if (z && i2 == 2) {
            setStopped(playbackSessionIdentifier, externalPlayerIdentifier);
            hashSet.add(PlayerEvent.PLAYBACK_STOPPED);
            Log.i(str, String.format("eventToSend: %s.", hashSet));
            return hashSet;
        }
        if (z && (i == 4 || i == 5)) {
            hashSet.add(PlayerEvent.PLAY_MODE_CHANGED);
        }
        Log.i(str, String.format("eventToSend: %s.", hashSet));
        return hashSet;
    }

    public PlaybackEventInterpreter(PlaybackSessionEndedTimerManager playbackSessionEndedTimerManager) {
        this(false, playbackSessionEndedTimerManager);
    }
}
