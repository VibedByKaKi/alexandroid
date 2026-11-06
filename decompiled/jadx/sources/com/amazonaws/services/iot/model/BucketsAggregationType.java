package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BucketsAggregationType implements Serializable {
    private TermsAggregation termsAggregation;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BucketsAggregationType)) {
            return false;
        }
        BucketsAggregationType bucketsAggregationType = (BucketsAggregationType) obj;
        if ((bucketsAggregationType.getTermsAggregation() == null) ^ (getTermsAggregation() == null)) {
            return false;
        }
        return bucketsAggregationType.getTermsAggregation() == null || bucketsAggregationType.getTermsAggregation().equals(getTermsAggregation());
    }

    public TermsAggregation getTermsAggregation() {
        return this.termsAggregation;
    }

    public int hashCode() {
        return 31 + (getTermsAggregation() == null ? 0 : getTermsAggregation().hashCode());
    }

    public void setTermsAggregation(TermsAggregation termsAggregation) {
        this.termsAggregation = termsAggregation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTermsAggregation() != null) {
            sb.append("termsAggregation: " + getTermsAggregation());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public BucketsAggregationType withTermsAggregation(TermsAggregation termsAggregation) {
        this.termsAggregation = termsAggregation;
        return this;
    }
}
