package com.amazon.alexa.client.alexaservice.features.camera.events;

import com.amazon.alexa.api.AlexaCameraId;
import com.amazon.alexa.client.alexaservice.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CameraDeregisteredEvent extends Event.NotGated {
    private final AlexaCameraId cameraId;

    private CameraDeregisteredEvent(AlexaCameraId alexaCameraId) {
        this.cameraId = alexaCameraId;
    }

    public static CameraDeregisteredEvent create(AlexaCameraId alexaCameraId) {
        return new CameraDeregisteredEvent(alexaCameraId);
    }

    public AlexaCameraId getCameraId() {
        return this.cameraId;
    }
}
