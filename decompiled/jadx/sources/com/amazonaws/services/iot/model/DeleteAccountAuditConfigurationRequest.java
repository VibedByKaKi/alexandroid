package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteAccountAuditConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean deleteScheduledAudits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteAccountAuditConfigurationRequest)) {
            return false;
        }
        DeleteAccountAuditConfigurationRequest deleteAccountAuditConfigurationRequest = (DeleteAccountAuditConfigurationRequest) obj;
        if ((deleteAccountAuditConfigurationRequest.getDeleteScheduledAudits() == null) ^ (getDeleteScheduledAudits() == null)) {
            return false;
        }
        return deleteAccountAuditConfigurationRequest.getDeleteScheduledAudits() == null || deleteAccountAuditConfigurationRequest.getDeleteScheduledAudits().equals(getDeleteScheduledAudits());
    }

    public Boolean getDeleteScheduledAudits() {
        return this.deleteScheduledAudits;
    }

    public int hashCode() {
        return 31 + (getDeleteScheduledAudits() == null ? 0 : getDeleteScheduledAudits().hashCode());
    }

    public Boolean isDeleteScheduledAudits() {
        return this.deleteScheduledAudits;
    }

    public void setDeleteScheduledAudits(Boolean bool) {
        this.deleteScheduledAudits = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDeleteScheduledAudits() != null) {
            sb.append("deleteScheduledAudits: " + getDeleteScheduledAudits());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DeleteAccountAuditConfigurationRequest withDeleteScheduledAudits(Boolean bool) {
        this.deleteScheduledAudits = bool;
        return this;
    }
}
