package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum TextAlign implements APLEnum {
    kTextAlignAuto(0),
    kTextAlignLeft(1),
    kTextAlignCenter(2),
    kTextAlignRight(3),
    kTextAlignStart(4),
    kTextAlignEnd(5);

    private static SparseArray<TextAlign> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (TextAlign textAlign : values()) {
            values.put(textAlign.getIndex(), textAlign);
        }
    }

    TextAlign(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static TextAlign valueOf(int i) {
        return values.get(i);
    }
}
