package com.facebook.yoga;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum YogaJustify {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int mIntValue;

    YogaJustify(int i) {
        this.mIntValue = i;
    }

    public static YogaJustify fromInt(int i) {
        if (i == 0) {
            return FLEX_START;
        }
        if (i == 1) {
            return CENTER;
        }
        if (i == 2) {
            return FLEX_END;
        }
        if (i == 3) {
            return SPACE_BETWEEN;
        }
        if (i == 4) {
            return SPACE_AROUND;
        }
        if (i == 5) {
            return SPACE_EVENLY;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown enum value: "));
        return null;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
