package com.google.android.gms.internal.fido;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzhj extends IOException {
    public zzhj(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }

    public zzhj(String str) {
        super(str);
    }
}
