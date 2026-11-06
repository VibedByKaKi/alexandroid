package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ExportTaskStatus implements Serializable {
    private String code;
    private String message;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ExportTaskStatus)) {
            return false;
        }
        ExportTaskStatus exportTaskStatus = (ExportTaskStatus) obj;
        if ((exportTaskStatus.getCode() == null) ^ (getCode() == null)) {
            return false;
        }
        if (exportTaskStatus.getCode() != null && !exportTaskStatus.getCode().equals(getCode())) {
            return false;
        }
        if ((exportTaskStatus.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        return exportTaskStatus.getMessage() == null || exportTaskStatus.getMessage().equals(getMessage());
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

    public void setCode(ExportTaskStatusCode exportTaskStatusCode) {
        this.code = exportTaskStatusCode.toString();
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

    public ExportTaskStatus withCode(ExportTaskStatusCode exportTaskStatusCode) {
        this.code = exportTaskStatusCode.toString();
        return this;
    }

    public ExportTaskStatus withMessage(String str) {
        this.message = str;
        return this;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public ExportTaskStatus withCode(String str) {
        this.code = str;
        return this;
    }
}
