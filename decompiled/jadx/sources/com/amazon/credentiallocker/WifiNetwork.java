package com.amazon.credentiallocker;

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
@XmlName("WifiNetwork")
@Documentation("ssid - wifi name - SSID is simply the technical term for a network name.\n        When you set up a wireless home network, you give it a name to distinguish it from other networks in your neighbourhood.\n        You'll see this name when you connect your computer to your wireless network.\n        bssid - The BSSID is a 48bit identity used to identify a particular BSS (Basic Service Set) within an area.\n        In Infrastructure BSS networks, the BSSID is the MAC (Medium Access Control) address of the AP (Access Point) and in Independent BSS or ad hoc networks, the BSSID is generated randomly.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiNetwork {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiNetwork");
    private String bssid;
    private String keyManagement;
    private String ssid;
    private String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String bssid;
        protected String keyManagement;
        protected String ssid;
        protected String wpaPskType;

        public WifiNetwork build() {
            WifiNetwork wifiNetwork = new WifiNetwork();
            populate(wifiNetwork);
            return wifiNetwork;
        }

        public void populate(WifiNetwork wifiNetwork) {
            wifiNetwork.setSsid(this.ssid);
            wifiNetwork.setKeyManagement(this.keyManagement);
            wifiNetwork.setWpaPskType(this.wpaPskType);
            wifiNetwork.setBssid(this.bssid);
        }

        public Builder withBssid(String str) {
            this.bssid = str;
            return this;
        }

        public Builder withKeyManagement(String str) {
            this.keyManagement = str;
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
        if (!(obj instanceof WifiNetwork)) {
            return false;
        }
        WifiNetwork wifiNetwork = (WifiNetwork) obj;
        return Objects.equals(getSsid(), wifiNetwork.getSsid()) && Objects.equals(getKeyManagement(), wifiNetwork.getKeyManagement()) && Objects.equals(getWpaPskType(), wifiNetwork.getWpaPskType()) && Objects.equals(getBssid(), wifiNetwork.getBssid());
    }

    @Sensitive
    public String getBssid() {
        return this.bssid;
    }

    @EnumValues({"NONE", "WPAPSK", "WPA2_EAP"})
    @Required
    @Documentation("Type of wifi network wpa, wep, guest, etc. You can select WPAPSK for wpa and NONE for any other network.")
    public String getKeyManagement() {
        return this.keyManagement;
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
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getKeyManagement(), getWpaPskType(), getBssid());
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setKeyManagement(String str) {
        this.keyManagement = str;
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
        builder.withBssid(getBssid());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiNetwork(ssid=*** REDACTED ***, keyManagement=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.keyManagement, ", wpaPskType=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.wpaPskType, ", bssid=*** REDACTED ***)", sb);
    }
}
