package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.WifiScanData;
import com.amazon.devicesetupservice.reporting.KeyExchangeMethod;
import com.amazon.devicesetupservice.reporting.ProvisioningMethod;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@CoralSuppressWarnings
@Generated
@XmlName("GetWiFiNetworksInput")
@Documentation("Input structure for the \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetWiFiNetworksInput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetWiFiNetworksInput");
    private String accessToken;
    private String authMaterialIndex;
    private WifiScanData currentWifiNetwork;
    private String keyExchangeMethod;
    private String productIndex;
    private WifiScanData provisioneeLastConnectedNetwork;
    private String provisioningMethod;
    private String sessionToken;
    private String trustMethod;
    private List<WifiScanData> wifiScanDataList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String accessToken;
        protected String authMaterialIndex;
        protected WifiScanData currentWifiNetwork;
        protected String keyExchangeMethod;
        protected String productIndex;
        protected WifiScanData provisioneeLastConnectedNetwork;
        protected String provisioningMethod;
        protected String sessionToken;
        protected String trustMethod;
        protected List<WifiScanData> wifiScanDataList;

        public GetWiFiNetworksInput build() {
            GetWiFiNetworksInput getWiFiNetworksInput = new GetWiFiNetworksInput();
            populate(getWiFiNetworksInput);
            return getWiFiNetworksInput;
        }

        public void populate(GetWiFiNetworksInput getWiFiNetworksInput) {
            getWiFiNetworksInput.setProductIndex(this.productIndex);
            getWiFiNetworksInput.setAuthMaterialIndex(this.authMaterialIndex);
            getWiFiNetworksInput.setProvisioningMethod(this.provisioningMethod);
            getWiFiNetworksInput.setTrustMethod(this.trustMethod);
            getWiFiNetworksInput.setKeyExchangeMethod(this.keyExchangeMethod);
            getWiFiNetworksInput.setWifiScanDataList(this.wifiScanDataList);
            getWiFiNetworksInput.setCurrentWifiNetwork(this.currentWifiNetwork);
            getWiFiNetworksInput.setAccessToken(this.accessToken);
            getWiFiNetworksInput.setProvisioneeLastConnectedNetwork(this.provisioneeLastConnectedNetwork);
            getWiFiNetworksInput.setSessionToken(this.sessionToken);
        }

        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withAuthMaterialIndex(String str) {
            this.authMaterialIndex = str;
            return this;
        }

        public Builder withCurrentWifiNetwork(WifiScanData wifiScanData) {
            this.currentWifiNetwork = wifiScanData;
            return this;
        }

        public Builder withKeyExchangeMethod(String str) {
            this.keyExchangeMethod = str;
            return this;
        }

        public Builder withProductIndex(String str) {
            this.productIndex = str;
            return this;
        }

        public Builder withProvisioneeLastConnectedNetwork(WifiScanData wifiScanData) {
            this.provisioneeLastConnectedNetwork = wifiScanData;
            return this;
        }

        public Builder withProvisioningMethod(String str) {
            this.provisioningMethod = str;
            return this;
        }

        public Builder withSessionToken(String str) {
            this.sessionToken = str;
            return this;
        }

        public Builder withTrustMethod(String str) {
            this.trustMethod = str;
            return this;
        }

        public Builder withWifiScanDataList(List<WifiScanData> list) {
            this.wifiScanDataList = list;
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
        if (!(obj instanceof GetWiFiNetworksInput)) {
            return false;
        }
        GetWiFiNetworksInput getWiFiNetworksInput = (GetWiFiNetworksInput) obj;
        return Objects.equals(getProductIndex(), getWiFiNetworksInput.getProductIndex()) && Objects.equals(getAuthMaterialIndex(), getWiFiNetworksInput.getAuthMaterialIndex()) && Objects.equals(getProvisioningMethod(), getWiFiNetworksInput.getProvisioningMethod()) && Objects.equals(getTrustMethod(), getWiFiNetworksInput.getTrustMethod()) && Objects.equals(getKeyExchangeMethod(), getWiFiNetworksInput.getKeyExchangeMethod()) && Objects.equals(getWifiScanDataList(), getWiFiNetworksInput.getWifiScanDataList()) && Objects.equals(getCurrentWifiNetwork(), getWiFiNetworksInput.getCurrentWifiNetwork()) && Objects.equals(getAccessToken(), getWiFiNetworksInput.getAccessToken()) && Objects.equals(getProvisioneeLastConnectedNetwork(), getWiFiNetworksInput.getProvisioneeLastConnectedNetwork()) && Objects.equals(getSessionToken(), getWiFiNetworksInput.getSessionToken());
    }

    @HttpHeader("x-amz-access-token")
    @Sensitive
    public String getAccessToken() {
        return this.accessToken;
    }

    @Pattern("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public String getAuthMaterialIndex() {
        return this.authMaterialIndex;
    }

    @Documentation("Wi-Fi scan data structure for \"get Wi-Fi credentials\" API.")
    public WifiScanData getCurrentWifiNetwork() {
        return this.currentWifiNetwork;
    }

    @EnumValues({KeyExchangeMethod.ECDHE, KeyExchangeMethod.JPAKE})
    @Required
    public String getKeyExchangeMethod() {
        return this.keyExchangeMethod;
    }

    @MaxLength(4)
    @MinLength(4)
    @Pattern("[a-zA-Z0-9]+")
    public String getProductIndex() {
        return this.productIndex;
    }

    @Documentation("Wi-Fi scan data structure for \"get Wi-Fi credentials\" API.")
    public WifiScanData getProvisioneeLastConnectedNetwork() {
        return this.provisioneeLastConnectedNetwork;
    }

    @EnumValues({ProvisioningMethod.FFS, "MANUAL", ProvisioningMethod.WIFI_FFS, ProvisioningMethod.SH_PHILIPS, "MATTER"})
    @Required
    public String getProvisioningMethod() {
        return this.provisioningMethod;
    }

    @MaxLength(36)
    @MinLength(36)
    @Pattern("[0-9a-fA-F]{8}-(?:[0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}")
    public String getSessionToken() {
        return this.sessionToken;
    }

    @EnumValues({"AUTHENTICATED", "UNAUTHENTICATED", "NONE"})
    @Required
    public String getTrustMethod() {
        return this.trustMethod;
    }

    @Required
    @Documentation("Wi-Fi scan data list for \"get Wi-Fi credentials\" API.")
    public List<WifiScanData> getWifiScanDataList() {
        return this.wifiScanDataList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getProductIndex(), getAuthMaterialIndex(), getProvisioningMethod(), getTrustMethod(), getKeyExchangeMethod(), getWifiScanDataList(), getCurrentWifiNetwork(), getAccessToken(), getProvisioneeLastConnectedNetwork(), getSessionToken());
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAuthMaterialIndex(String str) {
        this.authMaterialIndex = str;
    }

    public void setCurrentWifiNetwork(WifiScanData wifiScanData) {
        this.currentWifiNetwork = wifiScanData;
    }

    public void setKeyExchangeMethod(String str) {
        this.keyExchangeMethod = str;
    }

    public void setProductIndex(String str) {
        this.productIndex = str;
    }

    public void setProvisioneeLastConnectedNetwork(WifiScanData wifiScanData) {
        this.provisioneeLastConnectedNetwork = wifiScanData;
    }

    public void setProvisioningMethod(String str) {
        this.provisioningMethod = str;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public void setTrustMethod(String str) {
        this.trustMethod = str;
    }

    public void setWifiScanDataList(List<WifiScanData> list) {
        this.wifiScanDataList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withProductIndex(getProductIndex());
        builder.withAuthMaterialIndex(getAuthMaterialIndex());
        builder.withProvisioningMethod(getProvisioningMethod());
        builder.withTrustMethod(getTrustMethod());
        builder.withKeyExchangeMethod(getKeyExchangeMethod());
        builder.withWifiScanDataList(getWifiScanDataList());
        builder.withCurrentWifiNetwork(getCurrentWifiNetwork());
        builder.withAccessToken(getAccessToken());
        builder.withProvisioneeLastConnectedNetwork(getProvisioneeLastConnectedNetwork());
        builder.withSessionToken(getSessionToken());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetWiFiNetworksInput(productIndex=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.productIndex, ", authMaterialIndex=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.authMaterialIndex, ", provisioningMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.provisioningMethod, ", trustMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.trustMethod, ", keyExchangeMethod=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.keyExchangeMethod, ", wifiScanDataList=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", currentWifiNetwork=", (List) this.wifiScanDataList, sb);
        sb.append(String.valueOf(this.currentWifiNetwork));
        sb.append(", accessToken=*** REDACTED ***, provisioneeLastConnectedNetwork=");
        sb.append(String.valueOf(this.provisioneeLastConnectedNetwork));
        sb.append(", sessionToken=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.sessionToken, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
