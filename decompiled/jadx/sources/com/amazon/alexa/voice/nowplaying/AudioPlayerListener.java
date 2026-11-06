package com.amazon.alexa.voice.nowplaying;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface AudioPlayerListener {
    void onBuffering();

    void onError();

    void onIdle();

    void onPaused();

    void onPlaybackEnded();

    void onPlaying();
}
