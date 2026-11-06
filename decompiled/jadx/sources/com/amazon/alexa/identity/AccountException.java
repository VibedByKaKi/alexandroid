package com.amazon.alexa.identity;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class AccountException extends Exception {
    public final int error;

    public AccountException(int i) {
        super(a$$ExternalSyntheticOutline0.m(i, "Account error "));
        this.error = i;
    }
}
