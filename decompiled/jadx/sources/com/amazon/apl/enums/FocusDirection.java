package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum FocusDirection implements APLEnum {
    kFocusDirectionNone(0),
    kFocusDirectionForward(1),
    kFocusDirectionBackwards(2),
    kFocusDirectionUp(3),
    kFocusDirectionDown(4),
    kFocusDirectionLeft(5),
    kFocusDirectionRight(6);

    private static SparseArray<FocusDirection> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (FocusDirection focusDirection : values()) {
            values.put(focusDirection.getIndex(), focusDirection);
        }
    }

    FocusDirection(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static FocusDirection valueOf(int i) {
        return values.get(i);
    }
}
