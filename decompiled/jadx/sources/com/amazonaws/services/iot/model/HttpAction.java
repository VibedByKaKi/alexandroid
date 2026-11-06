package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HttpAction implements Serializable {
    private HttpAuthorization auth;
    private String confirmationUrl;
    private List<HttpActionHeader> headers;
    private String url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HttpAction)) {
            return false;
        }
        HttpAction httpAction = (HttpAction) obj;
        if ((httpAction.getUrl() == null) ^ (getUrl() == null)) {
            return false;
        }
        if (httpAction.getUrl() != null && !httpAction.getUrl().equals(getUrl())) {
            return false;
        }
        if ((httpAction.getConfirmationUrl() == null) ^ (getConfirmationUrl() == null)) {
            return false;
        }
        if (httpAction.getConfirmationUrl() != null && !httpAction.getConfirmationUrl().equals(getConfirmationUrl())) {
            return false;
        }
        if ((httpAction.getHeaders() == null) ^ (getHeaders() == null)) {
            return false;
        }
        if (httpAction.getHeaders() != null && !httpAction.getHeaders().equals(getHeaders())) {
            return false;
        }
        if ((httpAction.getAuth() == null) ^ (getAuth() == null)) {
            return false;
        }
        return httpAction.getAuth() == null || httpAction.getAuth().equals(getAuth());
    }

    public HttpAuthorization getAuth() {
        return this.auth;
    }

    public String getConfirmationUrl() {
        return this.confirmationUrl;
    }

    public List<HttpActionHeader> getHeaders() {
        return this.headers;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((getUrl() == null ? 0 : getUrl().hashCode()) + 31) * 31) + (getConfirmationUrl() == null ? 0 : getConfirmationUrl().hashCode())) * 31) + (getHeaders() == null ? 0 : getHeaders().hashCode())) * 31) + (getAuth() != null ? getAuth().hashCode() : 0);
    }

    public void setAuth(HttpAuthorization httpAuthorization) {
        this.auth = httpAuthorization;
    }

    public void setConfirmationUrl(String str) {
        this.confirmationUrl = str;
    }

    public void setHeaders(Collection<HttpActionHeader> collection) {
        if (collection == null) {
            this.headers = null;
        } else {
            this.headers = new ArrayList(collection);
        }
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getUrl() != null) {
            sb.append("url: " + getUrl() + ",");
        }
        if (getConfirmationUrl() != null) {
            sb.append("confirmationUrl: " + getConfirmationUrl() + ",");
        }
        if (getHeaders() != null) {
            sb.append("headers: " + getHeaders() + ",");
        }
        if (getAuth() != null) {
            sb.append("auth: " + getAuth());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public HttpAction withAuth(HttpAuthorization httpAuthorization) {
        this.auth = httpAuthorization;
        return this;
    }

    public HttpAction withConfirmationUrl(String str) {
        this.confirmationUrl = str;
        return this;
    }

    public HttpAction withHeaders(HttpActionHeader... httpActionHeaderArr) {
        if (getHeaders() == null) {
            this.headers = new ArrayList(httpActionHeaderArr.length);
        }
        for (HttpActionHeader httpActionHeader : httpActionHeaderArr) {
            this.headers.add(httpActionHeader);
        }
        return this;
    }

    public HttpAction withUrl(String str) {
        this.url = str;
        return this;
    }

    public HttpAction withHeaders(Collection<HttpActionHeader> collection) {
        setHeaders(collection);
        return this;
    }
}
