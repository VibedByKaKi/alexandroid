package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum FlexboxAlign implements APLEnum {
    kFlexboxAlignStretch(0),
    kFlexboxAlignCenter(1),
    kFlexboxAlignStart(2),
    kFlexboxAlignEnd(3),
    kFlexboxAlignBaseline(4),
    kFlexboxAlignAuto(5);

    private static SparseArray<FlexboxAlign> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (FlexboxAlign flexboxAlign : values()) {
            values.put(flexboxAlign.getIndex(), flexboxAlign);
        }
    }

    FlexboxAlign(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static FlexboxAlign valueOf(int i) {
        return values.get(i);
    }
}
