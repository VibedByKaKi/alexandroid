package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum UpdateType implements APLEnum {
    kUpdatePressed(0),
    kUpdateTakeFocus(1),
    kUpdatePressState(2),
    kUpdateScrollPosition(3),
    kUpdatePagerPosition(4),
    kUpdatePagerByEvent(5),
    kUpdateSubmit(6),
    kUpdateTextChange(7),
    kUpdateAccessibilityAction(8);

    private static SparseArray<UpdateType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (UpdateType updateType : values()) {
            values.put(updateType.getIndex(), updateType);
        }
    }

    UpdateType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static UpdateType valueOf(int i) {
        return values.get(i);
    }
}
