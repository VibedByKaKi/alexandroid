package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.ApiName;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_DeprecatedApiUseEvent extends DeprecatedApiUseEvent {
    private final ApiName apiName;

    public AutoValue_DeprecatedApiUseEvent(ApiName apiName) {
        if (apiName != null) {
            this.apiName = apiName;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null apiName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeprecatedApiUseEvent) {
            return this.apiName.equals(((DeprecatedApiUseEvent) obj).getApiName());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.DeprecatedApiUseEvent
    public ApiName getApiName() {
        return this.apiName;
    }

    public int hashCode() {
        return this.apiName.hashCode() ^ 1000003;
    }

    public String toString() {
        return "DeprecatedApiUseEvent{apiName=" + this.apiName + StringSubstitutor.DEFAULT_VAR_END;
    }
}
