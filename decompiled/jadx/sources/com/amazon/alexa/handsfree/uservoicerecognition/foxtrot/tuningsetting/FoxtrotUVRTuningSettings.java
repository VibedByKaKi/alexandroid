package com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.tuningsetting;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotUVRTuningSettings implements UVRTuningSettings {
    private static final String TAG = "FoxtrotUVRTuningSettings";

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void getAntiSpoofThreshold(@NonNull ResultCallback<Double> resultCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void getSecondStageThreshold(@NonNull ResultCallback<Integer> resultCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void getTrainingThreshold(@NonNull ResultCallback<Integer> resultCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void getUserConfidenceLevel(@NonNull ResultCallback<Integer> resultCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void setUtteranceTrainingTimeout(int i) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void setAntiSpoofThreshold(double d, @NonNull ResponseCallback responseCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void setSecondStageThreshold(int i, @NonNull ResponseCallback responseCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void setTrainingThreshold(int i, @NonNull ResponseCallback responseCallback) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRTuningSettings
    public void setUserConfidenceLevel(int i, @NonNull ResponseCallback responseCallback) {
    }
}
