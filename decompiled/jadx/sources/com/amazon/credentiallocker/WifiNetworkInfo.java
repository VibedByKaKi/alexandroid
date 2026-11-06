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
import com.amazon.credentiallocker.WifiNetworkExtended;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("WifiNetworkInfo")
@Documentation("This represents a wifi network which extends from WifiNetworkExtended and has properties such as\n        lastUpdatedDateUtcMillis - last updated date in UTC milliseconds")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiNetworkInfo extends WifiNetworkExtended {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiNetworkInfo");
    private long lastUpdatedDateUtcMillis;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WifiNetworkInfo) {
            return super.equals(obj) && Long.valueOf(getLastUpdatedDateUtcMillis()).equals(Long.valueOf(((WifiNetworkInfo) obj).getLastUpdatedDateUtcMillis()));
        }
        return false;
    }

    public long getLastUpdatedDateUtcMillis() {
        return this.lastUpdatedDateUtcMillis;
    }

    @Override // com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), Long.valueOf(getLastUpdatedDateUtcMillis()));
    }

    public void setLastUpdatedDateUtcMillis(long j) {
        this.lastUpdatedDateUtcMillis = j;
    }

    @Override // com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withLastConnectedDateUtcMillis(getLastConnectedDateUtcMillis());
        builder.withPriority(getPriority());
        builder.withAutoJoin(isAutoJoin());
        builder.withFrequency(getFrequency());
        builder.withSsid(getSsid());
        builder.withKeyManagement(getKeyManagement());
        builder.withWpaPskType(getWpaPskType());
        builder.withBssid(getBssid());
        builder.withLastUpdatedDateUtcMillis(getLastUpdatedDateUtcMillis());
        return builder;
    }

    @Override // com.amazon.credentiallocker.WifiNetworkExtended, com.amazon.credentiallocker.WifiNetwork
    public String toString() {
        return "WifiNetworkInfo(super=" + super.toString() + ", lastUpdatedDateUtcMillis=" + String.valueOf(this.lastUpdatedDateUtcMillis) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends WifiNetworkExtended.Builder {
        protected long lastUpdatedDateUtcMillis;

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public WifiNetworkInfo build() {
            WifiNetworkInfo wifiNetworkInfo = new WifiNetworkInfo();
            populate(wifiNetworkInfo);
            return wifiNetworkInfo;
        }

        public void populate(WifiNetworkInfo wifiNetworkInfo) {
            super.populate((WifiNetworkExtended) wifiNetworkInfo);
            wifiNetworkInfo.setLastUpdatedDateUtcMillis(this.lastUpdatedDateUtcMillis);
        }

        public Builder withLastUpdatedDateUtcMillis(long j) {
            this.lastUpdatedDateUtcMillis = j;
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withAutoJoin(Boolean bool) {
            super.withAutoJoin(bool);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withFrequency(int i) {
            super.withFrequency(i);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withLastConnectedDateUtcMillis(long j) {
            super.withLastConnectedDateUtcMillis(j);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder
        public Builder withPriority(int i) {
            super.withPriority(i);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withBssid(String str) {
            super.withBssid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withKeyManagement(String str) {
            super.withKeyManagement(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withSsid(String str) {
            super.withSsid(str);
            return this;
        }

        @Override // com.amazon.credentiallocker.WifiNetworkExtended.Builder, com.amazon.credentiallocker.WifiNetwork.Builder
        public Builder withWpaPskType(String str) {
            super.withWpaPskType(str);
            return this;
        }
    }
}
