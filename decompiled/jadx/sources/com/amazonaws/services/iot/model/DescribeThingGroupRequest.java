package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String thingGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeThingGroupRequest)) {
            return false;
        }
        DescribeThingGroupRequest describeThingGroupRequest = (DescribeThingGroupRequest) obj;
        if ((describeThingGroupRequest.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        return describeThingGroupRequest.getThingGroupName() == null || describeThingGroupRequest.getThingGroupName().equals(getThingGroupName());
    }

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public int hashCode() {
        return 31 + (getThingGroupName() == null ? 0 : getThingGroupName().hashCode());
    }

    public void setThingGroupName(String str) {
        this.thingGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupName() != null) {
            sb.append("thingGroupName: " + getThingGroupName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeThingGroupRequest withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }
}
