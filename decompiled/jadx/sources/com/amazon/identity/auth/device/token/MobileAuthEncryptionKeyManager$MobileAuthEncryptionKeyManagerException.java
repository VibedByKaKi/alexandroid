package com.amazon.identity.auth.device.token;

import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MobileAuthEncryptionKeyManager$MobileAuthEncryptionKeyManagerException extends Exception {
    private static final long serialVersionUID = -7354549861193710767L;
    private final MAPError mError;
    private final String mErrorMessage;

    public MobileAuthEncryptionKeyManager$MobileAuthEncryptionKeyManagerException(MAPError.CommonError commonError, String str, Exception exc) {
        super(exc.getMessage(), exc);
        this.mError = commonError;
        this.mErrorMessage = str;
    }

    public final MAPError a() {
        return this.mError;
    }

    public final String b() {
        return this.mErrorMessage;
    }

    public MobileAuthEncryptionKeyManager$MobileAuthEncryptionKeyManagerException(MAPError mAPError, String str) {
        super(str);
        this.mError = mAPError;
        this.mErrorMessage = str;
    }
}
