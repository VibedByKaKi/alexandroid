package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetupservice.reporting.NetworkState;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("WifiNetworkInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiNetworkInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.WifiNetworkInfo");
    private String keyManagement;
    private long lastUpdatedDateUtcMillis;
    private String networkState;
    private String ssid;
    private String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String keyManagement;
        protected long lastUpdatedDateUtcMillis;
        protected String networkState;
        protected String ssid;
        protected String wpaPskType;

        public WifiNetworkInfo build() {
            WifiNetworkInfo wifiNetworkInfo = new WifiNetworkInfo();
            populate(wifiNetworkInfo);
            return wifiNetworkInfo;
        }

        public void populate(WifiNetworkInfo wifiNetworkInfo) {
            wifiNetworkInfo.setSsid(this.ssid);
            wifiNetworkInfo.setKeyManagement(this.keyManagement);
            wifiNetworkInfo.setWpaPskType(this.wpaPskType);
            wifiNetworkInfo.setNetworkState(this.networkState);
            wifiNetworkInfo.setLastUpdatedDateUtcMillis(this.lastUpdatedDateUtcMillis);
        }

        public Builder withKeyManagement(String str) {
            this.keyManagement = str;
            return this;
        }

        public Builder withLastUpdatedDateUtcMillis(long j) {
            this.lastUpdatedDateUtcMillis = j;
            return this;
        }

        public Builder withNetworkState(String str) {
            this.networkState = str;
            return this;
        }

        public Builder withSsid(String str) {
            this.ssid = str;
            return this;
        }

        public Builder withWpaPskType(String str) {
            this.wpaPskType = str;
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
        if (!(obj instanceof WifiNetworkInfo)) {
            return false;
        }
        WifiNetworkInfo wifiNetworkInfo = (WifiNetworkInfo) obj;
        return Objects.equals(getSsid(), wifiNetworkInfo.getSsid()) && Objects.equals(getKeyManagement(), wifiNetworkInfo.getKeyManagement()) && Objects.equals(getWpaPskType(), wifiNetworkInfo.getWpaPskType()) && Objects.equals(getNetworkState(), wifiNetworkInfo.getNetworkState()) && Long.valueOf(getLastUpdatedDateUtcMillis()).equals(Long.valueOf(wifiNetworkInfo.getLastUpdatedDateUtcMillis()));
    }

    @EnumValues({"WPAPSK", "WEP", "OPEN", "NONE"})
    @Required
    public String getKeyManagement() {
        return this.keyManagement;
    }

    @Documentation("Last time Wi-Fi network info was updated. Date difference since January 1, 1970, 00:00:00,\n        universal time in milliseconds.")
    public long getLastUpdatedDateUtcMillis() {
        return this.lastUpdatedDateUtcMillis;
    }

    @EnumValues({NetworkState.INITIATING_CONNECTION_ATTEMPT, "DISCONNECTED", NetworkState.CONNECTING, "CONNECTED", "ASSOCIATED", NetworkState.CONNECTION_FAILED_INTERNAL_ERROR, NetworkState.CONNECTION_FAILED_PSK_AUTHENTICATION, NetworkState.CONNECTION_FAILED_AP_NOT_FOUND, NetworkState.CONNECTED_BEHIND_CAPTIVE_PORTAL, NetworkState.CONNECTED_LIMITED_CONNECTIVITY, NetworkState.STATE_INITIATING_CONNECTION_ATTEMPT, NetworkState.STATE_DISCONNECTED, NetworkState.STATE_CONNECTING, NetworkState.STATE_ASSOCIATED})
    public String getNetworkState() {
        return this.networkState;
    }

    @MaxLength(34)
    @Required
    @Sensitive
    @MinLength(1)
    public String getSsid() {
        return this.ssid;
    }

    @EnumValues({"WPA3_ONLY", "WPA3_TRANSITION", "WPA2"})
    @Documentation("Type of wpa psk network (wpa2, wpa3 transition, or wpa3 only). Null for non wpa psk networks.")
    public String getWpaPskType() {
        return this.wpaPskType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getKeyManagement(), getWpaPskType(), getNetworkState(), Long.valueOf(getLastUpdatedDateUtcMillis()));
    }

    public void setKeyManagement(String str) {
        this.keyManagement = str;
    }

    public void setLastUpdatedDateUtcMillis(long j) {
        this.lastUpdatedDateUtcMillis = j;
    }

    public void setNetworkState(String str) {
        this.networkState = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setWpaPskType(String str) {
        this.wpaPskType = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSsid(getSsid());
        builder.withKeyManagement(getKeyManagement());
        builder.withWpaPskType(getWpaPskType());
        builder.withNetworkState(getNetworkState());
        builder.withLastUpdatedDateUtcMillis(getLastUpdatedDateUtcMillis());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiNetworkInfo(ssid=*** REDACTED ***, keyManagement=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.keyManagement, ", wpaPskType=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.wpaPskType, ", networkState=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.networkState, ", lastUpdatedDateUtcMillis=", sb);
        sb.append(String.valueOf(this.lastUpdatedDateUtcMillis));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
