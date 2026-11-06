package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason;
import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSession;", "", "onStarted", "", "cameraCaptureInitiator", "Lcom/amazon/alexa/api/AlexaCameraCaptureInitiator;", "onStopped", "reason", "Lcom/amazon/alexa/api/AlexaAutoCaptureSessionStopReason;", "onStartFailed", "captureError", "Lcom/amazon/alexa/api/AlexaCameraCaptureError;", "onStopFailed", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaAutoCaptureSession {
    void onStartFailed(@NotNull AlexaCameraCaptureError captureError, @NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator);

    void onStarted(@NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator);

    void onStopFailed(@NotNull AlexaCameraCaptureError captureError);

    void onStopped(@NotNull AlexaAutoCaptureSessionStopReason reason);
}
