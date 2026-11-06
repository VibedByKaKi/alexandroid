package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.MediaSessionPlaybackPausedEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.MediaSessionPlaybackStartedEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import java.util.Set;
import javax.inject.Inject;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalMediaPlayerPlaybackAuthority {
    private static final String TAG = "ExternalMediaPlayerPlaybackAuthority";
    private final AlexaClientEventBus eventBus;
    private final Set<ExternalPlayerIdentifier> externalMediaPlayerPlaying = ChatData$$ExternalSyntheticOutline0.m();

    @Inject
    public ExternalMediaPlayerPlaybackAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    public boolean isExternalMediaPlayerPlaying() {
        return !this.externalMediaPlayerPlaying.isEmpty();
    }

    @Subscribe
    public void on(MediaSessionPlaybackStartedEvent mediaSessionPlaybackStartedEvent) {
        Log.i(TAG, "Media session playback was started: " + mediaSessionPlaybackStartedEvent.getPlayerId());
        this.externalMediaPlayerPlaying.add(mediaSessionPlaybackStartedEvent.getPlayerId());
    }

    public void teardown() {
        this.eventBus.unregister(this);
    }

    @Subscribe
    public void on(MediaSessionPlaybackPausedEvent mediaSessionPlaybackPausedEvent) {
        Log.i(TAG, "Media session playback was paused: " + mediaSessionPlaybackPausedEvent.getPlayerId());
        this.externalMediaPlayerPlaying.remove(mediaSessionPlaybackPausedEvent.getPlayerId());
    }
}
