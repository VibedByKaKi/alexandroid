package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuthInfo implements Serializable {
    private String actionType;
    private List<String> resources;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthInfo)) {
            return false;
        }
        AuthInfo authInfo = (AuthInfo) obj;
        if ((authInfo.getActionType() == null) ^ (getActionType() == null)) {
            return false;
        }
        if (authInfo.getActionType() != null && !authInfo.getActionType().equals(getActionType())) {
            return false;
        }
        if ((authInfo.getResources() == null) ^ (getResources() == null)) {
            return false;
        }
        return authInfo.getResources() == null || authInfo.getResources().equals(getResources());
    }

    public String getActionType() {
        return this.actionType;
    }

    public List<String> getResources() {
        return this.resources;
    }

    public int hashCode() {
        return (((getActionType() == null ? 0 : getActionType().hashCode()) + 31) * 31) + (getResources() != null ? getResources().hashCode() : 0);
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    public void setResources(Collection<String> collection) {
        if (collection == null) {
            this.resources = null;
        } else {
            this.resources = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getActionType() != null) {
            sb.append("actionType: " + getActionType() + ",");
        }
        if (getResources() != null) {
            sb.append("resources: " + getResources());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AuthInfo withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    public AuthInfo withResources(String... strArr) {
        if (getResources() == null) {
            this.resources = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.resources.add(str);
        }
        return this;
    }

    public void setActionType(String str) {
        this.actionType = str;
    }

    public AuthInfo withActionType(String str) {
        this.actionType = str;
        return this;
    }

    public AuthInfo withResources(Collection<String> collection) {
        setResources(collection);
        return this;
    }
}
