package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum EventScrollAlign implements APLEnum {
    kEventScrollAlignFirst(0),
    kEventScrollAlignCenter(1),
    kEventScrollAlignLast(2),
    kEventScrollAlignVisible(3);

    private static SparseArray<EventScrollAlign> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (EventScrollAlign eventScrollAlign : values()) {
            values.put(eventScrollAlign.getIndex(), eventScrollAlign);
        }
    }

    EventScrollAlign(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static EventScrollAlign valueOf(int i) {
        return values.get(i);
    }
}
