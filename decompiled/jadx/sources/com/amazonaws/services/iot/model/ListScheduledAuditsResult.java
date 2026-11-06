package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListScheduledAuditsResult implements Serializable {
    private String nextToken;
    private List<ScheduledAuditMetadata> scheduledAudits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListScheduledAuditsResult)) {
            return false;
        }
        ListScheduledAuditsResult listScheduledAuditsResult = (ListScheduledAuditsResult) obj;
        if ((listScheduledAuditsResult.getScheduledAudits() == null) ^ (getScheduledAudits() == null)) {
            return false;
        }
        if (listScheduledAuditsResult.getScheduledAudits() != null && !listScheduledAuditsResult.getScheduledAudits().equals(getScheduledAudits())) {
            return false;
        }
        if ((listScheduledAuditsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listScheduledAuditsResult.getNextToken() == null || listScheduledAuditsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ScheduledAuditMetadata> getScheduledAudits() {
        return this.scheduledAudits;
    }

    public int hashCode() {
        return (((getScheduledAudits() == null ? 0 : getScheduledAudits().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setScheduledAudits(Collection<ScheduledAuditMetadata> collection) {
        if (collection == null) {
            this.scheduledAudits = null;
        } else {
            this.scheduledAudits = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getScheduledAudits() != null) {
            sb.append("scheduledAudits: " + getScheduledAudits() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListScheduledAuditsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListScheduledAuditsResult withScheduledAudits(ScheduledAuditMetadata... scheduledAuditMetadataArr) {
        if (getScheduledAudits() == null) {
            this.scheduledAudits = new ArrayList(scheduledAuditMetadataArr.length);
        }
        for (ScheduledAuditMetadata scheduledAuditMetadata : scheduledAuditMetadataArr) {
            this.scheduledAudits.add(scheduledAuditMetadata);
        }
        return this;
    }

    public ListScheduledAuditsResult withScheduledAudits(Collection<ScheduledAuditMetadata> collection) {
        setScheduledAudits(collection);
        return this;
    }
}
