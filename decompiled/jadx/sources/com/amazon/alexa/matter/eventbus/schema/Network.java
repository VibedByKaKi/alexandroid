package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Network {
    private ThreadNetwork thread;
    private WiFiNetwork wifi;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Network() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Network;
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
        if (!network.canEqual(this)) {
            return false;
        }
        ThreadNetwork thread = getThread();
        ThreadNetwork thread2 = network.getThread();
        if (thread != null ? !thread.equals(thread2) : thread2 != null) {
            return false;
        }
        WiFiNetwork wifi = getWifi();
        WiFiNetwork wifi2 = network.getWifi();
        return wifi != null ? wifi.equals(wifi2) : wifi2 == null;
    }

    @JsonProperty("thread")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork getThread() {
        return this.thread;
    }

    @JsonProperty("wifi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WiFiNetwork getWifi() {
        return this.wifi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        ThreadNetwork thread = getThread();
        int hashCode = thread == null ? 43 : thread.hashCode();
        WiFiNetwork wifi = getWifi();
        return ((hashCode + 59) * 59) + (wifi != null ? wifi.hashCode() : 43);
    }

    @JsonProperty("thread")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setThread(ThreadNetwork threadNetwork) {
        this.thread = threadNetwork;
    }

    @JsonProperty("wifi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setWifi(WiFiNetwork wiFiNetwork) {
        this.wifi = wiFiNetwork;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Network(thread=" + getThread() + ", wifi=" + getWifi() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
