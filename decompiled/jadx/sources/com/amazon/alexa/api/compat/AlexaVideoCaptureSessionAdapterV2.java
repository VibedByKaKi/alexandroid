package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.AlexaCameraCaptureError;
import com.amazon.alexa.api.compat.model.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.compat.model.AlexaCaptureId;
import com.amazon.alexa.api.compat.model.AlexaVideoCaptureStopReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSessionAdapterV2;", "Lcom/amazon/alexa/api/compat/model/AlexaVideoCaptureSession;", "voxSession", "Lcom/amazon/alexa/api/AlexaVideoCaptureSession;", "<init>", "(Lcom/amazon/alexa/api/AlexaVideoCaptureSession;)V", "onStarted", "", "cameraCaptureInitiator", "Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureInitiator;", "onStopped", "captureId", "Lcom/amazon/alexa/api/compat/model/AlexaCaptureId;", "reason", "Lcom/amazon/alexa/api/compat/model/AlexaVideoCaptureStopReason;", "onError", "captureError", "Lcom/amazon/alexa/api/compat/model/AlexaCameraCaptureError;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaVideoCaptureSessionAdapterV2 implements com.amazon.alexa.api.compat.model.AlexaVideoCaptureSession {

    @NotNull
    private final com.amazon.alexa.api.AlexaVideoCaptureSession voxSession;

    public AlexaVideoCaptureSessionAdapterV2(@NotNull com.amazon.alexa.api.AlexaVideoCaptureSession alexaVideoCaptureSession) {
        alexaVideoCaptureSession.getClass();
        this.voxSession = alexaVideoCaptureSession;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaVideoCaptureSession
    public void onError(@NotNull AlexaCameraCaptureError captureError, @NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator) {
        captureError.getClass();
        cameraCaptureInitiator.getClass();
        com.amazon.alexa.api.AlexaVideoCaptureSession alexaVideoCaptureSession = this.voxSession;
        CameraConversions cameraConversions = CameraConversions.INSTANCE;
        alexaVideoCaptureSession.onError(cameraConversions.toVoxSdk(captureError), cameraConversions.toVoxSdk(cameraCaptureInitiator));
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaVideoCaptureSession
    public void onStarted(@NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator) {
        cameraCaptureInitiator.getClass();
        this.voxSession.onStarted(CameraConversions.INSTANCE.toVoxSdk(cameraCaptureInitiator));
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaVideoCaptureSession
    public void onStopped(@NotNull AlexaCaptureId captureId, @NotNull AlexaVideoCaptureStopReason reason) {
        captureId.getClass();
        reason.getClass();
        this.voxSession.onStopped(new com.amazon.alexa.api.AlexaCaptureId(captureId.getValue()), CameraConversions.INSTANCE.toVoxSdk(reason));
    }
}
