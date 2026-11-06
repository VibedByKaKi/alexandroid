package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class SetupRequirementsResponse {
    private final String activeAdministratorCaseAuthenticatedTag;
    private final String challengeQuestionHint;
    private final String commissionSessionID;
    private final CustomFlow customFlow;
    private final String deviceTypeSupportStatus;
    private final String errorMessage;
    private final String fabricId;
    private final String identityProtectionKey;
    private final boolean isChallengeRequired;
    private final String nodeId;
    private final PairingHints pairingHints;
    private final int responseCode;
    private final Skill skill;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SetupRequirementsResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String activeAdministratorCaseAuthenticatedTag;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String challengeQuestionHint;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String commissionSessionID;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private CustomFlow customFlow;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String deviceTypeSupportStatus;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String errorMessage;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String fabricId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String identityProtectionKey;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private boolean isChallengeRequired;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String nodeId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PairingHints pairingHints;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int responseCode;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Skill skill;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder activeAdministratorCaseAuthenticatedTag(String str) {
            this.activeAdministratorCaseAuthenticatedTag = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponse build() {
            return new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder challengeQuestionHint(String str) {
            this.challengeQuestionHint = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder commissionSessionID(String str) {
            this.commissionSessionID = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder customFlow(CustomFlow customFlow) {
            this.customFlow = customFlow;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder deviceTypeSupportStatus(String str) {
            this.deviceTypeSupportStatus = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder fabricId(String str) {
            this.fabricId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder identityProtectionKey(String str) {
            this.identityProtectionKey = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder isChallengeRequired(boolean z) {
            this.isChallengeRequired = z;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder nodeId(String str) {
            this.nodeId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder pairingHints(PairingHints pairingHints) {
            this.pairingHints = pairingHints;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder responseCode(int i) {
            this.responseCode = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsResponseBuilder skill(Skill skill) {
            this.skill = skill;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("SetupRequirementsResponse.SetupRequirementsResponseBuilder(responseCode=");
            sb.append(this.responseCode);
            sb.append(", commissionSessionID=");
            sb.append(this.commissionSessionID);
            sb.append(", nodeId=");
            sb.append(this.nodeId);
            sb.append(", fabricId=");
            sb.append(this.fabricId);
            sb.append(", activeAdministratorCaseAuthenticatedTag=");
            sb.append(this.activeAdministratorCaseAuthenticatedTag);
            sb.append(", identityProtectionKey=");
            sb.append(this.identityProtectionKey);
            sb.append(", isChallengeRequired=");
            sb.append(this.isChallengeRequired);
            sb.append(", challengeQuestionHint=");
            sb.append(this.challengeQuestionHint);
            sb.append(", customFlow=");
            sb.append(this.customFlow);
            sb.append(", skill=");
            sb.append(this.skill);
            sb.append(", pairingHints=");
            sb.append(this.pairingHints);
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
            sb.append(", deviceTypeSupportStatus=");
            return a$$ExternalSyntheticOutline0.m(sb, this.deviceTypeSupportStatus, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private SetupRequirementsResponse() {
        this.responseCode = 0;
        this.commissionSessionID = null;
        this.nodeId = null;
        this.fabricId = null;
        this.activeAdministratorCaseAuthenticatedTag = null;
        this.identityProtectionKey = null;
        this.isChallengeRequired = false;
        this.challengeQuestionHint = null;
        this.customFlow = null;
        this.skill = null;
        this.pairingHints = null;
        this.errorMessage = null;
        this.deviceTypeSupportStatus = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SetupRequirementsResponseBuilder builder() {
        return new SetupRequirementsResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetupRequirementsResponse)) {
            return false;
        }
        SetupRequirementsResponse setupRequirementsResponse = (SetupRequirementsResponse) obj;
        if (getResponseCode() != setupRequirementsResponse.getResponseCode() || isChallengeRequired() != setupRequirementsResponse.isChallengeRequired()) {
            return false;
        }
        String commissionSessionID = getCommissionSessionID();
        String commissionSessionID2 = setupRequirementsResponse.getCommissionSessionID();
        if (commissionSessionID != null ? !commissionSessionID.equals(commissionSessionID2) : commissionSessionID2 != null) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = setupRequirementsResponse.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        String fabricId = getFabricId();
        String fabricId2 = setupRequirementsResponse.getFabricId();
        if (fabricId != null ? !fabricId.equals(fabricId2) : fabricId2 != null) {
            return false;
        }
        String activeAdministratorCaseAuthenticatedTag = getActiveAdministratorCaseAuthenticatedTag();
        String activeAdministratorCaseAuthenticatedTag2 = setupRequirementsResponse.getActiveAdministratorCaseAuthenticatedTag();
        if (activeAdministratorCaseAuthenticatedTag != null ? !activeAdministratorCaseAuthenticatedTag.equals(activeAdministratorCaseAuthenticatedTag2) : activeAdministratorCaseAuthenticatedTag2 != null) {
            return false;
        }
        String identityProtectionKey = getIdentityProtectionKey();
        String identityProtectionKey2 = setupRequirementsResponse.getIdentityProtectionKey();
        if (identityProtectionKey != null ? !identityProtectionKey.equals(identityProtectionKey2) : identityProtectionKey2 != null) {
            return false;
        }
        String challengeQuestionHint = getChallengeQuestionHint();
        String challengeQuestionHint2 = setupRequirementsResponse.getChallengeQuestionHint();
        if (challengeQuestionHint != null ? !challengeQuestionHint.equals(challengeQuestionHint2) : challengeQuestionHint2 != null) {
            return false;
        }
        CustomFlow customFlow = getCustomFlow();
        CustomFlow customFlow2 = setupRequirementsResponse.getCustomFlow();
        if (customFlow != null ? !customFlow.equals(customFlow2) : customFlow2 != null) {
            return false;
        }
        Skill skill = getSkill();
        Skill skill2 = setupRequirementsResponse.getSkill();
        if (skill != null ? !skill.equals(skill2) : skill2 != null) {
            return false;
        }
        PairingHints pairingHints = getPairingHints();
        PairingHints pairingHints2 = setupRequirementsResponse.getPairingHints();
        if (pairingHints != null ? !pairingHints.equals(pairingHints2) : pairingHints2 != null) {
            return false;
        }
        String errorMessage = getErrorMessage();
        String errorMessage2 = setupRequirementsResponse.getErrorMessage();
        if (errorMessage != null ? !errorMessage.equals(errorMessage2) : errorMessage2 != null) {
            return false;
        }
        String deviceTypeSupportStatus = getDeviceTypeSupportStatus();
        String deviceTypeSupportStatus2 = setupRequirementsResponse.getDeviceTypeSupportStatus();
        return deviceTypeSupportStatus != null ? deviceTypeSupportStatus.equals(deviceTypeSupportStatus2) : deviceTypeSupportStatus2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getActiveAdministratorCaseAuthenticatedTag() {
        return this.activeAdministratorCaseAuthenticatedTag;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getChallengeQuestionHint() {
        return this.challengeQuestionHint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCommissionSessionID() {
        return this.commissionSessionID;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomFlow getCustomFlow() {
        return this.customFlow;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDeviceTypeSupportStatus() {
        return this.deviceTypeSupportStatus;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getFabricId() {
        return this.fabricId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getIdentityProtectionKey() {
        return this.identityProtectionKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingHints getPairingHints() {
        return this.pairingHints;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getResponseCode() {
        return this.responseCode;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Skill getSkill() {
        return this.skill;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int responseCode = ((getResponseCode() + 59) * 59) + (isChallengeRequired() ? 79 : 97);
        String commissionSessionID = getCommissionSessionID();
        int hashCode = (responseCode * 59) + (commissionSessionID == null ? 43 : commissionSessionID.hashCode());
        String nodeId = getNodeId();
        int hashCode2 = (hashCode * 59) + (nodeId == null ? 43 : nodeId.hashCode());
        String fabricId = getFabricId();
        int hashCode3 = (hashCode2 * 59) + (fabricId == null ? 43 : fabricId.hashCode());
        String activeAdministratorCaseAuthenticatedTag = getActiveAdministratorCaseAuthenticatedTag();
        int hashCode4 = (hashCode3 * 59) + (activeAdministratorCaseAuthenticatedTag == null ? 43 : activeAdministratorCaseAuthenticatedTag.hashCode());
        String identityProtectionKey = getIdentityProtectionKey();
        int hashCode5 = (hashCode4 * 59) + (identityProtectionKey == null ? 43 : identityProtectionKey.hashCode());
        String challengeQuestionHint = getChallengeQuestionHint();
        int hashCode6 = (hashCode5 * 59) + (challengeQuestionHint == null ? 43 : challengeQuestionHint.hashCode());
        CustomFlow customFlow = getCustomFlow();
        int hashCode7 = (hashCode6 * 59) + (customFlow == null ? 43 : customFlow.hashCode());
        Skill skill = getSkill();
        int hashCode8 = (hashCode7 * 59) + (skill == null ? 43 : skill.hashCode());
        PairingHints pairingHints = getPairingHints();
        int hashCode9 = (hashCode8 * 59) + (pairingHints == null ? 43 : pairingHints.hashCode());
        String errorMessage = getErrorMessage();
        int i = hashCode9 * 59;
        int hashCode10 = errorMessage == null ? 43 : errorMessage.hashCode();
        String deviceTypeSupportStatus = getDeviceTypeSupportStatus();
        return ((i + hashCode10) * 59) + (deviceTypeSupportStatus != null ? deviceTypeSupportStatus.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean isChallengeRequired() {
        return this.isChallengeRequired;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SetupRequirementsResponse(responseCode=" + getResponseCode() + ", commissionSessionID=" + getCommissionSessionID() + ", nodeId=" + getNodeId() + ", fabricId=" + getFabricId() + ", activeAdministratorCaseAuthenticatedTag=" + getActiveAdministratorCaseAuthenticatedTag() + ", identityProtectionKey=" + getIdentityProtectionKey() + ", isChallengeRequired=" + isChallengeRequired() + ", challengeQuestionHint=" + getChallengeQuestionHint() + ", customFlow=" + getCustomFlow() + ", skill=" + getSkill() + ", pairingHints=" + getPairingHints() + ", errorMessage=" + getErrorMessage() + ", deviceTypeSupportStatus=" + getDeviceTypeSupportStatus() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withActiveAdministratorCaseAuthenticatedTag(String str) {
        return this.activeAdministratorCaseAuthenticatedTag == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, str, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withChallengeQuestionHint(String str) {
        return this.challengeQuestionHint == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, str, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withChallengeRequired(boolean z) {
        return this.isChallengeRequired == z ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, z, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withCommissionSessionID(String str) {
        return this.commissionSessionID == str ? this : new SetupRequirementsResponse(this.responseCode, str, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withCustomFlow(CustomFlow customFlow) {
        return this.customFlow == customFlow ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withDeviceTypeSupportStatus(String str) {
        return this.deviceTypeSupportStatus == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withErrorMessage(String str) {
        return this.errorMessage == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, str, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withFabricId(String str) {
        return this.fabricId == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, str, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withIdentityProtectionKey(String str) {
        return this.identityProtectionKey == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, str, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withNodeId(String str) {
        return this.nodeId == str ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, str, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withPairingHints(PairingHints pairingHints) {
        return this.pairingHints == pairingHints ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withResponseCode(int i) {
        return this.responseCode == i ? this : new SetupRequirementsResponse(i, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, this.skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse withSkill(Skill skill) {
        return this.skill == skill ? this : new SetupRequirementsResponse(this.responseCode, this.commissionSessionID, this.nodeId, this.fabricId, this.activeAdministratorCaseAuthenticatedTag, this.identityProtectionKey, this.isChallengeRequired, this.challengeQuestionHint, this.customFlow, skill, this.pairingHints, this.errorMessage, this.deviceTypeSupportStatus);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsResponse(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, CustomFlow customFlow, Skill skill, PairingHints pairingHints, String str7, String str8) {
        this.responseCode = i;
        this.commissionSessionID = str;
        this.nodeId = str2;
        this.fabricId = str3;
        this.activeAdministratorCaseAuthenticatedTag = str4;
        this.identityProtectionKey = str5;
        this.isChallengeRequired = z;
        this.challengeQuestionHint = str6;
        this.customFlow = customFlow;
        this.skill = skill;
        this.pairingHints = pairingHints;
        this.errorMessage = str7;
        this.deviceTypeSupportStatus = str8;
    }
}
