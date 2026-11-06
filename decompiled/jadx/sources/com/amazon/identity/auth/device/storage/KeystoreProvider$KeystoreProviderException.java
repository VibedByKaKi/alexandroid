package com.amazon.identity.auth.device.storage;

import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class KeystoreProvider$KeystoreProviderException extends Exception {
    private static final long serialVersionUID = -7354549861193710767L;
    private final MAPError mError;
    private final String mErrorMessage;

    public KeystoreProvider$KeystoreProviderException(MAPError.CommonError commonError, String str, Exception exc) {
        super(exc.getMessage(), exc);
        this.mError = commonError;
        this.mErrorMessage = str;
    }

    public final String a() {
        return this.mErrorMessage;
    }
}
