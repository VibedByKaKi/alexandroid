package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MitigationAction implements Serializable {
    private MitigationActionParams actionParams;
    private String id;
    private String name;
    private String roleArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MitigationAction)) {
            return false;
        }
        MitigationAction mitigationAction = (MitigationAction) obj;
        if ((mitigationAction.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (mitigationAction.getName() != null && !mitigationAction.getName().equals(getName())) {
            return false;
        }
        if ((mitigationAction.getId() == null) ^ (getId() == null)) {
            return false;
        }
        if (mitigationAction.getId() != null && !mitigationAction.getId().equals(getId())) {
            return false;
        }
        if ((mitigationAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (mitigationAction.getRoleArn() != null && !mitigationAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((mitigationAction.getActionParams() == null) ^ (getActionParams() == null)) {
            return false;
        }
        return mitigationAction.getActionParams() == null || mitigationAction.getActionParams().equals(getActionParams());
    }

    public MitigationActionParams getActionParams() {
        return this.actionParams;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public int hashCode() {
        return (((((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getActionParams() != null ? getActionParams().hashCode() : 0);
    }

    public void setActionParams(MitigationActionParams mitigationActionParams) {
        this.actionParams = mitigationActionParams;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getName() != null) {
            sb.append("name: " + getName() + ",");
        }
        if (getId() != null) {
            sb.append("id: " + getId() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getActionParams() != null) {
            sb.append("actionParams: " + getActionParams());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MitigationAction withActionParams(MitigationActionParams mitigationActionParams) {
        this.actionParams = mitigationActionParams;
        return this;
    }

    public MitigationAction withId(String str) {
        this.id = str;
        return this;
    }

    public MitigationAction withName(String str) {
        this.name = str;
        return this;
    }

    public MitigationAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }
}
