package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteRetentionPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private String logGroupName;

    public DeleteRetentionPolicyRequest(String str) {
        setLogGroupName(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteRetentionPolicyRequest)) {
            return false;
        }
        DeleteRetentionPolicyRequest deleteRetentionPolicyRequest = (DeleteRetentionPolicyRequest) obj;
        if ((deleteRetentionPolicyRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        return deleteRetentionPolicyRequest.getLogGroupName() == null || deleteRetentionPolicyRequest.getLogGroupName().equals(getLogGroupName());
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public int hashCode() {
        return 31 + (getLogGroupName() == null ? 0 : getLogGroupName().hashCode());
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteRetentionPolicyRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public DeleteRetentionPolicyRequest() {
    }
}
