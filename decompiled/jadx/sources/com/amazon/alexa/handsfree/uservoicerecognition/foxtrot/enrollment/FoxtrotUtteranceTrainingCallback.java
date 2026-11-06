package com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.enrollment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.fva.IUVRUtteranceTrainingCallback;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIConstants;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.callback.EnrollmentCallback;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UtteranceTrainingMetadata;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.feedback.UtteranceFeedbackFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotUtteranceTrainingCallback extends IUVRUtteranceTrainingCallback.Stub {
    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;
    private static final String TAG = "FoxtrotUtteranceTrainingCallback";
    private EnrollmentCallback mEnrollmentCallback;
    private final UtteranceFeedbackFactory mUtteranceFeedbackFactory;

    public FoxtrotUtteranceTrainingCallback(@NonNull EnrollmentCallback enrollmentCallback) {
        this(enrollmentCallback, new UtteranceFeedbackFactory());
    }

    @NonNull
    private UtteranceTrainingMetadata getUtteranceTrainingMetadata(@NonNull Bundle bundle) {
        return new UtteranceTrainingMetadata(bundle.getInt(FoxtrotAPIConstants.UVR_UTTERANCE_TRAINING_DATA_SNR), bundle.getInt(FoxtrotAPIConstants.UVR_UTTERANCE_TRAINING_DATA_CONFIDENCE));
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onError(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onError(EnrollError.from(bundle.getInt(FoxtrotAPIConstants.UVR_UTTERANCE_TRAINING_DATA_ERROR_CODE)), getUtteranceTrainingMetadata(bundle));
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onFeedback(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onFeedback(this.mUtteranceFeedbackFactory.getVolumeFeedback(bundle.getInt(FoxtrotAPIConstants.UVR_UTTERANCE_TRAINING_DATA_ENERGY), 0, 100));
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onStartProcessing(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onStartProcessing();
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onStartRecording(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onStartRecording();
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onStopProcessing(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onStopProcessing();
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onStopRecording(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onStopRecording();
    }

    @Override // com.amazon.alexa.fva.IUVRUtteranceTrainingCallback
    public void onSuccess(@NonNull Bundle bundle) {
        this.mEnrollmentCallback.onSuccess(getUtteranceTrainingMetadata(bundle));
    }

    @VisibleForTesting
    public FoxtrotUtteranceTrainingCallback(@NonNull EnrollmentCallback enrollmentCallback, @NonNull UtteranceFeedbackFactory utteranceFeedbackFactory) {
        this.mEnrollmentCallback = enrollmentCallback;
        this.mUtteranceFeedbackFactory = utteranceFeedbackFactory;
    }
}
