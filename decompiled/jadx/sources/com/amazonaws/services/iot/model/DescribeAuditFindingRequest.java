package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeAuditFindingRequest extends AmazonWebServiceRequest implements Serializable {
    private String findingId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeAuditFindingRequest)) {
            return false;
        }
        DescribeAuditFindingRequest describeAuditFindingRequest = (DescribeAuditFindingRequest) obj;
        if ((describeAuditFindingRequest.getFindingId() == null) ^ (getFindingId() == null)) {
            return false;
        }
        return describeAuditFindingRequest.getFindingId() == null || describeAuditFindingRequest.getFindingId().equals(getFindingId());
    }

    public String getFindingId() {
        return this.findingId;
    }

    public int hashCode() {
        return 31 + (getFindingId() == null ? 0 : getFindingId().hashCode());
    }

    public void setFindingId(String str) {
        this.findingId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFindingId() != null) {
            sb.append("findingId: " + getFindingId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeAuditFindingRequest withFindingId(String str) {
        this.findingId = str;
        return this;
    }
}
