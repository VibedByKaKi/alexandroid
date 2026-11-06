package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    private String endpointType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeEndpointRequest)) {
            return false;
        }
        DescribeEndpointRequest describeEndpointRequest = (DescribeEndpointRequest) obj;
        if ((describeEndpointRequest.getEndpointType() == null) ^ (getEndpointType() == null)) {
            return false;
        }
        return describeEndpointRequest.getEndpointType() == null || describeEndpointRequest.getEndpointType().equals(getEndpointType());
    }

    public String getEndpointType() {
        return this.endpointType;
    }

    public int hashCode() {
        return 31 + (getEndpointType() == null ? 0 : getEndpointType().hashCode());
    }

    public void setEndpointType(String str) {
        this.endpointType = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEndpointType() != null) {
            sb.append("endpointType: " + getEndpointType());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeEndpointRequest withEndpointType(String str) {
        this.endpointType = str;
        return this;
    }
}
