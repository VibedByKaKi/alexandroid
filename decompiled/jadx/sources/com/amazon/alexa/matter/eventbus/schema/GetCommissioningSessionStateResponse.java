package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class GetCommissioningSessionStateResponse {
    private CommissioningSessionState commissioningSessionState;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetCommissioningSessionStateResponse() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetCommissioningSessionStateResponse;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCommissioningSessionStateResponse)) {
            return false;
        }
        GetCommissioningSessionStateResponse getCommissioningSessionStateResponse = (GetCommissioningSessionStateResponse) obj;
        if (!getCommissioningSessionStateResponse.canEqual(this)) {
            return false;
        }
        CommissioningSessionState commissioningSessionState = getCommissioningSessionState();
        CommissioningSessionState commissioningSessionState2 = getCommissioningSessionStateResponse.getCommissioningSessionState();
        return commissioningSessionState != null ? commissioningSessionState.equals(commissioningSessionState2) : commissioningSessionState2 == null;
    }

    @JsonProperty("commissioningSessionState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CommissioningSessionState getCommissioningSessionState() {
        return this.commissioningSessionState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        CommissioningSessionState commissioningSessionState = getCommissioningSessionState();
        return 59 + (commissioningSessionState == null ? 43 : commissioningSessionState.hashCode());
    }

    @JsonProperty("commissioningSessionState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCommissioningSessionState(CommissioningSessionState commissioningSessionState) {
        this.commissioningSessionState = commissioningSessionState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "GetCommissioningSessionStateResponse(commissioningSessionState=" + getCommissioningSessionState() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
