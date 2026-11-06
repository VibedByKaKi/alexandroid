package com.amazon.alexa.voice.ui.onedesign.speech;

import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract;
import com.amazon.alexa.voice.ui.permissions.VoicePermissions;
import com.amazon.alexa.voice.ui.speech.SpeechController;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SpeechControlInteractor implements SpeechControlContract.Interactor {
    private final SpeechController speechController;
    private final VoicePermissions voicePermissions;

    public SpeechControlInteractor(SpeechController speechController, @Nullable VoicePermissions voicePermissions) {
        this.speechController = speechController;
        this.voicePermissions = voicePermissions;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Interactor
    public void cancel() {
        this.speechController.cancel();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Interactor
    public void recognizeSpeech() {
        if (this.speechController.hasMinimumRequiredPermission()) {
            this.speechController.recognizeSpeech();
            return;
        }
        VoicePermissions voicePermissions = this.voicePermissions;
        if (voicePermissions != null) {
            voicePermissions.requestPermissions();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("VoicePermissions should not be null, if we don't have a minimum permissions");
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Interactor
    public boolean shouldEmbedVoiceIngress() {
        return this.speechController.hasMinimumRequiredPermission() || this.voicePermissions != null;
    }
}
