package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeEndpointResult implements Serializable {
    private String endpointAddress;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeEndpointResult)) {
            return false;
        }
        DescribeEndpointResult describeEndpointResult = (DescribeEndpointResult) obj;
        if ((describeEndpointResult.getEndpointAddress() == null) ^ (getEndpointAddress() == null)) {
            return false;
        }
        return describeEndpointResult.getEndpointAddress() == null || describeEndpointResult.getEndpointAddress().equals(getEndpointAddress());
    }

    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public int hashCode() {
        return 31 + (getEndpointAddress() == null ? 0 : getEndpointAddress().hashCode());
    }

    public void setEndpointAddress(String str) {
        this.endpointAddress = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEndpointAddress() != null) {
            sb.append("endpointAddress: " + getEndpointAddress());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeEndpointResult withEndpointAddress(String str) {
        this.endpointAddress = str;
        return this;
    }
}
