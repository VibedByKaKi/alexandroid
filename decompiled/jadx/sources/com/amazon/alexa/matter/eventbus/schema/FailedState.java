package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class FailedState {
    private InProgressState lastKnownState;
    private FailureReason reason;
    private SDKFailure sdkFailure;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FailedState() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof FailedState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FailedState)) {
            return false;
        }
        FailedState failedState = (FailedState) obj;
        if (!failedState.canEqual(this)) {
            return false;
        }
        InProgressState lastKnownState = getLastKnownState();
        InProgressState lastKnownState2 = failedState.getLastKnownState();
        if (lastKnownState != null ? !lastKnownState.equals(lastKnownState2) : lastKnownState2 != null) {
            return false;
        }
        FailureReason reason = getReason();
        FailureReason reason2 = failedState.getReason();
        if (reason != null ? !reason.equals(reason2) : reason2 != null) {
            return false;
        }
        SDKFailure sdkFailure = getSdkFailure();
        SDKFailure sdkFailure2 = failedState.getSdkFailure();
        return sdkFailure != null ? sdkFailure.equals(sdkFailure2) : sdkFailure2 == null;
    }

    @JsonProperty("lastKnownState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public InProgressState getLastKnownState() {
        return this.lastKnownState;
    }

    @JsonProperty("reason")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FailureReason getReason() {
        return this.reason;
    }

    @JsonProperty("sdkFailure")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SDKFailure getSdkFailure() {
        return this.sdkFailure;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        InProgressState lastKnownState = getLastKnownState();
        int hashCode = lastKnownState == null ? 43 : lastKnownState.hashCode();
        FailureReason reason = getReason();
        int i = (hashCode + 59) * 59;
        int hashCode2 = reason == null ? 43 : reason.hashCode();
        SDKFailure sdkFailure = getSdkFailure();
        return ((i + hashCode2) * 59) + (sdkFailure != null ? sdkFailure.hashCode() : 43);
    }

    @JsonProperty("lastKnownState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLastKnownState(InProgressState inProgressState) {
        this.lastKnownState = inProgressState;
    }

    @JsonProperty("reason")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReason(FailureReason failureReason) {
        this.reason = failureReason;
    }

    @JsonProperty("sdkFailure")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSdkFailure(SDKFailure sDKFailure) {
        this.sdkFailure = sDKFailure;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "FailedState(lastKnownState=" + getLastKnownState() + ", reason=" + getReason() + ", sdkFailure=" + getSdkFailure() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
