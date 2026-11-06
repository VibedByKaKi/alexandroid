package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SDKFailure {
    private long errorCode;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SDKFailure() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SDKFailure;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKFailure)) {
            return false;
        }
        SDKFailure sDKFailure = (SDKFailure) obj;
        return sDKFailure.canEqual(this) && getErrorCode() == sDKFailure.getErrorCode();
    }

    @JsonProperty("errorCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getErrorCode() {
        return this.errorCode;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long errorCode = getErrorCode();
        return 59 + ((int) (errorCode ^ (errorCode >>> 32)));
    }

    @JsonProperty("errorCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setErrorCode(long j) {
        this.errorCode = j;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SDKFailure(errorCode=" + getErrorCode() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
