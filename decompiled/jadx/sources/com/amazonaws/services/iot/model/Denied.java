package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Denied implements Serializable {
    private ExplicitDeny explicitDeny;
    private ImplicitDeny implicitDeny;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Denied)) {
            return false;
        }
        Denied denied = (Denied) obj;
        if ((denied.getImplicitDeny() == null) ^ (getImplicitDeny() == null)) {
            return false;
        }
        if (denied.getImplicitDeny() != null && !denied.getImplicitDeny().equals(getImplicitDeny())) {
            return false;
        }
        if ((denied.getExplicitDeny() == null) ^ (getExplicitDeny() == null)) {
            return false;
        }
        return denied.getExplicitDeny() == null || denied.getExplicitDeny().equals(getExplicitDeny());
    }

    public ExplicitDeny getExplicitDeny() {
        return this.explicitDeny;
    }

    public ImplicitDeny getImplicitDeny() {
        return this.implicitDeny;
    }

    public int hashCode() {
        return (((getImplicitDeny() == null ? 0 : getImplicitDeny().hashCode()) + 31) * 31) + (getExplicitDeny() != null ? getExplicitDeny().hashCode() : 0);
    }

    public void setExplicitDeny(ExplicitDeny explicitDeny) {
        this.explicitDeny = explicitDeny;
    }

    public void setImplicitDeny(ImplicitDeny implicitDeny) {
        this.implicitDeny = implicitDeny;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getImplicitDeny() != null) {
            sb.append("implicitDeny: " + getImplicitDeny() + ",");
        }
        if (getExplicitDeny() != null) {
            sb.append("explicitDeny: " + getExplicitDeny());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Denied withExplicitDeny(ExplicitDeny explicitDeny) {
        this.explicitDeny = explicitDeny;
        return this;
    }

    public Denied withImplicitDeny(ImplicitDeny implicitDeny) {
        this.implicitDeny = implicitDeny;
        return this;
    }
}
