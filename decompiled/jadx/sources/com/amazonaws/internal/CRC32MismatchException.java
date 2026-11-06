package com.amazonaws.internal;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CRC32MismatchException extends IOException {
    private static final long serialVersionUID = 1;

    public CRC32MismatchException(String str, Throwable th) {
        super(str, th);
    }

    public CRC32MismatchException(String str) {
        super(str);
    }
}
