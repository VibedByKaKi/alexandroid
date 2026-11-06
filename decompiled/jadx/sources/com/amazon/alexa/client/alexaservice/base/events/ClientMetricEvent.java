package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.ApiCallIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ClientMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class RecordLatencyEvent extends ClientMetricEvent {
        public static RecordLatencyEvent create(String str, long j) {
            return new AutoValue_ClientMetricEvent_RecordLatencyEvent(str, j);
        }

        public abstract long getLatency();
    }

    public abstract String getName();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class RecordEvent extends ClientMetricEvent {
        public static RecordEvent create(String str, ApiCallIdentifier apiCallIdentifier) {
            return create(str, apiCallIdentifier, 1);
        }

        public abstract ApiCallIdentifier getApiCallIdentifier();

        public abstract Integer getEventValue();

        public static RecordEvent create(String str, ApiCallIdentifier apiCallIdentifier, Integer num) {
            return new AutoValue_ClientMetricEvent_RecordEvent(str, apiCallIdentifier, num);
        }
    }
}
