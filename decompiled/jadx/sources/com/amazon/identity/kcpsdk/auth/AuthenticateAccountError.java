package com.amazon.identity.kcpsdk.auth;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AuthenticateAccountError {
    AuthenticateAccountErrorMissingValue(PandaError.PandaErrorMissingValue),
    AuthenticateAccountErrorInvalidValue(PandaError.PandaErrorInvalidValue),
    AuthenticateAccountErrorCredentialError(PandaError.PandaErrorCredentialError),
    AuthenticateAccountErrorServerError(PandaError.PandaErrorServerError),
    AuthenticateAccountErrorServiceUnavailable(PandaError.PandaErrorServiceUnavailable),
    AuthenticateAccountErrorUnknown(PandaError.PandaErrorUnknown),
    AuthenticateAccountErrorChallengeException(PandaError.PandaErrorChallengeException),
    AuthenticateAccountErrorForbidden(PandaError.PandaErrorForbidden);

    private final PandaError mBaseError;

    AuthenticateAccountError(PandaError pandaError) {
        this.mBaseError = pandaError;
    }

    public static AuthenticateAccountError fromPandaError(PandaError pandaError) {
        for (AuthenticateAccountError authenticateAccountError : values()) {
            if (authenticateAccountError.mBaseError == pandaError) {
                return authenticateAccountError;
            }
        }
        return null;
    }

    public String getErrorCode() {
        return this.mBaseError.getErrorCode();
    }

    @Override // java.lang.Enum
    public String toString() {
        return MarkdownConstants.LEFT_BRACKET + name() + " " + this.mBaseError.getErrorString() + MarkdownConstants.RIGHT_BRACKET;
    }
}
