package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_VideoCaptureSessionFactoryWrapper extends VideoCaptureSessionFactory implements AlexaVideoCaptureSessionFactory {
    private final AlexaVideoCaptureSessionFactory alexaVideoCaptureSessionFactory;

    public ApiType_VideoCaptureSessionFactoryWrapper(AlexaVideoCaptureSessionFactory alexaVideoCaptureSessionFactory) {
        this.alexaVideoCaptureSessionFactory = alexaVideoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.api.AlexaVideoCaptureSessionFactory
    public AlexaVideoCaptureSession createNewSession() {
        return this.alexaVideoCaptureSessionFactory.createNewSession();
    }

    @Override // com.amazon.alexa.api.VideoCaptureSessionFactory
    public VideoCaptureSession createNewSessionMethod() {
        return null;
    }
}
