package com.amazonaws.services.logs.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateLogGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String kmsKeyId;
    private String logGroupName;
    private Map<String, String> tags;

    public CreateLogGroupRequest(String str) {
        setLogGroupName(str);
    }

    public CreateLogGroupRequest addtagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (this.tags.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.tags.put(str, str2);
        return this;
    }

    public CreateLogGroupRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateLogGroupRequest)) {
            return false;
        }
        CreateLogGroupRequest createLogGroupRequest = (CreateLogGroupRequest) obj;
        if ((createLogGroupRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (createLogGroupRequest.getLogGroupName() != null && !createLogGroupRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((createLogGroupRequest.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        if (createLogGroupRequest.getKmsKeyId() != null && !createLogGroupRequest.getKmsKeyId().equals(getKmsKeyId())) {
            return false;
        }
        if ((createLogGroupRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createLogGroupRequest.getTags() == null || createLogGroupRequest.getTags().equals(getTags());
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getKmsKeyId() == null ? 0 : getKmsKeyId().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getKmsKeyId() != null) {
            sb.append("kmsKeyId: " + getKmsKeyId() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateLogGroupRequest withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public CreateLogGroupRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public CreateLogGroupRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }

    public CreateLogGroupRequest() {
    }
}
