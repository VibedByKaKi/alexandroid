package com.amazonaws.internal.keyvaluestore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class KeyNotFoundException extends Exception {
    private static final long serialVersionUID = 1;

    public KeyNotFoundException(String str, Throwable th) {
        super(str, th);
    }

    public KeyNotFoundException(String str) {
        super(str);
    }

    public KeyNotFoundException(Throwable th) {
        super(th);
    }
}
