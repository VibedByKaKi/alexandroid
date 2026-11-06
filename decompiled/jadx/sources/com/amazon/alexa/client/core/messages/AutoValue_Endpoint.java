package com.amazon.alexa.client.core.messages;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_Endpoint extends Endpoint {
    private final String endpointId;

    public AutoValue_Endpoint(String str) {
        if (str != null) {
            this.endpointId = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null endpointId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Endpoint) {
            return this.endpointId.equals(((Endpoint) obj).getEndpointId());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.messages.Endpoint
    public String getEndpointId() {
        return this.endpointId;
    }

    public int hashCode() {
        return this.endpointId.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Endpoint{endpointId="), this.endpointId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
