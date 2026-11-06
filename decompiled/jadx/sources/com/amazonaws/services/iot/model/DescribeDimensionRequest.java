package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeDimensionRequest extends AmazonWebServiceRequest implements Serializable {
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDimensionRequest)) {
            return false;
        }
        DescribeDimensionRequest describeDimensionRequest = (DescribeDimensionRequest) obj;
        if ((describeDimensionRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        return describeDimensionRequest.getName() == null || describeDimensionRequest.getName().equals(getName());
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return 31 + (getName() == null ? 0 : getName().hashCode());
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getName() != null) {
            sb.append("name: " + getName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeDimensionRequest withName(String str) {
        this.name = str;
        return this;
    }
}
