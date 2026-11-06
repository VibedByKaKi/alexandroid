package com.amazon.alexa.client.alexaservice.base.interactions;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AudioAttributesPair {
    private final AudioAttributes androidAudioAttributes;
    private final com.google.android.exoplayer2.audio.AudioAttributes exoAudioAttributes;

    public AudioAttributesPair(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, AudioAttributes audioAttributes2) {
        this.exoAudioAttributes = audioAttributes;
        this.androidAudioAttributes = audioAttributes2;
    }

    public AudioAttributes getAndroidAudioAttributes() {
        return this.androidAudioAttributes;
    }

    public com.google.android.exoplayer2.audio.AudioAttributes getExoAudioAttributes() {
        return this.exoAudioAttributes;
    }
}
