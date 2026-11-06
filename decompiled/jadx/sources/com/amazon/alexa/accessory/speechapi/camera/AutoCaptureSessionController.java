package com.amazon.alexa.accessory.speechapi.camera;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/camera/AutoCaptureSessionController;", "", "getAutoCaptureSessionFactory", "Lcom/amazon/alexa/accessory/speechapi/camera/AutoCaptureSessionFactory;", "initialize", "", "autoCaptureSessionFactory", "startAutoCaptureSession", "autoCaptureSession", "Lcom/amazon/alexa/accessory/speechapi/camera/AutoCaptureSession;", "stopAutoCaptureSession", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AutoCaptureSessionController {
    @NotNull
    AutoCaptureSessionFactory getAutoCaptureSessionFactory();

    void initialize(@NotNull AutoCaptureSessionFactory autoCaptureSessionFactory);

    void startAutoCaptureSession(@NotNull AutoCaptureSession autoCaptureSession);

    void stopAutoCaptureSession(@NotNull AutoCaptureSession autoCaptureSession);
}
