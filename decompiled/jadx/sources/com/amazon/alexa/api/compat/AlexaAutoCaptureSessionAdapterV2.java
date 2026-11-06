package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.AlexaAutoCaptureSessionStopReason;
import com.amazon.alexa.api.compat.model.AlexaCameraCaptureError;
import com.amazon.alexa.api.compat.model.AlexaCameraCaptureInitiator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSessionAdapterV2;", "Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSession;", "voxSession", "Lcom/amazon/alexa/api/AlexaAutoCaptureSession;", "<init>", "(Lcom/amazon/alexa/api/AlexaAutoCaptureSession;)V", "onStarted", "", "cameraCaptureInitiator", "Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureInitiator;", "onStopped", "reason", "Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSessionStopReason;", "onStartFailed", "captureError", "Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureError;", "onStopFailed", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaAutoCaptureSessionAdapterV2 implements com.amazon.alexa.api.compat.model.AlexaAutoCaptureSession {

    @NotNull
    private final com.amazon.alexa.api.AlexaAutoCaptureSession voxSession;

    public AlexaAutoCaptureSessionAdapterV2(@NotNull com.amazon.alexa.api.AlexaAutoCaptureSession alexaAutoCaptureSession) {
        alexaAutoCaptureSession.getClass();
        this.voxSession = alexaAutoCaptureSession;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAutoCaptureSession
    public void onStartFailed(@NotNull AlexaCameraCaptureError captureError, @NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator) {
        captureError.getClass();
        cameraCaptureInitiator.getClass();
        com.amazon.alexa.api.AlexaAutoCaptureSession alexaAutoCaptureSession = this.voxSession;
        CameraConversions cameraConversions = CameraConversions.INSTANCE;
        alexaAutoCaptureSession.onStartFailed(cameraConversions.toVoxSdk(captureError), cameraConversions.toVoxSdk(cameraCaptureInitiator));
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAutoCaptureSession
    public void onStarted(@NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator) {
        cameraCaptureInitiator.getClass();
        this.voxSession.onStarted(CameraConversions.INSTANCE.toVoxSdk(cameraCaptureInitiator));
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAutoCaptureSession
    public void onStopFailed(@NotNull AlexaCameraCaptureError captureError) {
        captureError.getClass();
        this.voxSession.onStopFailed(CameraConversions.INSTANCE.toVoxSdk(captureError));
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAutoCaptureSession
    public void onStopped(@NotNull AlexaAutoCaptureSessionStopReason reason) {
        reason.getClass();
        this.voxSession.onStopped(CameraConversions.INSTANCE.toVoxSdk(reason));
    }
}
