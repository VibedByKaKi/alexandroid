package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AbortConfig implements Serializable {
    private List<AbortCriteria> criteriaList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbortConfig)) {
            return false;
        }
        AbortConfig abortConfig = (AbortConfig) obj;
        if ((abortConfig.getCriteriaList() == null) ^ (getCriteriaList() == null)) {
            return false;
        }
        return abortConfig.getCriteriaList() == null || abortConfig.getCriteriaList().equals(getCriteriaList());
    }

    public List<AbortCriteria> getCriteriaList() {
        return this.criteriaList;
    }

    public int hashCode() {
        return 31 + (getCriteriaList() == null ? 0 : getCriteriaList().hashCode());
    }

    public void setCriteriaList(Collection<AbortCriteria> collection) {
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

    public AbortConfig withCriteriaList(AbortCriteria... abortCriteriaArr) {
        if (getCriteriaList() == null) {
            this.criteriaList = new ArrayList(abortCriteriaArr.length);
        }
        for (AbortCriteria abortCriteria : abortCriteriaArr) {
            this.criteriaList.add(abortCriteria);
        }
        return this;
    }

    public AbortConfig withCriteriaList(Collection<AbortCriteria> collection) {
        setCriteriaList(collection);
        return this;
    }
}
