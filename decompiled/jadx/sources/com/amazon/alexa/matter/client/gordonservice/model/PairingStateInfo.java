package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class PairingStateInfo {
    private final String detailedState;
    private final UserInputInfo userInputInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class PairingStateInfoBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String detailedState;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private UserInputInfo userInputInfo;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingStateInfoBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingStateInfo build() {
            return new PairingStateInfo(this.detailedState, this.userInputInfo);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingStateInfoBuilder detailedState(String str) {
            this.detailedState = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return "PairingStateInfo.PairingStateInfoBuilder(detailedState=" + this.detailedState + ", userInputInfo=" + this.userInputInfo + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingStateInfoBuilder userInputInfo(UserInputInfo userInputInfo) {
            this.userInputInfo = userInputInfo;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private PairingStateInfo() {
        this.detailedState = null;
        this.userInputInfo = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static PairingStateInfoBuilder builder() {
        return new PairingStateInfoBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PairingStateInfo)) {
            return false;
        }
        PairingStateInfo pairingStateInfo = (PairingStateInfo) obj;
        String detailedState = getDetailedState();
        String detailedState2 = pairingStateInfo.getDetailedState();
        if (detailedState != null ? !detailedState.equals(detailedState2) : detailedState2 != null) {
            return false;
        }
        UserInputInfo userInputInfo = getUserInputInfo();
        UserInputInfo userInputInfo2 = pairingStateInfo.getUserInputInfo();
        return userInputInfo != null ? userInputInfo.equals(userInputInfo2) : userInputInfo2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getDetailedState() {
        return this.detailedState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public UserInputInfo getUserInputInfo() {
        return this.userInputInfo;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String detailedState = getDetailedState();
        int hashCode = detailedState == null ? 43 : detailedState.hashCode();
        UserInputInfo userInputInfo = getUserInputInfo();
        return ((hashCode + 59) * 59) + (userInputInfo != null ? userInputInfo.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "PairingStateInfo(detailedState=" + getDetailedState() + ", userInputInfo=" + getUserInputInfo() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingStateInfo withDetailedState(String str) {
        return this.detailedState == str ? this : new PairingStateInfo(str, this.userInputInfo);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingStateInfo withUserInputInfo(UserInputInfo userInputInfo) {
        return this.userInputInfo == userInputInfo ? this : new PairingStateInfo(this.detailedState, userInputInfo);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingStateInfo(String str, UserInputInfo userInputInfo) {
        this.detailedState = str;
        this.userInputInfo = userInputInfo;
    }
}
