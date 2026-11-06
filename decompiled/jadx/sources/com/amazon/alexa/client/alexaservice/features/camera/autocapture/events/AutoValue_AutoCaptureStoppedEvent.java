package com.amazon.alexa.client.alexaservice.features.camera.autocapture.events;

import com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason;
import com.amazon.alexa.client.alexaservice.features.camera.autocapture.AutoCaptureSession;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AutoCaptureStoppedEvent extends AutoCaptureStoppedEvent {
    private final AutoCaptureSession autoCaptureSession;
    private final AlexaAutoCaptureSessionStopReason reason;

    public AutoValue_AutoCaptureStoppedEvent(AutoCaptureSession autoCaptureSession, AlexaAutoCaptureSessionStopReason alexaAutoCaptureSessionStopReason) {
        if (autoCaptureSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null autoCaptureSession");
            throw null;
        }
        this.autoCaptureSession = autoCaptureSession;
        if (alexaAutoCaptureSessionStopReason != null) {
            this.reason = alexaAutoCaptureSessionStopReason;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null reason");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoCaptureStoppedEvent) {
            AutoCaptureStoppedEvent autoCaptureStoppedEvent = (AutoCaptureStoppedEvent) obj;
            if (this.autoCaptureSession.equals(autoCaptureStoppedEvent.getAutoCaptureSession()) && this.reason.equals(autoCaptureStoppedEvent.getReason())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStoppedEvent
    public AutoCaptureSession getAutoCaptureSession() {
        return this.autoCaptureSession;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStoppedEvent
    public AlexaAutoCaptureSessionStopReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() ^ ((this.autoCaptureSession.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "AutoCaptureStoppedEvent{autoCaptureSession=" + this.autoCaptureSession + ", reason=" + this.reason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
