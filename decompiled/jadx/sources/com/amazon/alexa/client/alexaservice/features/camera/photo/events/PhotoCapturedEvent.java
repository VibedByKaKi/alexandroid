package com.amazon.alexa.client.alexaservice.features.camera.photo.events;

import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PhotoCapturedEvent extends Event.NotGated {
    public static PhotoCapturedEvent create(AlexaCaptureId alexaCaptureId, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator, AlexaCamera alexaCamera) {
        return new AutoValue_PhotoCapturedEvent(alexaCaptureId, alexaCameraCaptureInitiator, alexaCamera);
    }

    public abstract AlexaCamera getAlexaCamera();

    public abstract AlexaCameraCaptureInitiator getAlexaCameraCaptureInitiator();

    public abstract AlexaCaptureId getAlexaCaptureId();
}
