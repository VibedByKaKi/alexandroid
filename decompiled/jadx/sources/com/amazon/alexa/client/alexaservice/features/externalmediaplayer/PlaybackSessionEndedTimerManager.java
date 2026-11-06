package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerTimerEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackSessionIdentifier;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.Player;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PlaybackSessionEndedTimerManager {
    private static final long PLAYBACK_SESSION_ENDED_TIMER_MS = 900000;
    private static final String TAG = "PlaybackSessionEndedTimerManager";
    private final AlexaClientEventBus alexaClientEventBus;
    private final Handler handler;
    private final Map<ExternalPlayerIdentifier, Runnable> ongoingTimersMap;
    private final PlayerStatePersister playerStatePersister;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class HandlePlaybackSessionEndedTimer implements Runnable {
        private final AlexaClientEventBus alexaClientEventBus;
        private final PlaybackSessionIdentifier playbackSessionId;
        private final ExternalPlayerIdentifier playerID;
        private final PlayerStatePersister playerStatePersister;

        public HandlePlaybackSessionEndedTimer(PlaybackSessionIdentifier playbackSessionIdentifier, ExternalPlayerIdentifier externalPlayerIdentifier, AlexaClientEventBus alexaClientEventBus, PlayerStatePersister playerStatePersister) {
            this.playbackSessionId = playbackSessionIdentifier;
            this.playerID = externalPlayerIdentifier;
            this.alexaClientEventBus = alexaClientEventBus;
            this.playerStatePersister = playerStatePersister;
        }

        @Override // java.lang.Runnable
        public void run() {
            Player load = this.playerStatePersister.load(this.playerID);
            if (load == null) {
                this.playerID.name();
                PlaybackSessionEndedTimerManager.this.ongoingTimersMap.remove(this.playerID);
                return;
            }
            this.alexaClientEventBus.post(ExternalMediaPlayerEvent.create(this.playerID, PlayerEvent.PLAYBACK_SESSION_ENDED, this.playbackSessionId));
            this.alexaClientEventBus.post(ExternalMediaPlayerTimerEvent.createEvent(ExternalMediaPlayerTimerMetricEnum.ELAPSED_TIMER));
            this.playerStatePersister.save(this.playerID, Player.builder(load).setPlaybackSessionId(PlaybackSessionIdentifier.NONE).build());
            Log.i(PlaybackSessionEndedTimerManager.TAG, String.format("Ending session for player '%s' with playbackSessionId %s", this.playerID, this.playbackSessionId));
            PlaybackSessionEndedTimerManager.this.ongoingTimersMap.remove(this.playerID);
        }
    }

    @Inject
    public PlaybackSessionEndedTimerManager(AlexaClientEventBus alexaClientEventBus, PlayerStatePersister playerStatePersister) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.playerStatePersister = playerStatePersister;
        this.handler = new Handler();
        this.ongoingTimersMap = new HashMap();
    }

    public void cancelPlaybackSessionEndedTimer(ExternalPlayerIdentifier externalPlayerIdentifier) {
        if (isTimerActive(externalPlayerIdentifier)) {
            this.handler.removeCallbacks(this.ongoingTimersMap.get(externalPlayerIdentifier));
            this.ongoingTimersMap.remove(externalPlayerIdentifier);
            this.alexaClientEventBus.post(ExternalMediaPlayerTimerEvent.createEvent(ExternalMediaPlayerTimerMetricEnum.CANCEL_TIMER));
            externalPlayerIdentifier.name();
        }
    }

    @VisibleForTesting
    public boolean isTimerActive(ExternalPlayerIdentifier externalPlayerIdentifier) {
        return this.ongoingTimersMap.get(externalPlayerIdentifier) != null;
    }

    public void setPlaybackSessionEndedTimer(PlaybackSessionIdentifier playbackSessionIdentifier, ExternalPlayerIdentifier externalPlayerIdentifier) {
        cancelPlaybackSessionEndedTimer(externalPlayerIdentifier);
        HandlePlaybackSessionEndedTimer handlePlaybackSessionEndedTimer = new HandlePlaybackSessionEndedTimer(playbackSessionIdentifier, externalPlayerIdentifier, this.alexaClientEventBus, this.playerStatePersister);
        this.handler.postDelayed(handlePlaybackSessionEndedTimer, 900000L);
        this.ongoingTimersMap.put(externalPlayerIdentifier, handlePlaybackSessionEndedTimer);
        this.alexaClientEventBus.post(ExternalMediaPlayerTimerEvent.createEvent(ExternalMediaPlayerTimerMetricEnum.SET_TIMER));
    }

    @VisibleForTesting
    public PlaybackSessionEndedTimerManager(AlexaClientEventBus alexaClientEventBus, PlayerStatePersister playerStatePersister, Handler handler) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.playerStatePersister = playerStatePersister;
        this.handler = handler;
        this.ongoingTimersMap = new HashMap();
    }
}
