package com.amazon.alexa.smarthomecameras.eventsender;

import android.util.Log;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext;
import com.amazon.alexa.smarthomecameras.service.CamerasMobilyticsService;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class EventSender {
    private static final String TAG = "EventSender";
    private final AlexaMobileFrameworkApisV2 amfApis;
    protected final CamerasMobilyticsService mobilyticsService;

    public EventSender(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, CamerasMobilyticsService camerasMobilyticsService) {
        this.amfApis = alexaMobileFrameworkApisV2;
        this.mobilyticsService = camerasMobilyticsService;
    }

    public void initialize() {
        this.amfApis.start();
    }

    public void sendEvent(EventSenderContext eventSenderContext) {
        String namespace = eventSenderContext.getAlexaHeader().getNamespace();
        String eventName = eventSenderContext.getEventName();
        String str = TAG;
        Log.i(str, a$$ExternalSyntheticOutline0.m("Sending ", namespace, ".", eventName, " event"));
        this.amfApis.getCapabilitiesApi().sendEvent(eventSenderContext.buildAlexaEvent(), true);
        Log.i(str, namespace + "." + eventName + " event sent");
    }

    public void teardown() {
        this.amfApis.stop();
        this.amfApis.destroy();
    }
}
