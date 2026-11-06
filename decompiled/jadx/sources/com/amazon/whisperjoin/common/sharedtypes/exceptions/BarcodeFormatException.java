package com.amazon.whisperjoin.common.sharedtypes.exceptions;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BarcodeFormatException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeFormatException(String str) {
        super(a$$ExternalSyntheticOutline0.m("Barcode <", str, "> doesn't follow FFS 2D Bar Code specification."));
        Locale locale = Locale.ENGLISH;
    }
}
