package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWifiNetworksOutput")
@Documentation("Output of GetWifiNetworks operation")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetWifiNetworksOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetWifiNetworksOutput");
    private List<WifiNetworkResource> wifiNetworkResourceList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<WifiNetworkResource> wifiNetworkResourceList;

        public GetWifiNetworksOutput build() {
            GetWifiNetworksOutput getWifiNetworksOutput = new GetWifiNetworksOutput();
            populate(getWifiNetworksOutput);
            return getWifiNetworksOutput;
        }

        public void populate(GetWifiNetworksOutput getWifiNetworksOutput) {
            getWifiNetworksOutput.setWifiNetworkResourceList(this.wifiNetworkResourceList);
        }

        public Builder withWifiNetworkResourceList(List<WifiNetworkResource> list) {
            this.wifiNetworkResourceList = list;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWifiNetworksOutput) {
            return Objects.equals(getWifiNetworkResourceList(), ((GetWifiNetworksOutput) obj).getWifiNetworkResourceList());
        }
        return false;
    }

    @Required
    public List<WifiNetworkResource> getWifiNetworkResourceList() {
        return this.wifiNetworkResourceList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiNetworkResourceList());
    }

    public void setWifiNetworkResourceList(List<WifiNetworkResource> list) {
        this.wifiNetworkResourceList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiNetworkResourceList(getWifiNetworkResourceList());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.wifiNetworkResourceList, new StringBuilder("GetWifiNetworksOutput(wifiNetworkResourceList="));
    }
}
