package com.amazon.alexa.client.alexaservice.features.camera.video.events;

import com.amazon.alexa.api.AlexaCaptureId;
import com.amazon.alexa.api.AlexaVideoCaptureStopReason;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.camera.video.VideoCaptureSession;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class VideoCaptureStoppedEvent extends Event.NotGated {
    public static VideoCaptureStoppedEvent create(VideoCaptureSession videoCaptureSession, AlexaCaptureId alexaCaptureId, AlexaVideoCaptureStopReason alexaVideoCaptureStopReason) {
        return new AutoValue_VideoCaptureStoppedEvent(videoCaptureSession, alexaCaptureId, alexaVideoCaptureStopReason);
    }

    public abstract AlexaCaptureId getAlexaCaptureId();

    public abstract AlexaVideoCaptureStopReason getAlexaVideoCaptureStopReason();

    public abstract VideoCaptureSession getVideoCaptureSession();
}
