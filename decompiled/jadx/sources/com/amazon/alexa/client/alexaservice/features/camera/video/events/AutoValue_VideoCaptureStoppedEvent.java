package com.amazon.alexa.client.alexaservice.features.camera.video.events;

import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.api.AlexaVideoCaptureStopReason;
import com.amazon.alexa.client.alexaservice.features.camera.video.VideoCaptureSession;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_VideoCaptureStoppedEvent extends VideoCaptureStoppedEvent {
    private final AlexaCaptureId alexaCaptureId;
    private final AlexaVideoCaptureStopReason alexaVideoCaptureStopReason;
    private final VideoCaptureSession videoCaptureSession;

    public AutoValue_VideoCaptureStoppedEvent(VideoCaptureSession videoCaptureSession, AlexaCaptureId alexaCaptureId, AlexaVideoCaptureStopReason alexaVideoCaptureStopReason) {
        if (videoCaptureSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null videoCaptureSession");
            throw null;
        }
        this.videoCaptureSession = videoCaptureSession;
        if (alexaCaptureId == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCaptureId");
            throw null;
        }
        this.alexaCaptureId = alexaCaptureId;
        if (alexaVideoCaptureStopReason != null) {
            this.alexaVideoCaptureStopReason = alexaVideoCaptureStopReason;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaVideoCaptureStopReason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoCaptureStoppedEvent) {
            VideoCaptureStoppedEvent videoCaptureStoppedEvent = (VideoCaptureStoppedEvent) obj;
            if (this.videoCaptureSession.equals(videoCaptureStoppedEvent.getVideoCaptureSession()) && this.alexaCaptureId.equals(videoCaptureStoppedEvent.getAlexaCaptureId()) && this.alexaVideoCaptureStopReason.equals(videoCaptureStoppedEvent.getAlexaVideoCaptureStopReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.video.events.VideoCaptureStoppedEvent
    public AlexaCaptureId getAlexaCaptureId() {
        return this.alexaCaptureId;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.video.events.VideoCaptureStoppedEvent
    public AlexaVideoCaptureStopReason getAlexaVideoCaptureStopReason() {
        return this.alexaVideoCaptureStopReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.video.events.VideoCaptureStoppedEvent
    public VideoCaptureSession getVideoCaptureSession() {
        return this.videoCaptureSession;
    }

    public int hashCode() {
        return this.alexaVideoCaptureStopReason.hashCode() ^ ((((this.videoCaptureSession.hashCode() ^ 1000003) * 1000003) ^ this.alexaCaptureId.hashCode()) * 1000003);
    }

    public String toString() {
        return "VideoCaptureStoppedEvent{videoCaptureSession=" + this.videoCaptureSession + ", alexaCaptureId=" + this.alexaCaptureId + ", alexaVideoCaptureStopReason=" + this.alexaVideoCaptureStopReason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
