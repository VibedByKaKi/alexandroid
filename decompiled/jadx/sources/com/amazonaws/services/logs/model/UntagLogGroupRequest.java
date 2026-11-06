package com.amazonaws.services.logs.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UntagLogGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String logGroupName;
    private List<String> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UntagLogGroupRequest)) {
            return false;
        }
        UntagLogGroupRequest untagLogGroupRequest = (UntagLogGroupRequest) obj;
        if ((untagLogGroupRequest.getLogGroupName() == null) ^ (getLogGroupName() == null)) {
            return false;
        }
        if (untagLogGroupRequest.getLogGroupName() != null && !untagLogGroupRequest.getLogGroupName().equals(getLogGroupName())) {
            return false;
        }
        if ((untagLogGroupRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return untagLogGroupRequest.getTags() == null || untagLogGroupRequest.getTags().equals(getTags());
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getLogGroupName() == null ? 0 : getLogGroupName().hashCode()) + 31) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setLogGroupName(String str) {
        this.logGroupName = str;
    }

    public void setTags(Collection<String> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroupName() != null) {
            sb.append("logGroupName: " + getLogGroupName() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UntagLogGroupRequest withLogGroupName(String str) {
        this.logGroupName = str;
        return this;
    }

    public UntagLogGroupRequest withTags(String... strArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.tags.add(str);
        }
        return this;
    }

    public UntagLogGroupRequest withTags(Collection<String> collection) {
        setTags(collection);
        return this;
    }
}
