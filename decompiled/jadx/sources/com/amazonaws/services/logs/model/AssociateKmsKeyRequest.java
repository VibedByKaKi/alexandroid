package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AssociateKmsKeyRequest extends AmazonWebServiceRequest implements Serializable {
    private String kmsKeyId;
    private String logGroupName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssociateKmsKeyRequest)) {
            return false;
        }
        AssociateKmsKeyRequest associateKmsKeyRequest = (AssociateKmsKeyRequest) obj;
        if ((associateKmsKeyRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (associateKmsKeyRequest.getLogGroupName() != null && !associateKmsKeyRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((associateKmsKeyRequest.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        return associateKmsKeyRequest.getKmsKeyId() == null || associateKmsKeyRequest.getKmsKeyId().equals(getKmsKeyId());
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public int hashCode() {
        return (((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getKmsKeyId() != null ? getKmsKeyId().hashCode() : 0);
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getKmsKeyId() != null) {
            sb.append("kmsKeyId: " + getKmsKeyId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AssociateKmsKeyRequest withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public AssociateKmsKeyRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }
}
