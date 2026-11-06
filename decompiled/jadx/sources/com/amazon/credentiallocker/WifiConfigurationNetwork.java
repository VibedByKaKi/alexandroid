package com.amazon.credentiallocker;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.MaxValue;
import com.amazon.coral.annotation.MinValue;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiConfigurationNetwork")
@Documentation("Wifi network structure containing credentials and other operational parameters.\n        Created to avoid inheritance using faux tagged unions with the intention of moving to Smithy.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiConfigurationNetwork {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiConfigurationNetwork");
    private Boolean autoJoin;
    private String bssid;
    private CredentialConfiguration credentialConfiguration;
    private int frequency;
    private int priority;
    private String securityType;
    private String ssid;
    private List<String> tags;
    private String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Boolean autoJoin;
        protected String bssid;
        protected CredentialConfiguration credentialConfiguration;
        protected int frequency;
        protected int priority;
        protected String securityType;
        protected String ssid;
        protected List<String> tags;
        protected String wpaPskType;

        public WifiConfigurationNetwork build() {
            WifiConfigurationNetwork wifiConfigurationNetwork = new WifiConfigurationNetwork();
            populate(wifiConfigurationNetwork);
            return wifiConfigurationNetwork;
        }

        public void populate(WifiConfigurationNetwork wifiConfigurationNetwork) {
            wifiConfigurationNetwork.setSsid(this.ssid);
            wifiConfigurationNetwork.setSecurityType(this.securityType);
            wifiConfigurationNetwork.setWpaPskType(this.wpaPskType);
            wifiConfigurationNetwork.setBssid(this.bssid);
            wifiConfigurationNetwork.setPriority(this.priority);
            wifiConfigurationNetwork.setAutoJoin(this.autoJoin);
            wifiConfigurationNetwork.setFrequency(this.frequency);
            wifiConfigurationNetwork.setCredentialConfiguration(this.credentialConfiguration);
            wifiConfigurationNetwork.setTags(this.tags);
        }

        public Builder withAutoJoin(Boolean bool) {
            this.autoJoin = bool;
            return this;
        }

        public Builder withBssid(String str) {
            this.bssid = str;
            return this;
        }

        public Builder withCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
            this.credentialConfiguration = credentialConfiguration;
            return this;
        }

        public Builder withFrequency(int i) {
            this.frequency = i;
            return this;
        }

        public Builder withPriority(int i) {
            this.priority = i;
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

        public Builder withTags(List<String> list) {
            this.tags = list;
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
        if (!(obj instanceof WifiConfigurationNetwork)) {
            return false;
        }
        WifiConfigurationNetwork wifiConfigurationNetwork = (WifiConfigurationNetwork) obj;
        return Objects.equals(getSsid(), wifiConfigurationNetwork.getSsid()) && Objects.equals(getSecurityType(), wifiConfigurationNetwork.getSecurityType()) && Objects.equals(getWpaPskType(), wifiConfigurationNetwork.getWpaPskType()) && Objects.equals(getBssid(), wifiConfigurationNetwork.getBssid()) && Integer.valueOf(getPriority()).equals(Integer.valueOf(wifiConfigurationNetwork.getPriority())) && Objects.equals(isAutoJoin(), wifiConfigurationNetwork.isAutoJoin()) && Integer.valueOf(getFrequency()).equals(Integer.valueOf(wifiConfigurationNetwork.getFrequency())) && Objects.equals(getCredentialConfiguration(), wifiConfigurationNetwork.getCredentialConfiguration()) && Objects.equals(getTags(), wifiConfigurationNetwork.getTags());
    }

    @Sensitive
    public String getBssid() {
        return this.bssid;
    }

    @Documentation("privateSharedKey - wifi password for wpa and other network, \"null\" for wep, guest.\n        authenticationMethod - Authentication method for WPA2-Enterprise networks (currently only EAP-TLS is supported)\n        certificateAuthority -\n        authenticationServerCertificates - List of certificates used to identify a trusted network on a supplicant.")
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    @MaxValue("6000")
    @Documentation("Common frequencies that are used for wifi communication are 2.4Ghz (giga hertz per second) and 5Ghz.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public int getFrequency() {
        return this.frequency;
    }

    @Documentation("It is used to prioritize the wifi network.\n        For example if two wifi networks are available then which one should connect.\n        Priority can be 1, 2, 3, etc.")
    public int getPriority() {
        return this.priority;
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

    @ListMemberConstraint(@NestedConstraints(enumValues = {@EnumValues({NetworkTag.Public, NetworkTag.Internal, NetworkTag.Pseudo})}))
    public List<String> getTags() {
        return this.tags;
    }

    @EnumValues({"WPA3_ONLY", "WPA3_TRANSITION", "WPA2"})
    @Documentation("Type of wpa psk network (wpa2, wpa3 transition, or wpa3 only). Null for non wpa psk networks.")
    public String getWpaPskType() {
        return this.wpaPskType;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getSecurityType(), getWpaPskType(), getBssid(), Integer.valueOf(getPriority()), isAutoJoin(), Integer.valueOf(getFrequency()), getCredentialConfiguration(), getTags());
    }

    @Documentation("Automatically connect eligible distressed devices to this network.")
    public Boolean isAutoJoin() {
        return this.autoJoin;
    }

    public void setAutoJoin(Boolean bool) {
        this.autoJoin = bool;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public void setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setSecurityType(String str) {
        this.securityType = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
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
        builder.withPriority(getPriority());
        builder.withAutoJoin(isAutoJoin());
        builder.withFrequency(getFrequency());
        builder.withCredentialConfiguration(getCredentialConfiguration());
        builder.withTags(getTags());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiConfigurationNetwork(ssid=*** REDACTED ***, securityType=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.securityType, ", wpaPskType=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.wpaPskType, ", bssid=*** REDACTED ***, priority=", sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", autoJoin=", this.priority, sb);
        sb.append(String.valueOf(this.autoJoin));
        sb.append(", frequency=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", credentialConfiguration=", this.frequency, sb);
        sb.append(String.valueOf(this.credentialConfiguration));
        sb.append(", tags=");
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.tags, sb);
    }
}
