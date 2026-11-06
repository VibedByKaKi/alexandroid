package com.amazon.alexa.voice.ui.player;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface PlaybackController {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onPlaybackPaused();

        void onPlaybackStarted();

        void onPlaybackStopped();
    }

    void addCallback(Callback callback);

    long getCurrentPosition();

    long getDuration();

    boolean isPlaying();

    void next();

    void pause();

    void play();

    void previous();

    void removeCallback(Callback callback);

    void seek(long j);

    void stop();
}
