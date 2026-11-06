package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class DiscoverOverBleResponse {
    private boolean isDeviceDiscovered;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DiscoverOverBleResponse() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof DiscoverOverBleResponse;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverOverBleResponse)) {
            return false;
        }
        DiscoverOverBleResponse discoverOverBleResponse = (DiscoverOverBleResponse) obj;
        return discoverOverBleResponse.canEqual(this) && isDeviceDiscovered() == discoverOverBleResponse.isDeviceDiscovered();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        return 59 + (isDeviceDiscovered() ? 79 : 97);
    }

    @JsonProperty("isDeviceDiscovered")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean isDeviceDiscovered() {
        return this.isDeviceDiscovered;
    }

    @JsonProperty("isDeviceDiscovered")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDeviceDiscovered(boolean z) {
        this.isDeviceDiscovered = z;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "DiscoverOverBleResponse(isDeviceDiscovered=" + isDeviceDiscovered() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
