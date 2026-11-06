package com.amazon.alexa.client.alexaservice.features.camera.photo.events;

import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.AlexaCaptureId;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PhotoCapturedEvent extends PhotoCapturedEvent {
    private final AlexaCamera alexaCamera;
    private final AlexaCameraCaptureInitiator alexaCameraCaptureInitiator;
    private final AlexaCaptureId alexaCaptureId;

    public AutoValue_PhotoCapturedEvent(AlexaCaptureId alexaCaptureId, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator, AlexaCamera alexaCamera) {
        if (alexaCaptureId == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCaptureId");
            throw null;
        }
        this.alexaCaptureId = alexaCaptureId;
        if (alexaCameraCaptureInitiator == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCameraCaptureInitiator");
            throw null;
        }
        this.alexaCameraCaptureInitiator = alexaCameraCaptureInitiator;
        if (alexaCamera != null) {
            this.alexaCamera = alexaCamera;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null alexaCamera");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoCapturedEvent) {
            PhotoCapturedEvent photoCapturedEvent = (PhotoCapturedEvent) obj;
            if (this.alexaCaptureId.equals(photoCapturedEvent.getAlexaCaptureId()) && this.alexaCameraCaptureInitiator.equals(photoCapturedEvent.getAlexaCameraCaptureInitiator()) && this.alexaCamera.equals(photoCapturedEvent.getAlexaCamera())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.photo.events.PhotoCapturedEvent
    public AlexaCamera getAlexaCamera() {
        return this.alexaCamera;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.photo.events.PhotoCapturedEvent
    public AlexaCameraCaptureInitiator getAlexaCameraCaptureInitiator() {
        return this.alexaCameraCaptureInitiator;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.camera.photo.events.PhotoCapturedEvent
    public AlexaCaptureId getAlexaCaptureId() {
        return this.alexaCaptureId;
    }

    public int hashCode() {
        return this.alexaCamera.hashCode() ^ ((((this.alexaCaptureId.hashCode() ^ 1000003) * 1000003) ^ this.alexaCameraCaptureInitiator.hashCode()) * 1000003);
    }

    public String toString() {
        return "PhotoCapturedEvent{alexaCaptureId=" + this.alexaCaptureId + ", alexaCameraCaptureInitiator=" + this.alexaCameraCaptureInitiator + ", alexaCamera=" + this.alexaCamera + StringSubstitutor.DEFAULT_VAR_END;
    }
}
