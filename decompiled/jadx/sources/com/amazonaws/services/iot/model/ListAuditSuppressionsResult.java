package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuditSuppressionsResult implements Serializable {
    private String nextToken;
    private List<AuditSuppression> suppressions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuditSuppressionsResult)) {
            return false;
        }
        ListAuditSuppressionsResult listAuditSuppressionsResult = (ListAuditSuppressionsResult) obj;
        if ((listAuditSuppressionsResult.getSuppressions() == null) ^ (getSuppressions() == null)) {
            return false;
        }
        if (listAuditSuppressionsResult.getSuppressions() != null && !listAuditSuppressionsResult.getSuppressions().equals(getSuppressions())) {
            return false;
        }
        if ((listAuditSuppressionsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listAuditSuppressionsResult.getNextToken() == null || listAuditSuppressionsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<AuditSuppression> getSuppressions() {
        return this.suppressions;
    }

    public int hashCode() {
        return (((getSuppressions() == null ? 0 : getSuppressions().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSuppressions(Collection<AuditSuppression> collection) {
        if (collection == null) {
            this.suppressions = null;
        } else {
            this.suppressions = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSuppressions() != null) {
            sb.append("suppressions: " + getSuppressions() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAuditSuppressionsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListAuditSuppressionsResult withSuppressions(AuditSuppression... auditSuppressionArr) {
        if (getSuppressions() == null) {
            this.suppressions = new ArrayList(auditSuppressionArr.length);
        }
        for (AuditSuppression auditSuppression : auditSuppressionArr) {
            this.suppressions.add(auditSuppression);
        }
        return this;
    }

    public ListAuditSuppressionsResult withSuppressions(Collection<AuditSuppression> collection) {
        setSuppressions(collection);
        return this;
    }
}
