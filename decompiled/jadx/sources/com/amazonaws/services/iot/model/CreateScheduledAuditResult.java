package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateScheduledAuditResult implements Serializable {
    private String scheduledAuditArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateScheduledAuditResult)) {
            return false;
        }
        CreateScheduledAuditResult createScheduledAuditResult = (CreateScheduledAuditResult) obj;
        if ((createScheduledAuditResult.getScheduledAuditArn() == null) ^ (getScheduledAuditArn() == null)) {
            return false;
        }
        return createScheduledAuditResult.getScheduledAuditArn() == null || createScheduledAuditResult.getScheduledAuditArn().equals(getScheduledAuditArn());
    }

    public String getScheduledAuditArn() {
        return this.scheduledAuditArn;
    }

    public int hashCode() {
        return 31 + (getScheduledAuditArn() == null ? 0 : getScheduledAuditArn().hashCode());
    }

    public void setScheduledAuditArn(String str) {
        this.scheduledAuditArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getScheduledAuditArn() != null) {
            sb.append("scheduledAuditArn: " + getScheduledAuditArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateScheduledAuditResult withScheduledAuditArn(String str) {
        this.scheduledAuditArn = str;
        return this;
    }
}
