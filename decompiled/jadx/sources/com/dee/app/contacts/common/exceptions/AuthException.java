package com.dee.app.contacts.common.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AuthException extends Exception {
    public AuthException(Throwable th) {
        super(th + "while making api call from contacts sdk");
    }
}
