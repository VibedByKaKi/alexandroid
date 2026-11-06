package com.amazon.alexa.client.alexaservice.vad.audio.mode;

import android.media.AudioManager;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AudioManagerAudioModeProvider implements AudioModeProvider {
    private final AudioManager audioManager;

    public AudioManagerAudioModeProvider(@NonNull AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.mode.AudioModeProvider
    public int getMode() {
        return this.audioManager.getMode();
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.mode.AudioModeProvider
    public void setMode(int i) {
        this.audioManager.setMode(i);
    }
}
