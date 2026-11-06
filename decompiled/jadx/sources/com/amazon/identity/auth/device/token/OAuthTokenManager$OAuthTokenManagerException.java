package com.amazon.identity.auth.device.token;

import com.amazon.identity.auth.device.api.MAPError;
import com.amazon.identity.auth.device.m1;
import com.amazon.identity.auth.device.n1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class OAuthTokenManager$OAuthTokenManagerException extends Exception implements m1 {
    private static final long serialVersionUID = -7354549861193710767L;
    private n1 mAccountRecoverContext;
    private com.amazon.identity.auth.device.framework.a mAuthEndpointError;
    private final MAPError mError;
    private final String mErrorMessage;
    private final int mLegacyErrorCode;
    private final String mLegacyErrorMessage;
    private final boolean mShouldClearAuthCookies;

    public OAuthTokenManager$OAuthTokenManagerException(MAPError mAPError, String str, int i, Exception exc) {
        super(exc.getMessage(), exc);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = exc.getMessage();
        this.mAccountRecoverContext = null;
        this.mAuthEndpointError = null;
        this.mError = mAPError;
        this.mErrorMessage = str;
        this.mShouldClearAuthCookies = false;
    }

    @Override // com.amazon.identity.auth.device.m1
    public final n1 a() {
        return this.mAccountRecoverContext;
    }

    @Override // com.amazon.identity.auth.device.m1
    public final String b() {
        return this.mLegacyErrorMessage;
    }

    @Override // com.amazon.identity.auth.device.m1
    public final int c() {
        return this.mLegacyErrorCode;
    }

    public final com.amazon.identity.auth.device.framework.a d() {
        return this.mAuthEndpointError;
    }

    public final MAPError e() {
        return this.mError;
    }

    public final String f() {
        return this.mErrorMessage;
    }

    public final boolean g() {
        return this.mShouldClearAuthCookies;
    }

    public OAuthTokenManager$OAuthTokenManagerException(MAPError mAPError, String str, int i, String str2) {
        super(str2);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = str2;
        this.mAccountRecoverContext = null;
        this.mAuthEndpointError = null;
        this.mError = mAPError;
        this.mErrorMessage = str;
        this.mShouldClearAuthCookies = false;
    }

    public OAuthTokenManager$OAuthTokenManagerException(MAPError.CommonError commonError, String str, int i, String str2, com.amazon.identity.auth.device.framework.a aVar) {
        super(str2);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = str2;
        this.mAuthEndpointError = aVar;
        this.mAccountRecoverContext = null;
        this.mError = commonError;
        this.mErrorMessage = str;
        this.mShouldClearAuthCookies = false;
    }

    public OAuthTokenManager$OAuthTokenManagerException(MAPError.CommonError commonError, String str, int i, String str2, com.amazon.identity.auth.device.framework.a aVar, int i2) {
        super(str2);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = str2;
        this.mAuthEndpointError = aVar;
        this.mAccountRecoverContext = null;
        this.mError = commonError;
        this.mErrorMessage = str;
        this.mShouldClearAuthCookies = true;
    }

    public OAuthTokenManager$OAuthTokenManagerException(MAPError.CommonError commonError, String str, int i, String str2, com.amazon.identity.auth.device.framework.a aVar, n1 n1Var) {
        super(str2);
        this.mLegacyErrorCode = i;
        this.mLegacyErrorMessage = str2;
        this.mAuthEndpointError = aVar;
        this.mAccountRecoverContext = n1Var;
        this.mError = commonError;
        this.mErrorMessage = str;
        this.mShouldClearAuthCookies = false;
    }
}
