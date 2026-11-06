package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiNetworkScanResult")
@Documentation("A unique idenfifer for a Wifi network composed of ssid, key management, wpa psk type and\n        bssid.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiNetworkScanResult {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiNetworkScanResult");
    private String bssid;
    private Long rssi;
    private String securityType;
    private String ssid;
    private String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String bssid;
        protected Long rssi;
        protected String securityType;
        protected String ssid;
        protected String wpaPskType;

        public WifiNetworkScanResult build() {
            WifiNetworkScanResult wifiNetworkScanResult = new WifiNetworkScanResult();
            populate(wifiNetworkScanResult);
            return wifiNetworkScanResult;
        }

        public void populate(WifiNetworkScanResult wifiNetworkScanResult) {
            wifiNetworkScanResult.setSsid(this.ssid);
            wifiNetworkScanResult.setSecurityType(this.securityType);
            wifiNetworkScanResult.setWpaPskType(this.wpaPskType);
            wifiNetworkScanResult.setBssid(this.bssid);
            wifiNetworkScanResult.setRssi(this.rssi);
        }

        public Builder withBssid(String str) {
            this.bssid = str;
            return this;
        }

        public Builder withRssi(Long l) {
            this.rssi = l;
            return this;
        }

        public Builder withSecurityType(String str) {
            this.securityType = str;
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
        if (!(obj instanceof WifiNetworkScanResult)) {
            return false;
        }
        WifiNetworkScanResult wifiNetworkScanResult = (WifiNetworkScanResult) obj;
        return Objects.equals(getSsid(), wifiNetworkScanResult.getSsid()) && Objects.equals(getSecurityType(), wifiNetworkScanResult.getSecurityType()) && Objects.equals(getWpaPskType(), wifiNetworkScanResult.getWpaPskType()) && Objects.equals(getBssid(), wifiNetworkScanResult.getBssid()) && Objects.equals(getRssi(), wifiNetworkScanResult.getRssi());
    }

    @Sensitive
    public String getBssid() {
        return this.bssid;
    }

    public Long getRssi() {
        return this.rssi;
    }

    @EnumValues({"OPEN", "WEP", "WPAPSK", "WPA2_EAP"})
    @Required
    @Documentation("Type of wifi network security (e.g. wep, wpa, open, etc.)")
    public String getSecurityType() {
        return this.securityType;
    }

    @Required
    @Sensitive
    public String getSsid() {
        return this.ssid;
    }

    @EnumValues({"WPA3_ONLY", "WPA3_TRANSITION", "WPA2"})
    @Documentation("Type of wpa psk network (wpa2, wpa3 transition, or wpa3 only). Null for non wpa psk networks.")
    public String getWpaPskType() {
        return this.wpaPskType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getSecurityType(), getWpaPskType(), getBssid(), getRssi());
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setRssi(Long l) {
        this.rssi = l;
    }

    public void setSecurityType(String str) {
        this.securityType = str;
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
        builder.withSecurityType(getSecurityType());
        builder.withWpaPskType(getWpaPskType());
        builder.withBssid(getBssid());
        builder.withRssi(getRssi());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiNetworkScanResult(ssid=*** REDACTED ***, securityType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.securityType, ", wpaPskType=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.wpaPskType, ", bssid=*** REDACTED ***, rssi=", sb);
        sb.append(String.valueOf(this.rssi));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
