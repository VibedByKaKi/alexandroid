package com.amazon.devicesetup.common.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
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
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetup.common.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiCredentials")
@Documentation("Wi-Fi credentials data structure for \"get Wi-Fi credentials\" API.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiCredentials {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetup.common.v1.WifiCredentials");
    private int frequency;
    private String key;
    private int keyIndex;
    private int priority;
    private String securityProtocol;
    private String ssid;
    private String wpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected int frequency;
        protected String key;
        protected int keyIndex;
        protected int priority;
        protected String securityProtocol;
        protected String ssid;
        protected String wpaPskType;

        public WifiCredentials build() {
            WifiCredentials wifiCredentials = new WifiCredentials();
            populate(wifiCredentials);
            return wifiCredentials;
        }

        public void populate(WifiCredentials wifiCredentials) {
            wifiCredentials.setSsid(this.ssid);
            wifiCredentials.setSecurityProtocol(this.securityProtocol);
            wifiCredentials.setWpaPskType(this.wpaPskType);
            wifiCredentials.setKey(this.key);
            wifiCredentials.setKeyIndex(this.keyIndex);
            wifiCredentials.setPriority(this.priority);
            wifiCredentials.setFrequency(this.frequency);
        }

        public Builder withFrequency(int i) {
            this.frequency = i;
            return this;
        }

        public Builder withKey(String str) {
            this.key = str;
            return this;
        }

        public Builder withKeyIndex(int i) {
            this.keyIndex = i;
            return this;
        }

        public Builder withPriority(int i) {
            this.priority = i;
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
        if (!(obj instanceof WifiCredentials)) {
            return false;
        }
        WifiCredentials wifiCredentials = (WifiCredentials) obj;
        return Objects.equals(getSsid(), wifiCredentials.getSsid()) && Objects.equals(getSecurityProtocol(), wifiCredentials.getSecurityProtocol()) && Objects.equals(getWpaPskType(), wifiCredentials.getWpaPskType()) && Objects.equals(getKey(), wifiCredentials.getKey()) && Integer.valueOf(getKeyIndex()).equals(Integer.valueOf(wifiCredentials.getKeyIndex())) && Integer.valueOf(getPriority()).equals(Integer.valueOf(wifiCredentials.getPriority())) && Integer.valueOf(getFrequency()).equals(Integer.valueOf(wifiCredentials.getFrequency()));
    }

    @Documentation("Frequency range in MHz.\n        Currently not used by device setup service.\n        <!--TODO: https://sim.amazon.com/issues/FFS-3097-->")
    public int getFrequency() {
        return this.frequency;
    }

    @Required
    @Documentation("Private PSKs are unique pre-shared keys created for individuals or\n        groups of users on the same SSID and used for WPA or WPA2 passphrase.")
    @Sensitive
    public String getKey() {
        return this.key;
    }

    @Documentation("An access point (wireless router) can be configured with as many as four\n        WEP keys. Only one key is used on the network at a time, however. The\n        keys are numbered, and the number of a key is referred to as its key\n        index.")
    public int getKeyIndex() {
        return this.keyIndex;
    }

    @Documentation("Set the priority of the network to a Low number if you would prefer that\n        other networks traffic take priority. For example, if you want to\n        prioritize internal traffic networks over guest network traffic, you can\n        set the priority in the guest network configuration settings to a lower\n        number. Currently not used by device setup service.\n        <!--TODO: https://sim.amazon.com/issues/FFS-3097-->")
    public int getPriority() {
        return this.priority;
    }

    @EnumValues({SecurityProtocol.WPA_PSK, "WEP", "OPEN", "OTHER"})
    @Required
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
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getSsid(), getSecurityProtocol(), getWpaPskType(), getKey(), Integer.valueOf(getKeyIndex()), Integer.valueOf(getPriority()), Integer.valueOf(getFrequency()));
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setKeyIndex(int i) {
        this.keyIndex = i;
    }

    public void setPriority(int i) {
        this.priority = i;
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
        builder.withSecurityProtocol(getSecurityProtocol());
        builder.withWpaPskType(getWpaPskType());
        builder.withKey(getKey());
        builder.withKeyIndex(getKeyIndex());
        builder.withPriority(getPriority());
        builder.withFrequency(getFrequency());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiCredentials(ssid=*** REDACTED ***, securityProtocol=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.securityProtocol, ", wpaPskType=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.wpaPskType, ", key=*** REDACTED ***, keyIndex=", sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", priority=", this.keyIndex, sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", frequency=", this.priority, sb);
        sb.append(String.valueOf(this.frequency));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
