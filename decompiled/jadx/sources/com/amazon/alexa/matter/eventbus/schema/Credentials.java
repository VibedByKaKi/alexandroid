package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Credentials {
    private ThreadNetworkCredentials thread;
    private WiFiNetworkCredentials wifi;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Credentials() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Credentials;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) obj;
        if (!credentials.canEqual(this)) {
            return false;
        }
        ThreadNetworkCredentials thread = getThread();
        ThreadNetworkCredentials thread2 = credentials.getThread();
        if (thread != null ? !thread.equals(thread2) : thread2 != null) {
            return false;
        }
        WiFiNetworkCredentials wifi = getWifi();
        WiFiNetworkCredentials wifi2 = credentials.getWifi();
        return wifi != null ? wifi.equals(wifi2) : wifi2 == null;
    }

    @JsonProperty("thread")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkCredentials getThread() {
        return this.thread;
    }

    @JsonProperty("wifi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WiFiNetworkCredentials getWifi() {
        return this.wifi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        ThreadNetworkCredentials thread = getThread();
        int hashCode = thread == null ? 43 : thread.hashCode();
        WiFiNetworkCredentials wifi = getWifi();
        return ((hashCode + 59) * 59) + (wifi != null ? wifi.hashCode() : 43);
    }

    @JsonProperty("thread")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setThread(ThreadNetworkCredentials threadNetworkCredentials) {
        this.thread = threadNetworkCredentials;
    }

    @JsonProperty("wifi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setWifi(WiFiNetworkCredentials wiFiNetworkCredentials) {
        this.wifi = wiFiNetworkCredentials;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Credentials(thread=" + getThread() + ", wifi=" + getWifi() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
