package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateDeviceCertificateParams implements Serializable {
    private String action;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateDeviceCertificateParams)) {
            return false;
        }
        UpdateDeviceCertificateParams updateDeviceCertificateParams = (UpdateDeviceCertificateParams) obj;
        if ((updateDeviceCertificateParams.getAction() == null) ^ (getAction() == null)) {
            return false;
        }
        return updateDeviceCertificateParams.getAction() == null || updateDeviceCertificateParams.getAction().equals(getAction());
    }

    public String getAction() {
        return this.action;
    }

    public int hashCode() {
        return 31 + (getAction() == null ? 0 : getAction().hashCode());
    }

    public void setAction(DeviceCertificateUpdateAction deviceCertificateUpdateAction) {
        this.action = deviceCertificateUpdateAction.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAction() != null) {
            sb.append("action: " + getAction());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateDeviceCertificateParams withAction(DeviceCertificateUpdateAction deviceCertificateUpdateAction) {
        this.action = deviceCertificateUpdateAction.toString();
        return this;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public UpdateDeviceCertificateParams withAction(String str) {
        this.action = str;
        return this;
    }
}
