package com.amazon.alexa.matter.client.credentiallockerservice.model;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ThreadNetwork {
    private final Integer channelMask;
    private final Integer channelNumber;
    private final Integer channelPage;
    private final String commissionerCredential;
    private final String extendedPanId;
    private final String meshLocalPrefix;
    private final String networkKey;
    private final String networkName;
    private final String panId;
    private final String party;
    private final String pskc;
    private final List<String> tags;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ThreadNetworkBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer channelMask;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer channelNumber;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer channelPage;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String commissionerCredential;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String extendedPanId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String meshLocalPrefix;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String networkKey;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String networkName;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String panId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String party;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String pskc;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<String> tags;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetwork build() {
            return new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder channelMask(Integer num) {
            this.channelMask = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder channelNumber(Integer num) {
            this.channelNumber = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder channelPage(Integer num) {
            this.channelPage = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder commissionerCredential(String str) {
            this.commissionerCredential = str;
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
        public ThreadNetworkBuilder meshLocalPrefix(String str) {
            this.meshLocalPrefix = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder networkKey(String str) {
            this.networkKey = str;
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
        public ThreadNetworkBuilder party(String str) {
            this.party = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder pskc(String str) {
            this.pskc = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ThreadNetworkBuilder tags(List<String> list) {
            this.tags = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadNetwork.ThreadNetworkBuilder(extendedPanId=");
            sb.append(this.extendedPanId);
            sb.append(", meshLocalPrefix=");
            sb.append(this.meshLocalPrefix);
            sb.append(", networkName=");
            sb.append(this.networkName);
            sb.append(", channelMask=");
            sb.append(this.channelMask);
            sb.append(", commissionerCredential=");
            sb.append(this.commissionerCredential);
            sb.append(", panId=");
            sb.append(this.panId);
            sb.append(", party=");
            sb.append(this.party);
            sb.append(", tags=");
            sb.append(this.tags);
            sb.append(", networkKey=");
            sb.append(this.networkKey);
            sb.append(", pskc=");
            sb.append(this.pskc);
            sb.append(", channelPage=");
            sb.append(this.channelPage);
            sb.append(", channelNumber=");
            return Automotive$$ExternalSyntheticOutline0.m(sb, this.channelNumber, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private ThreadNetwork() {
        this.extendedPanId = null;
        this.meshLocalPrefix = null;
        this.networkName = null;
        this.channelMask = null;
        this.commissionerCredential = null;
        this.panId = null;
        this.party = null;
        this.tags = null;
        this.networkKey = null;
        this.pskc = null;
        this.channelPage = null;
        this.channelNumber = null;
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
        Integer channelMask = getChannelMask();
        Integer channelMask2 = threadNetwork.getChannelMask();
        if (channelMask != null ? !channelMask.equals(channelMask2) : channelMask2 != null) {
            return false;
        }
        Integer channelPage = getChannelPage();
        Integer channelPage2 = threadNetwork.getChannelPage();
        if (channelPage != null ? !channelPage.equals(channelPage2) : channelPage2 != null) {
            return false;
        }
        Integer channelNumber = getChannelNumber();
        Integer channelNumber2 = threadNetwork.getChannelNumber();
        if (channelNumber != null ? !channelNumber.equals(channelNumber2) : channelNumber2 != null) {
            return false;
        }
        String extendedPanId = getExtendedPanId();
        String extendedPanId2 = threadNetwork.getExtendedPanId();
        if (extendedPanId != null ? !extendedPanId.equals(extendedPanId2) : extendedPanId2 != null) {
            return false;
        }
        String meshLocalPrefix = getMeshLocalPrefix();
        String meshLocalPrefix2 = threadNetwork.getMeshLocalPrefix();
        if (meshLocalPrefix != null ? !meshLocalPrefix.equals(meshLocalPrefix2) : meshLocalPrefix2 != null) {
            return false;
        }
        String networkName = getNetworkName();
        String networkName2 = threadNetwork.getNetworkName();
        if (networkName != null ? !networkName.equals(networkName2) : networkName2 != null) {
            return false;
        }
        String commissionerCredential = getCommissionerCredential();
        String commissionerCredential2 = threadNetwork.getCommissionerCredential();
        if (commissionerCredential != null ? !commissionerCredential.equals(commissionerCredential2) : commissionerCredential2 != null) {
            return false;
        }
        String panId = getPanId();
        String panId2 = threadNetwork.getPanId();
        if (panId != null ? !panId.equals(panId2) : panId2 != null) {
            return false;
        }
        String party = getParty();
        String party2 = threadNetwork.getParty();
        if (party != null ? !party.equals(party2) : party2 != null) {
            return false;
        }
        List<String> tags = getTags();
        List<String> tags2 = threadNetwork.getTags();
        if (tags != null ? !tags.equals(tags2) : tags2 != null) {
            return false;
        }
        String networkKey = getNetworkKey();
        String networkKey2 = threadNetwork.getNetworkKey();
        if (networkKey != null ? !networkKey.equals(networkKey2) : networkKey2 != null) {
            return false;
        }
        String pskc = getPskc();
        String pskc2 = threadNetwork.getPskc();
        return pskc != null ? pskc.equals(pskc2) : pskc2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getChannelMask() {
        return this.channelMask;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getChannelNumber() {
        return this.channelNumber;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getChannelPage() {
        return this.channelPage;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCommissionerCredential() {
        return this.commissionerCredential;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getMeshLocalPrefix() {
        return this.meshLocalPrefix;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkKey() {
        return this.networkKey;
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
    public String getParty() {
        return this.party;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPskc() {
        return this.pskc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<String> getTags() {
        return this.tags;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Integer channelMask = getChannelMask();
        int hashCode = channelMask == null ? 43 : channelMask.hashCode();
        Integer channelPage = getChannelPage();
        int hashCode2 = ((hashCode + 59) * 59) + (channelPage == null ? 43 : channelPage.hashCode());
        Integer channelNumber = getChannelNumber();
        int hashCode3 = (hashCode2 * 59) + (channelNumber == null ? 43 : channelNumber.hashCode());
        String extendedPanId = getExtendedPanId();
        int hashCode4 = (hashCode3 * 59) + (extendedPanId == null ? 43 : extendedPanId.hashCode());
        String meshLocalPrefix = getMeshLocalPrefix();
        int hashCode5 = (hashCode4 * 59) + (meshLocalPrefix == null ? 43 : meshLocalPrefix.hashCode());
        String networkName = getNetworkName();
        int hashCode6 = (hashCode5 * 59) + (networkName == null ? 43 : networkName.hashCode());
        String commissionerCredential = getCommissionerCredential();
        int hashCode7 = (hashCode6 * 59) + (commissionerCredential == null ? 43 : commissionerCredential.hashCode());
        String panId = getPanId();
        int hashCode8 = (hashCode7 * 59) + (panId == null ? 43 : panId.hashCode());
        String party = getParty();
        int hashCode9 = (hashCode8 * 59) + (party == null ? 43 : party.hashCode());
        List<String> tags = getTags();
        int hashCode10 = (hashCode9 * 59) + (tags == null ? 43 : tags.hashCode());
        String networkKey = getNetworkKey();
        int i = hashCode10 * 59;
        int hashCode11 = networkKey == null ? 43 : networkKey.hashCode();
        String pskc = getPskc();
        return ((i + hashCode11) * 59) + (pskc != null ? pskc.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ThreadNetwork(extendedPanId=" + getExtendedPanId() + ", meshLocalPrefix=" + getMeshLocalPrefix() + ", networkName=" + getNetworkName() + ", channelMask=" + getChannelMask() + ", commissionerCredential=" + getCommissionerCredential() + ", panId=" + getPanId() + ", party=" + getParty() + ", tags=" + getTags() + ", networkKey=" + getNetworkKey() + ", pskc=" + getPskc() + ", channelPage=" + getChannelPage() + ", channelNumber=" + getChannelNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withChannelMask(Integer num) {
        return this.channelMask == num ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, num, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withChannelNumber(Integer num) {
        return this.channelNumber == num ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, num);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withChannelPage(Integer num) {
        return this.channelPage == num ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, num, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withCommissionerCredential(String str) {
        return this.commissionerCredential == str ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, str, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withExtendedPanId(String str) {
        return this.extendedPanId == str ? this : new ThreadNetwork(str, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withMeshLocalPrefix(String str) {
        return this.meshLocalPrefix == str ? this : new ThreadNetwork(this.extendedPanId, str, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withNetworkKey(String str) {
        return this.networkKey == str ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, str, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withNetworkName(String str) {
        return this.networkName == str ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, str, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withPanId(String str) {
        return this.panId == str ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, str, this.party, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withParty(String str) {
        return this.party == str ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, str, this.tags, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withPskc(String str) {
        return this.pskc == str ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, this.tags, this.networkKey, str, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork withTags(List<String> list) {
        return this.tags == list ? this : new ThreadNetwork(this.extendedPanId, this.meshLocalPrefix, this.networkName, this.channelMask, this.commissionerCredential, this.panId, this.party, list, this.networkKey, this.pskc, this.channelPage, this.channelNumber);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadNetwork(String str, String str2, String str3, Integer num, String str4, String str5, String str6, List<String> list, String str7, String str8, Integer num2, Integer num3) {
        this.extendedPanId = str;
        this.meshLocalPrefix = str2;
        this.networkName = str3;
        this.channelMask = num;
        this.commissionerCredential = str4;
        this.panId = str5;
        this.party = str6;
        this.tags = list;
        this.networkKey = str7;
        this.pskc = str8;
        this.channelPage = num2;
        this.channelNumber = num3;
    }
}
