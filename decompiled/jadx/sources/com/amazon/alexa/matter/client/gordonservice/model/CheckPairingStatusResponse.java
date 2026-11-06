package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CheckPairingStatusResponse {
    private final String endpointId;
    private final String failureReason;
    private final PairingStateInfo pairingStateInfo;
    private final String pairingStatus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CheckPairingStatusResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String endpointId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String failureReason;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PairingStateInfo pairingStateInfo;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String pairingStatus;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusResponse build() {
            return new CheckPairingStatusResponse(this.pairingStatus, this.failureReason, this.pairingStateInfo, this.endpointId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusResponseBuilder endpointId(String str) {
            this.endpointId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusResponseBuilder failureReason(String str) {
            this.failureReason = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusResponseBuilder pairingStateInfo(PairingStateInfo pairingStateInfo) {
            this.pairingStateInfo = pairingStateInfo;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusResponseBuilder pairingStatus(String str) {
            this.pairingStatus = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CheckPairingStatusResponse.CheckPairingStatusResponseBuilder(pairingStatus=");
            sb.append(this.pairingStatus);
            sb.append(", failureReason=");
            sb.append(this.failureReason);
            sb.append(", pairingStateInfo=");
            sb.append(this.pairingStateInfo);
            sb.append(", endpointId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.endpointId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CheckPairingStatusResponse() {
        this.pairingStatus = null;
        this.failureReason = null;
        this.pairingStateInfo = null;
        this.endpointId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CheckPairingStatusResponseBuilder builder() {
        return new CheckPairingStatusResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckPairingStatusResponse)) {
            return false;
        }
        CheckPairingStatusResponse checkPairingStatusResponse = (CheckPairingStatusResponse) obj;
        String pairingStatus = getPairingStatus();
        String pairingStatus2 = checkPairingStatusResponse.getPairingStatus();
        if (pairingStatus != null ? !pairingStatus.equals(pairingStatus2) : pairingStatus2 != null) {
            return false;
        }
        String failureReason = getFailureReason();
        String failureReason2 = checkPairingStatusResponse.getFailureReason();
        if (failureReason != null ? !failureReason.equals(failureReason2) : failureReason2 != null) {
            return false;
        }
        PairingStateInfo pairingStateInfo = getPairingStateInfo();
        PairingStateInfo pairingStateInfo2 = checkPairingStatusResponse.getPairingStateInfo();
        if (pairingStateInfo != null ? !pairingStateInfo.equals(pairingStateInfo2) : pairingStateInfo2 != null) {
            return false;
        }
        String endpointId = getEndpointId();
        String endpointId2 = checkPairingStatusResponse.getEndpointId();
        return endpointId != null ? endpointId.equals(endpointId2) : endpointId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpointId() {
        return this.endpointId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getFailureReason() {
        return this.failureReason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingStateInfo getPairingStateInfo() {
        return this.pairingStateInfo;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPairingStatus() {
        return this.pairingStatus;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String pairingStatus = getPairingStatus();
        int hashCode = pairingStatus == null ? 43 : pairingStatus.hashCode();
        String failureReason = getFailureReason();
        int hashCode2 = ((hashCode + 59) * 59) + (failureReason == null ? 43 : failureReason.hashCode());
        PairingStateInfo pairingStateInfo = getPairingStateInfo();
        int i = hashCode2 * 59;
        int hashCode3 = pairingStateInfo == null ? 43 : pairingStateInfo.hashCode();
        String endpointId = getEndpointId();
        return ((i + hashCode3) * 59) + (endpointId != null ? endpointId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CheckPairingStatusResponse(pairingStatus=" + getPairingStatus() + ", failureReason=" + getFailureReason() + ", pairingStateInfo=" + getPairingStateInfo() + ", endpointId=" + getEndpointId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusResponse withEndpointId(String str) {
        return this.endpointId == str ? this : new CheckPairingStatusResponse(this.pairingStatus, this.failureReason, this.pairingStateInfo, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusResponse withFailureReason(String str) {
        return this.failureReason == str ? this : new CheckPairingStatusResponse(this.pairingStatus, str, this.pairingStateInfo, this.endpointId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusResponse withPairingStateInfo(PairingStateInfo pairingStateInfo) {
        return this.pairingStateInfo == pairingStateInfo ? this : new CheckPairingStatusResponse(this.pairingStatus, this.failureReason, pairingStateInfo, this.endpointId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusResponse withPairingStatus(String str) {
        return this.pairingStatus == str ? this : new CheckPairingStatusResponse(str, this.failureReason, this.pairingStateInfo, this.endpointId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusResponse(String str, String str2, PairingStateInfo pairingStateInfo, String str3) {
        this.pairingStatus = str;
        this.failureReason = str2;
        this.pairingStateInfo = pairingStateInfo;
        this.endpointId = str3;
    }
}
