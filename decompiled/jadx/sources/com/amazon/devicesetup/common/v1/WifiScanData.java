package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
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
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiScanData")
@Documentation("Wi-Fi scan data structure for \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiScanData {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.WifiScanData");
    private String bssid;
    private int frequency;
    private int rssi;
    private String securityProtocol;
    private String ssid;
    private String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String bssid;
        protected int frequency;
        protected int rssi;
        protected String securityProtocol;
        protected String ssid;
        protected String wpaPskType;

        public WifiScanData build() {
            WifiScanData wifiScanData = new WifiScanData();
            populate(wifiScanData);
            return wifiScanData;
        }

        public void populate(WifiScanData wifiScanData) {
            wifiScanData.setSsid(this.ssid);
            wifiScanData.setBssid(this.bssid);
            wifiScanData.setSecurityProtocol(this.securityProtocol);
            wifiScanData.setWpaPskType(this.wpaPskType);
            wifiScanData.setRssi(this.rssi);
            wifiScanData.setFrequency(this.frequency);
        }

        public Builder withBssid(String str) {
            this.bssid = str;
            return this;
        }

        public Builder withFrequency(int i) {
            this.frequency = i;
            return this;
        }

        public Builder withRssi(int i) {
            this.rssi = i;
            return this;
        }

        public Builder withSecurityProtocol(String str) {
            this.securityProtocol = str;
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
        if (!(obj instanceof WifiScanData)) {
            return false;
        }
        WifiScanData wifiScanData = (WifiScanData) obj;
        return Objects.equals(getSsid(), wifiScanData.getSsid()) && Objects.equals(getBssid(), wifiScanData.getBssid()) && Objects.equals(getSecurityProtocol(), wifiScanData.getSecurityProtocol()) && Objects.equals(getWpaPskType(), wifiScanData.getWpaPskType()) && Integer.valueOf(getRssi()).equals(Integer.valueOf(wifiScanData.getRssi())) && Integer.valueOf(getFrequency()).equals(Integer.valueOf(wifiScanData.getFrequency()));
    }

    @Documentation("Wi-Fi binary SSID.")
    @Pattern("([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}")
    public String getBssid() {
        return this.bssid;
    }

    @Documentation("Frequency range in MHz.\n        Currently not used by device setup service.\n        <!--TODO: https://sim.amazon.com/issues/FFS-3097-->")
    public int getFrequency() {
        return this.frequency;
    }

    public int getRssi() {
        return this.rssi;
    }

    @EnumValues({SecurityProtocol.WPA_PSK, "WEP", "OPEN", "OTHER"})
    @Documentation("Wi-Fi security protocol.")
    public String getSecurityProtocol() {
        return this.securityProtocol;
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
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getBssid(), getSecurityProtocol(), getWpaPskType(), Integer.valueOf(getRssi()), Integer.valueOf(getFrequency()));
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setSecurityProtocol(String str) {
        this.securityProtocol = str;
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
        builder.withBssid(getBssid());
        builder.withSecurityProtocol(getSecurityProtocol());
        builder.withWpaPskType(getWpaPskType());
        builder.withRssi(getRssi());
        builder.withFrequency(getFrequency());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiScanData(ssid=*** REDACTED ***, bssid=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.bssid, ", securityProtocol=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.securityProtocol, ", wpaPskType=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.wpaPskType, ", rssi=", sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", frequency=", this.rssi, sb);
        sb.append(String.valueOf(this.frequency));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
