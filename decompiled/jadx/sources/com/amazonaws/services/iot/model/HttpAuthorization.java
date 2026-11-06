package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HttpAuthorization implements Serializable {
    private SigV4Authorization sigv4;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HttpAuthorization)) {
            return false;
        }
        HttpAuthorization httpAuthorization = (HttpAuthorization) obj;
        if ((httpAuthorization.getSigv4() == null) ^ (getSigv4() == null)) {
            return false;
        }
        return httpAuthorization.getSigv4() == null || httpAuthorization.getSigv4().equals(getSigv4());
    }

    public SigV4Authorization getSigv4() {
        return this.sigv4;
    }

    public int hashCode() {
        return 31 + (getSigv4() == null ? 0 : getSigv4().hashCode());
    }

    public void setSigv4(SigV4Authorization sigV4Authorization) {
        this.sigv4 = sigV4Authorization;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSigv4() != null) {
            sb.append("sigv4: " + getSigv4());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public HttpAuthorization withSigv4(SigV4Authorization sigV4Authorization) {
        this.sigv4 = sigV4Authorization;
        return this;
    }
}
