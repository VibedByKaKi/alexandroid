package com.amazon.alexa.handsfree.protocols.uservoicerecognition.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface UVRTuningSettings {
    void getAntiSpoofThreshold(@NonNull ResultCallback<Double> resultCallback);

    void getSecondStageThreshold(@NonNull ResultCallback<Integer> resultCallback);

    void getTrainingThreshold(@NonNull ResultCallback<Integer> resultCallback);

    void getUserConfidenceLevel(@NonNull ResultCallback<Integer> resultCallback);

    void setAntiSpoofThreshold(double d, @NonNull ResponseCallback responseCallback);

    void setSecondStageThreshold(int i, @NonNull ResponseCallback responseCallback);

    void setTrainingThreshold(int i, @NonNull ResponseCallback responseCallback);

    void setUserConfidenceLevel(int i, @NonNull ResponseCallback responseCallback);

    void setUtteranceTrainingTimeout(int i);
}
