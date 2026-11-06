package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CancelCommissioningSessionRequest {
    private String commissioningSessionID;
    private CancellationReason reason;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelCommissioningSessionRequest() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CancelCommissioningSessionRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelCommissioningSessionRequest)) {
            return false;
        }
        CancelCommissioningSessionRequest cancelCommissioningSessionRequest = (CancelCommissioningSessionRequest) obj;
        if (!cancelCommissioningSessionRequest.canEqual(this)) {
            return false;
        }
        String commissioningSessionID = getCommissioningSessionID();
        String commissioningSessionID2 = cancelCommissioningSessionRequest.getCommissioningSessionID();
        if (commissioningSessionID != null ? !commissioningSessionID.equals(commissioningSessionID2) : commissioningSessionID2 != null) {
            return false;
        }
        CancellationReason reason = getReason();
        CancellationReason reason2 = cancelCommissioningSessionRequest.getReason();
        return reason != null ? reason.equals(reason2) : reason2 == null;
    }

    @JsonProperty("commissioningSessionID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCommissioningSessionID() {
        return this.commissioningSessionID;
    }

    @JsonProperty("reason")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancellationReason getReason() {
        return this.reason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String commissioningSessionID = getCommissioningSessionID();
        int hashCode = commissioningSessionID == null ? 43 : commissioningSessionID.hashCode();
        CancellationReason reason = getReason();
        return ((hashCode + 59) * 59) + (reason != null ? reason.hashCode() : 43);
    }

    @JsonProperty("commissioningSessionID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCommissioningSessionID(String str) {
        this.commissioningSessionID = str;
    }

    @JsonProperty("reason")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReason(CancellationReason cancellationReason) {
        this.reason = cancellationReason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CancelCommissioningSessionRequest(commissioningSessionID=" + getCommissioningSessionID() + ", reason=" + getReason() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
