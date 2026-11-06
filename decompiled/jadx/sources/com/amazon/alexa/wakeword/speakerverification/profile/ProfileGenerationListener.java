package com.amazon.alexa.wakeword.speakerverification.profile;

import androidx.annotation.NonNull;
import com.amazon.alexa.wakeword.speakerverification.errors.TrainingFailure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ProfileGenerationListener {
    void onGenerationFail(@NonNull TrainingFailure trainingFailure);

    void onGenerationSuccess();
}
