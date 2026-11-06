package com.amazon.alexa.accessory.speechapi.voicesdk.camera;

import com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession;
import com.amazon.alexa.accessory.speechapi.camera.CameraActionInitiator;
import com.amazon.alexa.accessory.speechapi.camera.CaptureError;
import com.amazon.alexa.accessory.speechapi.voicesdk.mapper.CameraApiModelMapper;
import com.amazon.alexa.api.compat.AlexaAutoCaptureSession;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/camera/VoxAutoCaptureSession;", "Lcom/amazon/alexa/accessory/speechapi/camera/AutoCaptureSession;", "alexaAutoCaptureSession", "Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSession;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSession;)V", "getAlexaAutoCaptureSession", "()Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSession;", "onStarted", "", "actionInitiator", "Lcom/amazon/alexa/accessory/speechapi/camera/CameraActionInitiator;", "onStopped", "error", "Lcom/amazon/alexa/accessory/speechapi/camera/CaptureError;", "onStartFailed", "onStopFailed", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxAutoCaptureSession implements AutoCaptureSession {

    @NotNull
    private final AlexaAutoCaptureSession alexaAutoCaptureSession;

    public VoxAutoCaptureSession(@NotNull AlexaAutoCaptureSession alexaAutoCaptureSession) {
        alexaAutoCaptureSession.getClass();
        this.alexaAutoCaptureSession = alexaAutoCaptureSession;
    }

    @NotNull
    public final AlexaAutoCaptureSession getAlexaAutoCaptureSession() {
        return this.alexaAutoCaptureSession;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession
    public void onStartFailed(@NotNull CaptureError error, @NotNull CameraActionInitiator actionInitiator) {
        error.getClass();
        actionInitiator.getClass();
        AlexaAutoCaptureSession alexaAutoCaptureSession = this.alexaAutoCaptureSession;
        CameraApiModelMapper cameraApiModelMapper = CameraApiModelMapper.INSTANCE;
        alexaAutoCaptureSession.onStartFailed(cameraApiModelMapper.convertToAlexaCameraCaptureError(error), cameraApiModelMapper.convertToAlexaCameraCaptureInitiator(actionInitiator));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession
    public void onStarted(@NotNull CameraActionInitiator actionInitiator) {
        actionInitiator.getClass();
        this.alexaAutoCaptureSession.onStarted(CameraApiModelMapper.INSTANCE.convertToAlexaCameraCaptureInitiator(actionInitiator));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession
    public void onStopFailed(@NotNull CaptureError error, @NotNull CameraActionInitiator actionInitiator) {
        error.getClass();
        actionInitiator.getClass();
        this.alexaAutoCaptureSession.onStopFailed(CameraApiModelMapper.INSTANCE.convertToAlexaCameraCaptureError(error));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession
    public void onStopped(@NotNull CaptureError error, @NotNull CameraActionInitiator actionInitiator) {
        error.getClass();
        actionInitiator.getClass();
        this.alexaAutoCaptureSession.onStopped(CameraApiModelMapper.INSTANCE.convertCaptureErrorToAutoCaptureStopReason(error));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.AutoCaptureSession
    public void onStopped(@NotNull CameraActionInitiator actionInitiator) {
        actionInitiator.getClass();
        this.alexaAutoCaptureSession.onStopped(CameraApiModelMapper.INSTANCE.convertToAlexaAutoCaptureSessionStopReason(actionInitiator));
    }
}
