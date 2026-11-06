package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class EventBusMessage {
    private EventType eventType;
    private Payload payload;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public EventBusMessage() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof EventBusMessage;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventBusMessage)) {
            return false;
        }
        EventBusMessage eventBusMessage = (EventBusMessage) obj;
        if (!eventBusMessage.canEqual(this)) {
            return false;
        }
        EventType eventType = getEventType();
        EventType eventType2 = eventBusMessage.getEventType();
        if (eventType != null ? !eventType.equals(eventType2) : eventType2 != null) {
            return false;
        }
        Payload payload = getPayload();
        Payload payload2 = eventBusMessage.getPayload();
        return payload != null ? payload.equals(payload2) : payload2 == null;
    }

    @JsonProperty("eventType")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public EventType getEventType() {
        return this.eventType;
    }

    @JsonProperty("payload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Payload getPayload() {
        return this.payload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        EventType eventType = getEventType();
        int hashCode = eventType == null ? 43 : eventType.hashCode();
        Payload payload = getPayload();
        return ((hashCode + 59) * 59) + (payload != null ? payload.hashCode() : 43);
    }

    @JsonProperty("eventType")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("payload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "EventBusMessage(eventType=" + getEventType() + ", payload=" + getPayload() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
