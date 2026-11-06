package com.amazon.credentiallocker;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxValue;
import com.amazon.coral.annotation.MinValue;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.WifiNetwork;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiNetworkExtended")
@Documentation("This represents a wifi network which extends from WifiNetwork and has properties such as\n        priority - to prioritize a wifi network over others for a customer\n        frequency - Common frequencies that are used for wifi communication are 2.4Ghz (giga hertz per second) and 5Ghz.\n        lastConnectedDateUtcMillis - last connected date in UTC milliseconds")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiNetworkExtended extends WifiNetwork {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiNetworkExtended");
    private Boolean autoJoin;
    private int frequency;
    private long lastConnectedDateUtcMillis;
    private int priority;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.credentiallocker.WifiNetwork
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiNetworkExtended)) {
            return false;
        }
        WifiNetworkExtended wifiNetworkExtended = (WifiNetworkExtended) obj;
        return super.equals(obj) && Long.valueOf(getLastConnectedDateUtcMillis()).equals(Long.valueOf(wifiNetworkExtended.getLastConnectedDateUtcMillis())) && Integer.valueOf(getPriority()).equals(Integer.valueOf(wifiNetworkExtended.getPriority())) && Objects.equals(isAutoJoin(), wifiNetworkExtended.isAutoJoin()) && Integer.valueOf(getFrequency()).equals(Integer.valueOf(wifiNetworkExtended.getFrequency()));
    }

    @MaxValue("6000")
    @Documentation("Common frequencies that are used for wifi communication are 2.4Ghz (giga hertz per second) and 5Ghz.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public int getFrequency() {
        return this.frequency;
    }

    public long getLastConnectedDateUtcMillis() {
        return this.lastConnectedDateUtcMillis;
    }

    @Documentation("It is used to prioritize the wifi network.\n        For example if two wifi networks are available then which one should connect.\n        Priority can be 1, 2, 3, etc.")
    public int getPriority() {
        return this.priority;
    }

    @Override // com.amazon.credentiallocker.WifiNetwork
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), Long.valueOf(getLastConnectedDateUtcMillis()), Integer.valueOf(getPriority()), isAutoJoin(), Integer.valueOf(getFrequency()));
    }

    @Documentation("Automatically connect eligible distressed devices to this network.")
    public Boolean isAutoJoin() {
        return this.autoJoin;
    }

    public void setAutoJoin(Boolean bool) {
        this.autoJoin = bool;
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

    @Override // com.amazon.credentiallocker.WifiNetwork
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withSsid(getSsid());
        builder.withKeyManagement(getKeyManagement());
        builder.withWpaPskType(getWpaPskType());
        builder.withBssid(getBssid());
        builder.withLastConnectedDateUtcMillis(getLastConnectedDateUtcMillis());
        builder.withPriority(getPriority());
        builder.withAutoJoin(isAutoJoin());
        builder.withFrequency(getFrequency());
        return builder;
    }

    @Override // com.amazon.credentiallocker.WifiNetwork
    public String toString() {
        StringBuilder sb = new StringBuilder("WifiNetworkExtended(super=");
        sb.append(super.toString());
        sb.append(", , , , lastConnectedDateUtcMillis=");
        sb.append(String.valueOf(this.lastConnectedDateUtcMillis));
        sb.append(", priority=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", autoJoin=", this.priority, sb);
        sb.append(String.valueOf(this.autoJoin));
        sb.append(", frequency=");
        sb.append(String.valueOf(this.frequency));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends WifiNetwork.Builder {
        protected Boolean autoJoin;
        protected int frequency;
        protected long lastConnectedDateUtcMillis;
        protected int priority;

        @Override // com.amazon.credentiallocker.WifiNetwork.Builder
        public WifiNetworkExtended build() {
            WifiNetworkExtended wifiNetworkExtended = new WifiNetworkExtended();
            populate(wifiNetworkExtended);
            return wifiNetworkExtended;
        }

        public void populate(WifiNetworkExtended wifiNetworkExtended) {
            super.populate((WifiNetwork) wifiNetworkExtended);
            wifiNetworkExtended.setLastConnectedDateUtcMillis(this.lastConnectedDateUtcMillis);
            wifiNetworkExtended.setPriority(this.priority);
            wifiNetworkExtended.setAutoJoin(this.autoJoin);
            wifiNetworkExtended.setFrequency(this.frequency);
        }

        public Builder withAutoJoin(Boolean bool) {
            this.autoJoin = bool;
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

        @Override // com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withBssid(String str) {
            super.withBssid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withKeyManagement(String str) {
            super.withKeyManagement(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withSsid(String str) {
            super.withSsid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withWpaPskType(String str) {
            super.withWpaPskType(str);
            return this;
        }
    }
}
