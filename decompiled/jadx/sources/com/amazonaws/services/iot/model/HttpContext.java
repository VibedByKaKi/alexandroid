package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HttpContext implements Serializable {
    private Map<String, String> headers;
    private String queryString;

    public HttpContext addheadersEntry(String str, String str2) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        if (this.headers.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.headers.put(str, str2);
        return this;
    }

    public HttpContext clearheadersEntries() {
        this.headers = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HttpContext)) {
            return false;
        }
        HttpContext httpContext = (HttpContext) obj;
        if ((httpContext.getHeaders() == null) ^ (getHeaders() == null)) {
            return false;
        }
        if (httpContext.getHeaders() != null && !httpContext.getHeaders().equals(getHeaders())) {
            return false;
        }
        if ((httpContext.getQueryString() == null) ^ (getQueryString() == null)) {
            return false;
        }
        return httpContext.getQueryString() == null || httpContext.getQueryString().equals(getQueryString());
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public int hashCode() {
        return (((getHeaders() == null ? 0 : getHeaders().hashCode()) + 31) * 31) + (getQueryString() != null ? getQueryString().hashCode() : 0);
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getHeaders() != null) {
            sb.append("headers: " + getHeaders() + ",");
        }
        if (getQueryString() != null) {
            sb.append("queryString: " + getQueryString());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public HttpContext withHeaders(Map<String, String> map) {
        this.headers = map;
        return this;
    }

    public HttpContext withQueryString(String str) {
        this.queryString = str;
        return this;
    }
}
