package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateCACertificateParams implements Serializable {
    private String action;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateCACertificateParams)) {
            return false;
        }
        UpdateCACertificateParams updateCACertificateParams = (UpdateCACertificateParams) obj;
        if ((updateCACertificateParams.getAction() == null) ^ (getAction() == null)) {
            return false;
        }
        return updateCACertificateParams.getAction() == null || updateCACertificateParams.getAction().equals(getAction());
    }

    public String getAction() {
        return this.action;
    }

    public int hashCode() {
        return 31 + (getAction() == null ? 0 : getAction().hashCode());
    }

    public void setAction(CACertificateUpdateAction cACertificateUpdateAction) {
        this.action = cACertificateUpdateAction.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAction() != null) {
            sb.append("action: " + getAction());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateCACertificateParams withAction(CACertificateUpdateAction cACertificateUpdateAction) {
        this.action = cACertificateUpdateAction.toString();
        return this;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public UpdateCACertificateParams withAction(String str) {
        this.action = str;
        return this;
    }
}
