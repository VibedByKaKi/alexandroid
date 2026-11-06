package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioAttributesPair;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AudioPlayer {
    void deregisterAudioPlayerEvents();

    void duck();

    long getPosition();

    void initializePlayer();

    boolean isPaused();

    boolean isPlaying();

    void pause();

    void play();

    void prepare(PlayItem playItem, AudioPlayerEventListener audioPlayerEventListener);

    void releasePlayer();

    void setAudioAttributes(AudioAttributesPair audioAttributesPair);

    void stop();

    void unduck();
}
