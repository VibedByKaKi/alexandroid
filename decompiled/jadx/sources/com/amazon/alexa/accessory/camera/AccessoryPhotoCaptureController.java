package com.amazon.alexa.accessory.camera;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureController;
import com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureReporter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AccessoryPhotoCaptureController implements PhotoCaptureController {
    private final PhotoCallback alexaPhotoCaptureCallback;
    private PhotoCaptureReporter photoCaptureReporter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface PhotoCallback {
        void capture();
    }

    public AccessoryPhotoCaptureController(PhotoCallback photoCallback) {
        Preconditions.notNull(photoCallback, "alexaPhotoCaptureCallback");
        this.alexaPhotoCaptureCallback = photoCallback;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureController
    public void capture() {
        this.alexaPhotoCaptureCallback.capture();
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureController
    public PhotoCaptureReporter getPhotoCaptureReporter() {
        return this.photoCaptureReporter;
    }

    @Override // com.amazon.alexa.accessory.speechapi.camera.PhotoCaptureController
    public void initialize(PhotoCaptureReporter photoCaptureReporter) {
        Preconditions.notNull(photoCaptureReporter, "photoCaptureReporter");
        this.photoCaptureReporter = photoCaptureReporter;
    }
}
