package com.amazon.ion;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class InvalidSystemSymbolException extends IonException {
    private static final long serialVersionUID = 2206499395645594047L;
    private String myBadSymbol;

    public InvalidSystemSymbolException(String str) {
        super(a$$ExternalSyntheticOutline0.m("Invalid system symbol '", str, "'"));
        this.myBadSymbol = str;
    }

    public String getBadSymbol() {
        return this.myBadSymbol;
    }
}
