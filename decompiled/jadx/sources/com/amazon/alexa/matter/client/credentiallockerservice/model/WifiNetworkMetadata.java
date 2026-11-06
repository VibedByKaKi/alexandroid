package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class WifiNetworkMetadata {
    private final long mostRecentReplacedCredentialUtcMillis;
    private final long mostRecentUpdatedCredentialUtcMillis;
    private final int wifiCredentialCount;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class WifiNetworkMetadataBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private long mostRecentReplacedCredentialUtcMillis;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private long mostRecentUpdatedCredentialUtcMillis;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int wifiCredentialCount;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkMetadataBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkMetadata build() {
            return new WifiNetworkMetadata(this.mostRecentReplacedCredentialUtcMillis, this.mostRecentUpdatedCredentialUtcMillis, this.wifiCredentialCount);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkMetadataBuilder mostRecentReplacedCredentialUtcMillis(long j) {
            this.mostRecentReplacedCredentialUtcMillis = j;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkMetadataBuilder mostRecentUpdatedCredentialUtcMillis(long j) {
            this.mostRecentUpdatedCredentialUtcMillis = j;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("WifiNetworkMetadata.WifiNetworkMetadataBuilder(mostRecentReplacedCredentialUtcMillis=");
            sb.append(this.mostRecentReplacedCredentialUtcMillis);
            sb.append(", mostRecentUpdatedCredentialUtcMillis=");
            sb.append(this.mostRecentUpdatedCredentialUtcMillis);
            sb.append(", wifiCredentialCount=");
            return a$$ExternalSyntheticOutline0.m(sb, this.wifiCredentialCount, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public WifiNetworkMetadataBuilder wifiCredentialCount(int i) {
            this.wifiCredentialCount = i;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private WifiNetworkMetadata() {
        this.mostRecentReplacedCredentialUtcMillis = 0L;
        this.mostRecentUpdatedCredentialUtcMillis = 0L;
        this.wifiCredentialCount = 0;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static WifiNetworkMetadataBuilder builder() {
        return new WifiNetworkMetadataBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiNetworkMetadata)) {
            return false;
        }
        WifiNetworkMetadata wifiNetworkMetadata = (WifiNetworkMetadata) obj;
        return getMostRecentReplacedCredentialUtcMillis() == wifiNetworkMetadata.getMostRecentReplacedCredentialUtcMillis() && getMostRecentUpdatedCredentialUtcMillis() == wifiNetworkMetadata.getMostRecentUpdatedCredentialUtcMillis() && getWifiCredentialCount() == wifiNetworkMetadata.getWifiCredentialCount();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getMostRecentReplacedCredentialUtcMillis() {
        return this.mostRecentReplacedCredentialUtcMillis;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getMostRecentUpdatedCredentialUtcMillis() {
        return this.mostRecentUpdatedCredentialUtcMillis;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getWifiCredentialCount() {
        return this.wifiCredentialCount;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long mostRecentReplacedCredentialUtcMillis = getMostRecentReplacedCredentialUtcMillis();
        int i = ((int) (mostRecentReplacedCredentialUtcMillis ^ (mostRecentReplacedCredentialUtcMillis >>> 32))) + 59;
        long mostRecentUpdatedCredentialUtcMillis = getMostRecentUpdatedCredentialUtcMillis();
        return getWifiCredentialCount() + (((i * 59) + ((int) ((mostRecentUpdatedCredentialUtcMillis >>> 32) ^ mostRecentUpdatedCredentialUtcMillis))) * 59);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "WifiNetworkMetadata(mostRecentReplacedCredentialUtcMillis=" + getMostRecentReplacedCredentialUtcMillis() + ", mostRecentUpdatedCredentialUtcMillis=" + getMostRecentUpdatedCredentialUtcMillis() + ", wifiCredentialCount=" + getWifiCredentialCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkMetadata withMostRecentReplacedCredentialUtcMillis(long j) {
        return this.mostRecentReplacedCredentialUtcMillis == j ? this : new WifiNetworkMetadata(j, this.mostRecentUpdatedCredentialUtcMillis, this.wifiCredentialCount);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkMetadata withMostRecentUpdatedCredentialUtcMillis(long j) {
        return this.mostRecentUpdatedCredentialUtcMillis == j ? this : new WifiNetworkMetadata(this.mostRecentReplacedCredentialUtcMillis, j, this.wifiCredentialCount);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkMetadata withWifiCredentialCount(int i) {
        return this.wifiCredentialCount == i ? this : new WifiNetworkMetadata(this.mostRecentReplacedCredentialUtcMillis, this.mostRecentUpdatedCredentialUtcMillis, i);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkMetadata(long j, long j2, int i) {
        this.mostRecentReplacedCredentialUtcMillis = j;
        this.mostRecentUpdatedCredentialUtcMillis = j2;
        this.wifiCredentialCount = i;
    }
}
