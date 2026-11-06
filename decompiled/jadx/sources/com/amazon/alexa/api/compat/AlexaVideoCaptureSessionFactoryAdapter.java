package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSessionFactoryAdapter;", "Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSessionFactory;", "videoCaptureSessionFactory", "Lcom/amazon/alexa/api/AlexaVideoCaptureSessionFactory;", "<init>", "(Lcom/amazon/alexa/api/AlexaVideoCaptureSessionFactory;)V", "createNewSession", "Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaVideoCaptureSessionFactoryAdapter implements AlexaVideoCaptureSessionFactory {

    @NotNull
    private final com.amazon.alexa.api.AlexaVideoCaptureSessionFactory videoCaptureSessionFactory;

    public AlexaVideoCaptureSessionFactoryAdapter(@NotNull com.amazon.alexa.api.AlexaVideoCaptureSessionFactory alexaVideoCaptureSessionFactory) {
        alexaVideoCaptureSessionFactory.getClass();
        this.videoCaptureSessionFactory = alexaVideoCaptureSessionFactory;
    }

    @Override // com.amazon.alexa.api.compat.AlexaVideoCaptureSessionFactory
    @NotNull
    public AlexaVideoCaptureSession createNewSession() {
        com.amazon.alexa.api.AlexaVideoCaptureSession createNewSession = this.videoCaptureSessionFactory.createNewSession();
        createNewSession.getClass();
        return new AlexaVideoCaptureSessionAdapter(createNewSession);
    }
}
