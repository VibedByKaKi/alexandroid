package com.amazon.identity.auth.device.dependency;

import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PandaServiceAccessor$PandaServiceException extends Exception {
    private final MAPError mError;
    private final String mErrorMessage;
    private final int mLegacyErrorCode;
    private final String mLegacyErrorMessage;

    public PandaServiceAccessor$PandaServiceException(MAPError.CommonError commonError, String str, String str2) {
        super(str2);
        this.mLegacyErrorCode = 5;
        this.mLegacyErrorMessage = str2;
        this.mError = commonError;
        this.mErrorMessage = str;
    }

    public final MAPError a() {
        return this.mError;
    }

    public final String b() {
        return this.mErrorMessage;
    }

    public final int c() {
        return this.mLegacyErrorCode;
    }

    public final String d() {
        return this.mLegacyErrorMessage;
    }
}
