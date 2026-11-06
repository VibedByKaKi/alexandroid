package com.amazon.alexa.client.alexaservice.base.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ForegroundServiceStartDeniedMetricEvent extends Event.NotGated {
    public static ForegroundServiceStartDeniedMetricEvent create(@Nullable String str) {
        return new AutoValue_ForegroundServiceStartDeniedMetricEvent(str);
    }

    @Nullable
    public abstract String getStartAction();
}
