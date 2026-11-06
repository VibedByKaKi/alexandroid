package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class NetworkScanResult {
    private final ThreadNetworkScanResult threadNetworkScanResult;
    private final WifiNetworkScanResult wifiNetworkScanResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class NetworkScanResultBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private ThreadNetworkScanResult threadNetworkScanResult;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private WifiNetworkScanResult wifiNetworkScanResult;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkScanResultBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkScanResult build() {
            return new NetworkScanResult(this.wifiNetworkScanResult, this.threadNetworkScanResult);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkScanResultBuilder threadNetworkScanResult(ThreadNetworkScanResult threadNetworkScanResult) {
            this.threadNetworkScanResult = threadNetworkScanResult;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "NetworkScanResult.NetworkScanResultBuilder(wifiNetworkScanResult=" + this.wifiNetworkScanResult + ", threadNetworkScanResult=" + this.threadNetworkScanResult + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkScanResultBuilder wifiNetworkScanResult(WifiNetworkScanResult wifiNetworkScanResult) {
            this.wifiNetworkScanResult = wifiNetworkScanResult;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private NetworkScanResult() {
        this.wifiNetworkScanResult = null;
        this.threadNetworkScanResult = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static NetworkScanResultBuilder builder() {
        return new NetworkScanResultBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkScanResult)) {
            return false;
        }
        NetworkScanResult networkScanResult = (NetworkScanResult) obj;
        WifiNetworkScanResult wifiNetworkScanResult = getWifiNetworkScanResult();
        WifiNetworkScanResult wifiNetworkScanResult2 = networkScanResult.getWifiNetworkScanResult();
        if (wifiNetworkScanResult != null ? !wifiNetworkScanResult.equals(wifiNetworkScanResult2) : wifiNetworkScanResult2 != null) {
            return false;
        }
        ThreadNetworkScanResult threadNetworkScanResult = getThreadNetworkScanResult();
        ThreadNetworkScanResult threadNetworkScanResult2 = networkScanResult.getThreadNetworkScanResult();
        return threadNetworkScanResult != null ? threadNetworkScanResult.equals(threadNetworkScanResult2) : threadNetworkScanResult2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkScanResult getThreadNetworkScanResult() {
        return this.threadNetworkScanResult;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiNetworkScanResult getWifiNetworkScanResult() {
        return this.wifiNetworkScanResult;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        WifiNetworkScanResult wifiNetworkScanResult = getWifiNetworkScanResult();
        int hashCode = wifiNetworkScanResult == null ? 43 : wifiNetworkScanResult.hashCode();
        ThreadNetworkScanResult threadNetworkScanResult = getThreadNetworkScanResult();
        return ((hashCode + 59) * 59) + (threadNetworkScanResult != null ? threadNetworkScanResult.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "NetworkScanResult(wifiNetworkScanResult=" + getWifiNetworkScanResult() + ", threadNetworkScanResult=" + getThreadNetworkScanResult() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NetworkScanResult withThreadNetworkScanResult(ThreadNetworkScanResult threadNetworkScanResult) {
        return this.threadNetworkScanResult == threadNetworkScanResult ? this : new NetworkScanResult(this.wifiNetworkScanResult, threadNetworkScanResult);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NetworkScanResult withWifiNetworkScanResult(WifiNetworkScanResult wifiNetworkScanResult) {
        return this.wifiNetworkScanResult == wifiNetworkScanResult ? this : new NetworkScanResult(wifiNetworkScanResult, this.threadNetworkScanResult);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public NetworkScanResult(WifiNetworkScanResult wifiNetworkScanResult, ThreadNetworkScanResult threadNetworkScanResult) {
        this.wifiNetworkScanResult = wifiNetworkScanResult;
        this.threadNetworkScanResult = threadNetworkScanResult;
    }
}
