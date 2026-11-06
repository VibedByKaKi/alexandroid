package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
abstract class AutoCaptureSession {
    public abstract void onStartFailed(AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator);

    public abstract void onStarted(AlexaCameraCaptureInitiator alexaCameraCaptureInitiator);

    public abstract void onStopFailed(AlexaCameraCaptureError alexaCameraCaptureError);

    public abstract void onStopped(AlexaAutoCaptureSessionStopReason alexaAutoCaptureSessionStopReason);
}
