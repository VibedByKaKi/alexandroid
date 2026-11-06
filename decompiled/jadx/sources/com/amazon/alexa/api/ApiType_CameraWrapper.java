package com.amazon.alexa.api;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_CameraWrapper extends Camera implements AlexaCamera {
    private final AlexaCamera alexaCamera;

    public ApiType_CameraWrapper(AlexaCamera alexaCamera) {
        this.alexaCamera = alexaCamera;
    }

    @Override // com.amazon.alexa.api.AlexaCamera
    @Nullable
    public AlexaAutoCaptureSessionController getAutoCaptureSessionController() {
        return this.alexaCamera.getAutoCaptureSessionController();
    }

    @Override // com.amazon.alexa.api.Camera
    @Nullable
    public AutoCaptureSessionController getAutoCaptureSessionControllerMethod() {
        return null;
    }

    @Override // com.amazon.alexa.api.Camera, com.amazon.alexa.api.AlexaCamera
    public AlexaCameraId getId() {
        return this.alexaCamera.getId();
    }

    @Override // com.amazon.alexa.api.AlexaCamera
    public AlexaPhotoCaptureController getPhotoCaptureController() {
        return this.alexaCamera.getPhotoCaptureController();
    }

    @Override // com.amazon.alexa.api.Camera
    public PhotoCaptureController getPhotoCaptureControllerMethod() {
        return null;
    }

    @Override // com.amazon.alexa.api.AlexaCamera
    @Nullable
    public AlexaVideoCaptureController getVideoCaptureController() {
        return this.alexaCamera.getVideoCaptureController();
    }

    @Override // com.amazon.alexa.api.Camera
    @Nullable
    public VideoCaptureController getVideoCaptureControllerMethod() {
        return null;
    }
}
