package com.amazon.alexa.accessory.speechapi.voicesdk.camera;

import com.amazon.alexa.accessory.speechapi.camera.CameraActionInitiator;
import com.amazon.alexa.accessory.speechapi.camera.CaptureError;
import com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSession;
import com.amazon.alexa.accessory.speechapi.voicesdk.mapper.CameraApiModelMapper;
import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.api.compat.AlexaVideoCaptureSession;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/camera/VoxVideoCaptureSession;", "Lcom/amazon/alexa/accessory/speechapi/camera/VideoCaptureSession;", "alexaVideoCaptureSession", "Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;)V", "getAlexaVideoCaptureSession", "()Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;", "onStarted", "", "actionInitiator", "Lcom/amazon/alexa/accessory/speechapi/camera/CameraActionInitiator;", "onCaptured", "captureId", "", "onError", "captureError", "Lcom/amazon/alexa/accessory/speechapi/camera/CaptureError;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxVideoCaptureSession implements VideoCaptureSession {

    @NotNull
    private final AlexaVideoCaptureSession alexaVideoCaptureSession;

    public VoxVideoCaptureSession(@NotNull AlexaVideoCaptureSession alexaVideoCaptureSession) {
        alexaVideoCaptureSession.getClass();
        this.alexaVideoCaptureSession = alexaVideoCaptureSession;
    }

    @NotNull
    public final AlexaVideoCaptureSession getAlexaVideoCaptureSession() {
        return this.alexaVideoCaptureSession;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSession
    public void onCaptured(@NotNull String captureId, @NotNull CameraActionInitiator actionInitiator) {
        captureId.getClass();
        actionInitiator.getClass();
        this.alexaVideoCaptureSession.onStopped(new AlexaCaptureId(captureId), CameraApiModelMapper.INSTANCE.convertToAlexaVideoCaptureStopReason(actionInitiator));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSession
    public void onError(@NotNull CaptureError captureError, @NotNull CameraActionInitiator actionInitiator) {
        captureError.getClass();
        actionInitiator.getClass();
        AlexaVideoCaptureSession alexaVideoCaptureSession = this.alexaVideoCaptureSession;
        CameraApiModelMapper cameraApiModelMapper = CameraApiModelMapper.INSTANCE;
        alexaVideoCaptureSession.onError(cameraApiModelMapper.convertToAlexaCameraCaptureError(captureError), cameraApiModelMapper.convertToAlexaCameraCaptureInitiator(actionInitiator));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.VideoCaptureSession
    public void onStarted(@NotNull CameraActionInitiator actionInitiator) {
        actionInitiator.getClass();
        this.alexaVideoCaptureSession.onStarted(CameraApiModelMapper.INSTANCE.convertToAlexaCameraCaptureInitiator(actionInitiator));
    }
}
