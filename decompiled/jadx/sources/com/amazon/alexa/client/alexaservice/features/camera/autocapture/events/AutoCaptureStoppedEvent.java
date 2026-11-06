package com.amazon.alexa.client.alexaservice.features.camera.autocapture.events;

import com.amazon.alexa.api.AlexaAutoCaptureSessionStopReason;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.camera.autocapture.AutoCaptureSession;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AutoCaptureStoppedEvent extends Event.NotGated {
    public static AutoCaptureStoppedEvent create(AutoCaptureSession autoCaptureSession, AlexaAutoCaptureSessionStopReason alexaAutoCaptureSessionStopReason) {
        return new AutoValue_AutoCaptureStoppedEvent(autoCaptureSession, alexaAutoCaptureSessionStopReason);
    }

    public abstract AutoCaptureSession getAutoCaptureSession();

    public abstract AlexaAutoCaptureSessionStopReason getReason();
}
