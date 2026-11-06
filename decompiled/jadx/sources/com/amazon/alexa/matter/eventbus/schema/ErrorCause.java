package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ErrorCause {
    private MatterSDKError matterSDKError;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ErrorCause() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ErrorCause;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ErrorCause)) {
            return false;
        }
        ErrorCause errorCause = (ErrorCause) obj;
        if (!errorCause.canEqual(this)) {
            return false;
        }
        MatterSDKError matterSDKError = getMatterSDKError();
        MatterSDKError matterSDKError2 = errorCause.getMatterSDKError();
        return matterSDKError != null ? matterSDKError.equals(matterSDKError2) : matterSDKError2 == null;
    }

    @JsonProperty("matterSdkError")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public MatterSDKError getMatterSDKError() {
        return this.matterSDKError;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        MatterSDKError matterSDKError = getMatterSDKError();
        return 59 + (matterSDKError == null ? 43 : matterSDKError.hashCode());
    }

    @JsonProperty("matterSdkError")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setMatterSDKError(MatterSDKError matterSDKError) {
        this.matterSDKError = matterSDKError;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ErrorCause(matterSDKError=" + getMatterSDKError() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
