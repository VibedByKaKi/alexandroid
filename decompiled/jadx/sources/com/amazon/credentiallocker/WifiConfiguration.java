package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.WifiNetworkInfo;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiConfiguration")
@Documentation("This represents wifi configuration with all properties including privatesharedkey and wepkeylist\n        and extends from WifiNetworkInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiConfiguration extends WifiNetworkInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiConfiguration");
    private CredentialConfiguration credentialConfiguration;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WifiConfiguration) {
            return super.equals(obj) && Objects.equals(getCredentialConfiguration(), ((WifiConfiguration) obj).getCredentialConfiguration());
        }
        return false;
    }

    @Documentation("privateSharedKey - wifi password for wpa and other network, \"null\" for wep, guest.\n        authenticationMethod - Authentication method for WPA2-Enterprise networks (currently only EAP-TLS is supported)\n        certificateAuthority -\n        authenticationServerCertificates - List of certificates used to identify a trusted network on a supplicant.")
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    @Override // com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getCredentialConfiguration());
    }

    public void setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
    }

    @Override // com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withLastUpdatedDateUtcMillis(getLastUpdatedDateUtcMillis());
        builder.withLastConnectedDateUtcMillis(getLastConnectedDateUtcMillis());
        builder.withPriority(getPriority());
        builder.withAutoJoin(isAutoJoin());
        builder.withFrequency(getFrequency());
        builder.withSsid(getSsid());
        builder.withKeyManagement(getKeyManagement());
        builder.withWpaPskType(getWpaPskType());
        builder.withBssid(getBssid());
        builder.withCredentialConfiguration(getCredentialConfiguration());
        return builder;
    }

    @Override // com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public String toString() {
        return "WifiConfiguration(super=" + super.toString() + ", credentialConfiguration=" + String.valueOf(this.credentialConfiguration) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends WifiNetworkInfo.Builder {
        protected CredentialConfiguration credentialConfiguration;

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public WifiConfiguration build() {
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            populate(wifiConfiguration);
            return wifiConfiguration;
        }

        public void populate(WifiConfiguration wifiConfiguration) {
            super.populate((WifiNetworkInfo) wifiConfiguration);
            wifiConfiguration.setCredentialConfiguration(this.credentialConfiguration);
        }

        public Builder withCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
            this.credentialConfiguration = credentialConfiguration;
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder
        public Builder withLastUpdatedDateUtcMillis(long j) {
            super.withLastUpdatedDateUtcMillis(j);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withAutoJoin(Boolean bool) {
            super.withAutoJoin(bool);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withFrequency(int i) {
            super.withFrequency(i);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withLastConnectedDateUtcMillis(long j) {
            super.withLastConnectedDateUtcMillis(j);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withPriority(int i) {
            super.withPriority(i);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withBssid(String str) {
            super.withBssid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withKeyManagement(String str) {
            super.withKeyManagement(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withSsid(String str) {
            super.withSsid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withWpaPskType(String str) {
            super.withWpaPskType(str);
            return this;
        }
    }
}
