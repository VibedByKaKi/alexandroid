package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeAuditFindingResult implements Serializable {
    private AuditFinding finding;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeAuditFindingResult)) {
            return false;
        }
        DescribeAuditFindingResult describeAuditFindingResult = (DescribeAuditFindingResult) obj;
        if ((describeAuditFindingResult.getFinding() == null) ^ (getFinding() == null)) {
            return false;
        }
        return describeAuditFindingResult.getFinding() == null || describeAuditFindingResult.getFinding().equals(getFinding());
    }

    public AuditFinding getFinding() {
        return this.finding;
    }

    public int hashCode() {
        return 31 + (getFinding() == null ? 0 : getFinding().hashCode());
    }

    public void setFinding(AuditFinding auditFinding) {
        this.finding = auditFinding;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFinding() != null) {
            sb.append("finding: " + getFinding());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeAuditFindingResult withFinding(AuditFinding auditFinding) {
        this.finding = auditFinding;
        return this;
    }
}
