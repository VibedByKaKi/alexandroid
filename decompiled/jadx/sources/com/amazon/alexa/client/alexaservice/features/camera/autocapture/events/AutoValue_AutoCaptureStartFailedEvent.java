package com.amazon.alexa.client.alexaservice.features.camera.autocapture.events;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.client.alexaservice.features.camera.autocapture.AutoCaptureSession;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AutoCaptureStartFailedEvent extends AutoCaptureStartFailedEvent {
    private final AutoCaptureSession autoCaptureSession;
    private final AlexaCameraCaptureError error;
    private final AlexaCameraCaptureInitiator initiator;

    public AutoValue_AutoCaptureStartFailedEvent(AutoCaptureSession autoCaptureSession, AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        if (autoCaptureSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null autoCaptureSession");
            throw null;
        }
        this.autoCaptureSession = autoCaptureSession;
        if (alexaCameraCaptureError == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null error");
            throw null;
        }
        this.error = alexaCameraCaptureError;
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
        if (obj instanceof AutoCaptureStartFailedEvent) {
            AutoCaptureStartFailedEvent autoCaptureStartFailedEvent = (AutoCaptureStartFailedEvent) obj;
            if (this.autoCaptureSession.equals(autoCaptureStartFailedEvent.getAutoCaptureSession()) && this.error.equals(autoCaptureStartFailedEvent.getError()) && this.initiator.equals(autoCaptureStartFailedEvent.getInitiator())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStartFailedEvent
    public AutoCaptureSession getAutoCaptureSession() {
        return this.autoCaptureSession;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStartFailedEvent
    public AlexaCameraCaptureError getError() {
        return this.error;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStartFailedEvent
    public AlexaCameraCaptureInitiator getInitiator() {
        return this.initiator;
    }

    public int hashCode() {
        return this.initiator.hashCode() ^ ((((this.autoCaptureSession.hashCode() ^ 1000003) * 1000003) ^ this.error.hashCode()) * 1000003);
    }

    public String toString() {
        return "AutoCaptureStartFailedEvent{autoCaptureSession=" + this.autoCaptureSession + ", error=" + this.error + ", initiator=" + this.initiator + StringSubstitutor.DEFAULT_VAR_END;
    }
}
