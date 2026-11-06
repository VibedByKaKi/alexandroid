package com.amazon.alexa.client.alexaservice.features.camera.autocapture.events;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.camera.autocapture.AutoCaptureSession;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AutoCaptureStopFailedEvent extends Event.NotGated {
    public static AutoCaptureStopFailedEvent create(AutoCaptureSession autoCaptureSession, AlexaCameraCaptureError alexaCameraCaptureError) {
        return new AutoValue_AutoCaptureStopFailedEvent(autoCaptureSession, alexaCameraCaptureError);
    }

    public abstract AutoCaptureSession getAutoCaptureSession();

    public abstract AlexaCameraCaptureError getError();
}
