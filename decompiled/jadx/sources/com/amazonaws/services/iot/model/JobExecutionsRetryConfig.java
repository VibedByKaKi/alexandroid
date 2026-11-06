package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobExecutionsRetryConfig implements Serializable {
    private List<RetryCriteria> criteriaList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobExecutionsRetryConfig)) {
            return false;
        }
        JobExecutionsRetryConfig jobExecutionsRetryConfig = (JobExecutionsRetryConfig) obj;
        if ((jobExecutionsRetryConfig.getCriteriaList() == null) ^ (getCriteriaList() == null)) {
            return false;
        }
        return jobExecutionsRetryConfig.getCriteriaList() == null || jobExecutionsRetryConfig.getCriteriaList().equals(getCriteriaList());
    }

    public List<RetryCriteria> getCriteriaList() {
        return this.criteriaList;
    }

    public int hashCode() {
        return 31 + (getCriteriaList() == null ? 0 : getCriteriaList().hashCode());
    }

    public void setCriteriaList(Collection<RetryCriteria> collection) {
        if (collection == null) {
            this.criteriaList = null;
        } else {
            this.criteriaList = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCriteriaList() != null) {
            sb.append("criteriaList: " + getCriteriaList());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobExecutionsRetryConfig withCriteriaList(RetryCriteria... retryCriteriaArr) {
        if (getCriteriaList() == null) {
            this.criteriaList = new ArrayList(retryCriteriaArr.length);
        }
        for (RetryCriteria retryCriteria : retryCriteriaArr) {
            this.criteriaList.add(retryCriteria);
        }
        return this;
    }

    public JobExecutionsRetryConfig withCriteriaList(Collection<RetryCriteria> collection) {
        setCriteriaList(collection);
        return this;
    }
}
