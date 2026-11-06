package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ErrorResponseBody {
    private ErrorCause causedBy;
    private String message;
    private ErrorStatusCode status;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ErrorResponseBody() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ErrorResponseBody;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ErrorResponseBody)) {
            return false;
        }
        ErrorResponseBody errorResponseBody = (ErrorResponseBody) obj;
        if (!errorResponseBody.canEqual(this)) {
            return false;
        }
        String message = getMessage();
        String message2 = errorResponseBody.getMessage();
        if (message != null ? !message.equals(message2) : message2 != null) {
            return false;
        }
        ErrorStatusCode status = getStatus();
        ErrorStatusCode status2 = errorResponseBody.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        ErrorCause causedBy = getCausedBy();
        ErrorCause causedBy2 = errorResponseBody.getCausedBy();
        return causedBy != null ? causedBy.equals(causedBy2) : causedBy2 == null;
    }

    @JsonProperty("causedBy")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ErrorCause getCausedBy() {
        return this.causedBy;
    }

    @JsonProperty("message")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getMessage() {
        return this.message;
    }

    @JsonProperty("status")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ErrorStatusCode getStatus() {
        return this.status;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String message = getMessage();
        int hashCode = message == null ? 43 : message.hashCode();
        ErrorStatusCode status = getStatus();
        int i = (hashCode + 59) * 59;
        int hashCode2 = status == null ? 43 : status.hashCode();
        ErrorCause causedBy = getCausedBy();
        return ((i + hashCode2) * 59) + (causedBy != null ? causedBy.hashCode() : 43);
    }

    @JsonProperty("causedBy")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCausedBy(ErrorCause errorCause) {
        this.causedBy = errorCause;
    }

    @JsonProperty("message")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setMessage(String str) {
        this.message = str;
    }

    @JsonProperty("status")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setStatus(ErrorStatusCode errorStatusCode) {
        this.status = errorStatusCode;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ErrorResponseBody(message=" + getMessage() + ", status=" + getStatus() + ", causedBy=" + getCausedBy() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
