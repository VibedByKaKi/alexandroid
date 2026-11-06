package com.amazon.alexa.matter.utils.metrics;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum CommonMetricEvents implements CloudwatchMetricEvent {
    EventTypeParseFailure("EventBus:EventType:parseFailure"),
    EventTypeUnsupported("EventBus:EventType:unsupported"),
    EventBusMessageParseSuccess("EventBus:EventBusMessage:parseSuccess");


    @NonNull
    private final String mEventName;

    CommonMetricEvents(@NonNull String str) {
        this.mEventName = str;
    }

    @Override // com.amazon.alexa.matter.utils.metrics.CloudwatchMetricEvent
    @NonNull
    public String getEventName() {
        return this.mEventName;
    }
}
