package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class StartCommissioningResponse {
    private String commissioningSessionID;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartCommissioningResponse() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof StartCommissioningResponse;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartCommissioningResponse)) {
            return false;
        }
        StartCommissioningResponse startCommissioningResponse = (StartCommissioningResponse) obj;
        if (!startCommissioningResponse.canEqual(this)) {
            return false;
        }
        String commissioningSessionID = getCommissioningSessionID();
        String commissioningSessionID2 = startCommissioningResponse.getCommissioningSessionID();
        return commissioningSessionID != null ? commissioningSessionID.equals(commissioningSessionID2) : commissioningSessionID2 == null;
    }

    @JsonProperty("commissioningSessionID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCommissioningSessionID() {
        return this.commissioningSessionID;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String commissioningSessionID = getCommissioningSessionID();
        return 59 + (commissioningSessionID == null ? 43 : commissioningSessionID.hashCode());
    }

    @JsonProperty("commissioningSessionID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCommissioningSessionID(String str) {
        this.commissioningSessionID = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "StartCommissioningResponse(commissioningSessionID=" + getCommissioningSessionID() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
