package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.api.AlexaVideoCaptureStopReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;", "", "onStarted", "", "cameraCaptureInitiator", "Lcom/amazon/alexa/api/AlexaCameraCaptureInitiator;", "onStopped", "captureId", "Lcom/amazon/alexa/api/AlexaCaptureId;", "reason", "Lcom/amazon/alexa/api/AlexaVideoCaptureStopReason;", "onError", "captureError", "Lcom/amazon/alexa/api/AlexaCameraCaptureError;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaVideoCaptureSession {
    void onError(@NotNull AlexaCameraCaptureError captureError, @NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator);

    void onStarted(@NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator);

    void onStopped(@NotNull AlexaCaptureId captureId, @NotNull AlexaVideoCaptureStopReason reason);
}
