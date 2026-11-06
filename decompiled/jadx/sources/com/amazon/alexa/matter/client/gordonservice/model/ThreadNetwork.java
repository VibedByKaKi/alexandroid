package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ThreadNetwork {
    private final Integer channel;
    private final String extendedAddress;
    private final String extendedPanId;
    private final Integer lqi;
    private final String networkName;
    private final String panId;
    private final Integer rssi;
    private final Integer version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ThreadNetworkBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer channel;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String extendedAddress;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String extendedPanId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer lqi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String networkName;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String panId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer rssi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer version;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetwork build() {
            return new ThreadNetwork(this.panId, this.extendedPanId, this.networkName, this.channel, this.version, this.extendedAddress, this.rssi, this.lqi);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder channel(Integer num) {
            this.channel = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder extendedAddress(String str) {
            this.extendedAddress = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder extendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder lqi(Integer num) {
            this.lqi = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder networkName(String str) {
            this.networkName = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder panId(String str) {
            this.panId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder rssi(Integer num) {
            this.rssi = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadNetwork.ThreadNetworkBuilder(panId=");
            sb.append(this.panId);
            sb.append(", extendedPanId=");
            sb.append(this.extendedPanId);
            sb.append(", networkName=");
            sb.append(this.networkName);
            sb.append(", channel=");
            sb.append(this.channel);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", extendedAddress=");
            sb.append(this.extendedAddress);
            sb.append(", rssi=");
            sb.append(this.rssi);
            sb.append(", lqi=");
            return Automotive$$ExternalSyntheticOutline0.m(sb, this.lqi, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder version(Integer num) {
            this.version = num;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private ThreadNetwork() {
        this.panId = null;
        this.extendedPanId = null;
        this.networkName = null;
        this.channel = null;
        this.version = null;
        this.extendedAddress = null;
        this.rssi = null;
        this.lqi = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ThreadNetworkBuilder builder() {
        return new ThreadNetworkBuilder();
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
        Integer channel = getChannel();
        Integer channel2 = threadNetwork.getChannel();
        if (channel != null ? !channel.equals(channel2) : channel2 != null) {
            return false;
        }
        Integer version = getVersion();
        Integer version2 = threadNetwork.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        Integer rssi = getRssi();
        Integer rssi2 = threadNetwork.getRssi();
        if (rssi != null ? !rssi.equals(rssi2) : rssi2 != null) {
            return false;
        }
        Integer lqi = getLqi();
        Integer lqi2 = threadNetwork.getLqi();
        if (lqi != null ? !lqi.equals(lqi2) : lqi2 != null) {
            return false;
        }
        String panId = getPanId();
        String panId2 = threadNetwork.getPanId();
        if (panId != null ? !panId.equals(panId2) : panId2 != null) {
            return false;
        }
        String extendedPanId = getExtendedPanId();
        String extendedPanId2 = threadNetwork.getExtendedPanId();
        if (extendedPanId != null ? !extendedPanId.equals(extendedPanId2) : extendedPanId2 != null) {
            return false;
        }
        String networkName = getNetworkName();
        String networkName2 = threadNetwork.getNetworkName();
        if (networkName != null ? !networkName.equals(networkName2) : networkName2 != null) {
            return false;
        }
        String extendedAddress = getExtendedAddress();
        String extendedAddress2 = threadNetwork.getExtendedAddress();
        return extendedAddress != null ? extendedAddress.equals(extendedAddress2) : extendedAddress2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getChannel() {
        return this.channel;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedAddress() {
        return this.extendedAddress;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getLqi() {
        return this.lqi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkName() {
        return this.networkName;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPanId() {
        return this.panId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getRssi() {
        return this.rssi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getVersion() {
        return this.version;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Integer channel = getChannel();
        int hashCode = channel == null ? 43 : channel.hashCode();
        Integer version = getVersion();
        int hashCode2 = ((hashCode + 59) * 59) + (version == null ? 43 : version.hashCode());
        Integer rssi = getRssi();
        int hashCode3 = (hashCode2 * 59) + (rssi == null ? 43 : rssi.hashCode());
        Integer lqi = getLqi();
        int hashCode4 = (hashCode3 * 59) + (lqi == null ? 43 : lqi.hashCode());
        String panId = getPanId();
        int hashCode5 = (hashCode4 * 59) + (panId == null ? 43 : panId.hashCode());
        String extendedPanId = getExtendedPanId();
        int hashCode6 = (hashCode5 * 59) + (extendedPanId == null ? 43 : extendedPanId.hashCode());
        String networkName = getNetworkName();
        int i = hashCode6 * 59;
        int hashCode7 = networkName == null ? 43 : networkName.hashCode();
        String extendedAddress = getExtendedAddress();
        return ((i + hashCode7) * 59) + (extendedAddress != null ? extendedAddress.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ThreadNetwork(panId=" + getPanId() + ", extendedPanId=" + getExtendedPanId() + ", networkName=" + getNetworkName() + ", channel=" + getChannel() + ", version=" + getVersion() + ", extendedAddress=" + getExtendedAddress() + ", rssi=" + getRssi() + ", lqi=" + getLqi() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withChannel(Integer num) {
        return this.channel == num ? this : new ThreadNetwork(this.panId, this.extendedPanId, this.networkName, num, this.version, this.extendedAddress, this.rssi, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withExtendedAddress(String str) {
        return this.extendedAddress == str ? this : new ThreadNetwork(this.panId, this.extendedPanId, this.networkName, this.channel, this.version, str, this.rssi, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withExtendedPanId(String str) {
        return this.extendedPanId == str ? this : new ThreadNetwork(this.panId, str, this.networkName, this.channel, this.version, this.extendedAddress, this.rssi, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withLqi(Integer num) {
        return this.lqi == num ? this : new ThreadNetwork(this.panId, this.extendedPanId, this.networkName, this.channel, this.version, this.extendedAddress, this.rssi, num);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withNetworkName(String str) {
        return this.networkName == str ? this : new ThreadNetwork(this.panId, this.extendedPanId, str, this.channel, this.version, this.extendedAddress, this.rssi, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withPanId(String str) {
        return this.panId == str ? this : new ThreadNetwork(str, this.extendedPanId, this.networkName, this.channel, this.version, this.extendedAddress, this.rssi, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withRssi(Integer num) {
        return this.rssi == num ? this : new ThreadNetwork(this.panId, this.extendedPanId, this.networkName, this.channel, this.version, this.extendedAddress, num, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withVersion(Integer num) {
        return this.version == num ? this : new ThreadNetwork(this.panId, this.extendedPanId, this.networkName, this.channel, num, this.extendedAddress, this.rssi, this.lqi);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, Integer num4) {
        this.panId = str;
        this.extendedPanId = str2;
        this.networkName = str3;
        this.channel = num;
        this.version = num2;
        this.extendedAddress = str4;
        this.rssi = num3;
        this.lqi = num4;
    }
}
