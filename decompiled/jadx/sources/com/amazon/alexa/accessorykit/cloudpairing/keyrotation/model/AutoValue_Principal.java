package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.Principal;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_Principal extends Principal {
    private final String customerId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Principal.Builder {
        private String customerId;

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.Principal.Builder
        public Principal build() {
            String str = this.customerId;
            if (str != null) {
                return new AutoValue_Principal(str, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: customerId");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.Principal.Builder
        public Principal.Builder setCustomerId(String str) {
            if (str != null) {
                this.customerId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null customerId");
            return null;
        }
    }

    private AutoValue_Principal(String str) {
        this.customerId = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Principal) {
            return this.customerId.equals(((Principal) obj).getCustomerId());
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.Principal
    @JsonProperty(BizMetricsConstants.CUSTOMER_ID)
    public String getCustomerId() {
        return this.customerId;
    }

    public int hashCode() {
        return this.customerId.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Principal{customerId="), this.customerId, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_Principal(String str, int i) {
        this(str);
    }
}
