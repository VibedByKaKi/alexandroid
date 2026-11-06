package com.amazon.alexa.audiopersonalization.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.protocol.Hearing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AmaApi {
    void getAssessmentMode(String str, SuccessDelegate<Integer> successDelegate, ErrorDelegate errorDelegate);

    void getAudioProfile(String str, SuccessDelegate<Hearing.Audiogram> successDelegate, ErrorMessageDelegate errorMessageDelegate);

    void getBudsInEar(String str, @NonNull SuccessDelegate<Boolean> successDelegate, @NonNull ErrorDelegate errorDelegate);

    void getFeatureStatus(String str, SuccessDelegate<Boolean> successDelegate, ErrorMessageDelegate errorMessageDelegate);

    void getPersonalizationLevel(String str, SuccessDelegate<Integer> successDelegate, ErrorDelegate errorDelegate);

    void setAssessmentMode(int i, String str, CompletableDelegate completableDelegate);

    void setAudioProfile(Hearing.Audiogram audiogram, String str, CompletableDelegate completableDelegate);

    void setFeatureStatus(boolean z, String str, CompletableDelegate completableDelegate);

    void setPersonalizationLevel(int i, String str, CompletableDelegate completableDelegate);

    void subscribeToAudioAssessmentAbort(String str, @NonNull CompletableDelegate completableDelegate);

    void unsubscribeToAudioAssessmentAbort(String str);
}
