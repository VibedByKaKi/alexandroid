package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Network {
    private final ThreadNetwork threadNetwork;
    private final WifiConfigurationNetwork wifiNetwork;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class NetworkBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private ThreadNetwork threadNetwork;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private WifiConfigurationNetwork wifiNetwork;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Network build() {
            return new Network(this.wifiNetwork, this.threadNetwork);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkBuilder threadNetwork(ThreadNetwork threadNetwork) {
            this.threadNetwork = threadNetwork;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "Network.NetworkBuilder(wifiNetwork=" + this.wifiNetwork + ", threadNetwork=" + this.threadNetwork + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public NetworkBuilder wifiNetwork(WifiConfigurationNetwork wifiConfigurationNetwork) {
            this.wifiNetwork = wifiConfigurationNetwork;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private Network() {
        this.wifiNetwork = null;
        this.threadNetwork = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static NetworkBuilder builder() {
        return new NetworkBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        WifiConfigurationNetwork wifiNetwork = getWifiNetwork();
        WifiConfigurationNetwork wifiNetwork2 = network.getWifiNetwork();
        if (wifiNetwork != null ? !wifiNetwork.equals(wifiNetwork2) : wifiNetwork2 != null) {
            return false;
        }
        ThreadNetwork threadNetwork = getThreadNetwork();
        ThreadNetwork threadNetwork2 = network.getThreadNetwork();
        return threadNetwork != null ? threadNetwork.equals(threadNetwork2) : threadNetwork2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork getThreadNetwork() {
        return this.threadNetwork;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WifiConfigurationNetwork getWifiNetwork() {
        return this.wifiNetwork;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        WifiConfigurationNetwork wifiNetwork = getWifiNetwork();
        int hashCode = wifiNetwork == null ? 43 : wifiNetwork.hashCode();
        ThreadNetwork threadNetwork = getThreadNetwork();
        return ((hashCode + 59) * 59) + (threadNetwork != null ? threadNetwork.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Network(wifiNetwork=" + getWifiNetwork() + ", threadNetwork=" + getThreadNetwork() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Network withThreadNetwork(ThreadNetwork threadNetwork) {
        return this.threadNetwork == threadNetwork ? this : new Network(this.wifiNetwork, threadNetwork);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Network withWifiNetwork(WifiConfigurationNetwork wifiConfigurationNetwork) {
        return this.wifiNetwork == wifiConfigurationNetwork ? this : new Network(wifiConfigurationNetwork, this.threadNetwork);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Network(WifiConfigurationNetwork wifiConfigurationNetwork, ThreadNetwork threadNetwork) {
        this.wifiNetwork = wifiConfigurationNetwork;
        this.threadNetwork = threadNetwork;
    }
}
