package com.upokecenter.cbor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class CBORException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public CBORException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public CBORException(String str) {
        super(str);
    }

    public CBORException() {
    }
}
