package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AnalyticsMetadataType implements Serializable {
    private String analyticsEndpointId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AnalyticsMetadataType)) {
            return false;
        }
        AnalyticsMetadataType analyticsMetadataType = (AnalyticsMetadataType) obj;
        if ((analyticsMetadataType.getAnalyticsEndpointId() == null) ^ (getAnalyticsEndpointId() == null)) {
            return false;
        }
        return analyticsMetadataType.getAnalyticsEndpointId() == null || analyticsMetadataType.getAnalyticsEndpointId().equals(getAnalyticsEndpointId());
    }

    public String getAnalyticsEndpointId() {
        return this.analyticsEndpointId;
    }

    public int hashCode() {
        return 31 + (getAnalyticsEndpointId() == null ? 0 : getAnalyticsEndpointId().hashCode());
    }

    public void setAnalyticsEndpointId(String str) {
        this.analyticsEndpointId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAnalyticsEndpointId() != null) {
            sb.append("AnalyticsEndpointId: " + getAnalyticsEndpointId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AnalyticsMetadataType withAnalyticsEndpointId(String str) {
        this.analyticsEndpointId = str;
        return this;
    }
}
