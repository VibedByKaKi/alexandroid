package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ThreadNetworkScanResult {
    private final String extendedPanId;
    private final Long lqi;
    private final String networkName;
    private final Long rssi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ThreadNetworkScanResultBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String extendedPanId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Long lqi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String networkName;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Long rssi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkScanResultBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkScanResult build() {
            return new ThreadNetworkScanResult(this.rssi, this.networkName, this.lqi, this.extendedPanId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkScanResultBuilder extendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkScanResultBuilder lqi(Long l) {
            this.lqi = l;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkScanResultBuilder networkName(String str) {
            this.networkName = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkScanResultBuilder rssi(Long l) {
            this.rssi = l;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadNetworkScanResult.ThreadNetworkScanResultBuilder(rssi=");
            sb.append(this.rssi);
            sb.append(", networkName=");
            sb.append(this.networkName);
            sb.append(", lqi=");
            sb.append(this.lqi);
            sb.append(", extendedPanId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.extendedPanId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private ThreadNetworkScanResult() {
        this.rssi = null;
        this.networkName = null;
        this.lqi = null;
        this.extendedPanId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ThreadNetworkScanResultBuilder builder() {
        return new ThreadNetworkScanResultBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreadNetworkScanResult)) {
            return false;
        }
        ThreadNetworkScanResult threadNetworkScanResult = (ThreadNetworkScanResult) obj;
        Long rssi = getRssi();
        Long rssi2 = threadNetworkScanResult.getRssi();
        if (rssi != null ? !rssi.equals(rssi2) : rssi2 != null) {
            return false;
        }
        Long lqi = getLqi();
        Long lqi2 = threadNetworkScanResult.getLqi();
        if (lqi != null ? !lqi.equals(lqi2) : lqi2 != null) {
            return false;
        }
        String networkName = getNetworkName();
        String networkName2 = threadNetworkScanResult.getNetworkName();
        if (networkName != null ? !networkName.equals(networkName2) : networkName2 != null) {
            return false;
        }
        String extendedPanId = getExtendedPanId();
        String extendedPanId2 = threadNetworkScanResult.getExtendedPanId();
        return extendedPanId != null ? extendedPanId.equals(extendedPanId2) : extendedPanId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getLqi() {
        return this.lqi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkName() {
        return this.networkName;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getRssi() {
        return this.rssi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Long rssi = getRssi();
        int hashCode = rssi == null ? 43 : rssi.hashCode();
        Long lqi = getLqi();
        int hashCode2 = ((hashCode + 59) * 59) + (lqi == null ? 43 : lqi.hashCode());
        String networkName = getNetworkName();
        int i = hashCode2 * 59;
        int hashCode3 = networkName == null ? 43 : networkName.hashCode();
        String extendedPanId = getExtendedPanId();
        return ((i + hashCode3) * 59) + (extendedPanId != null ? extendedPanId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ThreadNetworkScanResult(rssi=" + getRssi() + ", networkName=" + getNetworkName() + ", lqi=" + getLqi() + ", extendedPanId=" + getExtendedPanId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkScanResult withExtendedPanId(String str) {
        return this.extendedPanId == str ? this : new ThreadNetworkScanResult(this.rssi, this.networkName, this.lqi, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkScanResult withLqi(Long l) {
        return this.lqi == l ? this : new ThreadNetworkScanResult(this.rssi, this.networkName, l, this.extendedPanId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkScanResult withNetworkName(String str) {
        return this.networkName == str ? this : new ThreadNetworkScanResult(this.rssi, str, this.lqi, this.extendedPanId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkScanResult withRssi(Long l) {
        return this.rssi == l ? this : new ThreadNetworkScanResult(l, this.networkName, this.lqi, this.extendedPanId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkScanResult(Long l, String str, Long l2, String str2) {
        this.rssi = l;
        this.networkName = str;
        this.lqi = l2;
        this.extendedPanId = str2;
    }
}
