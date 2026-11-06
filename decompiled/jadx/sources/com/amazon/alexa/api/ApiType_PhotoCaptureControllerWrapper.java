package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_PhotoCaptureControllerWrapper extends PhotoCaptureController implements AlexaPhotoCaptureController {
    private final AlexaPhotoCaptureController alexaPhotoCaptureController;

    public ApiType_PhotoCaptureControllerWrapper(AlexaPhotoCaptureController alexaPhotoCaptureController) {
        this.alexaPhotoCaptureController = alexaPhotoCaptureController;
    }

    @Override // com.amazon.alexa.api.PhotoCaptureController, com.amazon.alexa.api.AlexaPhotoCaptureController
    public void capture() {
        this.alexaPhotoCaptureController.capture();
    }

    @Override // com.amazon.alexa.api.AlexaPhotoCaptureController
    public void initialize(AlexaPhotoCaptureReporter alexaPhotoCaptureReporter) {
        this.alexaPhotoCaptureController.initialize(alexaPhotoCaptureReporter);
    }

    @Override // com.amazon.alexa.api.PhotoCaptureController
    public void initialize(PhotoCaptureReporter photoCaptureReporter) {
    }
}
