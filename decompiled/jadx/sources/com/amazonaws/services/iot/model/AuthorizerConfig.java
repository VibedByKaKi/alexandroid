package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuthorizerConfig implements Serializable {
    private Boolean allowAuthorizerOverride;
    private String defaultAuthorizerName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthorizerConfig)) {
            return false;
        }
        AuthorizerConfig authorizerConfig = (AuthorizerConfig) obj;
        if ((authorizerConfig.getDefaultAuthorizerName() == null) ^ (getDefaultAuthorizerName() == null)) {
            return false;
        }
        if (authorizerConfig.getDefaultAuthorizerName() != null && !authorizerConfig.getDefaultAuthorizerName().equals(getDefaultAuthorizerName())) {
            return false;
        }
        if ((authorizerConfig.getAllowAuthorizerOverride() == null) ^ (getAllowAuthorizerOverride() == null)) {
            return false;
        }
        return authorizerConfig.getAllowAuthorizerOverride() == null || authorizerConfig.getAllowAuthorizerOverride().equals(getAllowAuthorizerOverride());
    }

    public Boolean getAllowAuthorizerOverride() {
        return this.allowAuthorizerOverride;
    }

    public String getDefaultAuthorizerName() {
        return this.defaultAuthorizerName;
    }

    public int hashCode() {
        return (((getDefaultAuthorizerName() == null ? 0 : getDefaultAuthorizerName().hashCode()) + 31) * 31) + (getAllowAuthorizerOverride() != null ? getAllowAuthorizerOverride().hashCode() : 0);
    }

    public Boolean isAllowAuthorizerOverride() {
        return this.allowAuthorizerOverride;
    }

    public void setAllowAuthorizerOverride(Boolean bool) {
        this.allowAuthorizerOverride = bool;
    }

    public void setDefaultAuthorizerName(String str) {
        this.defaultAuthorizerName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDefaultAuthorizerName() != null) {
            sb.append("defaultAuthorizerName: " + getDefaultAuthorizerName() + ",");
        }
        if (getAllowAuthorizerOverride() != null) {
            sb.append("allowAuthorizerOverride: " + getAllowAuthorizerOverride());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AuthorizerConfig withAllowAuthorizerOverride(Boolean bool) {
        this.allowAuthorizerOverride = bool;
        return this;
    }

    public AuthorizerConfig withDefaultAuthorizerName(String str) {
        this.defaultAuthorizerName = str;
        return this;
    }
}
