package com.amazon.identity.auth.device.token;

import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ScopedTokenManager$ScopedTokenManagerException extends Exception {
    private static final long serialVersionUID = -7354549861193710768L;
    private final MAPError mError;
    private final String mErrorMessage;
    private final int mLegacyErrorCode;
    private final String mLegacyErrorMessage;

    public ScopedTokenManager$ScopedTokenManagerException(MAPError.CommonError commonError, String str, int i, Exception exc) {
        super(exc.getMessage(), exc);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = exc.getMessage();
        this.mError = commonError;
        this.mErrorMessage = str;
    }

    public final MAPError a() {
        return this.mError;
    }

    public final String b() {
        return this.mErrorMessage;
    }

    public ScopedTokenManager$ScopedTokenManagerException(MAPError mAPError, String str, int i, String str2) {
        super(str2);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = str2;
        this.mError = mAPError;
        this.mErrorMessage = str;
    }
}
