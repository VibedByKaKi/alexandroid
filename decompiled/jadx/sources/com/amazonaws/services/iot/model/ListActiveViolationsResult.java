package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListActiveViolationsResult implements Serializable {
    private List<ActiveViolation> activeViolations;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListActiveViolationsResult)) {
            return false;
        }
        ListActiveViolationsResult listActiveViolationsResult = (ListActiveViolationsResult) obj;
        if ((listActiveViolationsResult.getActiveViolations() == null) ^ (getActiveViolations() == null)) {
            return false;
        }
        if (listActiveViolationsResult.getActiveViolations() != null && !listActiveViolationsResult.getActiveViolations().equals(getActiveViolations())) {
            return false;
        }
        if ((listActiveViolationsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listActiveViolationsResult.getNextToken() == null || listActiveViolationsResult.getNextToken().equals(getNextToken());
    }

    public List<ActiveViolation> getActiveViolations() {
        return this.activeViolations;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getActiveViolations() == null ? 0 : getActiveViolations().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setActiveViolations(Collection<ActiveViolation> collection) {
        if (collection == null) {
            this.activeViolations = null;
        } else {
            this.activeViolations = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActiveViolations() != null) {
            sb.append("activeViolations: " + getActiveViolations() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListActiveViolationsResult withActiveViolations(ActiveViolation... activeViolationArr) {
        if (getActiveViolations() == null) {
            this.activeViolations = new ArrayList(activeViolationArr.length);
        }
        for (ActiveViolation activeViolation : activeViolationArr) {
            this.activeViolations.add(activeViolation);
        }
        return this;
    }

    public ListActiveViolationsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListActiveViolationsResult withActiveViolations(Collection<ActiveViolation> collection) {
        setActiveViolations(collection);
        return this;
    }
}
