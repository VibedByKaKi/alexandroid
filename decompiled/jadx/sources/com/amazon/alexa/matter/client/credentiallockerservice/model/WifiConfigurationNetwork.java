package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class WifiConfigurationNetwork {
    private final String bssid;
    private final CredentialConfiguration credentialConfiguration;
    private final int frequency;
    private final int priority;
    private final String securityType;
    private final String ssid;
    private final List<String> tags;
    private final String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class WifiConfigurationNetworkBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String bssid;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private CredentialConfiguration credentialConfiguration;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int frequency;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int priority;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String securityType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String ssid;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<String> tags;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String wpaPskType;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder bssid(String str) {
            this.bssid = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetwork build() {
            return new WifiConfigurationNetwork(this.wpaPskType, this.frequency, this.tags, this.securityType, this.priority, this.ssid, this.credentialConfiguration, this.bssid);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder credentialConfiguration(CredentialConfiguration credentialConfiguration) {
            this.credentialConfiguration = credentialConfiguration;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder frequency(int i) {
            this.frequency = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder priority(int i) {
            this.priority = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder securityType(String str) {
            this.securityType = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder ssid(String str) {
            this.ssid = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("WifiConfigurationNetwork.WifiConfigurationNetworkBuilder(wpaPskType=");
            sb.append(this.wpaPskType);
            sb.append(", frequency=");
            sb.append(this.frequency);
            sb.append(", tags=");
            sb.append(this.tags);
            sb.append(", securityType=");
            sb.append(this.securityType);
            sb.append(", priority=");
            sb.append(this.priority);
            sb.append(", ssid=");
            sb.append(this.ssid);
            sb.append(", credentialConfiguration=");
            sb.append(this.credentialConfiguration);
            sb.append(", bssid=");
            return a$$ExternalSyntheticOutline0.m(sb, this.bssid, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiConfigurationNetworkBuilder wpaPskType(String str) {
            this.wpaPskType = str;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private WifiConfigurationNetwork() {
        this.wpaPskType = null;
        this.frequency = 0;
        this.tags = null;
        this.securityType = null;
        this.priority = 0;
        this.ssid = null;
        this.credentialConfiguration = null;
        this.bssid = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static WifiConfigurationNetworkBuilder builder() {
        return new WifiConfigurationNetworkBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiConfigurationNetwork)) {
            return false;
        }
        WifiConfigurationNetwork wifiConfigurationNetwork = (WifiConfigurationNetwork) obj;
        if (getFrequency() != wifiConfigurationNetwork.getFrequency() || getPriority() != wifiConfigurationNetwork.getPriority()) {
            return false;
        }
        String wpaPskType = getWpaPskType();
        String wpaPskType2 = wifiConfigurationNetwork.getWpaPskType();
        if (wpaPskType != null ? !wpaPskType.equals(wpaPskType2) : wpaPskType2 != null) {
            return false;
        }
        List<String> tags = getTags();
        List<String> tags2 = wifiConfigurationNetwork.getTags();
        if (tags != null ? !tags.equals(tags2) : tags2 != null) {
            return false;
        }
        String securityType = getSecurityType();
        String securityType2 = wifiConfigurationNetwork.getSecurityType();
        if (securityType != null ? !securityType.equals(securityType2) : securityType2 != null) {
            return false;
        }
        String ssid = getSsid();
        String ssid2 = wifiConfigurationNetwork.getSsid();
        if (ssid != null ? !ssid.equals(ssid2) : ssid2 != null) {
            return false;
        }
        CredentialConfiguration credentialConfiguration = getCredentialConfiguration();
        CredentialConfiguration credentialConfiguration2 = wifiConfigurationNetwork.getCredentialConfiguration();
        if (credentialConfiguration != null ? !credentialConfiguration.equals(credentialConfiguration2) : credentialConfiguration2 != null) {
            return false;
        }
        String bssid = getBssid();
        String bssid2 = wifiConfigurationNetwork.getBssid();
        return bssid != null ? bssid.equals(bssid2) : bssid2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getBssid() {
        return this.bssid;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getFrequency() {
        return this.frequency;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getPriority() {
        return this.priority;
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
    public List<String> getTags() {
        return this.tags;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getWpaPskType() {
        return this.wpaPskType;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int priority = getPriority() + ((getFrequency() + 59) * 59);
        String wpaPskType = getWpaPskType();
        int hashCode = (priority * 59) + (wpaPskType == null ? 43 : wpaPskType.hashCode());
        List<String> tags = getTags();
        int hashCode2 = (hashCode * 59) + (tags == null ? 43 : tags.hashCode());
        String securityType = getSecurityType();
        int hashCode3 = (hashCode2 * 59) + (securityType == null ? 43 : securityType.hashCode());
        String ssid = getSsid();
        int hashCode4 = (hashCode3 * 59) + (ssid == null ? 43 : ssid.hashCode());
        CredentialConfiguration credentialConfiguration = getCredentialConfiguration();
        int i = hashCode4 * 59;
        int hashCode5 = credentialConfiguration == null ? 43 : credentialConfiguration.hashCode();
        String bssid = getBssid();
        return ((i + hashCode5) * 59) + (bssid != null ? bssid.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WifiConfigurationNetwork(wpaPskType=" + getWpaPskType() + ", frequency=" + getFrequency() + ", tags=" + getTags() + ", securityType=" + getSecurityType() + ", priority=" + getPriority() + ", ssid=" + getSsid() + ", credentialConfiguration=" + getCredentialConfiguration() + ", bssid=" + getBssid() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withBssid(String str) {
        return this.bssid == str ? this : new WifiConfigurationNetwork(this.wpaPskType, this.frequency, this.tags, this.securityType, this.priority, this.ssid, this.credentialConfiguration, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        return this.credentialConfiguration == credentialConfiguration ? this : new WifiConfigurationNetwork(this.wpaPskType, this.frequency, this.tags, this.securityType, this.priority, this.ssid, credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withFrequency(int i) {
        return this.frequency == i ? this : new WifiConfigurationNetwork(this.wpaPskType, i, this.tags, this.securityType, this.priority, this.ssid, this.credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withPriority(int i) {
        return this.priority == i ? this : new WifiConfigurationNetwork(this.wpaPskType, this.frequency, this.tags, this.securityType, i, this.ssid, this.credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withSecurityType(String str) {
        return this.securityType == str ? this : new WifiConfigurationNetwork(this.wpaPskType, this.frequency, this.tags, str, this.priority, this.ssid, this.credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withSsid(String str) {
        return this.ssid == str ? this : new WifiConfigurationNetwork(this.wpaPskType, this.frequency, this.tags, this.securityType, this.priority, str, this.credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withTags(List<String> list) {
        return this.tags == list ? this : new WifiConfigurationNetwork(this.wpaPskType, this.frequency, list, this.securityType, this.priority, this.ssid, this.credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork withWpaPskType(String str) {
        return this.wpaPskType == str ? this : new WifiConfigurationNetwork(str, this.frequency, this.tags, this.securityType, this.priority, this.ssid, this.credentialConfiguration, this.bssid);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork(String str, int i, List<String> list, String str2, int i2, String str3, CredentialConfiguration credentialConfiguration, String str4) {
        this.wpaPskType = str;
        this.frequency = i;
        this.tags = list;
        this.securityType = str2;
        this.priority = i2;
        this.ssid = str3;
        this.credentialConfiguration = credentialConfiguration;
        this.bssid = str4;
    }
}
