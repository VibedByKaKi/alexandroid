package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_VideoCaptureSessionWrapper extends VideoCaptureSession implements AlexaVideoCaptureSession {
    private final AlexaVideoCaptureSession alexaVideoCaptureSession;

    public ApiType_VideoCaptureSessionWrapper(AlexaVideoCaptureSession alexaVideoCaptureSession) {
        this.alexaVideoCaptureSession = alexaVideoCaptureSession;
    }

    @Override // com.amazon.alexa.api.VideoCaptureSession, com.amazon.alexa.api.AlexaVideoCaptureSession
    public void onError(AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        this.alexaVideoCaptureSession.onError(alexaCameraCaptureError, alexaCameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.VideoCaptureSession, com.amazon.alexa.api.AlexaVideoCaptureSession
    public void onStarted(AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        this.alexaVideoCaptureSession.onStarted(alexaCameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.VideoCaptureSession, com.amazon.alexa.api.AlexaVideoCaptureSession
    public void onStopped(AlexaCaptureId alexaCaptureId, AlexaVideoCaptureStopReason alexaVideoCaptureStopReason) {
        this.alexaVideoCaptureSession.onStopped(alexaCaptureId, alexaVideoCaptureStopReason);
    }
}
