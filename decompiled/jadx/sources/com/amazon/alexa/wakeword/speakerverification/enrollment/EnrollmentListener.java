package com.amazon.alexa.wakeword.speakerverification.enrollment;

import androidx.annotation.NonNull;
import com.amazon.alexa.wakeword.WakeWordData;
import com.amazon.alexa.wakeword.speakerverification.errors.TrainingFailure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface EnrollmentListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResponseCallback {
        void onFailure(@NonNull TrainingFailure trainingFailure);

        void onSuccess();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UtteranceTrainingCallback {
        void onAudioCaptured(@NonNull short[] sArr);

        void onUtteranceTrainingFailure(@NonNull TrainingFailure trainingFailure);

        void onUtteranceTrainingSuccess(@NonNull WakeWordData wakeWordData);

        void onWakeWordDetected(@NonNull WakeWordData wakeWordData, @NonNull String str, @NonNull String str2, long j);
    }
}
