package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SelectedNetwork {
    private String displayName;
    private Network network;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SelectedNetwork() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SelectedNetwork;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectedNetwork)) {
            return false;
        }
        SelectedNetwork selectedNetwork = (SelectedNetwork) obj;
        if (!selectedNetwork.canEqual(this)) {
            return false;
        }
        String displayName = getDisplayName();
        String displayName2 = selectedNetwork.getDisplayName();
        if (displayName != null ? !displayName.equals(displayName2) : displayName2 != null) {
            return false;
        }
        Network network = getNetwork();
        Network network2 = selectedNetwork.getNetwork();
        return network != null ? network.equals(network2) : network2 == null;
    }

    @JsonProperty(CamerasRouteParameter.DISPLAY_NAME)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    @JsonProperty("network")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Network getNetwork() {
        return this.network;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String displayName = getDisplayName();
        int hashCode = displayName == null ? 43 : displayName.hashCode();
        Network network = getNetwork();
        return ((hashCode + 59) * 59) + (network != null ? network.hashCode() : 43);
    }

    @JsonProperty(CamerasRouteParameter.DISPLAY_NAME)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDisplayName(String str) {
        this.displayName = str;
    }

    @JsonProperty("network")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setNetwork(Network network) {
        this.network = network;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SelectedNetwork(displayName=" + getDisplayName() + ", network=" + getNetwork() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
