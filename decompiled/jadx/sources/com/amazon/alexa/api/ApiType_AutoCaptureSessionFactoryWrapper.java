package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_AutoCaptureSessionFactoryWrapper extends AutoCaptureSessionFactory implements AlexaAutoCaptureSessionFactory {
    private final AlexaAutoCaptureSessionFactory alexaAutoCaptureSessionFactory;

    public ApiType_AutoCaptureSessionFactoryWrapper(AlexaAutoCaptureSessionFactory alexaAutoCaptureSessionFactory) {
        this.alexaAutoCaptureSessionFactory = alexaAutoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionFactory
    public AlexaAutoCaptureSession createNewSession() {
        return this.alexaAutoCaptureSessionFactory.createNewSession();
    }

    @Override // com.amazon.alexa.api.AutoCaptureSessionFactory
    public AutoCaptureSession createNewSessionMethod() {
        return null;
    }
}
