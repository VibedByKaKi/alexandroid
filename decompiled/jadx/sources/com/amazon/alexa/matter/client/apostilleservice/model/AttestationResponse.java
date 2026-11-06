package com.amazon.alexa.matter.client.apostilleservice.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class AttestationResponse {
    private final List<String> reason;
    private final String result;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class AttestationResponseBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<String> reason;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String result;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationResponse build() {
            return new AttestationResponse(this.result, this.reason);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationResponseBuilder reason(List<String> list) {
            this.reason = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public AttestationResponseBuilder result(String str) {
            this.result = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("AttestationResponse.AttestationResponseBuilder(result=");
            sb.append(this.result);
            sb.append(", reason=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.reason, sb);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private AttestationResponse() {
        this.result = null;
        this.reason = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static AttestationResponseBuilder builder() {
        return new AttestationResponseBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttestationResponse)) {
            return false;
        }
        AttestationResponse attestationResponse = (AttestationResponse) obj;
        String result = getResult();
        String result2 = attestationResponse.getResult();
        if (result != null ? !result.equals(result2) : result2 != null) {
            return false;
        }
        List<String> reason = getReason();
        List<String> reason2 = attestationResponse.getReason();
        return reason != null ? reason.equals(reason2) : reason2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<String> getReason() {
        return this.reason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getResult() {
        return this.result;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String result = getResult();
        int hashCode = result == null ? 43 : result.hashCode();
        List<String> reason = getReason();
        return ((hashCode + 59) * 59) + (reason != null ? reason.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "AttestationResponse(result=" + getResult() + ", reason=" + getReason() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResponse withReason(List<String> list) {
        return this.reason == list ? this : new AttestationResponse(this.result, list);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResponse withResult(String str) {
        return this.result == str ? this : new AttestationResponse(str, this.reason);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public AttestationResponse(String str, List<String> list) {
        this.result = str;
        this.reason = list;
    }
}
