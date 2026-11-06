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
import com.amazon.credentiallocker.WifiConfiguration;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("UpdatedWifiConfiguration")
@Documentation("A Wi-Fi configuration for the updateWifiConfigurations operation, with network credentials and optional\n        information about an old network replaced by this network.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class UpdatedWifiConfiguration extends WifiConfiguration {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.UpdatedWifiConfiguration");
    private WifiNetwork oldWifiNetwork;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.credentiallocker.WifiConfiguration, com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdatedWifiConfiguration) {
            return super.equals(obj) && Objects.equals(getOldWifiNetwork(), ((UpdatedWifiConfiguration) obj).getOldWifiNetwork());
        }
        return false;
    }

    @Documentation("ssid - wifi name - SSID is simply the technical term for a network name.\n        When you set up a wireless home network, you give it a name to distinguish it from other networks in your neighbourhood.\n        You'll see this name when you connect your computer to your wireless network.\n        bssid - The BSSID is a 48bit identity used to identify a particular BSS (Basic Service Set) within an area.\n        In Infrastructure BSS networks, the BSSID is the MAC (Medium Access Control) address of the AP (Access Point) and in Independent BSS or ad hoc networks, the BSSID is generated randomly.")
    public WifiNetwork getOldWifiNetwork() {
        return this.oldWifiNetwork;
    }

    @Override // com.amazon.credentiallocker.WifiConfiguration, com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getOldWifiNetwork());
    }

    public void setOldWifiNetwork(WifiNetwork wifiNetwork) {
        this.oldWifiNetwork = wifiNetwork;
    }

    @Override // com.amazon.credentiallocker.WifiConfiguration, com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withCredentialConfiguration(getCredentialConfiguration());
        builder.withLastUpdatedDateUtcMillis(getLastUpdatedDateUtcMillis());
        builder.withLastConnectedDateUtcMillis(getLastConnectedDateUtcMillis());
        builder.withPriority(getPriority());
        builder.withAutoJoin(isAutoJoin());
        builder.withFrequency(getFrequency());
        builder.withSsid(getSsid());
        builder.withKeyManagement(getKeyManagement());
        builder.withWpaPskType(getWpaPskType());
        builder.withBssid(getBssid());
        builder.withOldWifiNetwork(getOldWifiNetwork());
        return builder;
    }

    @Override // com.amazon.credentiallocker.WifiConfiguration, com.amazon.credentiallocker.WifiNetworkInfo, com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public String toString() {
        return "UpdatedWifiConfiguration(super=" + super.toString() + ", oldWifiNetwork=" + String.valueOf(this.oldWifiNetwork) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends WifiConfiguration.Builder {
        protected WifiNetwork oldWifiNetwork;

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public UpdatedWifiConfiguration build() {
            UpdatedWifiConfiguration updatedWifiConfiguration = new UpdatedWifiConfiguration();
            populate(updatedWifiConfiguration);
            return updatedWifiConfiguration;
        }

        public void populate(UpdatedWifiConfiguration updatedWifiConfiguration) {
            super.populate((WifiConfiguration) updatedWifiConfiguration);
            updatedWifiConfiguration.setOldWifiNetwork(this.oldWifiNetwork);
        }

        public Builder withOldWifiNetwork(WifiNetwork wifiNetwork) {
            this.oldWifiNetwork = wifiNetwork;
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder
        public Builder withCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
            super.withCredentialConfiguration(credentialConfiguration);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder
        public Builder withLastUpdatedDateUtcMillis(long j) {
            super.withLastUpdatedDateUtcMillis(j);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withAutoJoin(Boolean bool) {
            super.withAutoJoin(bool);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withFrequency(int i) {
            super.withFrequency(i);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withLastConnectedDateUtcMillis(long j) {
            super.withLastConnectedDateUtcMillis(j);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withPriority(int i) {
            super.withPriority(i);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withBssid(String str) {
            super.withBssid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withKeyManagement(String str) {
            super.withKeyManagement(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withSsid(String str) {
            super.withSsid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiConfiguration.Builder, com.amazon.credentiallocker.WifiNetworkInfo.Builder, com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withWpaPskType(String str) {
            super.withWpaPskType(str);
            return this;
        }
    }
}
