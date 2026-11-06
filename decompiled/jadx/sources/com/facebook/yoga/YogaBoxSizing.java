package com.facebook.yoga;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum YogaBoxSizing {
    BORDER_BOX(0),
    CONTENT_BOX(1);

    private final int mIntValue;

    YogaBoxSizing(int i) {
        this.mIntValue = i;
    }

    public static YogaBoxSizing fromInt(int i) {
        if (i == 0) {
            return BORDER_BOX;
        }
        if (i == 1) {
            return CONTENT_BOX;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown enum value: "));
        return null;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
