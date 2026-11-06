package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_AutoCaptureSessionWrapper extends AutoCaptureSession implements AlexaAutoCaptureSession {
    private final AlexaAutoCaptureSession alexaAutoCaptureSession;

    public ApiType_AutoCaptureSessionWrapper(AlexaAutoCaptureSession alexaAutoCaptureSession) {
        this.alexaAutoCaptureSession = alexaAutoCaptureSession;
    }

    @Override // com.amazon.alexa.api.AutoCaptureSession, com.amazon.alexa.api.AlexaAutoCaptureSession
    public void onStartFailed(AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        this.alexaAutoCaptureSession.onStartFailed(alexaCameraCaptureError, alexaCameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.AutoCaptureSession, com.amazon.alexa.api.AlexaAutoCaptureSession
    public void onStarted(AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        this.alexaAutoCaptureSession.onStarted(alexaCameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.AutoCaptureSession, com.amazon.alexa.api.AlexaAutoCaptureSession
    public void onStopFailed(AlexaCameraCaptureError alexaCameraCaptureError) {
        this.alexaAutoCaptureSession.onStopFailed(alexaCameraCaptureError);
    }

    @Override // com.amazon.alexa.api.AutoCaptureSession, com.amazon.alexa.api.AlexaAutoCaptureSession
    public void onStopped(AlexaAutoCaptureSessionStopReason alexaAutoCaptureSessionStopReason) {
        this.alexaAutoCaptureSession.onStopped(alexaAutoCaptureSessionStopReason);
    }
}
