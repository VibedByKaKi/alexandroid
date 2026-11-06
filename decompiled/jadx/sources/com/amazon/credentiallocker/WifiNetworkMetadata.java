package com.amazon.credentiallocker;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@Generated
@XmlName("WifiNetworkMetadata")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class WifiNetworkMetadata {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.WifiNetworkMetadata");
    private long mostRecentReplacedCredentialUtcMillis;
    private long mostRecentUpdatedCredentialUtcMillis;
    private int wifiCredentialCount;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected long mostRecentReplacedCredentialUtcMillis;
        protected long mostRecentUpdatedCredentialUtcMillis;
        protected int wifiCredentialCount;

        public WifiNetworkMetadata build() {
            WifiNetworkMetadata wifiNetworkMetadata = new WifiNetworkMetadata();
            populate(wifiNetworkMetadata);
            return wifiNetworkMetadata;
        }

        public void populate(WifiNetworkMetadata wifiNetworkMetadata) {
            wifiNetworkMetadata.setWifiCredentialCount(this.wifiCredentialCount);
            wifiNetworkMetadata.setMostRecentUpdatedCredentialUtcMillis(this.mostRecentUpdatedCredentialUtcMillis);
            wifiNetworkMetadata.setMostRecentReplacedCredentialUtcMillis(this.mostRecentReplacedCredentialUtcMillis);
        }

        public Builder withMostRecentReplacedCredentialUtcMillis(long j) {
            this.mostRecentReplacedCredentialUtcMillis = j;
            return this;
        }

        public Builder withMostRecentUpdatedCredentialUtcMillis(long j) {
            this.mostRecentUpdatedCredentialUtcMillis = j;
            return this;
        }

        public Builder withWifiCredentialCount(int i) {
            this.wifiCredentialCount = i;
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
        if (!(obj instanceof WifiNetworkMetadata)) {
            return false;
        }
        WifiNetworkMetadata wifiNetworkMetadata = (WifiNetworkMetadata) obj;
        return Integer.valueOf(getWifiCredentialCount()).equals(Integer.valueOf(wifiNetworkMetadata.getWifiCredentialCount())) && Long.valueOf(getMostRecentUpdatedCredentialUtcMillis()).equals(Long.valueOf(wifiNetworkMetadata.getMostRecentUpdatedCredentialUtcMillis())) && Long.valueOf(getMostRecentReplacedCredentialUtcMillis()).equals(Long.valueOf(wifiNetworkMetadata.getMostRecentReplacedCredentialUtcMillis()));
    }

    public long getMostRecentReplacedCredentialUtcMillis() {
        return this.mostRecentReplacedCredentialUtcMillis;
    }

    public long getMostRecentUpdatedCredentialUtcMillis() {
        return this.mostRecentUpdatedCredentialUtcMillis;
    }

    public int getWifiCredentialCount() {
        return this.wifiCredentialCount;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Integer.valueOf(getWifiCredentialCount()), Long.valueOf(getMostRecentUpdatedCredentialUtcMillis()), Long.valueOf(getMostRecentReplacedCredentialUtcMillis()));
    }

    public void setMostRecentReplacedCredentialUtcMillis(long j) {
        this.mostRecentReplacedCredentialUtcMillis = j;
    }

    public void setMostRecentUpdatedCredentialUtcMillis(long j) {
        this.mostRecentUpdatedCredentialUtcMillis = j;
    }

    public void setWifiCredentialCount(int i) {
        this.wifiCredentialCount = i;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWifiCredentialCount(getWifiCredentialCount());
        builder.withMostRecentUpdatedCredentialUtcMillis(getMostRecentUpdatedCredentialUtcMillis());
        builder.withMostRecentReplacedCredentialUtcMillis(getMostRecentReplacedCredentialUtcMillis());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiNetworkMetadata(wifiCredentialCount=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", mostRecentUpdatedCredentialUtcMillis=", this.wifiCredentialCount, sb);
        sb.append(String.valueOf(this.mostRecentUpdatedCredentialUtcMillis));
        sb.append(", mostRecentReplacedCredentialUtcMillis=");
        sb.append(String.valueOf(this.mostRecentReplacedCredentialUtcMillis));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
