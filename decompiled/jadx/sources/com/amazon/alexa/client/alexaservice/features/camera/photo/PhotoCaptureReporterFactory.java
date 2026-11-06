package com.amazon.alexa.client.alexaservice.features.camera.photo;

import com.amazon.alexa.api.AlexaCamera;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PhotoCaptureReporterFactory {
    private final AlexaClientEventBus eventBus;

    @Inject
    public PhotoCaptureReporterFactory(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    public PhotoCaptureReporter create(ExtendedClient extendedClient, AlexaCamera alexaCamera) {
        return new PhotoCaptureReporter(extendedClient, alexaCamera, this.eventBus);
    }
}
