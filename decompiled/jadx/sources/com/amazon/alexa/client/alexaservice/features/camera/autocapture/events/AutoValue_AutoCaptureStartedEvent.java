package com.amazon.alexa.client.alexaservice.features.camera.autocapture.events;

import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.client.alexaservice.features.camera.autocapture.AutoCaptureSession;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AutoCaptureStartedEvent extends AutoCaptureStartedEvent {
    private final AutoCaptureSession autoCaptureSession;
    private final AlexaCameraCaptureInitiator initiator;

    public AutoValue_AutoCaptureStartedEvent(AutoCaptureSession autoCaptureSession, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        if (autoCaptureSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null autoCaptureSession");
            throw null;
        }
        this.autoCaptureSession = autoCaptureSession;
        if (alexaCameraCaptureInitiator != null) {
            this.initiator = alexaCameraCaptureInitiator;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null initiator");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoCaptureStartedEvent) {
            AutoCaptureStartedEvent autoCaptureStartedEvent = (AutoCaptureStartedEvent) obj;
            if (this.autoCaptureSession.equals(autoCaptureStartedEvent.getAutoCaptureSession()) && this.initiator.equals(autoCaptureStartedEvent.getInitiator())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStartedEvent
    public AutoCaptureSession getAutoCaptureSession() {
        return this.autoCaptureSession;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStartedEvent
    public AlexaCameraCaptureInitiator getInitiator() {
        return this.initiator;
    }

    public int hashCode() {
        return this.initiator.hashCode() ^ ((this.autoCaptureSession.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "AutoCaptureStartedEvent{autoCaptureSession=" + this.autoCaptureSession + ", initiator=" + this.initiator + StringSubstitutor.DEFAULT_VAR_END;
    }
}
