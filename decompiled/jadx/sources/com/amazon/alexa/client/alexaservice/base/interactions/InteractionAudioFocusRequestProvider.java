package com.amazon.alexa.client.alexaservice.base.interactions;

import android.media.AudioManager;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class InteractionAudioFocusRequestProvider {
    @Inject
    public InteractionAudioFocusRequestProvider() {
    }

    public InteractionAudioFocusRequest create(AudioMetadata audioMetadata, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return new InteractionAudioFocusRequest(audioMetadata, onAudioFocusChangeListener);
    }
}
