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
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("NetworkScanResult")
@Documentation("NetworkScanResult represents an individual Wifi or Thread network credential,\n        attained from a network scan.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class NetworkScanResult {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.NetworkScanResult");
    private ThreadNetworkScanResult threadNetworkScanResult;
    private WifiNetworkScanResult wifiNetworkScanResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ThreadNetworkScanResult threadNetworkScanResult;
        protected WifiNetworkScanResult wifiNetworkScanResult;

        public NetworkScanResult build() {
            NetworkScanResult networkScanResult = new NetworkScanResult();
            populate(networkScanResult);
            return networkScanResult;
        }

        public void populate(NetworkScanResult networkScanResult) {
            networkScanResult.setThreadNetworkScanResult(this.threadNetworkScanResult);
            networkScanResult.setWifiNetworkScanResult(this.wifiNetworkScanResult);
        }

        public Builder withThreadNetworkScanResult(ThreadNetworkScanResult threadNetworkScanResult) {
            this.threadNetworkScanResult = threadNetworkScanResult;
            return this;
        }

        public Builder withWifiNetworkScanResult(WifiNetworkScanResult wifiNetworkScanResult) {
            this.wifiNetworkScanResult = wifiNetworkScanResult;
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
        if (!(obj instanceof NetworkScanResult)) {
            return false;
        }
        NetworkScanResult networkScanResult = (NetworkScanResult) obj;
        return Objects.equals(getThreadNetworkScanResult(), networkScanResult.getThreadNetworkScanResult()) && Objects.equals(getWifiNetworkScanResult(), networkScanResult.getWifiNetworkScanResult());
    }

    @Documentation("A unique idenfifer for a Thread network composed of network name and\n        extended PAN ID, along with scan information.")
    public ThreadNetworkScanResult getThreadNetworkScanResult() {
        return this.threadNetworkScanResult;
    }

    @Documentation("A unique idenfifer for a Wifi network composed of ssid, key management, wpa psk type and\n        bssid.")
    public WifiNetworkScanResult getWifiNetworkScanResult() {
        return this.wifiNetworkScanResult;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getThreadNetworkScanResult(), getWifiNetworkScanResult());
    }

    public void setThreadNetworkScanResult(ThreadNetworkScanResult threadNetworkScanResult) {
        this.threadNetworkScanResult = threadNetworkScanResult;
    }

    public void setWifiNetworkScanResult(WifiNetworkScanResult wifiNetworkScanResult) {
        this.wifiNetworkScanResult = wifiNetworkScanResult;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withThreadNetworkScanResult(getThreadNetworkScanResult());
        builder.withWifiNetworkScanResult(getWifiNetworkScanResult());
        return builder;
    }

    public String toString() {
        return "NetworkScanResult(threadNetworkScanResult=" + String.valueOf(this.threadNetworkScanResult) + ", wifiNetworkScanResult=" + String.valueOf(this.wifiNetworkScanResult) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
