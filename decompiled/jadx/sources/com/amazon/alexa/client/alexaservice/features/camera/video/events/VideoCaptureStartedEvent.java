package com.amazon.alexa.client.alexaservice.features.camera.video.events;

import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.features.camera.video.VideoCaptureSession;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class VideoCaptureStartedEvent extends Event.NotGated {
    public static VideoCaptureStartedEvent create(VideoCaptureSession videoCaptureSession, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        return new AutoValue_VideoCaptureStartedEvent(videoCaptureSession, alexaCameraCaptureInitiator);
    }

    public abstract AlexaCameraCaptureInitiator getAlexaCameraCaptureInitiator();

    public abstract VideoCaptureSession getVideoCaptureSession();
}
