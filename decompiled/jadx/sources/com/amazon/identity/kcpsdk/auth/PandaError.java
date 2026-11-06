package com.amazon.identity.kcpsdk.auth;

import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.auth.device.cg;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum PandaError {
    PandaErrorMissingValue("MissingValue", "One or more required values are missing"),
    PandaErrorInvalidValue("InvalidValue", "One or more required values are invalid"),
    PandaErrorCredentialError("CredentialError", "Invalid credentials. The provided email or phone number and password did not match our records."),
    PandaErrorServerError("ServerError", "The server has encountered a runtime error"),
    PandaErrorServiceUnavailable("ServiceUnavailable", "The service is temporarily overloaded or unavailable, try again later"),
    PandaErrorForbidden("Forbidden", "This application is not allowed to make this request."),
    PandaErrorUnknown(MetricsConstants.Error.UNKNOWN_ERROR, "Unknown error"),
    PandaErrorChallengeException("ChallengeException", "Additional credentials are required");

    private final String mErrorCode;
    private String mErrorReason = null;
    private final String mErrorString;

    PandaError(String str, String str2) {
        this.mErrorCode = str;
        this.mErrorString = str2;
    }

    public static PandaError getPandaError(String str) {
        for (PandaError pandaError : values()) {
            if (pandaError.getErrorCode().equals(str)) {
                return pandaError;
            }
        }
        return null;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorReason() {
        return this.mErrorReason;
    }

    public String getErrorString() {
        return this.mErrorString;
    }

    public void setErrorReason(String str) {
        this.mErrorReason = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        sb.append(name());
        sb.append(" ");
        return cg.a(sb, this.mErrorString, MarkdownConstants.RIGHT_BRACKET);
    }
}
