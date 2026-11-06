package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HttpHeader implements Serializable {
    private String headerName;
    private String headerValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HttpHeader)) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if ((httpHeader.getHeaderName() == null) ^ (getHeaderName() == null)) {
            return false;
        }
        if (httpHeader.getHeaderName() != null && !httpHeader.getHeaderName().equals(getHeaderName())) {
            return false;
        }
        if ((httpHeader.getHeaderValue() == null) ^ (getHeaderValue() == null)) {
            return false;
        }
        return httpHeader.getHeaderValue() == null || httpHeader.getHeaderValue().equals(getHeaderValue());
    }

    public String getHeaderName() {
        return this.headerName;
    }

    public String getHeaderValue() {
        return this.headerValue;
    }

    public int hashCode() {
        return (((getHeaderName() == null ? 0 : getHeaderName().hashCode()) + 31) * 31) + (getHeaderValue() != null ? getHeaderValue().hashCode() : 0);
    }

    public void setHeaderName(String str) {
        this.headerName = str;
    }

    public void setHeaderValue(String str) {
        this.headerValue = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getHeaderName() != null) {
            sb.append("headerName: " + getHeaderName() + ",");
        }
        if (getHeaderValue() != null) {
            sb.append("headerValue: " + getHeaderValue());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public HttpHeader withHeaderName(String str) {
        this.headerName = str;
        return this;
    }

    public HttpHeader withHeaderValue(String str) {
        this.headerValue = str;
        return this;
    }
}
