package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class NetworkLatencyMetricEvent extends Event.NotGated {
    public static NetworkLatencyMetricEvent create(String str, long j, String str2) {
        return new AutoValue_NetworkLatencyMetricEvent(str, j, str2);
    }

    public abstract String getLifeCycleName();

    public abstract long getProcessTimeMillis();

    public abstract String getRequestType();
}
