package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Snap implements APLEnum {
    kSnapNone(0),
    kSnapStart(1),
    kSnapCenter(2),
    kSnapEnd(3),
    kSnapForceStart(4),
    kSnapForceCenter(5),
    kSnapForceEnd(6);

    private static SparseArray<Snap> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (Snap snap : values()) {
            values.put(snap.getIndex(), snap);
        }
    }

    Snap(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static Snap valueOf(int i) {
        return values.get(i);
    }
}
