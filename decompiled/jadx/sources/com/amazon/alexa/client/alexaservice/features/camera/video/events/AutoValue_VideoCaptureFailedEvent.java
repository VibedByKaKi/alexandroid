package com.amazon.alexa.client.alexaservice.features.camera.video.events;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.client.alexaservice.features.camera.video.VideoCaptureSession;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_VideoCaptureFailedEvent extends VideoCaptureFailedEvent {
    private final AlexaCameraCaptureError alexaCameraCaptureError;
    private final AlexaCameraCaptureInitiator alexaCameraCaptureInitiator;
    private final VideoCaptureSession videoCaptureSession;

    public AutoValue_VideoCaptureFailedEvent(VideoCaptureSession videoCaptureSession, AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        if (videoCaptureSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null videoCaptureSession");
            throw null;
        }
        this.videoCaptureSession = videoCaptureSession;
        if (alexaCameraCaptureError == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCameraCaptureError");
            throw null;
        }
        this.alexaCameraCaptureError = alexaCameraCaptureError;
        if (alexaCameraCaptureInitiator != null) {
            this.alexaCameraCaptureInitiator = alexaCameraCaptureInitiator;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCameraCaptureInitiator");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoCaptureFailedEvent) {
            VideoCaptureFailedEvent videoCaptureFailedEvent = (VideoCaptureFailedEvent) obj;
            if (this.videoCaptureSession.equals(videoCaptureFailedEvent.getVideoCaptureSession()) && this.alexaCameraCaptureError.equals(videoCaptureFailedEvent.getAlexaCameraCaptureError()) && this.alexaCameraCaptureInitiator.equals(videoCaptureFailedEvent.getAlexaCameraCaptureInitiator())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.video.events.VideoCaptureFailedEvent
    public AlexaCameraCaptureError getAlexaCameraCaptureError() {
        return this.alexaCameraCaptureError;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.video.events.VideoCaptureFailedEvent
    public AlexaCameraCaptureInitiator getAlexaCameraCaptureInitiator() {
        return this.alexaCameraCaptureInitiator;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.video.events.VideoCaptureFailedEvent
    public VideoCaptureSession getVideoCaptureSession() {
        return this.videoCaptureSession;
    }

    public int hashCode() {
        return this.alexaCameraCaptureInitiator.hashCode() ^ ((((this.videoCaptureSession.hashCode() ^ 1000003) * 1000003) ^ this.alexaCameraCaptureError.hashCode()) * 1000003);
    }

    public String toString() {
        return "VideoCaptureFailedEvent{videoCaptureSession=" + this.videoCaptureSession + ", alexaCameraCaptureError=" + this.alexaCameraCaptureError + ", alexaCameraCaptureInitiator=" + this.alexaCameraCaptureInitiator + StringSubstitutor.DEFAULT_VAR_END;
    }
}
