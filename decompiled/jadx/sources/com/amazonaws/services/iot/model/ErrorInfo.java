package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ErrorInfo implements Serializable {
    private String code;
    private String message;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        if ((errorInfo.getCode() == null) ^ (getCode() == null)) {
            return false;
        }
        if (errorInfo.getCode() != null && !errorInfo.getCode().equals(getCode())) {
            return false;
        }
        if ((errorInfo.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        return errorInfo.getMessage() == null || errorInfo.getMessage().equals(getMessage());
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((getCode() == null ? 0 : getCode().hashCode()) + 31) * 31) + (getMessage() != null ? getMessage().hashCode() : 0);
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getCode() != null) {
            sb.append("code: " + getCode() + ",");
        }
        if (getMessage() != null) {
            sb.append("message: " + getMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ErrorInfo withCode(String str) {
        this.code = str;
        return this;
    }

    public ErrorInfo withMessage(String str) {
        this.message = str;
        return this;
    }
}
