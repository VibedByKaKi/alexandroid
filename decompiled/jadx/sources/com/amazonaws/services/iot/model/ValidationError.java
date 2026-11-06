package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ValidationError implements Serializable {
    private String errorMessage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ValidationError)) {
            return false;
        }
        ValidationError validationError = (ValidationError) obj;
        if ((validationError.getErrorMessage() == null) ^ (getErrorMessage() == null)) {
            return false;
        }
        return validationError.getErrorMessage() == null || validationError.getErrorMessage().equals(getErrorMessage());
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return 31 + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode());
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getErrorMessage() != null) {
            sb.append("errorMessage: " + getErrorMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ValidationError withErrorMessage(String str) {
        this.errorMessage = str;
        return this;
    }
}
