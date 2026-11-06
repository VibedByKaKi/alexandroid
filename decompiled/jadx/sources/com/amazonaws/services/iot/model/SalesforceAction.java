package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SalesforceAction implements Serializable {
    private String token;
    private String url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SalesforceAction)) {
            return false;
        }
        SalesforceAction salesforceAction = (SalesforceAction) obj;
        if ((salesforceAction.getToken() == null) ^ (getToken() == null)) {
            return false;
        }
        if (salesforceAction.getToken() != null && !salesforceAction.getToken().equals(getToken())) {
            return false;
        }
        if ((salesforceAction.getUrl() == null) ^ (getUrl() == null)) {
            return false;
        }
        return salesforceAction.getUrl() == null || salesforceAction.getUrl().equals(getUrl());
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((getToken() == null ? 0 : getToken().hashCode()) + 31) * 31) + (getUrl() != null ? getUrl().hashCode() : 0);
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getToken() != null) {
            sb.append("token: " + getToken() + ",");
        }
        if (getUrl() != null) {
            sb.append("url: " + getUrl());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SalesforceAction withToken(String str) {
        this.token = str;
        return this;
    }

    public SalesforceAction withUrl(String str) {
        this.url = str;
        return this;
    }
}
