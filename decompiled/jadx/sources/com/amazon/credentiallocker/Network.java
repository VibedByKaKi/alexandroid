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
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName(AlexaMetricsConstants.EventConstants.NETWORK)
@Documentation("Network represents an individual Wifi or Thread network credential.\n        Support for Wifi networks will be added in a future release.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class Network {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.Network");
    private ThreadNetwork threadNetwork;
    private WifiConfigurationNetwork wifiNetwork;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ThreadNetwork threadNetwork;
        protected WifiConfigurationNetwork wifiNetwork;

        public Network build() {
            Network network = new Network();
            populate(network);
            return network;
        }

        public void populate(Network network) {
            network.setThreadNetwork(this.threadNetwork);
            network.setWifiNetwork(this.wifiNetwork);
        }

        public Builder withThreadNetwork(ThreadNetwork threadNetwork) {
            this.threadNetwork = threadNetwork;
            return this;
        }

        public Builder withWifiNetwork(WifiConfigurationNetwork wifiConfigurationNetwork) {
            this.wifiNetwork = wifiConfigurationNetwork;
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
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return Objects.equals(getThreadNetwork(), network.getThreadNetwork()) && Objects.equals(getWifiNetwork(), network.getWifiNetwork());
    }

    @Documentation("Thread network structure containing credentials and other operational parameters\n        networkName - Name of the Thread network. A utf8 string with a maximum length of 16 bytes\n        extendedPanId - 8 bytes represented as a hex string\n        networkKey - 16 bytes represented as a hex string\n        pskc - Hashed commissioner credential 16 bytes represented as a hex string\n        commissionerCredential - Human readable commissioner credential utf8 encoded, 6-255 bytes inclusive\n        meshLocalPrefix - ipv6 network address\n        panId - 2 bytes represented as hex string\n        channelPage - 0 for 802.15.4, other values reserved for future PHY layers\n        channelNumber - Current channel number (11-26 for 802.15.4)\n        channelMask - Bitmask representing allowable channels for the network. Channel 0 is lsb\n        party - 1P (Amazon), 2P (EERO), or 3P owned network")
    public ThreadNetwork getThreadNetwork() {
        return this.threadNetwork;
    }

    @Documentation("Wifi network structure containing credentials and other operational parameters.\n        Created to avoid inheritance using faux tagged unions with the intention of moving to Smithy.")
    public WifiConfigurationNetwork getWifiNetwork() {
        return this.wifiNetwork;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getThreadNetwork(), getWifiNetwork());
    }

    public void setThreadNetwork(ThreadNetwork threadNetwork) {
        this.threadNetwork = threadNetwork;
    }

    public void setWifiNetwork(WifiConfigurationNetwork wifiConfigurationNetwork) {
        this.wifiNetwork = wifiConfigurationNetwork;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withThreadNetwork(getThreadNetwork());
        builder.withWifiNetwork(getWifiNetwork());
        return builder;
    }

    public String toString() {
        return "Network(threadNetwork=" + String.valueOf(this.threadNetwork) + ", wifiNetwork=" + String.valueOf(this.wifiNetwork) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
