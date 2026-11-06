package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class MatterSDKError {
    private long code;
    private String message;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public MatterSDKError() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof MatterSDKError;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatterSDKError)) {
            return false;
        }
        MatterSDKError matterSDKError = (MatterSDKError) obj;
        if (!matterSDKError.canEqual(this) || getCode() != matterSDKError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = matterSDKError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    @JsonProperty("code")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getCode() {
        return this.code;
    }

    @JsonProperty("message")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getMessage() {
        return this.message;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long code = getCode();
        String message = getMessage();
        return ((((int) (code ^ (code >>> 32))) + 59) * 59) + (message == null ? 43 : message.hashCode());
    }

    @JsonProperty("code")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCode(long j) {
        this.code = j;
    }

    @JsonProperty("message")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setMessage(String str) {
        this.message = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "MatterSDKError(code=" + getCode() + ", message=" + getMessage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
