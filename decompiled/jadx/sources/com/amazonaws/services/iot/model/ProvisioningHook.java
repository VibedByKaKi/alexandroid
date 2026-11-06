package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ProvisioningHook implements Serializable {
    private String payloadVersion;
    private String targetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProvisioningHook)) {
            return false;
        }
        ProvisioningHook provisioningHook = (ProvisioningHook) obj;
        if ((provisioningHook.getPayloadVersion() == null) ^ (getPayloadVersion() == null)) {
            return false;
        }
        if (provisioningHook.getPayloadVersion() != null && !provisioningHook.getPayloadVersion().equals(getPayloadVersion())) {
            return false;
        }
        if ((provisioningHook.getTargetArn() == null) ^ (getTargetArn() == null)) {
            return false;
        }
        return provisioningHook.getTargetArn() == null || provisioningHook.getTargetArn().equals(getTargetArn());
    }

    public String getPayloadVersion() {
        return this.payloadVersion;
    }

    public String getTargetArn() {
        return this.targetArn;
    }

    public int hashCode() {
        return (((getPayloadVersion() == null ? 0 : getPayloadVersion().hashCode()) + 31) * 31) + (getTargetArn() != null ? getTargetArn().hashCode() : 0);
    }

    public void setPayloadVersion(String str) {
        this.payloadVersion = str;
    }

    public void setTargetArn(String str) {
        this.targetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getPayloadVersion() != null) {
            sb.append("payloadVersion: " + getPayloadVersion() + ",");
        }
        if (getTargetArn() != null) {
            sb.append("targetArn: " + getTargetArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ProvisioningHook withPayloadVersion(String str) {
        this.payloadVersion = str;
        return this;
    }

    public ProvisioningHook withTargetArn(String str) {
        this.targetArn = str;
        return this;
    }
}
