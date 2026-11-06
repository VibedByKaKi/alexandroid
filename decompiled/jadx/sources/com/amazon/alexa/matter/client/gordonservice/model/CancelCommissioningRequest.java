package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CancelCommissioningRequest {
    private final String commissionSessionId;
    private final String reason;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CancelCommissioningRequestBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String commissionSessionId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String reason;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CancelCommissioningRequestBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CancelCommissioningRequest build() {
            return new CancelCommissioningRequest(this.commissionSessionId, this.reason);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CancelCommissioningRequestBuilder commissionSessionId(String str) {
            this.commissionSessionId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CancelCommissioningRequestBuilder reason(String str) {
            this.reason = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CancelCommissioningRequest.CancelCommissioningRequestBuilder(commissionSessionId=");
            sb.append(this.commissionSessionId);
            sb.append(", reason=");
            return a$$ExternalSyntheticOutline0.m(sb, this.reason, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CancelCommissioningRequest() {
        this.commissionSessionId = null;
        this.reason = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CancelCommissioningRequestBuilder builder() {
        return new CancelCommissioningRequestBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelCommissioningRequest)) {
            return false;
        }
        CancelCommissioningRequest cancelCommissioningRequest = (CancelCommissioningRequest) obj;
        String commissionSessionId = getCommissionSessionId();
        String commissionSessionId2 = cancelCommissioningRequest.getCommissionSessionId();
        if (commissionSessionId != null ? !commissionSessionId.equals(commissionSessionId2) : commissionSessionId2 != null) {
            return false;
        }
        String reason = getReason();
        String reason2 = cancelCommissioningRequest.getReason();
        return reason != null ? reason.equals(reason2) : reason2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCommissionSessionId() {
        return this.commissionSessionId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getReason() {
        return this.reason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String commissionSessionId = getCommissionSessionId();
        int hashCode = commissionSessionId == null ? 43 : commissionSessionId.hashCode();
        String reason = getReason();
        return ((hashCode + 59) * 59) + (reason != null ? reason.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CancelCommissioningRequest(commissionSessionId=" + getCommissionSessionId() + ", reason=" + getReason() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelCommissioningRequest withCommissionSessionId(String str) {
        return this.commissionSessionId == str ? this : new CancelCommissioningRequest(str, this.reason);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelCommissioningRequest withReason(String str) {
        return this.reason == str ? this : new CancelCommissioningRequest(this.commissionSessionId, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelCommissioningRequest(String str, String str2) {
        this.commissionSessionId = str;
        this.reason = str2;
    }
}
