package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.devicesetupservice.v1.WifiNetworkInfo;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("WifiConfiguration")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WifiConfiguration extends WifiNetworkInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.WifiConfiguration");
    private Boolean autoJoin;
    private CredentialConfiguration credentialConfiguration;
    private int frequency;
    private long lastConnectedDateUtcMillis;
    private int priority;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiConfiguration)) {
            return false;
        }
        WifiConfiguration wifiConfiguration = (WifiConfiguration) obj;
        return super.equals(obj) && Long.valueOf(getLastConnectedDateUtcMillis()).equals(Long.valueOf(wifiConfiguration.getLastConnectedDateUtcMillis())) && Integer.valueOf(getPriority()).equals(Integer.valueOf(wifiConfiguration.getPriority())) && Integer.valueOf(getFrequency()).equals(Integer.valueOf(wifiConfiguration.getFrequency())) && Objects.equals(isAutoJoin(), wifiConfiguration.isAutoJoin()) && Objects.equals(getCredentialConfiguration(), wifiConfiguration.getCredentialConfiguration());
    }

    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    @Documentation("Frequency range in MHz.\n        Currently not used by device setup service.\n        <!--TODO: https://sim.amazon.com/issues/FFS-3097-->")
    public int getFrequency() {
        return this.frequency;
    }

    @Documentation("Last connected date difference since January 1, 1970, 00:00:00,\n        universal time in milliseconds.")
    public long getLastConnectedDateUtcMillis() {
        return this.lastConnectedDateUtcMillis;
    }

    @Documentation("Set the priority of the network to a Low number if you would prefer that\n        other networks traffic take priority. For example, if you want to\n        prioritize internal traffic networks over guest network traffic, you can\n        set the priority in the guest network configuration settings to a lower\n        number. Currently not used by device setup service.\n        <!--TODO: https://sim.amazon.com/issues/FFS-3097-->")
    public int getPriority() {
        return this.priority;
    }

    @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), Long.valueOf(getLastConnectedDateUtcMillis()), Integer.valueOf(getPriority()), Integer.valueOf(getFrequency()), isAutoJoin(), getCredentialConfiguration());
    }

    @Documentation("Set to \"true\" if you would prefer distressed devices to automatically\n        connect to this network.")
    public Boolean isAutoJoin() {
        return this.autoJoin;
    }

    public void setAutoJoin(Boolean bool) {
        this.autoJoin = bool;
    }

    public void setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public void setLastConnectedDateUtcMillis(long j) {
        this.lastConnectedDateUtcMillis = j;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSsid(getSsid());
        builder.withKeyManagement(getKeyManagement());
        builder.withWpaPskType(getWpaPskType());
        builder.withNetworkState(getNetworkState());
        builder.withLastUpdatedDateUtcMillis(getLastUpdatedDateUtcMillis());
        builder.withLastConnectedDateUtcMillis(getLastConnectedDateUtcMillis());
        builder.withPriority(getPriority());
        builder.withFrequency(getFrequency());
        builder.withAutoJoin(isAutoJoin());
        builder.withCredentialConfiguration(getCredentialConfiguration());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo
    public String toString() {
        StringBuilder sb = new StringBuilder("WifiConfiguration(super=");
        sb.append(super.toString());
        sb.append(", , , , , lastConnectedDateUtcMillis=");
        sb.append(String.valueOf(this.lastConnectedDateUtcMillis));
        sb.append(", priority=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", frequency=", this.priority, sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", autoJoin=", this.frequency, sb);
        sb.append(String.valueOf(this.autoJoin));
        sb.append(", credentialConfiguration=");
        sb.append(String.valueOf(this.credentialConfiguration));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends WifiNetworkInfo.Builder {
        protected Boolean autoJoin;
        protected CredentialConfiguration credentialConfiguration;
        protected int frequency;
        protected long lastConnectedDateUtcMillis;
        protected int priority;

        @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo.Builder
        public WifiConfiguration build() {
            WifiConfiguration wifiConfiguration = new WifiConfiguration();
            populate(wifiConfiguration);
            return wifiConfiguration;
        }

        public void populate(WifiConfiguration wifiConfiguration) {
            super.populate((WifiNetworkInfo) wifiConfiguration);
            wifiConfiguration.setLastConnectedDateUtcMillis(this.lastConnectedDateUtcMillis);
            wifiConfiguration.setPriority(this.priority);
            wifiConfiguration.setFrequency(this.frequency);
            wifiConfiguration.setAutoJoin(this.autoJoin);
            wifiConfiguration.setCredentialConfiguration(this.credentialConfiguration);
        }

        public Builder withAutoJoin(Boolean bool) {
            this.autoJoin = bool;
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

        public Builder withLastConnectedDateUtcMillis(long j) {
            this.lastConnectedDateUtcMillis = j;
            return this;
        }

        public Builder withPriority(int i) {
            this.priority = i;
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo.Builder
        public Builder withKeyManagement(String str) {
            super.withKeyManagement(str);
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo.Builder
        public Builder withLastUpdatedDateUtcMillis(long j) {
            super.withLastUpdatedDateUtcMillis(j);
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo.Builder
        public Builder withNetworkState(String str) {
            super.withNetworkState(str);
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo.Builder
        public Builder withSsid(String str) {
            super.withSsid(str);
            return this;
        }

        @Override // com.amazon.devicesetupservice.v1.WifiNetworkInfo.Builder
        public Builder withWpaPskType(String str) {
            super.withWpaPskType(str);
            return this;
        }
    }
}
