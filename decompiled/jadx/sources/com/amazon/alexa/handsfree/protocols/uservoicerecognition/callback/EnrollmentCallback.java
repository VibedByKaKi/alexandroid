package com.amazon.alexa.handsfree.protocols.uservoicerecognition.callback;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UtteranceTrainingMetadata;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback.UtteranceFeedback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EnrollmentCallback {
    void onError(@NonNull EnrollmentErrorContract enrollmentErrorContract, @NonNull UtteranceTrainingMetadata utteranceTrainingMetadata);

    void onFeedback(@NonNull UtteranceFeedback utteranceFeedback);

    void onStartProcessing();

    void onStartRecording();

    void onStopProcessing();

    void onStopRecording();

    void onSuccess(@NonNull UtteranceTrainingMetadata utteranceTrainingMetadata);
}
