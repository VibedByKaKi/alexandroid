package com.facebook.yoga;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum YogaNodeType {
    DEFAULT(0),
    TEXT(1);

    private final int mIntValue;

    YogaNodeType(int i) {
        this.mIntValue = i;
    }

    public static YogaNodeType fromInt(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return TEXT;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown enum value: "));
        return null;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
