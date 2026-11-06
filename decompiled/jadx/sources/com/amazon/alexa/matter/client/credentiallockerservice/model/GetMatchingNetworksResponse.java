package com.amazon.alexa.matter.client.credentiallockerservice.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class GetMatchingNetworksResponse {
    private final List<Network> networks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class GetMatchingNetworksResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Network> networks;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksResponse build() {
            return new GetMatchingNetworksResponse(this.networks);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public GetMatchingNetworksResponseBuilder networks(List<Network> list) {
            this.networks = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.networks, new StringBuilder("GetMatchingNetworksResponse.GetMatchingNetworksResponseBuilder(networks="));
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private GetMatchingNetworksResponse() {
        this.networks = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static GetMatchingNetworksResponseBuilder builder() {
        return new GetMatchingNetworksResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMatchingNetworksResponse)) {
            return false;
        }
        List<Network> networks = getNetworks();
        List<Network> networks2 = ((GetMatchingNetworksResponse) obj).getNetworks();
        return networks != null ? networks.equals(networks2) : networks2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<Network> getNetworks() {
        return this.networks;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<Network> networks = getNetworks();
        return 59 + (networks == null ? 43 : networks.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "GetMatchingNetworksResponse(networks=" + getNetworks() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetMatchingNetworksResponse withNetworks(List<Network> list) {
        return this.networks == list ? this : new GetMatchingNetworksResponse(list);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetMatchingNetworksResponse(List<Network> list) {
        this.networks = list;
    }
}
