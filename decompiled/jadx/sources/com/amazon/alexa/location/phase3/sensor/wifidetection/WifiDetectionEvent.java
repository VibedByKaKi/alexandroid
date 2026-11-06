package com.amazon.alexa.location.phase3.sensor.wifidetection;

import com.amazon.alexa.location.phase3.evaluator.LocationEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WifiDetectionEvent extends LocationEvent {
    private static final String DATA_TYPE = "WIFI_DETECTION_TRIGGER_EVENT";
    public TransitionType transitionType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TransitionType {
        ARRIVE,
        LEAVE
    }

    public WifiDetectionEvent(long j, TransitionType transitionType) {
        super(DATA_TYPE, 1, j);
        this.transitionType = transitionType;
    }
}
