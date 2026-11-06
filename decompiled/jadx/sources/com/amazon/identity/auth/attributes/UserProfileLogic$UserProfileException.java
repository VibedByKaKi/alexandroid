package com.amazon.identity.auth.attributes;

import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UserProfileLogic$UserProfileException extends Exception {
    private final MAPError mError;
    private final String mErrorMessage;

    public UserProfileLogic$UserProfileException(MAPError.CommonError commonError, String str) {
        super(str);
        this.mError = commonError;
        this.mErrorMessage = str;
    }

    public final MAPError a() {
        return this.mError;
    }

    public final String b() {
        return this.mErrorMessage;
    }
}
