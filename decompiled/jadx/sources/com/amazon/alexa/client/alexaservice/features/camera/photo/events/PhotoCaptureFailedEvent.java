package com.amazon.alexa.client.alexaservice.features.camera.photo.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class PhotoCaptureFailedEvent extends Event.NotGated {
    public static PhotoCaptureFailedEvent create(AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator, @Nullable AlexaCamera alexaCamera) {
        return new AutoValue_PhotoCaptureFailedEvent(alexaCameraCaptureError, alexaCameraCaptureInitiator, alexaCamera);
    }

    @Nullable
    public abstract AlexaCamera getAlexaCamera();

    public abstract AlexaCameraCaptureError getAlexaCameraCaptureError();

    public abstract AlexaCameraCaptureInitiator getAlexaCameraCaptureInitiator();
}
