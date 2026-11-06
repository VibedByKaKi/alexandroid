package com.amazon.alexa.accessory.speechapi.voicesdk.camera;

import com.amazon.alexa.accessory.speechapi.camera.CameraActionInitiator;
import com.amazon.alexa.accessory.speechapi.camera.CaptureError;
import com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureReporter;
import com.amazon.alexa.accessory.speechapi.voicesdk.mapper.CameraApiModelMapper;
import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.api.compat.AlexaPhotoCaptureReporter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/camera/VoxPhotoCaptureReporter;", "Lcom/amazon/alexa/accessory/speechapi/camera/PhotoCaptureReporter;", "alexaPhotoCaptureReporter", "Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureReporter;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureReporter;)V", "reportCapture", "", "captureId", "", "actionInitiator", "Lcom/amazon/alexa/accessory/speechapi/camera/CameraActionInitiator;", "reportError", "captureError", "Lcom/amazon/alexa/accessory/speechapi/camera/CaptureError;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxPhotoCaptureReporter implements PhotoCaptureReporter {

    @NotNull
    private final AlexaPhotoCaptureReporter alexaPhotoCaptureReporter;

    public VoxPhotoCaptureReporter(@NotNull AlexaPhotoCaptureReporter alexaPhotoCaptureReporter) {
        alexaPhotoCaptureReporter.getClass();
        this.alexaPhotoCaptureReporter = alexaPhotoCaptureReporter;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureReporter
    public void reportCapture(@NotNull String captureId, @NotNull CameraActionInitiator actionInitiator) {
        captureId.getClass();
        actionInitiator.getClass();
        this.alexaPhotoCaptureReporter.reportCapture(new AlexaCaptureId(captureId), CameraApiModelMapper.INSTANCE.convertToAlexaCameraCaptureInitiator(actionInitiator));
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureReporter
    public void reportError(@NotNull CaptureError captureError, @NotNull CameraActionInitiator actionInitiator) {
        captureError.getClass();
        actionInitiator.getClass();
        AlexaPhotoCaptureReporter alexaPhotoCaptureReporter = this.alexaPhotoCaptureReporter;
        CameraApiModelMapper cameraApiModelMapper = CameraApiModelMapper.INSTANCE;
        alexaPhotoCaptureReporter.reportError(cameraApiModelMapper.convertToAlexaCameraCaptureError(captureError), cameraApiModelMapper.convertToAlexaCameraCaptureInitiator(actionInitiator));
    }
}
