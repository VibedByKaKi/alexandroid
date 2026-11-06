package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterThingResult implements Serializable {
    private String certificatePem;
    private Map<String, String> resourceArns;

    public RegisterThingResult addresourceArnsEntry(String str, String str2) {
        if (this.resourceArns == null) {
            this.resourceArns = new HashMap();
        }
        if (this.resourceArns.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.resourceArns.put(str, str2);
        return this;
    }

    public RegisterThingResult clearresourceArnsEntries() {
        this.resourceArns = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterThingResult)) {
            return false;
        }
        RegisterThingResult registerThingResult = (RegisterThingResult) obj;
        if ((registerThingResult.getCertificatePem() == null) ^ (getCertificatePem() == null)) {
            return false;
        }
        if (registerThingResult.getCertificatePem() != null && !registerThingResult.getCertificatePem().equals(getCertificatePem())) {
            return false;
        }
        if ((registerThingResult.getResourceArns() == null) ^ (getResourceArns() == null)) {
            return false;
        }
        return registerThingResult.getResourceArns() == null || registerThingResult.getResourceArns().equals(getResourceArns());
    }

    public String getCertificatePem() {
        return this.certificatePem;
    }

    public Map<String, String> getResourceArns() {
        return this.resourceArns;
    }

    public int hashCode() {
        return (((getCertificatePem() == null ? 0 : getCertificatePem().hashCode()) + 31) * 31) + (getResourceArns() != null ? getResourceArns().hashCode() : 0);
    }

    public void setCertificatePem(String str) {
        this.certificatePem = str;
    }

    public void setResourceArns(Map<String, String> map) {
        this.resourceArns = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCertificatePem() != null) {
            sb.append("certificatePem: " + getCertificatePem() + ",");
        }
        if (getResourceArns() != null) {
            sb.append("resourceArns: " + getResourceArns());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegisterThingResult withCertificatePem(String str) {
        this.certificatePem = str;
        return this;
    }

    public RegisterThingResult withResourceArns(Map<String, String> map) {
        this.resourceArns = map;
        return this;
    }
}
