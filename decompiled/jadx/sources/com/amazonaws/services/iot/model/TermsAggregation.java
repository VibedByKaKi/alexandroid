package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TermsAggregation implements Serializable {
    private Integer maxBuckets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TermsAggregation)) {
            return false;
        }
        TermsAggregation termsAggregation = (TermsAggregation) obj;
        if ((termsAggregation.getMaxBuckets() == null) ^ (getMaxBuckets() == null)) {
            return false;
        }
        return termsAggregation.getMaxBuckets() == null || termsAggregation.getMaxBuckets().equals(getMaxBuckets());
    }

    public Integer getMaxBuckets() {
        return this.maxBuckets;
    }

    public int hashCode() {
        return 31 + (getMaxBuckets() == null ? 0 : getMaxBuckets().hashCode());
    }

    public void setMaxBuckets(Integer num) {
        this.maxBuckets = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMaxBuckets() != null) {
            sb.append("maxBuckets: " + getMaxBuckets());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TermsAggregation withMaxBuckets(Integer num) {
        this.maxBuckets = num;
        return this;
    }
}
