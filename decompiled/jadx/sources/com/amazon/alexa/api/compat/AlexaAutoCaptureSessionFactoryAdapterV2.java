package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaAutoCaptureSessionFactoryAdapterV2;", "Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSessionFactory;", "voxFactory", "Lcom/amazon/alexa/api/AlexaAutoCaptureSessionFactory;", "<init>", "(Lcom/amazon/alexa/api/AlexaAutoCaptureSessionFactory;)V", "createNewSession", "Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSession;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaAutoCaptureSessionFactoryAdapterV2 implements com.amazon.alexa.api.compat.model.AlexaAutoCaptureSessionFactory {

    @NotNull
    private final com.amazon.alexa.api.AlexaAutoCaptureSessionFactory voxFactory;

    public AlexaAutoCaptureSessionFactoryAdapterV2(@NotNull com.amazon.alexa.api.AlexaAutoCaptureSessionFactory alexaAutoCaptureSessionFactory) {
        alexaAutoCaptureSessionFactory.getClass();
        this.voxFactory = alexaAutoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAutoCaptureSessionFactory
    @NotNull
    public com.amazon.alexa.api.compat.model.AlexaAutoCaptureSession createNewSession() {
        com.amazon.alexa.api.AlexaAutoCaptureSession createNewSession = this.voxFactory.createNewSession();
        createNewSession.getClass();
        return new AlexaAutoCaptureSessionAdapterV2(createNewSession);
    }
}
