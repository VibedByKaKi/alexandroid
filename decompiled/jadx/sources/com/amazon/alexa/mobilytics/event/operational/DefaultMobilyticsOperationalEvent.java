package com.amazon.alexa.mobilytics.event.operational;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent;
import com.amazon.alexa.mobilytics.event.EventType;
import com.amazon.alexa.mobilytics.protobuf.EventDetailsProto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes18.dex */
public class DefaultMobilyticsOperationalEvent extends DefaultMobilyticsEvent<DefaultMobilyticsOperationalEvent> implements MobilyticsOperationalEvent {
    private Map<String, String> debugInfo;
    private Long eventNumericValue;
    protected String operationalEventType;

    public DefaultMobilyticsOperationalEvent(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        super(str, str2, str3);
        this.eventNumericValue = null;
        this.operationalEventType = "counter";
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent
    @Nullable
    public Map<String, String> getDebugInfo() {
        return this.debugInfo;
    }

    @NonNull
    public Long getEventNumericValue() {
        return this.eventNumericValue;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent, com.amazon.alexa.mobilytics.event.MobilyticsEvent
    @JsonIgnore
    public String getEventType() {
        return EventType.OPERATIONAL;
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent
    public String getOperationalEventType() {
        return this.operationalEventType;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    public EventDetailsProto.Builder serialize() {
        EventDetailsProto.Builder serialize = super.serialize();
        String str = this.operationalEventType;
        if (str != null) {
            serialize.setOperationalEventType(str);
        }
        Long l = this.eventNumericValue;
        if (l != null) {
            serialize.setEventNumericValue(l.longValue());
        }
        Map<String, String> map = this.debugInfo;
        if (map != null) {
            serialize.putAllDebugInfo(map);
        }
        return serialize;
    }

    @JsonIgnore
    public DefaultMobilyticsOperationalEvent withDebugInfo(@Nullable Map<String, String> map) {
        this.debugInfo = map;
        return this;
    }

    @JsonIgnore
    public DefaultMobilyticsOperationalEvent withEventNumericValue(Long l) {
        this.eventNumericValue = l;
        return this;
    }

    @JsonIgnore
    public DefaultMobilyticsOperationalEvent withOperationalEventType(String str) {
        this.operationalEventType = str;
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    @JsonIgnore
    public DefaultMobilyticsOperationalEvent getThis() {
        return this;
    }

    public DefaultMobilyticsOperationalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, String str5) {
        super(str, str3, str4, str5);
        this.eventNumericValue = null;
        this.operationalEventType = str2;
    }

    public DefaultMobilyticsOperationalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        super(str, str3, str4);
        this.eventNumericValue = null;
        this.operationalEventType = str2;
    }

    public DefaultMobilyticsOperationalEvent(String str, String str2) {
        super(str, str2);
        this.eventNumericValue = null;
    }
}
