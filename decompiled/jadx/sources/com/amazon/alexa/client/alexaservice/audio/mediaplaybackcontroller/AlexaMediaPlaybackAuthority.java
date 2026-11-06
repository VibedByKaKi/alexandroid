package com.amazon.alexa.client.alexaservice.audio.mediaplaybackcontroller;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.api.AlexaMediaPlaybackListener;
import com.amazon.alexa.api.AlexaMediaPlaybackMetadata;
import com.amazon.alexa.api.AlexaMediaPlaybackState;
import com.amazon.alexa.api.AlexaPlayerInfoState;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import com.amazon.alexa.client.alexaservice.audio.events.AudioItemMetadataAcquiredEvent;
import com.amazon.alexa.client.alexaservice.audio.events.AudioItemStateChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.events.ExternalMediaPlayerUpdateEvent;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaMediaPlaybackAuthority {
    public static final String INTERNAL_AUDIO_PLAYER = "Internal AudioPlayer";
    private static final String TAG = "MediaPlayback";
    private final AlexaClientEventBus alexaClientEventBus;
    private final ClientListenerContainer<AlexaMediaPlaybackListener> alexaMediaPlaybackListeners = new ClientListenerContainer<>();

    @Nullable
    private volatile AlexaMediaPlaybackState playbackState = null;

    @Nullable
    private final HashMap<String, AlexaMediaPlaybackMetadata> metadataMap = new LinkedHashMap();

    @Inject
    public AlexaMediaPlaybackAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.alexaClientEventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private void clearMetadataByProviderIfPlaybackFinished(AlexaPlayerInfoState alexaPlayerInfoState, String str, String str2) {
        if (alexaPlayerInfoState.equals(AlexaPlayerInfoState.DONE) || alexaPlayerInfoState.equals(AlexaPlayerInfoState.CANCELLED)) {
            Iterator<AlexaMediaPlaybackMetadata> it2 = this.metadataMap.values().iterator();
            while (it2.hasNext()) {
                AlexaMediaPlaybackMetadata next = it2.next();
                if (str != null && str.equals(next.getMediaServiceProvider())) {
                    if (next.getMediaItemIdentifier().equals(str2)) {
                        return;
                    } else {
                        it2.remove();
                    }
                }
            }
        }
    }

    private void deregister(AlexaMediaPlaybackListener alexaMediaPlaybackListener) {
        this.alexaMediaPlaybackListeners.remove(alexaMediaPlaybackListener);
    }

    private void postSuccessfulApiCall(ApiCallMetadata apiCallMetadata) {
        this.alexaClientEventBus.post(ApiCallEvent.SuccessEvent.create(apiCallMetadata));
    }

    private void register(ExtendedClient extendedClient, AlexaMediaPlaybackListener alexaMediaPlaybackListener) {
        AlexaMediaPlaybackMetadata alexaMediaPlaybackMetadata;
        if (this.alexaMediaPlaybackListeners.containsListener(alexaMediaPlaybackListener)) {
            return;
        }
        this.alexaMediaPlaybackListeners.addListenerForClient(extendedClient, alexaMediaPlaybackListener);
        if (this.playbackState != null) {
            alexaMediaPlaybackListener.onMediaPlaybackStateUpdate(this.playbackState);
            String mediaItemIdentifier = this.playbackState.getMediaItemIdentifier();
            if (TextUtils.isEmpty(mediaItemIdentifier) || (alexaMediaPlaybackMetadata = this.metadataMap.get(mediaItemIdentifier)) == null) {
                return;
            }
            alexaMediaPlaybackListener.onMediaMetadata(alexaMediaPlaybackMetadata);
        }
    }

    public int getClientListenerCount() {
        return this.alexaMediaPlaybackListeners.size();
    }

    @Subscribe
    public synchronized void on(ExternalMediaPlayerUpdateEvent externalMediaPlayerUpdateEvent) {
        String str;
        try {
            Log.i(TAG, "on: ExternalMediaPlayerUpdateEvent");
            MediaMetadataCompat mediaMetadata = externalMediaPlayerUpdateEvent.getMediaMetadata();
            PlaybackStateCompat playbackState = externalMediaPlayerUpdateEvent.getPlaybackState();
            if (mediaMetadata != null) {
                str = mediaMetadata.getString("android.media.metadata.MEDIA_ID");
                if (str != null && !this.metadataMap.containsKey(str)) {
                    AlexaMediaPlaybackMetadata createAlexaMediaMetadata = MediaPlaybackUtil.createAlexaMediaMetadata(str, externalMediaPlayerUpdateEvent.getExternalPlayerIdentifier().name(), mediaMetadata);
                    this.metadataMap.put(str, createAlexaMediaMetadata);
                    Iterator<AlexaMediaPlaybackListener> it2 = this.alexaMediaPlaybackListeners.getAllListeners().iterator();
                    while (it2.hasNext()) {
                        it2.next().onMediaMetadata(createAlexaMediaMetadata);
                    }
                }
            } else {
                str = null;
            }
            if (playbackState != null) {
                AlexaMediaPlaybackState createAlexaMediaPlaybackState = MediaPlaybackUtil.createAlexaMediaPlaybackState(str, playbackState);
                if (createAlexaMediaPlaybackState == null) {
                    return;
                }
                this.playbackState = createAlexaMediaPlaybackState;
                clearMetadataByProviderIfPlaybackFinished(this.playbackState.getPlayerState(), externalMediaPlayerUpdateEvent.getExternalPlayerIdentifier().name(), this.playbackState.getMediaItemIdentifier());
                Iterator<AlexaMediaPlaybackListener> it3 = this.alexaMediaPlaybackListeners.getAllListeners().iterator();
                while (it3.hasNext()) {
                    it3.next().onMediaPlaybackStateUpdate(this.playbackState);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Subscribe
    public void on(ApiCallEvent.MediaPlayback.DeregisterMediaPlayerListenerEvent deregisterMediaPlayerListenerEvent) {
        Log.i(TAG, "on: MediaPlayerListenerDeregister");
        deregister(deregisterMediaPlayerListenerEvent.getAlexaMediaPlaybackListener());
        postSuccessfulApiCall(deregisterMediaPlayerListenerEvent.getApiCallMetadata());
    }

    @Subscribe
    public void on(AudioItemMetadataAcquiredEvent audioItemMetadataAcquiredEvent) {
        String value = audioItemMetadataAcquiredEvent.getAudioItemIdentifier().getValue();
        AlexaMediaPlaybackMetadata build = AlexaMediaPlaybackMetadata.builder(value).setMediaServiceProvider(INTERNAL_AUDIO_PLAYER).setArtistName(audioItemMetadataAcquiredEvent.getArtist()).setAlbumArtUri(audioItemMetadataAcquiredEvent.getArtImageUri()).setAlbumName(audioItemMetadataAcquiredEvent.getAlbum()).setSongName(audioItemMetadataAcquiredEvent.getTitle()).setSecondaryArtUri(audioItemMetadataAcquiredEvent.getBackgroundImageUri()).setDuration(TimeUnit.SECONDS.toMillis(audioItemMetadataAcquiredEvent.getMediaLengthInSeconds() != null ? audioItemMetadataAcquiredEvent.getMediaLengthInSeconds().longValue() : 0L)).build();
        if (this.metadataMap.containsKey(value)) {
            return;
        }
        this.metadataMap.put(value, build);
        Iterator<AlexaMediaPlaybackListener> it2 = this.alexaMediaPlaybackListeners.getAllListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onMediaMetadata(build);
        }
    }

    @Subscribe
    public synchronized void on(AudioItemStateChangedEvent audioItemStateChangedEvent) {
        AlexaMediaPlaybackState build = AlexaMediaPlaybackState.builder().setMediaItemIdentifier(audioItemStateChangedEvent.getAudioItemIdentifier().getValue()).setBufferedPosition(-1L).setLastPositionUpdateTime(-1L).setCurrentPosition(audioItemStateChangedEvent.getOffset()).setPlayerState(audioItemStateChangedEvent.getPlayerInfoState()).build();
        this.playbackState = build;
        clearMetadataByProviderIfPlaybackFinished(build.getPlayerState(), INTERNAL_AUDIO_PLAYER, build.getMediaItemIdentifier());
        Iterator<AlexaMediaPlaybackListener> it2 = this.alexaMediaPlaybackListeners.getAllListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onMediaPlaybackStateUpdate(build);
        }
    }

    @Subscribe
    public void on(ApiCallEvent.MediaPlayback.RegisterMediaPlayerListenerEvent registerMediaPlayerListenerEvent) {
        Log.i(TAG, "on: MediaPlayerListenerRegister");
        register(registerMediaPlayerListenerEvent.getClient(), registerMediaPlayerListenerEvent.getAlexaMediaPlaybackListener());
        postSuccessfulApiCall(registerMediaPlayerListenerEvent.getApiCallMetadata());
    }

    @Subscribe
    public void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        this.alexaMediaPlaybackListeners.removeAllClientListeners(clientDisconnectedEvent.getClient());
    }
}
