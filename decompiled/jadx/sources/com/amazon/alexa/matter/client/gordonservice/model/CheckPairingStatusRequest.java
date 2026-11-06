package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CheckPairingStatusRequest {
    private final String sessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CheckPairingStatusRequestBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String sessionId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusRequestBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusRequest build() {
            return new CheckPairingStatusRequest(this.sessionId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CheckPairingStatusRequestBuilder sessionId(String str) {
            this.sessionId = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("CheckPairingStatusRequest.CheckPairingStatusRequestBuilder(sessionId="), this.sessionId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CheckPairingStatusRequest() {
        this.sessionId = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CheckPairingStatusRequestBuilder builder() {
        return new CheckPairingStatusRequestBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckPairingStatusRequest)) {
            return false;
        }
        String sessionId = getSessionId();
        String sessionId2 = ((CheckPairingStatusRequest) obj).getSessionId();
        return sessionId != null ? sessionId.equals(sessionId2) : sessionId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String sessionId = getSessionId();
        return 59 + (sessionId == null ? 43 : sessionId.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CheckPairingStatusRequest(sessionId=" + getSessionId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusRequest withSessionId(String str) {
        return this.sessionId == str ? this : new CheckPairingStatusRequest(str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CheckPairingStatusRequest(String str) {
        this.sessionId = str;
    }
}
