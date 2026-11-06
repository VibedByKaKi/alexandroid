package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuditMitigationActionsTaskTarget implements Serializable {
    private Map<String, List<String>> auditCheckToReasonCodeFilter;
    private String auditTaskId;
    private List<String> findingIds;

    public AuditMitigationActionsTaskTarget addauditCheckToReasonCodeFilterEntry(String str, List<String> list) {
        if (this.auditCheckToReasonCodeFilter == null) {
            this.auditCheckToReasonCodeFilter = new HashMap();
        }
        if (this.auditCheckToReasonCodeFilter.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.auditCheckToReasonCodeFilter.put(str, list);
        return this;
    }

    public AuditMitigationActionsTaskTarget clearauditCheckToReasonCodeFilterEntries() {
        this.auditCheckToReasonCodeFilter = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuditMitigationActionsTaskTarget)) {
            return false;
        }
        AuditMitigationActionsTaskTarget auditMitigationActionsTaskTarget = (AuditMitigationActionsTaskTarget) obj;
        if ((auditMitigationActionsTaskTarget.getAuditTaskId() == null) ^ (getAuditTaskId() == null)) {
            return false;
        }
        if (auditMitigationActionsTaskTarget.getAuditTaskId() != null && !auditMitigationActionsTaskTarget.getAuditTaskId().equals(getAuditTaskId())) {
            return false;
        }
        if ((auditMitigationActionsTaskTarget.getFindingIds() == null) ^ (getFindingIds() == null)) {
            return false;
        }
        if (auditMitigationActionsTaskTarget.getFindingIds() != null && !auditMitigationActionsTaskTarget.getFindingIds().equals(getFindingIds())) {
            return false;
        }
        if ((auditMitigationActionsTaskTarget.getAuditCheckToReasonCodeFilter() == null) ^ (getAuditCheckToReasonCodeFilter() == null)) {
            return false;
        }
        return auditMitigationActionsTaskTarget.getAuditCheckToReasonCodeFilter() == null || auditMitigationActionsTaskTarget.getAuditCheckToReasonCodeFilter().equals(getAuditCheckToReasonCodeFilter());
    }

    public Map<String, List<String>> getAuditCheckToReasonCodeFilter() {
        return this.auditCheckToReasonCodeFilter;
    }

    public String getAuditTaskId() {
        return this.auditTaskId;
    }

    public List<String> getFindingIds() {
        return this.findingIds;
    }

    public int hashCode() {
        return (((((getAuditTaskId() == null ? 0 : getAuditTaskId().hashCode()) + 31) * 31) + (getFindingIds() == null ? 0 : getFindingIds().hashCode())) * 31) + (getAuditCheckToReasonCodeFilter() != null ? getAuditCheckToReasonCodeFilter().hashCode() : 0);
    }

    public void setAuditCheckToReasonCodeFilter(Map<String, List<String>> map) {
        this.auditCheckToReasonCodeFilter = map;
    }

    public void setAuditTaskId(String str) {
        this.auditTaskId = str;
    }

    public void setFindingIds(Collection<String> collection) {
        if (collection == null) {
            this.findingIds = null;
        } else {
            this.findingIds = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuditTaskId() != null) {
            sb.append("auditTaskId: " + getAuditTaskId() + ",");
        }
        if (getFindingIds() != null) {
            sb.append("findingIds: " + getFindingIds() + ",");
        }
        if (getAuditCheckToReasonCodeFilter() != null) {
            sb.append("auditCheckToReasonCodeFilter: " + getAuditCheckToReasonCodeFilter());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AuditMitigationActionsTaskTarget withAuditCheckToReasonCodeFilter(Map<String, List<String>> map) {
        this.auditCheckToReasonCodeFilter = map;
        return this;
    }

    public AuditMitigationActionsTaskTarget withAuditTaskId(String str) {
        this.auditTaskId = str;
        return this;
    }

    public AuditMitigationActionsTaskTarget withFindingIds(String... strArr) {
        if (getFindingIds() == null) {
            this.findingIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.findingIds.add(str);
        }
        return this;
    }

    public AuditMitigationActionsTaskTarget withFindingIds(Collection<String> collection) {
        setFindingIds(collection);
        return this;
    }
}
