package com.amazon.ion;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ReadOnlyValueException extends IonException {
    private static final long serialVersionUID = 1;

    public ReadOnlyValueException(Class cls) {
        super(a$$ExternalSyntheticOutline0.m("Cannot modify read-only instance of ", cls));
    }

    public ReadOnlyValueException() {
        super("Read-only IonValue cannot be modified");
    }
}
