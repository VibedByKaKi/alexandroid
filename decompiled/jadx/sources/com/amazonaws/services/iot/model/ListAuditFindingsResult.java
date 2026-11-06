package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAuditFindingsResult implements Serializable {
    private List<AuditFinding> findings;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListAuditFindingsResult)) {
            return false;
        }
        ListAuditFindingsResult listAuditFindingsResult = (ListAuditFindingsResult) obj;
        if ((listAuditFindingsResult.getFindings() == null) ^ (getFindings() == null)) {
            return false;
        }
        if (listAuditFindingsResult.getFindings() != null && !listAuditFindingsResult.getFindings().equals(getFindings())) {
            return false;
        }
        if ((listAuditFindingsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listAuditFindingsResult.getNextToken() == null || listAuditFindingsResult.getNextToken().equals(getNextToken());
    }

    public List<AuditFinding> getFindings() {
        return this.findings;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getFindings() == null ? 0 : getFindings().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setFindings(Collection<AuditFinding> collection) {
        if (collection == null) {
            this.findings = null;
        } else {
            this.findings = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFindings() != null) {
            sb.append("findings: " + getFindings() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListAuditFindingsResult withFindings(AuditFinding... auditFindingArr) {
        if (getFindings() == null) {
            this.findings = new ArrayList(auditFindingArr.length);
        }
        for (AuditFinding auditFinding : auditFindingArr) {
            this.findings.add(auditFinding);
        }
        return this;
    }

    public ListAuditFindingsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListAuditFindingsResult withFindings(Collection<AuditFinding> collection) {
        setFindings(collection);
        return this;
    }
}
