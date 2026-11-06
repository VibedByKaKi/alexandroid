package com.amazon.identity.kcpsdk.auth;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CredentialStatus {
    CredentialStatusOK(0),
    CredentialStatusStale(1),
    CredentialStatusInvalid(2),
    CredentialStatusUnknownWarning(3),
    CredentialStatusUnknownError(4);

    private final int mValue;

    CredentialStatus(int i) {
        this.mValue = i;
    }

    public int getValue() {
        return this.mValue;
    }
}
