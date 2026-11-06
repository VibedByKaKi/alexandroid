package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.api.AlexaVideoCaptureStopReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSessionAdapter;", "Lcom/amazon/alexa/api/compat/AlexaVideoCaptureSession;", "videoCaptureSession", "Lcom/amazon/alexa/api/AlexaVideoCaptureSession;", "<init>", "(Lcom/amazon/alexa/api/AlexaVideoCaptureSession;)V", "getVideoCaptureSession", "()Lcom/amazon/alexa/api/AlexaVideoCaptureSession;", "onStarted", "", "cameraCaptureInitiator", "Lcom/amazon/alexa/api/AlexaCameraCaptureInitiator;", "onStopped", "captureId", "Lcom/amazon/alexa/api/AlexaCaptureId;", "reason", "Lcom/amazon/alexa/api/AlexaVideoCaptureStopReason;", "onError", "captureError", "Lcom/amazon/alexa/api/AlexaCameraCaptureError;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaVideoCaptureSessionAdapter implements AlexaVideoCaptureSession {

    @NotNull
    private final com.amazon.alexa.api.AlexaVideoCaptureSession videoCaptureSession;

    public AlexaVideoCaptureSessionAdapter(@NotNull com.amazon.alexa.api.AlexaVideoCaptureSession alexaVideoCaptureSession) {
        alexaVideoCaptureSession.getClass();
        this.videoCaptureSession = alexaVideoCaptureSession;
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaVideoCaptureSession getVideoCaptureSession() {
        return this.videoCaptureSession;
    }

    @Override // com.amazon.alexa.api.compat.AlexaVideoCaptureSession
    public void onError(@NotNull AlexaCameraCaptureError captureError, @NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator) {
        captureError.getClass();
        cameraCaptureInitiator.getClass();
        this.videoCaptureSession.onError(captureError, cameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.compat.AlexaVideoCaptureSession
    public void onStarted(@NotNull AlexaCameraCaptureInitiator cameraCaptureInitiator) {
        cameraCaptureInitiator.getClass();
        this.videoCaptureSession.onStarted(cameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.compat.AlexaVideoCaptureSession
    public void onStopped(@NotNull AlexaCaptureId captureId, @NotNull AlexaVideoCaptureStopReason reason) {
        captureId.getClass();
        reason.getClass();
        this.videoCaptureSession.onStopped(captureId, reason);
    }
}
