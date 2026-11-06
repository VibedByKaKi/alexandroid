package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MitigationActionIdentifier implements Serializable {
    private String actionArn;
    private String actionName;
    private Date creationDate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MitigationActionIdentifier)) {
            return false;
        }
        MitigationActionIdentifier mitigationActionIdentifier = (MitigationActionIdentifier) obj;
        if ((mitigationActionIdentifier.getActionName() == null) ^ (getActionName() == null)) {
            return false;
        }
        if (mitigationActionIdentifier.getActionName() != null && !mitigationActionIdentifier.getActionName().equals(getActionName())) {
            return false;
        }
        if ((mitigationActionIdentifier.getActionArn() == null) ^ (getActionArn() == null)) {
            return false;
        }
        if (mitigationActionIdentifier.getActionArn() != null && !mitigationActionIdentifier.getActionArn().equals(getActionArn())) {
            return false;
        }
        if ((mitigationActionIdentifier.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        return mitigationActionIdentifier.getCreationDate() == null || mitigationActionIdentifier.getCreationDate().equals(getCreationDate());
    }

    public String getActionArn() {
        return this.actionArn;
    }

    public String getActionName() {
        return this.actionName;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public int hashCode() {
        return (((((getActionName() == null ? 0 : getActionName().hashCode()) + 31) * 31) + (getActionArn() == null ? 0 : getActionArn().hashCode())) * 31) + (getCreationDate() != null ? getCreationDate().hashCode() : 0);
    }

    public void setActionArn(String str) {
        this.actionArn = str;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionName() != null) {
            sb.append("actionName: " + getActionName() + ",");
        }
        if (getActionArn() != null) {
            sb.append("actionArn: " + getActionArn() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MitigationActionIdentifier withActionArn(String str) {
        this.actionArn = str;
        return this;
    }

    public MitigationActionIdentifier withActionName(String str) {
        this.actionName = str;
        return this;
    }

    public MitigationActionIdentifier withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }
}
