package com.amazon.alexa.enrollment.unified.api;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SettingsProvider {
    void isUVREnrolled(@NonNull ResultCallback<Boolean> resultCallback);

    boolean isUVREnrolled();

    void removeUVRModel(@NonNull ResponseCallback responseCallback);
}
