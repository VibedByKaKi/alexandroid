package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
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
@CoralSuppressWarnings
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@Generated
@XmlName("NetworkMetadata")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class NetworkMetadata {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.NetworkMetadata");
    private ThreadNetworkMetadata thread;
    private WifiNetworkMetadata wifi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ThreadNetworkMetadata thread;
        protected WifiNetworkMetadata wifi;

        public NetworkMetadata build() {
            NetworkMetadata networkMetadata = new NetworkMetadata();
            populate(networkMetadata);
            return networkMetadata;
        }

        public void populate(NetworkMetadata networkMetadata) {
            networkMetadata.setThread(this.thread);
            networkMetadata.setWifi(this.wifi);
        }

        public Builder withThread(ThreadNetworkMetadata threadNetworkMetadata) {
            this.thread = threadNetworkMetadata;
            return this;
        }

        public Builder withWifi(WifiNetworkMetadata wifiNetworkMetadata) {
            this.wifi = wifiNetworkMetadata;
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
        if (!(obj instanceof NetworkMetadata)) {
            return false;
        }
        NetworkMetadata networkMetadata = (NetworkMetadata) obj;
        return Objects.equals(getThread(), networkMetadata.getThread()) && Objects.equals(getWifi(), networkMetadata.getWifi());
    }

    public ThreadNetworkMetadata getThread() {
        return this.thread;
    }

    public WifiNetworkMetadata getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getThread(), getWifi());
    }

    public void setThread(ThreadNetworkMetadata threadNetworkMetadata) {
        this.thread = threadNetworkMetadata;
    }

    public void setWifi(WifiNetworkMetadata wifiNetworkMetadata) {
        this.wifi = wifiNetworkMetadata;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withThread(getThread());
        builder.withWifi(getWifi());
        return builder;
    }

    public String toString() {
        return "NetworkMetadata(thread=" + String.valueOf(this.thread) + ", wifi=" + String.valueOf(this.wifi) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
