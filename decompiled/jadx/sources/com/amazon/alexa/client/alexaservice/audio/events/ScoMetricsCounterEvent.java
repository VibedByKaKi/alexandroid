package com.amazon.alexa.client.alexaservice.audio.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ScoMetricsCounterEvent extends Event.NotGated {
    public static ScoMetricsCounterEvent create(String str, int i) {
        return new AutoValue_ScoMetricsCounterEvent(str, i);
    }

    public abstract int getCount();

    public abstract String getName();
}
