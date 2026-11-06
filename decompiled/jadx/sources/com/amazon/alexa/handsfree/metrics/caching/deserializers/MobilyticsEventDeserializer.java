package com.amazon.alexa.handsfree.metrics.caching.deserializers;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class MobilyticsEventDeserializer<T extends MobilyticsEvent> extends StdDeserializer<T> {
    public MobilyticsEventDeserializer(@NonNull Class<T> cls) {
        super((Class<?>) cls);
    }

    public String getComponent(@NonNull JsonNode jsonNode) {
        return jsonNode.findValue(JsonFields.COMPONENT).asText();
    }

    public String getEventName(@NonNull JsonNode jsonNode) {
        return jsonNode.findValue("eventName").asText();
    }

    public String getSubComponent(@NonNull JsonNode jsonNode) {
        return jsonNode.findValue("subComponent").asText();
    }

    public void setEventAttributes(@NonNull T t, @NonNull JsonNode jsonNode) {
        t.setEventId(jsonNode.findValue("eventId").asText());
        t.setEventTimestamp(jsonNode.findValue("eventTimestamp").asLong());
        t.setContentId(jsonNode.findValue("contentId").asText(null));
        t.setContentType(jsonNode.findValue("contentType").asText(null));
        t.setSourceContext(jsonNode.findValue("sourceContext").asText(null));
    }
}
