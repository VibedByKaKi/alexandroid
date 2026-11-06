package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum Navigation implements APLEnum {
    kNavigationNormal(0),
    kNavigationNone(1),
    kNavigationWrap(2),
    kNavigationForwardOnly(3);

    private static SparseArray<Navigation> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (Navigation navigation : values()) {
            values.put(navigation.getIndex(), navigation);
        }
    }

    Navigation(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static Navigation valueOf(int i) {
        return values.get(i);
    }
}
