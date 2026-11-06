package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeScheduledAuditRequest extends AmazonWebServiceRequest implements Serializable {
    private String scheduledAuditName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeScheduledAuditRequest)) {
            return false;
        }
        DescribeScheduledAuditRequest describeScheduledAuditRequest = (DescribeScheduledAuditRequest) obj;
        if ((describeScheduledAuditRequest.getScheduledAuditName() == null) ^ (getScheduledAuditName() == null)) {
            return false;
        }
        return describeScheduledAuditRequest.getScheduledAuditName() == null || describeScheduledAuditRequest.getScheduledAuditName().equals(getScheduledAuditName());
    }

    public String getScheduledAuditName() {
        return this.scheduledAuditName;
    }

    public int hashCode() {
        return 31 + (getScheduledAuditName() == null ? 0 : getScheduledAuditName().hashCode());
    }

    public void setScheduledAuditName(String str) {
        this.scheduledAuditName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getScheduledAuditName() != null) {
            sb.append("scheduledAuditName: " + getScheduledAuditName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeScheduledAuditRequest withScheduledAuditName(String str) {
        this.scheduledAuditName = str;
        return this;
    }
}
