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
@XmlName("GetWifiNetworksInfoResponse")
@Documentation("This is the response which will be returned when asked for wifi networks (without passwords) for a customer")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class GetWifiNetworksInfoResponse {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.GetWifiNetworksInfoResponse");
    private List<WifiNetworkInfo> wifiNetworksInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<WifiNetworkInfo> wifiNetworksInfo;

        public GetWifiNetworksInfoResponse build() {
            GetWifiNetworksInfoResponse getWifiNetworksInfoResponse = new GetWifiNetworksInfoResponse();
            populate(getWifiNetworksInfoResponse);
            return getWifiNetworksInfoResponse;
        }

        public void populate(GetWifiNetworksInfoResponse getWifiNetworksInfoResponse) {
            getWifiNetworksInfoResponse.setWifiNetworksInfo(this.wifiNetworksInfo);
        }

        public Builder withWifiNetworksInfo(List<WifiNetworkInfo> list) {
            this.wifiNetworksInfo = list;
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
        if (obj instanceof GetWifiNetworksInfoResponse) {
            return Objects.equals(getWifiNetworksInfo(), ((GetWifiNetworksInfoResponse) obj).getWifiNetworksInfo());
        }
        return false;
    }

    @Required
    public List<WifiNetworkInfo> getWifiNetworksInfo() {
        return this.wifiNetworksInfo;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiNetworksInfo());
    }

    public void setWifiNetworksInfo(List<WifiNetworkInfo> list) {
        this.wifiNetworksInfo = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiNetworksInfo(getWifiNetworksInfo());
        return builder;
    }

    public String toString() {
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.wifiNetworksInfo, new StringBuilder("GetWifiNetworksInfoResponse(wifiNetworksInfo="));
    }
}
