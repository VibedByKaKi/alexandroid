package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSessionControllerAdapter;", "Lcom/amazon/alexa/api/AlexaAutoCaptureSessionController;", "compatController", "Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSessionController;", "<init>", "(Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSessionController;)V", "initialize", "", "autoCaptureSessionFactory", "Lcom/amazon/alexa/api/AlexaAutoCaptureSessionFactory;", "startSession", "autoCaptureSession", "Lcom/amazon/alexa/api/AlexaAutoCaptureSession;", "stopSession", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaAutoCaptureSessionControllerAdapter implements com.amazon.alexa.api.AlexaAutoCaptureSessionController {

    @NotNull
    private final AlexaAutoCaptureSessionController compatController;

    public AlexaAutoCaptureSessionControllerAdapter(@NotNull AlexaAutoCaptureSessionController alexaAutoCaptureSessionController) {
        alexaAutoCaptureSessionController.getClass();
        this.compatController = alexaAutoCaptureSessionController;
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionController
    public void initialize(@NotNull com.amazon.alexa.api.AlexaAutoCaptureSessionFactory autoCaptureSessionFactory) {
        autoCaptureSessionFactory.getClass();
        this.compatController.initialize(new AlexaAutoCaptureSessionFactoryAdapter(autoCaptureSessionFactory));
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionController
    public void startSession(@NotNull com.amazon.alexa.api.AlexaAutoCaptureSession autoCaptureSession) {
        autoCaptureSession.getClass();
        this.compatController.startSession(new AlexaAutoCaptureSessionAdapter(autoCaptureSession));
    }

    @Override // com.amazon.alexa.api.AlexaAutoCaptureSessionController
    public void stopSession(@NotNull com.amazon.alexa.api.AlexaAutoCaptureSession autoCaptureSession) {
        autoCaptureSession.getClass();
        this.compatController.stopSession(new AlexaAutoCaptureSessionAdapter(autoCaptureSession));
    }
}
