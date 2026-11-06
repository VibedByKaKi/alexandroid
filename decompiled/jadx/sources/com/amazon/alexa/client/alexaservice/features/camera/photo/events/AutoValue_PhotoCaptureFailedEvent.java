package com.amazon.alexa.client.alexaservice.features.camera.photo.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PhotoCaptureFailedEvent extends PhotoCaptureFailedEvent {
    private final AlexaCamera alexaCamera;
    private final AlexaCameraCaptureError alexaCameraCaptureError;
    private final AlexaCameraCaptureInitiator alexaCameraCaptureInitiator;

    public AutoValue_PhotoCaptureFailedEvent(AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator, @Nullable AlexaCamera alexaCamera) {
        if (alexaCameraCaptureError == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCameraCaptureError");
            throw null;
        }
        this.alexaCameraCaptureError = alexaCameraCaptureError;
        if (alexaCameraCaptureInitiator == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCameraCaptureInitiator");
            throw null;
        }
        this.alexaCameraCaptureInitiator = alexaCameraCaptureInitiator;
        this.alexaCamera = alexaCamera;
    }

    public boolean equals(Object obj) {
        AlexaCamera alexaCamera;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoCaptureFailedEvent) {
            PhotoCaptureFailedEvent photoCaptureFailedEvent = (PhotoCaptureFailedEvent) obj;
            if (this.alexaCameraCaptureError.equals(photoCaptureFailedEvent.getAlexaCameraCaptureError()) && this.alexaCameraCaptureInitiator.equals(photoCaptureFailedEvent.getAlexaCameraCaptureInitiator()) && ((alexaCamera = this.alexaCamera) != null ? alexaCamera.equals(photoCaptureFailedEvent.getAlexaCamera()) : photoCaptureFailedEvent.getAlexaCamera() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.photo.events.PhotoCaptureFailedEvent
    @Nullable
    public AlexaCamera getAlexaCamera() {
        return this.alexaCamera;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.photo.events.PhotoCaptureFailedEvent
    public AlexaCameraCaptureError getAlexaCameraCaptureError() {
        return this.alexaCameraCaptureError;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.photo.events.PhotoCaptureFailedEvent
    public AlexaCameraCaptureInitiator getAlexaCameraCaptureInitiator() {
        return this.alexaCameraCaptureInitiator;
    }

    public int hashCode() {
        int hashCode = (((this.alexaCameraCaptureError.hashCode() ^ 1000003) * 1000003) ^ this.alexaCameraCaptureInitiator.hashCode()) * 1000003;
        AlexaCamera alexaCamera = this.alexaCamera;
        return (alexaCamera == null ? 0 : alexaCamera.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "PhotoCaptureFailedEvent{alexaCameraCaptureError=" + this.alexaCameraCaptureError + ", alexaCameraCaptureInitiator=" + this.alexaCameraCaptureInitiator + ", alexaCamera=" + this.alexaCamera + StringSubstitutor.DEFAULT_VAR_END;
    }
}
