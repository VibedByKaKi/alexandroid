package com.amazon.alexa.handsfree.protocols.uservoicerecognition.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.callback.EnrollmentCallback;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UserInfo;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UtteranceInfo;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface UVREnroller {
    void cancelUserVoiceEnrollment(@NonNull ResponseCallback responseCallback);

    void cancelUtteranceTraining(@NonNull ResponseCallback responseCallback);

    void finishUserVoiceEnrollment(@NonNull ResultCallback<Double> resultCallback);

    @NonNull
    List<UtteranceInfo> getUtterances();

    void startUserVoiceEnrollment(@NonNull UserInfo userInfo, @NonNull ResponseCallback responseCallback);

    void startUtteranceTraining(@NonNull UtteranceInfo utteranceInfo, @NonNull EnrollmentCallback enrollmentCallback);
}
