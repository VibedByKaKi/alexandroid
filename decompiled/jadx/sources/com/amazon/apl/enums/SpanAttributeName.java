package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum SpanAttributeName implements APLEnum {
    kSpanAttributeNameColor(0),
    kSpanAttributeNameFontSize(1);

    private static SparseArray<SpanAttributeName> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (SpanAttributeName spanAttributeName : values()) {
            values.put(spanAttributeName.getIndex(), spanAttributeName);
        }
    }

    SpanAttributeName(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static SpanAttributeName valueOf(int i) {
        return values.get(i);
    }
}
