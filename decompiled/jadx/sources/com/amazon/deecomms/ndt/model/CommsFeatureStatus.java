package com.amazon.deecomms.ndt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsFeatureStatus {

    @JsonProperty("feature")
    private String feature;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("supported")
    private boolean supported;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CommsFeatureStatus commsFeatureStatus = (CommsFeatureStatus) obj;
            if (this.supported == commsFeatureStatus.supported && Objects.equal(this.feature, commsFeatureStatus.feature) && Objects.equal(this.reason, commsFeatureStatus.reason)) {
                return true;
            }
        }
        return false;
    }

    public String getFeature() {
        return this.feature;
    }

    public String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Objects.hashCode(this.feature, Boolean.valueOf(this.supported), this.reason);
    }

    public boolean isSupported() {
        return this.supported;
    }

    public void setFeature(String str) {
        this.feature = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setSupported(boolean z) {
        this.supported = z;
    }
}
