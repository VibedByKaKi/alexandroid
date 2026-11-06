package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum TextAlignVertical implements APLEnum {
    kTextAlignVerticalAuto(0),
    kTextAlignVerticalTop(1),
    kTextAlignVerticalCenter(2),
    kTextAlignVerticalBottom(3);

    private static SparseArray<TextAlignVertical> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (TextAlignVertical textAlignVertical : values()) {
            values.put(textAlignVertical.getIndex(), textAlignVertical);
        }
    }

    TextAlignVertical(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static TextAlignVertical valueOf(int i) {
        return values.get(i);
    }
}
