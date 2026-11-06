package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HttpUrlDestinationConfiguration implements Serializable {
    private String confirmationUrl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HttpUrlDestinationConfiguration)) {
            return false;
        }
        HttpUrlDestinationConfiguration httpUrlDestinationConfiguration = (HttpUrlDestinationConfiguration) obj;
        if ((httpUrlDestinationConfiguration.getConfirmationUrl() == null) ^ (getConfirmationUrl() == null)) {
            return false;
        }
        return httpUrlDestinationConfiguration.getConfirmationUrl() == null || httpUrlDestinationConfiguration.getConfirmationUrl().equals(getConfirmationUrl());
    }

    public String getConfirmationUrl() {
        return this.confirmationUrl;
    }

    public int hashCode() {
        return 31 + (getConfirmationUrl() == null ? 0 : getConfirmationUrl().hashCode());
    }

    public void setConfirmationUrl(String str) {
        this.confirmationUrl = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getConfirmationUrl() != null) {
            sb.append("confirmationUrl: " + getConfirmationUrl());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public HttpUrlDestinationConfiguration withConfirmationUrl(String str) {
        this.confirmationUrl = str;
        return this;
    }
}
