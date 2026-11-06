package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetCardinalityResult implements Serializable {
    private Integer cardinality;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCardinalityResult)) {
            return false;
        }
        GetCardinalityResult getCardinalityResult = (GetCardinalityResult) obj;
        if ((getCardinalityResult.getCardinality() == null) ^ (getCardinality() == null)) {
            return false;
        }
        return getCardinalityResult.getCardinality() == null || getCardinalityResult.getCardinality().equals(getCardinality());
    }

    public Integer getCardinality() {
        return this.cardinality;
    }

    public int hashCode() {
        return 31 + (getCardinality() == null ? 0 : getCardinality().hashCode());
    }

    public void setCardinality(Integer num) {
        this.cardinality = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCardinality() != null) {
            sb.append("cardinality: " + getCardinality());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetCardinalityResult withCardinality(Integer num) {
        this.cardinality = num;
        return this;
    }
}
