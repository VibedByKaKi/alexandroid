package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_VideoCaptureControllerWrapper extends VideoCaptureController implements AlexaVideoCaptureController {
    private final AlexaVideoCaptureController alexaVideoCaptureController;

    public ApiType_VideoCaptureControllerWrapper(AlexaVideoCaptureController alexaVideoCaptureController) {
        this.alexaVideoCaptureController = alexaVideoCaptureController;
    }

    @Override // com.amazon.alexa.api.AlexaVideoCaptureController
    public void initialize(AlexaVideoCaptureSessionFactory alexaVideoCaptureSessionFactory) {
        this.alexaVideoCaptureController.initialize(alexaVideoCaptureSessionFactory);
    }

    @Override // com.amazon.alexa.api.AlexaVideoCaptureController
    public void startCapture(AlexaVideoCaptureSession alexaVideoCaptureSession) {
        this.alexaVideoCaptureController.startCapture(alexaVideoCaptureSession);
    }

    @Override // com.amazon.alexa.api.AlexaVideoCaptureController
    public void stopCapture(AlexaVideoCaptureSession alexaVideoCaptureSession) {
        this.alexaVideoCaptureController.stopCapture(alexaVideoCaptureSession);
    }

    @Override // com.amazon.alexa.api.VideoCaptureController
    public void initialize(VideoCaptureSessionFactory videoCaptureSessionFactory) {
    }

    @Override // com.amazon.alexa.api.VideoCaptureController
    public void startCapture(VideoCaptureSession videoCaptureSession) {
    }

    @Override // com.amazon.alexa.api.VideoCaptureController
    public void stopCapture(VideoCaptureSession videoCaptureSession) {
    }
}
