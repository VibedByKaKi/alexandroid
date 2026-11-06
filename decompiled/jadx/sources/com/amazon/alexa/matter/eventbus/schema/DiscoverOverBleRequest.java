package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class DiscoverOverBleRequest {
    private SetupPayload setupPayload;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DiscoverOverBleRequest() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof DiscoverOverBleRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverOverBleRequest)) {
            return false;
        }
        DiscoverOverBleRequest discoverOverBleRequest = (DiscoverOverBleRequest) obj;
        if (!discoverOverBleRequest.canEqual(this)) {
            return false;
        }
        SetupPayload setupPayload = getSetupPayload();
        SetupPayload setupPayload2 = discoverOverBleRequest.getSetupPayload();
        return setupPayload != null ? setupPayload.equals(setupPayload2) : setupPayload2 == null;
    }

    @JsonProperty("setupPayload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupPayload getSetupPayload() {
        return this.setupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        SetupPayload setupPayload = getSetupPayload();
        return 59 + (setupPayload == null ? 43 : setupPayload.hashCode());
    }

    @JsonProperty("setupPayload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSetupPayload(SetupPayload setupPayload) {
        this.setupPayload = setupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "DiscoverOverBleRequest(setupPayload=" + getSetupPayload() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
