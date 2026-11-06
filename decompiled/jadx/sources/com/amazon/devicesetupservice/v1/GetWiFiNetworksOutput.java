package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.WifiScanData;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWiFiNetworksOutput")
@Documentation("Output structure for the \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWiFiNetworksOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetWiFiNetworksOutput");
    private String endpointToUse;
    private WifiNetworkDetail preferredWifiConfig;
    private List<WifiScanData> unknownWifiNetworkList;
    private List<WifiNetworkDetail> wifiConfigList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String endpointToUse;
        protected WifiNetworkDetail preferredWifiConfig;
        protected List<WifiScanData> unknownWifiNetworkList;
        protected List<WifiNetworkDetail> wifiConfigList;

        public GetWiFiNetworksOutput build() {
            GetWiFiNetworksOutput getWiFiNetworksOutput = new GetWiFiNetworksOutput();
            populate(getWiFiNetworksOutput);
            return getWiFiNetworksOutput;
        }

        public void populate(GetWiFiNetworksOutput getWiFiNetworksOutput) {
            getWiFiNetworksOutput.setWifiConfigList(this.wifiConfigList);
            getWiFiNetworksOutput.setUnknownWifiNetworkList(this.unknownWifiNetworkList);
            getWiFiNetworksOutput.setPreferredWifiConfig(this.preferredWifiConfig);
            getWiFiNetworksOutput.setEndpointToUse(this.endpointToUse);
        }

        public Builder withEndpointToUse(String str) {
            this.endpointToUse = str;
            return this;
        }

        public Builder withPreferredWifiConfig(WifiNetworkDetail wifiNetworkDetail) {
            this.preferredWifiConfig = wifiNetworkDetail;
            return this;
        }

        public Builder withUnknownWifiNetworkList(List<WifiScanData> list) {
            this.unknownWifiNetworkList = list;
            return this;
        }

        public Builder withWifiConfigList(List<WifiNetworkDetail> list) {
            this.wifiConfigList = list;
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
        if (!(obj instanceof GetWiFiNetworksOutput)) {
            return false;
        }
        GetWiFiNetworksOutput getWiFiNetworksOutput = (GetWiFiNetworksOutput) obj;
        return Objects.equals(getWifiConfigList(), getWiFiNetworksOutput.getWifiConfigList()) && Objects.equals(getUnknownWifiNetworkList(), getWiFiNetworksOutput.getUnknownWifiNetworkList()) && Objects.equals(getPreferredWifiConfig(), getWiFiNetworksOutput.getPreferredWifiConfig()) && Objects.equals(getEndpointToUse(), getWiFiNetworksOutput.getEndpointToUse());
    }

    @HttpHeader("x-amzn-endpoint")
    public String getEndpointToUse() {
        return this.endpointToUse;
    }

    @Documentation("A structure to hold both wifi scan data and wifi credential.")
    public WifiNetworkDetail getPreferredWifiConfig() {
        return this.preferredWifiConfig;
    }

    @Documentation("Wi-Fi scan data list for \"get Wi-Fi credentials\" API.")
    public List<WifiScanData> getUnknownWifiNetworkList() {
        return this.unknownWifiNetworkList;
    }

    @Documentation("A list of WifiNetworkDetail objects.")
    public List<WifiNetworkDetail> getWifiConfigList() {
        return this.wifiConfigList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWifiConfigList(), getUnknownWifiNetworkList(), getPreferredWifiConfig(), getEndpointToUse());
    }

    public void setEndpointToUse(String str) {
        this.endpointToUse = str;
    }

    public void setPreferredWifiConfig(WifiNetworkDetail wifiNetworkDetail) {
        this.preferredWifiConfig = wifiNetworkDetail;
    }

    public void setUnknownWifiNetworkList(List<WifiScanData> list) {
        this.unknownWifiNetworkList = list;
    }

    public void setWifiConfigList(List<WifiNetworkDetail> list) {
        this.wifiConfigList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiConfigList(getWifiConfigList());
        builder.withUnknownWifiNetworkList(getUnknownWifiNetworkList());
        builder.withPreferredWifiConfig(getPreferredWifiConfig());
        builder.withEndpointToUse(getEndpointToUse());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetWiFiNetworksOutput(wifiConfigList=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", unknownWifiNetworkList=", (List) this.wifiConfigList, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", preferredWifiConfig=", (List) this.unknownWifiNetworkList, sb);
        sb.append(String.valueOf(this.preferredWifiConfig));
        sb.append(", endpointToUse=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.endpointToUse, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
