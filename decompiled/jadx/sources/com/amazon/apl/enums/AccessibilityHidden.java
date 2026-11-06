package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum AccessibilityHidden implements APLEnum {
    kAccessibilityHiddenAuto(0),
    kAccessibilityHiddenYes(1);

    private static SparseArray<AccessibilityHidden> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (AccessibilityHidden accessibilityHidden : values()) {
            values.put(accessibilityHidden.getIndex(), accessibilityHidden);
        }
    }

    AccessibilityHidden(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static AccessibilityHidden valueOf(int i) {
        return values.get(i);
    }
}
