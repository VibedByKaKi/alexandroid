package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("ThreadNetwork")
@Documentation("Thread network structure containing credentials and other operational parameters\n        networkName - Name of the Thread network. A utf8 string with a maximum length of 16 bytes\n        extendedPanId - 8 bytes represented as a hex string\n        networkKey - 16 bytes represented as a hex string\n        pskc - Hashed commissioner credential 16 bytes represented as a hex string\n        commissionerCredential - Human readable commissioner credential utf8 encoded, 6-255 bytes inclusive\n        meshLocalPrefix - ipv6 network address\n        panId - 2 bytes represented as hex string\n        channelPage - 0 for 802.15.4, other values reserved for future PHY layers\n        channelNumber - Current channel number (11-26 for 802.15.4)\n        channelMask - Bitmask representing allowable channels for the network. Channel 0 is lsb\n        party - 1P (Amazon), 2P (EERO), or 3P owned network")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class ThreadNetwork {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.ThreadNetwork");
    private Integer channelMask;
    private Integer channelNumber;
    private Integer channelPage;
    private String commissionerCredential;
    private String extendedPanId;
    private String meshLocalPrefix;
    private String networkKey;
    private String networkName;
    private String panId;
    private String party;
    private String pskc;
    private List<String> tags;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Integer channelMask;
        protected Integer channelNumber;
        protected Integer channelPage;
        protected String commissionerCredential;
        protected String extendedPanId;
        protected String meshLocalPrefix;
        protected String networkKey;
        protected String networkName;
        protected String panId;
        protected String party;
        protected String pskc;
        protected List<String> tags;

        public ThreadNetwork build() {
            ThreadNetwork threadNetwork = new ThreadNetwork();
            populate(threadNetwork);
            return threadNetwork;
        }

        public void populate(ThreadNetwork threadNetwork) {
            threadNetwork.setNetworkName(this.networkName);
            threadNetwork.setExtendedPanId(this.extendedPanId);
            threadNetwork.setNetworkKey(this.networkKey);
            threadNetwork.setPskc(this.pskc);
            threadNetwork.setCommissionerCredential(this.commissionerCredential);
            threadNetwork.setMeshLocalPrefix(this.meshLocalPrefix);
            threadNetwork.setPanId(this.panId);
            threadNetwork.setChannelPage(this.channelPage);
            threadNetwork.setChannelNumber(this.channelNumber);
            threadNetwork.setChannelMask(this.channelMask);
            threadNetwork.setParty(this.party);
            threadNetwork.setTags(this.tags);
        }

        public Builder withChannelMask(Integer num) {
            this.channelMask = num;
            return this;
        }

        public Builder withChannelNumber(Integer num) {
            this.channelNumber = num;
            return this;
        }

        public Builder withChannelPage(Integer num) {
            this.channelPage = num;
            return this;
        }

        public Builder withCommissionerCredential(String str) {
            this.commissionerCredential = str;
            return this;
        }

        public Builder withExtendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        public Builder withMeshLocalPrefix(String str) {
            this.meshLocalPrefix = str;
            return this;
        }

        public Builder withNetworkKey(String str) {
            this.networkKey = str;
            return this;
        }

        public Builder withNetworkName(String str) {
            this.networkName = str;
            return this;
        }

        public Builder withPanId(String str) {
            this.panId = str;
            return this;
        }

        public Builder withParty(String str) {
            this.party = str;
            return this;
        }

        public Builder withPskc(String str) {
            this.pskc = str;
            return this;
        }

        public Builder withTags(List<String> list) {
            this.tags = list;
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
        if (!(obj instanceof ThreadNetwork)) {
            return false;
        }
        ThreadNetwork threadNetwork = (ThreadNetwork) obj;
        return Objects.equals(getNetworkName(), threadNetwork.getNetworkName()) && Objects.equals(getExtendedPanId(), threadNetwork.getExtendedPanId()) && Objects.equals(getNetworkKey(), threadNetwork.getNetworkKey()) && Objects.equals(getPskc(), threadNetwork.getPskc()) && Objects.equals(getCommissionerCredential(), threadNetwork.getCommissionerCredential()) && Objects.equals(getMeshLocalPrefix(), threadNetwork.getMeshLocalPrefix()) && Objects.equals(getPanId(), threadNetwork.getPanId()) && Objects.equals(getChannelPage(), threadNetwork.getChannelPage()) && Objects.equals(getChannelNumber(), threadNetwork.getChannelNumber()) && Objects.equals(getChannelMask(), threadNetwork.getChannelMask()) && Objects.equals(getParty(), threadNetwork.getParty()) && Objects.equals(getTags(), threadNetwork.getTags());
    }

    public Integer getChannelMask() {
        return this.channelMask;
    }

    public Integer getChannelNumber() {
        return this.channelNumber;
    }

    public Integer getChannelPage() {
        return this.channelPage;
    }

    @Sensitive
    public String getCommissionerCredential() {
        return this.commissionerCredential;
    }

    @MaxLength(16)
    @Required
    @Sensitive
    @MinLength(16)
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @Sensitive
    public String getMeshLocalPrefix() {
        return this.meshLocalPrefix;
    }

    @MaxLength(32)
    @Required
    @Sensitive
    @MinLength(32)
    public String getNetworkKey() {
        return this.networkKey;
    }

    @Required
    @Sensitive
    public String getNetworkName() {
        return this.networkName;
    }

    @MaxLength(4)
    @MinLength(4)
    @Sensitive
    public String getPanId() {
        return this.panId;
    }

    @EnumValues({ThreadParty.First, ThreadParty.Second, ThreadParty.Third})
    @Documentation("ThreadParty is a parameter of ThreadNetwork that indicates if the given network is 1P, 2P, or 3P.\n        Party information like this is needed because treatment of Thread network processes like creation and\n        deletion are dependent on the origins of the network in question.")
    public String getParty() {
        return this.party;
    }

    @MaxLength(32)
    @MinLength(32)
    @Sensitive
    public String getPskc() {
        return this.pskc;
    }

    @ListMemberConstraint(@NestedConstraints(enumValues = {@EnumValues({NetworkTag.Public, NetworkTag.Internal, NetworkTag.Pseudo})}))
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNetworkName(), getExtendedPanId(), getNetworkKey(), getPskc(), getCommissionerCredential(), getMeshLocalPrefix(), getPanId(), getChannelPage(), getChannelNumber(), getChannelMask(), getParty(), getTags());
    }

    public void setChannelMask(Integer num) {
        this.channelMask = num;
    }

    public void setChannelNumber(Integer num) {
        this.channelNumber = num;
    }

    public void setChannelPage(Integer num) {
        this.channelPage = num;
    }

    public void setCommissionerCredential(String str) {
        this.commissionerCredential = str;
    }

    public void setExtendedPanId(String str) {
        this.extendedPanId = str;
    }

    public void setMeshLocalPrefix(String str) {
        this.meshLocalPrefix = str;
    }

    public void setNetworkKey(String str) {
        this.networkKey = str;
    }

    public void setNetworkName(String str) {
        this.networkName = str;
    }

    public void setPanId(String str) {
        this.panId = str;
    }

    public void setParty(String str) {
        this.party = str;
    }

    public void setPskc(String str) {
        this.pskc = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNetworkName(getNetworkName());
        builder.withExtendedPanId(getExtendedPanId());
        builder.withNetworkKey(getNetworkKey());
        builder.withPskc(getPskc());
        builder.withCommissionerCredential(getCommissionerCredential());
        builder.withMeshLocalPrefix(getMeshLocalPrefix());
        builder.withPanId(getPanId());
        builder.withChannelPage(getChannelPage());
        builder.withChannelNumber(getChannelNumber());
        builder.withChannelMask(getChannelMask());
        builder.withParty(getParty());
        builder.withTags(getTags());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThreadNetwork(networkName=*** REDACTED ***, extendedPanId=*** REDACTED ***, networkKey=*** REDACTED ***, pskc=*** REDACTED ***, commissionerCredential=*** REDACTED ***, meshLocalPrefix=*** REDACTED ***, panId=*** REDACTED ***, channelPage=");
        sb.append(String.valueOf(this.channelPage));
        sb.append(", channelNumber=");
        sb.append(String.valueOf(this.channelNumber));
        sb.append(", channelMask=");
        sb.append(String.valueOf(this.channelMask));
        sb.append(", party=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.party, ", tags=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.tags, sb);
    }
}
