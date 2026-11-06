package com.amazon.alexa.matter.eventbus.schema;

import androidx.autofill.HintConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ThreadNetwork {
    private Long channel;
    private String extendedAddress;
    private String extendedPanID;
    private Long lqi;
    private String name;
    private String panID;
    private Long rssi;
    private Long version;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ThreadNetwork;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreadNetwork)) {
            return false;
        }
        ThreadNetwork threadNetwork = (ThreadNetwork) obj;
        if (!threadNetwork.canEqual(this)) {
            return false;
        }
        Long channel = getChannel();
        Long channel2 = threadNetwork.getChannel();
        if (channel != null ? !channel.equals(channel2) : channel2 != null) {
            return false;
        }
        Long lqi = getLqi();
        Long lqi2 = threadNetwork.getLqi();
        if (lqi != null ? !lqi.equals(lqi2) : lqi2 != null) {
            return false;
        }
        Long rssi = getRssi();
        Long rssi2 = threadNetwork.getRssi();
        if (rssi != null ? !rssi.equals(rssi2) : rssi2 != null) {
            return false;
        }
        Long version = getVersion();
        Long version2 = threadNetwork.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        String extendedAddress = getExtendedAddress();
        String extendedAddress2 = threadNetwork.getExtendedAddress();
        if (extendedAddress != null ? !extendedAddress.equals(extendedAddress2) : extendedAddress2 != null) {
            return false;
        }
        String extendedPanID = getExtendedPanID();
        String extendedPanID2 = threadNetwork.getExtendedPanID();
        if (extendedPanID != null ? !extendedPanID.equals(extendedPanID2) : extendedPanID2 != null) {
            return false;
        }
        String name = getName();
        String name2 = threadNetwork.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String panID = getPanID();
        String panID2 = threadNetwork.getPanID();
        return panID != null ? panID.equals(panID2) : panID2 == null;
    }

    @JsonProperty("channel")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getChannel() {
        return this.channel;
    }

    @JsonProperty(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedAddress() {
        return this.extendedAddress;
    }

    @JsonProperty("extendedPanId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanID() {
        return this.extendedPanID;
    }

    @JsonProperty("lqi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getLqi() {
        return this.lqi;
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

    @JsonProperty("rssi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getRssi() {
        return this.rssi;
    }

    @JsonProperty("version")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getVersion() {
        return this.version;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Long channel = getChannel();
        int hashCode = channel == null ? 43 : channel.hashCode();
        Long lqi = getLqi();
        int hashCode2 = ((hashCode + 59) * 59) + (lqi == null ? 43 : lqi.hashCode());
        Long rssi = getRssi();
        int hashCode3 = (hashCode2 * 59) + (rssi == null ? 43 : rssi.hashCode());
        Long version = getVersion();
        int hashCode4 = (hashCode3 * 59) + (version == null ? 43 : version.hashCode());
        String extendedAddress = getExtendedAddress();
        int hashCode5 = (hashCode4 * 59) + (extendedAddress == null ? 43 : extendedAddress.hashCode());
        String extendedPanID = getExtendedPanID();
        int hashCode6 = (hashCode5 * 59) + (extendedPanID == null ? 43 : extendedPanID.hashCode());
        String name = getName();
        int i = hashCode6 * 59;
        int hashCode7 = name == null ? 43 : name.hashCode();
        String panID = getPanID();
        return ((i + hashCode7) * 59) + (panID != null ? panID.hashCode() : 43);
    }

    @JsonProperty("channel")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setChannel(Long l) {
        this.channel = l;
    }

    @JsonProperty(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setExtendedAddress(String str) {
        this.extendedAddress = str;
    }

    @JsonProperty("extendedPanId")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setExtendedPanID(String str) {
        this.extendedPanID = str;
    }

    @JsonProperty("lqi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLqi(Long l) {
        this.lqi = l;
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

    @JsonProperty("rssi")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRssi(Long l) {
        this.rssi = l;
    }

    @JsonProperty("version")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setVersion(Long l) {
        this.version = l;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ThreadNetwork(channel=" + getChannel() + ", extendedAddress=" + getExtendedAddress() + ", extendedPanID=" + getExtendedPanID() + ", lqi=" + getLqi() + ", name=" + getName() + ", panID=" + getPanID() + ", rssi=" + getRssi() + ", version=" + getVersion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
