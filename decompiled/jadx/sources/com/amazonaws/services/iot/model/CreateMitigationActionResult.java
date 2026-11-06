package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateMitigationActionResult implements Serializable {
    private String actionArn;
    private String actionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateMitigationActionResult)) {
            return false;
        }
        CreateMitigationActionResult createMitigationActionResult = (CreateMitigationActionResult) obj;
        if ((createMitigationActionResult.getActionArn() == null) ^ (getActionArn() == null)) {
            return false;
        }
        if (createMitigationActionResult.getActionArn() != null && !createMitigationActionResult.getActionArn().equals(getActionArn())) {
            return false;
        }
        if ((createMitigationActionResult.getActionId() == null) ^ (getActionId() == null)) {
            return false;
        }
        return createMitigationActionResult.getActionId() == null || createMitigationActionResult.getActionId().equals(getActionId());
    }

    public String getActionArn() {
        return this.actionArn;
    }

    public String getActionId() {
        return this.actionId;
    }

    public int hashCode() {
        return (((getActionArn() == null ? 0 : getActionArn().hashCode()) + 31) * 31) + (getActionId() != null ? getActionId().hashCode() : 0);
    }

    public void setActionArn(String str) {
        this.actionArn = str;
    }

    public void setActionId(String str) {
        this.actionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionArn() != null) {
            sb.append("actionArn: " + getActionArn() + ",");
        }
        if (getActionId() != null) {
            sb.append("actionId: " + getActionId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateMitigationActionResult withActionArn(String str) {
        this.actionArn = str;
        return this;
    }

    public CreateMitigationActionResult withActionId(String str) {
        this.actionId = str;
        return this;
    }
}
