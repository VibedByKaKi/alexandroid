package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class StartCommissioningRequest {
    private StartCommissioningSetupPayload setupPayload;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartCommissioningRequest() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof StartCommissioningRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartCommissioningRequest)) {
            return false;
        }
        StartCommissioningRequest startCommissioningRequest = (StartCommissioningRequest) obj;
        if (!startCommissioningRequest.canEqual(this)) {
            return false;
        }
        StartCommissioningSetupPayload setupPayload = getSetupPayload();
        StartCommissioningSetupPayload setupPayload2 = startCommissioningRequest.getSetupPayload();
        return setupPayload != null ? setupPayload.equals(setupPayload2) : setupPayload2 == null;
    }

    @JsonProperty("setupPayload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartCommissioningSetupPayload getSetupPayload() {
        return this.setupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        StartCommissioningSetupPayload setupPayload = getSetupPayload();
        return 59 + (setupPayload == null ? 43 : setupPayload.hashCode());
    }

    @JsonProperty("setupPayload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSetupPayload(StartCommissioningSetupPayload startCommissioningSetupPayload) {
        this.setupPayload = startCommissioningSetupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "StartCommissioningRequest(setupPayload=" + getSetupPayload() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
