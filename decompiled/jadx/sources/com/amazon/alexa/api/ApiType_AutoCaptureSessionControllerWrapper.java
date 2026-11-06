package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_AutoCaptureSessionControllerWrapper extends AutoCaptureSessionController implements AlexaAutoCaptureSessionController {
    private final AlexaAutoCaptureSessionController alexaAutoCaptureSessionController;

    public ApiType_AutoCaptureSessionControllerWrapper(AlexaAutoCaptureSessionController alexaAutoCaptureSessionController) {
        this.alexaAutoCaptureSessionController = alexaAutoCaptureSessionController;
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionController
    public void initialize(AlexaAutoCaptureSessionFactory alexaAutoCaptureSessionFactory) {
        this.alexaAutoCaptureSessionController.initialize(alexaAutoCaptureSessionFactory);
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionController
    public void startSession(AlexaAutoCaptureSession alexaAutoCaptureSession) {
        this.alexaAutoCaptureSessionController.startSession(alexaAutoCaptureSession);
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionController
    public void stopSession(AlexaAutoCaptureSession alexaAutoCaptureSession) {
        this.alexaAutoCaptureSessionController.stopSession(alexaAutoCaptureSession);
    }

    @Override // com.amazon.alexa.api.AutoCaptureSessionController
    public void initialize(AutoCaptureSessionFactory autoCaptureSessionFactory) {
    }

    @Override // com.amazon.alexa.api.AutoCaptureSessionController
    public void startSession(AutoCaptureSession autoCaptureSession) {
    }

    @Override // com.amazon.alexa.api.AutoCaptureSessionController
    public void stopSession(AutoCaptureSession autoCaptureSession) {
    }
}
