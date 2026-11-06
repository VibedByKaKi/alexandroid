package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeThingRequest extends AmazonWebServiceRequest implements Serializable {
    private String thingName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeThingRequest)) {
            return false;
        }
        DescribeThingRequest describeThingRequest = (DescribeThingRequest) obj;
        if ((describeThingRequest.getThingName() == null) ^ (getThingName() == null)) {
            return false;
        }
        return describeThingRequest.getThingName() == null || describeThingRequest.getThingName().equals(getThingName());
    }

    public String getThingName() {
        return this.thingName;
    }

    public int hashCode() {
        return 31 + (getThingName() == null ? 0 : getThingName().hashCode());
    }

    public void setThingName(String str) {
        this.thingName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingName() != null) {
            sb.append("thingName: " + getThingName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeThingRequest withThingName(String str) {
        this.thingName = str;
        return this;
    }
}
