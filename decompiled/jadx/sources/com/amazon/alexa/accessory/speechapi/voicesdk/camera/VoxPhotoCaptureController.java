package com.amazon.alexa.accessory.speechapi.voicesdk.camera;

import com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureController;
import com.amazon.alexa.api.compat.AlexaPhotoCaptureController;
import com.amazon.alexa.api.compat.AlexaPhotoCaptureReporter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/camera/VoxPhotoCaptureController;", "Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureController;", "photoCaptureController", "Lcom/amazon/alexa/accessory/speechapi/camera/PhotoCaptureController;", "<init>", "(Lcom/amazon/alexa/accessory/speechapi/camera/PhotoCaptureController;)V", "initialize", "", "captureSessionReporter", "Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureReporter;", "capture", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxPhotoCaptureController implements AlexaPhotoCaptureController {

    @NotNull
    private final PhotoCaptureController photoCaptureController;

    public VoxPhotoCaptureController(@NotNull PhotoCaptureController photoCaptureController) {
        photoCaptureController.getClass();
        this.photoCaptureController = photoCaptureController;
    }

    @Override // com.amazon.alexa.api.compat.AlexaPhotoCaptureController
    public void capture() {
        this.photoCaptureController.capture();
    }

    @Override // com.amazon.alexa.api.compat.AlexaPhotoCaptureController
    public void initialize(@NotNull AlexaPhotoCaptureReporter captureSessionReporter) {
        captureSessionReporter.getClass();
        this.photoCaptureController.initialize(new VoxPhotoCaptureReporter(captureSessionReporter));
    }
}
