package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class WakewordDetectionEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ExternalWakeWordVerifiedEvent extends WakeWordMetricEvent {
        public static ExternalWakeWordVerifiedEvent create() {
            return new AutoValue_WakewordDetectionEvent_ExternalWakeWordVerifiedEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class InAppWakeWordDetectedEvent extends WakeWordMetricEvent {
        public static InAppWakeWordDetectedEvent create(long j) {
            return new AutoValue_WakewordDetectionEvent_InAppWakeWordDetectedEvent(j);
        }

        public abstract long getWakewordDetectionTimeMs();
    }
}
