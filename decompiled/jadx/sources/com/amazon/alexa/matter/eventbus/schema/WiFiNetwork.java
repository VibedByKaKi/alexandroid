package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WiFiNetwork {
    private String bssid;
    private Long channel;
    private WiFiNetworkFrequencyBand frequencyBand;
    private Long rssi;
    private WiFiNetworkSecurityType securityType;
    private String ssid;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WiFiNetwork() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof WiFiNetwork;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WiFiNetwork)) {
            return false;
        }
        WiFiNetwork wiFiNetwork = (WiFiNetwork) obj;
        if (!wiFiNetwork.canEqual(this)) {
            return false;
        }
        Long channel = getChannel();
        Long channel2 = wiFiNetwork.getChannel();
        if (channel != null ? !channel.equals(channel2) : channel2 != null) {
            return false;
        }
        Long rssi = getRssi();
        Long rssi2 = wiFiNetwork.getRssi();
        if (rssi != null ? !rssi.equals(rssi2) : rssi2 != null) {
            return false;
        }
        String bssid = getBssid();
        String bssid2 = wiFiNetwork.getBssid();
        if (bssid != null ? !bssid.equals(bssid2) : bssid2 != null) {
            return false;
        }
        WiFiNetworkFrequencyBand frequencyBand = getFrequencyBand();
        WiFiNetworkFrequencyBand frequencyBand2 = wiFiNetwork.getFrequencyBand();
        if (frequencyBand != null ? !frequencyBand.equals(frequencyBand2) : frequencyBand2 != null) {
            return false;
        }
        WiFiNetworkSecurityType securityType = getSecurityType();
        WiFiNetworkSecurityType securityType2 = wiFiNetwork.getSecurityType();
        if (securityType != null ? !securityType.equals(securityType2) : securityType2 != null) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wiFiNetwork.getSsid();
        return ssid != null ? ssid.equals(ssid2) : ssid2 == null;
    }

    @JsonProperty("bssid")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getBssid() {
        return this.bssid;
    }

    @JsonProperty("channel")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getChannel() {
        return this.channel;
    }

    @JsonProperty("frequencyBand")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WiFiNetworkFrequencyBand getFrequencyBand() {
        return this.frequencyBand;
    }

    @JsonProperty("rssi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getRssi() {
        return this.rssi;
    }

    @JsonProperty("securityType")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WiFiNetworkSecurityType getSecurityType() {
        return this.securityType;
    }

    @JsonProperty("ssid")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSsid() {
        return this.ssid;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Long channel = getChannel();
        int hashCode = channel == null ? 43 : channel.hashCode();
        Long rssi = getRssi();
        int hashCode2 = ((hashCode + 59) * 59) + (rssi == null ? 43 : rssi.hashCode());
        String bssid = getBssid();
        int hashCode3 = (hashCode2 * 59) + (bssid == null ? 43 : bssid.hashCode());
        WiFiNetworkFrequencyBand frequencyBand = getFrequencyBand();
        int hashCode4 = (hashCode3 * 59) + (frequencyBand == null ? 43 : frequencyBand.hashCode());
        WiFiNetworkSecurityType securityType = getSecurityType();
        int i = hashCode4 * 59;
        int hashCode5 = securityType == null ? 43 : securityType.hashCode();
        String ssid = getSsid();
        return ((i + hashCode5) * 59) + (ssid != null ? ssid.hashCode() : 43);
    }

    @JsonProperty("bssid")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setBssid(String str) {
        this.bssid = str;
    }

    @JsonProperty("channel")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setChannel(Long l) {
        this.channel = l;
    }

    @JsonProperty("frequencyBand")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setFrequencyBand(WiFiNetworkFrequencyBand wiFiNetworkFrequencyBand) {
        this.frequencyBand = wiFiNetworkFrequencyBand;
    }

    @JsonProperty("rssi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRssi(Long l) {
        this.rssi = l;
    }

    @JsonProperty("securityType")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSecurityType(WiFiNetworkSecurityType wiFiNetworkSecurityType) {
        this.securityType = wiFiNetworkSecurityType;
    }

    @JsonProperty("ssid")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSsid(String str) {
        this.ssid = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WiFiNetwork(bssid=" + getBssid() + ", channel=" + getChannel() + ", frequencyBand=" + getFrequencyBand() + ", rssi=" + getRssi() + ", securityType=" + getSecurityType() + ", ssid=" + getSsid() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
