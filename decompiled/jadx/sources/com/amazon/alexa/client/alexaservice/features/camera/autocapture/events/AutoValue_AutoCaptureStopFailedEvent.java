package com.amazon.alexa.client.alexaservice.features.camera.autocapture.events;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.client.alexaservice.features.camera.autocapture.AutoCaptureSession;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AutoCaptureStopFailedEvent extends AutoCaptureStopFailedEvent {
    private final AutoCaptureSession autoCaptureSession;
    private final AlexaCameraCaptureError error;

    public AutoValue_AutoCaptureStopFailedEvent(AutoCaptureSession autoCaptureSession, AlexaCameraCaptureError alexaCameraCaptureError) {
        if (autoCaptureSession == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null autoCaptureSession");
            throw null;
        }
        this.autoCaptureSession = autoCaptureSession;
        if (alexaCameraCaptureError != null) {
            this.error = alexaCameraCaptureError;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null error");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoCaptureStopFailedEvent) {
            AutoCaptureStopFailedEvent autoCaptureStopFailedEvent = (AutoCaptureStopFailedEvent) obj;
            if (this.autoCaptureSession.equals(autoCaptureStopFailedEvent.getAutoCaptureSession()) && this.error.equals(autoCaptureStopFailedEvent.getError())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStopFailedEvent
    public AutoCaptureSession getAutoCaptureSession() {
        return this.autoCaptureSession;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.autocapture.events.AutoCaptureStopFailedEvent
    public AlexaCameraCaptureError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode() ^ ((this.autoCaptureSession.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "AutoCaptureStopFailedEvent{autoCaptureSession=" + this.autoCaptureSession + ", error=" + this.error + StringSubstitutor.DEFAULT_VAR_END;
    }
}
