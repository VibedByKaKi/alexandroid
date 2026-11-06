package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface AudioListener {
    default void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    default void onAudioSessionIdChanged(int i) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    default void onVolumeChanged(float f) {
    }
}
