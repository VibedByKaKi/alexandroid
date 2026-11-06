package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetPercentilesResult implements Serializable {
    private List<PercentPair> percentiles;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetPercentilesResult)) {
            return false;
        }
        GetPercentilesResult getPercentilesResult = (GetPercentilesResult) obj;
        if ((getPercentilesResult.getPercentiles() == null) ^ (getPercentiles() == null)) {
            return false;
        }
        return getPercentilesResult.getPercentiles() == null || getPercentilesResult.getPercentiles().equals(getPercentiles());
    }

    public List<PercentPair> getPercentiles() {
        return this.percentiles;
    }

    public int hashCode() {
        return 31 + (getPercentiles() == null ? 0 : getPercentiles().hashCode());
    }

    public void setPercentiles(Collection<PercentPair> collection) {
        if (collection == null) {
            this.percentiles = null;
        } else {
            this.percentiles = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPercentiles() != null) {
            sb.append("percentiles: " + getPercentiles());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetPercentilesResult withPercentiles(PercentPair... percentPairArr) {
        if (getPercentiles() == null) {
            this.percentiles = new ArrayList(percentPairArr.length);
        }
        for (PercentPair percentPair : percentPairArr) {
            this.percentiles.add(percentPair);
        }
        return this;
    }

    public GetPercentilesResult withPercentiles(Collection<PercentPair> collection) {
        setPercentiles(collection);
        return this;
    }
}
