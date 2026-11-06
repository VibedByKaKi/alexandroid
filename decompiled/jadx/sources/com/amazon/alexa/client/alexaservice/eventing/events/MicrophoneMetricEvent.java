package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class MicrophoneMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MicrophoneInitializationFailureEvent extends MicrophoneMetricEvent {
        public static MicrophoneInitializationFailureEvent create() {
            return new AutoValue_MicrophoneMetricEvent_MicrophoneInitializationFailureEvent();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MicrophoneInitializationSuccessEvent extends MicrophoneMetricEvent {
        public static MicrophoneInitializationSuccessEvent create(long j) {
            return new AutoValue_MicrophoneMetricEvent_MicrophoneInitializationSuccessEvent(j);
        }

        public abstract long getInitializationTime();
    }
}
