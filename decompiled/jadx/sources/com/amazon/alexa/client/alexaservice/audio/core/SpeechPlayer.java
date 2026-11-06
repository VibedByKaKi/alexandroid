package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioAttributesPair;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SpeechPlayer {
    private final AudioPlayer audioPlayer;
    private boolean isStopped;

    @Inject
    public SpeechPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void deregisterSpeechPlayerEvents() {
        this.audioPlayer.deregisterAudioPlayerEvents();
    }

    public void duck() {
        this.audioPlayer.duck();
    }

    public long getPosition() {
        return this.audioPlayer.getPosition();
    }

    public void initializePlayer() {
        this.audioPlayer.initializePlayer();
    }

    public boolean isPaused() {
        return this.audioPlayer.isPaused();
    }

    public boolean isPlaying() {
        return this.audioPlayer.isPlaying();
    }

    public void pause() {
        this.audioPlayer.pause();
    }

    public void play(SpeechItem speechItem, SpeechPlayerEventListener speechPlayerEventListener) {
        this.audioPlayer.prepare(speechItem, new SpeechPlayerEventListenerImpl(speechPlayerEventListener));
        this.audioPlayer.play();
        this.isStopped = false;
    }

    public void releasePlayer() {
        this.audioPlayer.releasePlayer();
    }

    public void resume() {
        this.audioPlayer.play();
    }

    public void setAudioAttributes(AudioAttributesPair audioAttributesPair) {
        this.audioPlayer.setAudioAttributes(audioAttributesPair);
    }

    public void stop() {
        if (this.isStopped) {
            return;
        }
        this.audioPlayer.stop();
        this.isStopped = true;
    }

    public void unduck() {
        this.audioPlayer.unduck();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SpeechPlayerEventListenerImpl implements AudioPlayerEventListener {
        private boolean hasPlaybackStartedWithStartTime;
        private final SpeechPlayerEventListener listener;

        public SpeechPlayerEventListenerImpl(SpeechPlayerEventListener speechPlayerEventListener) {
            this.listener = speechPlayerEventListener;
        }

        private SpeechItem playItemToSpeechItem(PlayItem playItem) {
            if (playItem instanceof SpeechItem) {
                return (SpeechItem) playItem;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("PlayItem is not a SpeechItem");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onBuffering(PlayItem playItem) {
            this.listener.onBuffering(playItemToSpeechItem(playItem));
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackFailed(PlayItem playItem, long j, Exception exc) {
            this.listener.onError(playItemToSpeechItem(playItem), exc);
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackFinished(PlayItem playItem) {
            this.listener.onSpeechFinished(playItemToSpeechItem(playItem));
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackPositionUpdated(PlayItem playItem, long j, long j2) {
            if (this.hasPlaybackStartedWithStartTime) {
                return;
            }
            this.hasPlaybackStartedWithStartTime = true;
            this.listener.onSpeechStarted(playItemToSpeechItem(playItem), j2 - j);
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackStarted(PlayItem playItem) {
            this.listener.onSpeechStarting(playItemToSpeechItem(playItem));
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackStopped(PlayItem playItem) {
            this.listener.onSpeechStopped(playItemToSpeechItem(playItem));
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onDrmLicenseKeyLoaded(boolean z) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onDrmLoadError(Exception exc) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onDrmManifestLoadError(Exception exc) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onDrmManifestLoaded(long j) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener, com.amazon.alexa.client.alexaservice.audio.core.MediaSourceCallback
        public void onDrmPlaybackInitiated(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackNearlyFinished(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackPaused(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackResumed(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackResuming(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onPlaybackStarting(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onStutterStarted(PlayItem playItem) {
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.core.AudioPlayerEventListener
        public void onStutterStopped(PlayItem playItem) {
        }
    }
}
