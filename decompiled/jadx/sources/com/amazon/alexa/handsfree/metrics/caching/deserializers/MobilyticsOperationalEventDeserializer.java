package com.amazon.alexa.handsfree.metrics.caching.deserializers;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.fasterxml.jackson.databind.JsonNode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class MobilyticsOperationalEventDeserializer<T extends DefaultMobilyticsOperationalEvent> extends MobilyticsEventDeserializer<T> {
    public MobilyticsOperationalEventDeserializer(@NonNull Class<T> cls) {
        super(cls);
    }

    @Override // com.amazon.alexa.handsfree.metrics.caching.deserializers.MobilyticsEventDeserializer
    public void setEventAttributes(@NonNull T t, @NonNull JsonNode jsonNode) {
        super.setEventAttributes((MobilyticsOperationalEventDeserializer<T>) t, jsonNode);
        t.withEventNumericValue(Long.valueOf(jsonNode.findValue(JsonFields.EVENT_NUMERIC_VALUE).asLong()));
    }
}
