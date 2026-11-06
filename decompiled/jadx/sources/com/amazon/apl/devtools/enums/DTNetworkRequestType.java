package com.amazon.apl.devtools.enums;

import org.jetbrains.kotlin.library.KotlinLibraryKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum DTNetworkRequestType {
    PACKAGE(KotlinLibraryKt.KLIB_PROPERTY_PACKAGE),
    IMAGE("image");

    private final String mType;

    DTNetworkRequestType(String str) {
        this.mType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mType;
    }
}
