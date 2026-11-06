package com.amazon.alexa.handsfree.uservoicerecognition.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalTrainingSoundPlayer implements StepsContract.SoundPlayer {
    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.SoundPlayer
    public void playSound(@NonNull TrainingSound trainingSound, @Nullable StepsContract.SoundPlayer.SoundCallback soundCallback) {
        if (soundCallback != null) {
            soundCallback.onSilence();
        }
    }
}
