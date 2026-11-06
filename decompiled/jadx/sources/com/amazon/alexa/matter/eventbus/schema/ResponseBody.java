package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ResponseBody {
    private ErrorResponseBody error;
    private SuccessResponseBody success;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ResponseBody() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ResponseBody;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseBody)) {
            return false;
        }
        ResponseBody responseBody = (ResponseBody) obj;
        if (!responseBody.canEqual(this)) {
            return false;
        }
        SuccessResponseBody success = getSuccess();
        SuccessResponseBody success2 = responseBody.getSuccess();
        if (success != null ? !success.equals(success2) : success2 != null) {
            return false;
        }
        ErrorResponseBody error = getError();
        ErrorResponseBody error2 = responseBody.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    @JsonProperty("error")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ErrorResponseBody getError() {
        return this.error;
    }

    @JsonProperty("success")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SuccessResponseBody getSuccess() {
        return this.success;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        SuccessResponseBody success = getSuccess();
        int hashCode = success == null ? 43 : success.hashCode();
        ErrorResponseBody error = getError();
        return ((hashCode + 59) * 59) + (error != null ? error.hashCode() : 43);
    }

    @JsonProperty("error")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setError(ErrorResponseBody errorResponseBody) {
        this.error = errorResponseBody;
    }

    @JsonProperty("success")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSuccess(SuccessResponseBody successResponseBody) {
        this.success = successResponseBody;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ResponseBody(success=" + getSuccess() + ", error=" + getError() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
