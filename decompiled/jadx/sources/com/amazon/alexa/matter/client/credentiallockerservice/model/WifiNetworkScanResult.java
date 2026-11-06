package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class WifiNetworkScanResult {
    private final String bssid;
    private final Long rssi;
    private final String securityType;
    private final String ssid;
    private final String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class WifiNetworkScanResultBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String bssid;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Long rssi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String securityType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String ssid;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String wpaPskType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResultBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResultBuilder bssid(String str) {
            this.bssid = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResult build() {
            return new WifiNetworkScanResult(this.wpaPskType, this.securityType, this.rssi, this.bssid, this.ssid);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResultBuilder rssi(Long l) {
            this.rssi = l;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResultBuilder securityType(String str) {
            this.securityType = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResultBuilder ssid(String str) {
            this.ssid = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("WifiNetworkScanResult.WifiNetworkScanResultBuilder(wpaPskType=");
            sb.append(this.wpaPskType);
            sb.append(", securityType=");
            sb.append(this.securityType);
            sb.append(", rssi=");
            sb.append(this.rssi);
            sb.append(", bssid=");
            sb.append(this.bssid);
            sb.append(", ssid=");
            return a$$ExternalSyntheticOutline0.m(sb, this.ssid, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkScanResultBuilder wpaPskType(String str) {
            this.wpaPskType = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private WifiNetworkScanResult() {
        this.wpaPskType = null;
        this.securityType = null;
        this.rssi = null;
        this.bssid = null;
        this.ssid = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static WifiNetworkScanResultBuilder builder() {
        return new WifiNetworkScanResultBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiNetworkScanResult)) {
            return false;
        }
        WifiNetworkScanResult wifiNetworkScanResult = (WifiNetworkScanResult) obj;
        Long rssi = getRssi();
        Long rssi2 = wifiNetworkScanResult.getRssi();
        if (rssi != null ? !rssi.equals(rssi2) : rssi2 != null) {
            return false;
        }
        String wpaPskType = getWpaPskType();
        String wpaPskType2 = wifiNetworkScanResult.getWpaPskType();
        if (wpaPskType != null ? !wpaPskType.equals(wpaPskType2) : wpaPskType2 != null) {
            return false;
        }
        String securityType = getSecurityType();
        String securityType2 = wifiNetworkScanResult.getSecurityType();
        if (securityType != null ? !securityType.equals(securityType2) : securityType2 != null) {
            return false;
        }
        String bssid = getBssid();
        String bssid2 = wifiNetworkScanResult.getBssid();
        if (bssid != null ? !bssid.equals(bssid2) : bssid2 != null) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiNetworkScanResult.getSsid();
        return ssid != null ? ssid.equals(ssid2) : ssid2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getBssid() {
        return this.bssid;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getRssi() {
        return this.rssi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSecurityType() {
        return this.securityType;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSsid() {
        return this.ssid;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getWpaPskType() {
        return this.wpaPskType;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Long rssi = getRssi();
        int hashCode = rssi == null ? 43 : rssi.hashCode();
        String wpaPskType = getWpaPskType();
        int hashCode2 = ((hashCode + 59) * 59) + (wpaPskType == null ? 43 : wpaPskType.hashCode());
        String securityType = getSecurityType();
        int hashCode3 = (hashCode2 * 59) + (securityType == null ? 43 : securityType.hashCode());
        String bssid = getBssid();
        int i = hashCode3 * 59;
        int hashCode4 = bssid == null ? 43 : bssid.hashCode();
        String ssid = getSsid();
        return ((i + hashCode4) * 59) + (ssid != null ? ssid.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WifiNetworkScanResult(wpaPskType=" + getWpaPskType() + ", securityType=" + getSecurityType() + ", rssi=" + getRssi() + ", bssid=" + getBssid() + ", ssid=" + getSsid() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult withBssid(String str) {
        return this.bssid == str ? this : new WifiNetworkScanResult(this.wpaPskType, this.securityType, this.rssi, str, this.ssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult withRssi(Long l) {
        return this.rssi == l ? this : new WifiNetworkScanResult(this.wpaPskType, this.securityType, l, this.bssid, this.ssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult withSecurityType(String str) {
        return this.securityType == str ? this : new WifiNetworkScanResult(this.wpaPskType, str, this.rssi, this.bssid, this.ssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult withSsid(String str) {
        return this.ssid == str ? this : new WifiNetworkScanResult(this.wpaPskType, this.securityType, this.rssi, this.bssid, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult withWpaPskType(String str) {
        return this.wpaPskType == str ? this : new WifiNetworkScanResult(str, this.securityType, this.rssi, this.bssid, this.ssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult(String str, String str2, Long l, String str3, String str4) {
        this.wpaPskType = str;
        this.securityType = str2;
        this.rssi = l;
        this.bssid = str3;
        this.ssid = str4;
    }
}
