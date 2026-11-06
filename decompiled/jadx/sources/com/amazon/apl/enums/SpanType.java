package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum SpanType implements APLEnum {
    kSpanTypeLineBreak(0),
    kSpanTypeListItem(1),
    kSpanTypeStrong(2),
    kSpanTypeItalic(3),
    kSpanTypeStrike(4),
    kSpanTypeUnderline(5),
    kSpanTypeMonospace(6),
    kSpanTypeSuperscript(7),
    kSpanTypeSubscript(8),
    kSpanTypeNoBreak(9),
    kSpanTypeSpan(10);

    private static SparseArray<SpanType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (SpanType spanType : values()) {
            values.put(spanType.getIndex(), spanType);
        }
    }

    SpanType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static SpanType valueOf(int i) {
        return values.get(i);
    }
}
