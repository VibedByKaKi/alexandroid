package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class WifiNetwork {
    private final String bssid;
    private final Integer channel;
    private final String frequencyBand;
    private final Integer rssi;
    private final String securityType;
    private final String ssid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class WifiNetworkBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String bssid;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer channel;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String frequencyBand;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer rssi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String securityType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String ssid;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder bssid(String str) {
            this.bssid = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetwork build() {
            return new WifiNetwork(this.ssid, this.bssid, this.rssi, this.frequencyBand, this.securityType, this.channel);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder channel(Integer num) {
            this.channel = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder frequencyBand(String str) {
            this.frequencyBand = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder rssi(Integer num) {
            this.rssi = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder securityType(String str) {
            this.securityType = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkBuilder ssid(String str) {
            this.ssid = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("WifiNetwork.WifiNetworkBuilder(ssid=");
            sb.append(this.ssid);
            sb.append(", bssid=");
            sb.append(this.bssid);
            sb.append(", rssi=");
            sb.append(this.rssi);
            sb.append(", frequencyBand=");
            sb.append(this.frequencyBand);
            sb.append(", securityType=");
            sb.append(this.securityType);
            sb.append(", channel=");
            return Automotive$$ExternalSyntheticOutline0.m(sb, this.channel, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private WifiNetwork() {
        this.ssid = null;
        this.bssid = null;
        this.rssi = null;
        this.frequencyBand = null;
        this.securityType = null;
        this.channel = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static WifiNetworkBuilder builder() {
        return new WifiNetworkBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiNetwork)) {
            return false;
        }
        WifiNetwork wifiNetwork = (WifiNetwork) obj;
        Integer rssi = getRssi();
        Integer rssi2 = wifiNetwork.getRssi();
        if (rssi != null ? !rssi.equals(rssi2) : rssi2 != null) {
            return false;
        }
        Integer channel = getChannel();
        Integer channel2 = wifiNetwork.getChannel();
        if (channel != null ? !channel.equals(channel2) : channel2 != null) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiNetwork.getSsid();
        if (ssid != null ? !ssid.equals(ssid2) : ssid2 != null) {
            return false;
        }
        String bssid = getBssid();
        String bssid2 = wifiNetwork.getBssid();
        if (bssid != null ? !bssid.equals(bssid2) : bssid2 != null) {
            return false;
        }
        String frequencyBand = getFrequencyBand();
        String frequencyBand2 = wifiNetwork.getFrequencyBand();
        if (frequencyBand != null ? !frequencyBand.equals(frequencyBand2) : frequencyBand2 != null) {
            return false;
        }
        String securityType = getSecurityType();
        String securityType2 = wifiNetwork.getSecurityType();
        return securityType != null ? securityType.equals(securityType2) : securityType2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getBssid() {
        return this.bssid;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getChannel() {
        return this.channel;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getFrequencyBand() {
        return this.frequencyBand;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getRssi() {
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
    public int hashCode() {
        Integer rssi = getRssi();
        int hashCode = rssi == null ? 43 : rssi.hashCode();
        Integer channel = getChannel();
        int hashCode2 = ((hashCode + 59) * 59) + (channel == null ? 43 : channel.hashCode());
        String ssid = getSsid();
        int hashCode3 = (hashCode2 * 59) + (ssid == null ? 43 : ssid.hashCode());
        String bssid = getBssid();
        int hashCode4 = (hashCode3 * 59) + (bssid == null ? 43 : bssid.hashCode());
        String frequencyBand = getFrequencyBand();
        int i = hashCode4 * 59;
        int hashCode5 = frequencyBand == null ? 43 : frequencyBand.hashCode();
        String securityType = getSecurityType();
        return ((i + hashCode5) * 59) + (securityType != null ? securityType.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WifiNetwork(ssid=" + getSsid() + ", bssid=" + getBssid() + ", rssi=" + getRssi() + ", frequencyBand=" + getFrequencyBand() + ", securityType=" + getSecurityType() + ", channel=" + getChannel() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork withBssid(String str) {
        return this.bssid == str ? this : new WifiNetwork(this.ssid, str, this.rssi, this.frequencyBand, this.securityType, this.channel);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork withChannel(Integer num) {
        return this.channel == num ? this : new WifiNetwork(this.ssid, this.bssid, this.rssi, this.frequencyBand, this.securityType, num);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork withFrequencyBand(String str) {
        return this.frequencyBand == str ? this : new WifiNetwork(this.ssid, this.bssid, this.rssi, str, this.securityType, this.channel);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork withRssi(Integer num) {
        return this.rssi == num ? this : new WifiNetwork(this.ssid, this.bssid, num, this.frequencyBand, this.securityType, this.channel);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork withSecurityType(String str) {
        return this.securityType == str ? this : new WifiNetwork(this.ssid, this.bssid, this.rssi, this.frequencyBand, str, this.channel);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork withSsid(String str) {
        return this.ssid == str ? this : new WifiNetwork(str, this.bssid, this.rssi, this.frequencyBand, this.securityType, this.channel);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetwork(String str, String str2, Integer num, String str3, String str4, Integer num2) {
        this.ssid = str;
        this.bssid = str2;
        this.rssi = num;
        this.frequencyBand = str3;
        this.securityType = str4;
        this.channel = num2;
    }
}
