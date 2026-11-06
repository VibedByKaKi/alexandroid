package com.amazon.alexa.response.payload;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.response.payload.type.ErrorResponseType;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ErrorResponsePayload {

    @CheckForNull
    private final String message;

    @CheckForNull
    private final ErrorResponseType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ErrorResponsePayloadBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String message;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private ErrorResponseType type;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ErrorResponsePayloadBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ErrorResponsePayload build() {
            return new ErrorResponsePayload(this.type, this.message);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ErrorResponsePayloadBuilder message(@CheckForNull String str) {
            this.message = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ErrorResponsePayload.ErrorResponsePayloadBuilder(type=", String.valueOf(this.type), ", message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ErrorResponsePayloadBuilder type(@CheckForNull ErrorResponseType errorResponseType) {
            this.type = errorResponseType;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ErrorResponsePayload(@CheckForNull ErrorResponseType errorResponseType, @CheckForNull String str) {
        this.type = errorResponseType;
        this.message = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static ErrorResponsePayloadBuilder builder() {
        return new ErrorResponsePayloadBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ErrorResponsePayload)) {
            return false;
        }
        ErrorResponsePayload errorResponsePayload = (ErrorResponsePayload) obj;
        ErrorResponseType type = getType();
        ErrorResponseType type2 = errorResponsePayload.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = errorResponsePayload.getMessage();
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
    public ErrorResponseType getType() {
        return this.type;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        ErrorResponseType type = getType();
        int hashCode = type == null ? 43 : type.hashCode();
        String message = getMessage();
        return ((hashCode + 59) * 59) + (message != null ? message.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ErrorResponsePayload(type=", String.valueOf(getType()), ", message=", getMessage(), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
