package com.amazon.alexa.wakeword.speakerverification.errors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum EncryptionFailure {
    ILLEGAL_ARGUMENT_EXCEPTION(1),
    SECURITY_EXCEPTION(2),
    OTHER_EXCEPTION(3),
    INPUT_NULL(4),
    SYMMETRIC_KEY_NULL(5);

    private final int mErrorCode;

    EncryptionFailure(int i) {
        this.mErrorCode = i;
    }
}
