package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SetDefaultAuthorizerResult implements Serializable {
    private String authorizerArn;
    private String authorizerName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SetDefaultAuthorizerResult)) {
            return false;
        }
        SetDefaultAuthorizerResult setDefaultAuthorizerResult = (SetDefaultAuthorizerResult) obj;
        if ((setDefaultAuthorizerResult.getAuthorizerName() == null) ^ (getAuthorizerName() == null)) {
            return false;
        }
        if (setDefaultAuthorizerResult.getAuthorizerName() != null && !setDefaultAuthorizerResult.getAuthorizerName().equals(getAuthorizerName())) {
            return false;
        }
        if ((setDefaultAuthorizerResult.getAuthorizerArn() == null) ^ (getAuthorizerArn() == null)) {
            return false;
        }
        return setDefaultAuthorizerResult.getAuthorizerArn() == null || setDefaultAuthorizerResult.getAuthorizerArn().equals(getAuthorizerArn());
    }

    public String getAuthorizerArn() {
        return this.authorizerArn;
    }

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    public int hashCode() {
        return (((getAuthorizerName() == null ? 0 : getAuthorizerName().hashCode()) + 31) * 31) + (getAuthorizerArn() != null ? getAuthorizerArn().hashCode() : 0);
    }

    public void setAuthorizerArn(String str) {
        this.authorizerArn = str;
    }

    public void setAuthorizerName(String str) {
        this.authorizerName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthorizerName() != null) {
            sb.append("authorizerName: " + getAuthorizerName() + ",");
        }
        if (getAuthorizerArn() != null) {
            sb.append("authorizerArn: " + getAuthorizerArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SetDefaultAuthorizerResult withAuthorizerArn(String str) {
        this.authorizerArn = str;
        return this;
    }

    public SetDefaultAuthorizerResult withAuthorizerName(String str) {
        this.authorizerName = str;
        return this;
    }
}
