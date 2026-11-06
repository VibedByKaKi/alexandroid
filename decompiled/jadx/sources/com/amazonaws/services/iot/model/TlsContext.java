package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TlsContext implements Serializable {
    private String serverName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TlsContext)) {
            return false;
        }
        TlsContext tlsContext = (TlsContext) obj;
        if ((tlsContext.getServerName() == null) ^ (getServerName() == null)) {
            return false;
        }
        return tlsContext.getServerName() == null || tlsContext.getServerName().equals(getServerName());
    }

    public String getServerName() {
        return this.serverName;
    }

    public int hashCode() {
        return 31 + (getServerName() == null ? 0 : getServerName().hashCode());
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getServerName() != null) {
            sb.append("serverName: " + getServerName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TlsContext withServerName(String str) {
        this.serverName = str;
        return this;
    }
}
