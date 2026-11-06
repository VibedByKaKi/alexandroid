package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateKeysAndCertificateRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean setAsActive;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateKeysAndCertificateRequest)) {
            return false;
        }
        CreateKeysAndCertificateRequest createKeysAndCertificateRequest = (CreateKeysAndCertificateRequest) obj;
        if ((createKeysAndCertificateRequest.getSetAsActive() == null) ^ (getSetAsActive() == null)) {
            return false;
        }
        return createKeysAndCertificateRequest.getSetAsActive() == null || createKeysAndCertificateRequest.getSetAsActive().equals(getSetAsActive());
    }

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    public int hashCode() {
        return 31 + (getSetAsActive() == null ? 0 : getSetAsActive().hashCode());
    }

    public Boolean isSetAsActive() {
        return this.setAsActive;
    }

    public void setSetAsActive(Boolean bool) {
        this.setAsActive = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSetAsActive() != null) {
            sb.append("setAsActive: " + getSetAsActive());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateKeysAndCertificateRequest withSetAsActive(Boolean bool) {
        this.setAsActive = bool;
        return this;
    }
}
