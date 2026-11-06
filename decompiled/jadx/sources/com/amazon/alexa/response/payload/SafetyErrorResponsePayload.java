package com.amazon.alexa.response.payload;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.response.payload.type.SafetyErrorResponseType;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SafetyErrorResponsePayload {

    @CheckForNull
    private final String message;

    @CheckForNull
    private final SafetyErrorResponseType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SafetyErrorResponsePayloadBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String message;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private SafetyErrorResponseType type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SafetyErrorResponsePayloadBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SafetyErrorResponsePayload build() {
            return new SafetyErrorResponsePayload(this.type, this.message);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SafetyErrorResponsePayloadBuilder message(@CheckForNull String str) {
            this.message = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SafetyErrorResponsePayload.SafetyErrorResponsePayloadBuilder(type=", String.valueOf(this.type), ", message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SafetyErrorResponsePayloadBuilder type(@CheckForNull SafetyErrorResponseType safetyErrorResponseType) {
            this.type = safetyErrorResponseType;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SafetyErrorResponsePayload(@CheckForNull SafetyErrorResponseType safetyErrorResponseType, @CheckForNull String str) {
        this.type = safetyErrorResponseType;
        this.message = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SafetyErrorResponsePayloadBuilder builder() {
        return new SafetyErrorResponsePayloadBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafetyErrorResponsePayload)) {
            return false;
        }
        SafetyErrorResponsePayload safetyErrorResponsePayload = (SafetyErrorResponsePayload) obj;
        SafetyErrorResponseType type = getType();
        SafetyErrorResponseType type2 = safetyErrorResponsePayload.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = safetyErrorResponsePayload.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getMessage() {
        return this.message;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SafetyErrorResponseType getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        SafetyErrorResponseType type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        String message = getMessage();
        return ((hashCode + 59) * 59) + (message != null ? message.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SafetyErrorResponsePayload(type=", String.valueOf(getType()), ", message=", getMessage(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
