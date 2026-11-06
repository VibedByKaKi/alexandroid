package com.amazon.whisperjoin.common.sharedtypes.exceptions;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RadioNotEnabledException extends Exception {
    private final String mRadio;

    public RadioNotEnabledException(String str, Throwable th) {
        super("Radio not enabled ".concat(str == null ? "" : str), th);
        if (str != null) {
            this.mRadio = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("radio must not be null");
            throw null;
        }
    }

    public String getRadio() {
        return this.mRadio;
    }

    public RadioNotEnabledException(String str) {
        this(str, null);
    }
}
