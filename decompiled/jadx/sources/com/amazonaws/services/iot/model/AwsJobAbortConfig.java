package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AwsJobAbortConfig implements Serializable {
    private List<AwsJobAbortCriteria> abortCriteriaList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AwsJobAbortConfig)) {
            return false;
        }
        AwsJobAbortConfig awsJobAbortConfig = (AwsJobAbortConfig) obj;
        if ((awsJobAbortConfig.getAbortCriteriaList() == null) ^ (getAbortCriteriaList() == null)) {
            return false;
        }
        return awsJobAbortConfig.getAbortCriteriaList() == null || awsJobAbortConfig.getAbortCriteriaList().equals(getAbortCriteriaList());
    }

    public List<AwsJobAbortCriteria> getAbortCriteriaList() {
        return this.abortCriteriaList;
    }

    public int hashCode() {
        return 31 + (getAbortCriteriaList() == null ? 0 : getAbortCriteriaList().hashCode());
    }

    public void setAbortCriteriaList(Collection<AwsJobAbortCriteria> collection) {
        if (collection == null) {
            this.abortCriteriaList = null;
        } else {
            this.abortCriteriaList = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAbortCriteriaList() != null) {
            sb.append("abortCriteriaList: " + getAbortCriteriaList());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AwsJobAbortConfig withAbortCriteriaList(AwsJobAbortCriteria... awsJobAbortCriteriaArr) {
        if (getAbortCriteriaList() == null) {
            this.abortCriteriaList = new ArrayList(awsJobAbortCriteriaArr.length);
        }
        for (AwsJobAbortCriteria awsJobAbortCriteria : awsJobAbortCriteriaArr) {
            this.abortCriteriaList.add(awsJobAbortCriteria);
        }
        return this;
    }

    public AwsJobAbortConfig withAbortCriteriaList(Collection<AwsJobAbortCriteria> collection) {
        setAbortCriteriaList(collection);
        return this;
    }
}
