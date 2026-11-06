package com.amazon.alexa.enrollment.unified.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EnrollmentProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UtteranceTrainingCallback {
        void onAudioCaptured(@NonNull short[] sArr);

        void onError(@NonNull EnrollmentErrorContract enrollmentErrorContract);

        void onSuccess();
    }

    void cancelUserVoiceEnrollment(@NonNull ResponseCallback responseCallback);

    void cancelUtteranceTraining(@NonNull ResponseCallback responseCallback);

    void finishUserVoiceEnrollment(@NonNull ResponseCallback responseCallback);

    List<String> getUtterances();

    void startUserVoiceEnrollment(@NonNull ResponseCallback responseCallback);

    void startUtteranceTraining(@NonNull UtteranceTrainingCallback utteranceTrainingCallback);
}
