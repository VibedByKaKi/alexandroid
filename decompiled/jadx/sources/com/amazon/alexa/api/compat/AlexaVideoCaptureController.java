package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaVideoCaptureController;", "", "initialize", "", "captureSessionFactory", "Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSessionFactory;", "startCapture", "captureSession", "Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;", "stopCapture", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaVideoCaptureController {
    void initialize(@NotNull AlexaVideoCaptureSessionFactory captureSessionFactory);

    void startCapture(@NotNull AlexaVideoCaptureSession captureSession);

    void stopCapture(@NotNull AlexaVideoCaptureSession captureSession);
}
