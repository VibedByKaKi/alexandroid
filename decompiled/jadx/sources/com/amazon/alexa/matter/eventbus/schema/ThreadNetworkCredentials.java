package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ThreadNetworkCredentials {
    private long channel;
    private String extendedPanID;
    private String key;
    private String name;
    private String panID;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetworkCredentials() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ThreadNetworkCredentials;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreadNetworkCredentials)) {
            return false;
        }
        ThreadNetworkCredentials threadNetworkCredentials = (ThreadNetworkCredentials) obj;
        if (!threadNetworkCredentials.canEqual(this) || getChannel() != threadNetworkCredentials.getChannel()) {
            return false;
        }
        String extendedPanID = getExtendedPanID();
        String extendedPanID2 = threadNetworkCredentials.getExtendedPanID();
        if (extendedPanID != null ? !extendedPanID.equals(extendedPanID2) : extendedPanID2 != null) {
            return false;
        }
        String key = getKey();
        String key2 = threadNetworkCredentials.getKey();
        if (key != null ? !key.equals(key2) : key2 != null) {
            return false;
        }
        String name = getName();
        String name2 = threadNetworkCredentials.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String panID = getPanID();
        String panID2 = threadNetworkCredentials.getPanID();
        return panID != null ? panID.equals(panID2) : panID2 == null;
    }

    @JsonProperty("channel")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getChannel() {
        return this.channel;
    }

    @JsonProperty("extendedPanId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanID() {
        return this.extendedPanID;
    }

    @JsonProperty("key")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getKey() {
        return this.key;
    }

    @JsonProperty("name")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getName() {
        return this.name;
    }

    @JsonProperty("panId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPanID() {
        return this.panID;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long channel = getChannel();
        String extendedPanID = getExtendedPanID();
        int hashCode = ((((int) (channel ^ (channel >>> 32))) + 59) * 59) + (extendedPanID == null ? 43 : extendedPanID.hashCode());
        String key = getKey();
        int hashCode2 = (hashCode * 59) + (key == null ? 43 : key.hashCode());
        String name = getName();
        int i = hashCode2 * 59;
        int hashCode3 = name == null ? 43 : name.hashCode();
        String panID = getPanID();
        return ((i + hashCode3) * 59) + (panID != null ? panID.hashCode() : 43);
    }

    @JsonProperty("channel")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setChannel(long j) {
        this.channel = j;
    }

    @JsonProperty("extendedPanId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setExtendedPanID(String str) {
        this.extendedPanID = str;
    }

    @JsonProperty("key")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setKey(String str) {
        this.key = str;
    }

    @JsonProperty("name")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @JsonProperty("panId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setPanID(String str) {
        this.panID = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ThreadNetworkCredentials(channel=" + getChannel() + ", extendedPanID=" + getExtendedPanID() + ", key=" + getKey() + ", name=" + getName() + ", panID=" + getPanID() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
