package com.facebook.yoga;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public enum YogaErrata {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    CLASSIC(2147483646);

    private final int mIntValue;

    YogaErrata(int i) {
        this.mIntValue = i;
    }

    public static YogaErrata fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return STRETCH_FLEX_BASIS;
        }
        if (i == 2) {
            return ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING;
        }
        if (i == 4) {
            return ABSOLUTE_PERCENT_AGAINST_INNER_SIZE;
        }
        switch (i) {
            case 2147483646:
                return CLASSIC;
            case Integer.MAX_VALUE:
                return ALL;
            default:
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown enum value: "));
                return null;
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}
