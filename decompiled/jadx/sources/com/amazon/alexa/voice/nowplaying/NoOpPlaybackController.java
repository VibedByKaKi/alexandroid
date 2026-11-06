package com.amazon.alexa.voice.nowplaying;

import com.amazon.alexa.voice.ui.player.PlaybackController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NoOpPlaybackController implements PlaybackController {
    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public long getCurrentPosition() {
        return 0L;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public long getDuration() {
        return 0L;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public boolean isPlaying() {
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void next() {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void pause() {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void play() {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void previous() {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void stop() {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void addCallback(PlaybackController.Callback callback) {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void removeCallback(PlaybackController.Callback callback) {
    }

    @Override // com.amazon.alexa.voice.ui.player.PlaybackController
    public void seek(long j) {
    }
}
