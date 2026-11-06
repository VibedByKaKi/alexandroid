package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.ApiCallIdentifier;
import com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientMetricEvent_RecordEvent extends ClientMetricEvent.RecordEvent {
    private final ApiCallIdentifier apiCallIdentifier;
    private final Integer eventValue;
    private final String name;

    public AutoValue_ClientMetricEvent_RecordEvent(String str, ApiCallIdentifier apiCallIdentifier, Integer num) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        if (apiCallIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null apiCallIdentifier");
            throw null;
        }
        this.apiCallIdentifier = apiCallIdentifier;
        if (num != null) {
            this.eventValue = num;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventValue");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientMetricEvent.RecordEvent) {
            ClientMetricEvent.RecordEvent recordEvent = (ClientMetricEvent.RecordEvent) obj;
            if (this.name.equals(recordEvent.getName()) && this.apiCallIdentifier.equals(recordEvent.getApiCallIdentifier()) && this.eventValue.equals(recordEvent.getEventValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent.RecordEvent
    public ApiCallIdentifier getApiCallIdentifier() {
        return this.apiCallIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent.RecordEvent
    public Integer getEventValue() {
        return this.eventValue;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.ClientMetricEvent
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.eventValue.hashCode() ^ ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.apiCallIdentifier.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RecordEvent{name=");
        sb.append(this.name);
        sb.append(", apiCallIdentifier=");
        sb.append(this.apiCallIdentifier);
        sb.append(", eventValue=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.eventValue, StringSubstitutor.DEFAULT_VAR_END);
    }
}
