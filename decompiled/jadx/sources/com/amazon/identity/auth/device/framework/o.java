package com.amazon.identity.auth.device.framework;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final RetryLogic$RetryErrorMessageFromServerSide f659a;
    public final IOException b;
    public final boolean c = true;

    public o(RetryLogic$RetryErrorMessageFromServerSide retryLogic$RetryErrorMessageFromServerSide) {
        this.f659a = retryLogic$RetryErrorMessageFromServerSide;
    }

    public o(IOException iOException) {
        this.b = iOException;
    }

    public o() {
    }
}
