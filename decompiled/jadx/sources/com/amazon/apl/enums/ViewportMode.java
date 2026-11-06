package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ViewportMode implements APLEnum {
    kViewportModeAuto(0),
    kViewportModeHub(1),
    kViewportModeMobile(2),
    kViewportModePC(3),
    kViewportModeTV(4);

    private static SparseArray<ViewportMode> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (ViewportMode viewportMode : values()) {
            values.put(viewportMode.getIndex(), viewportMode);
        }
    }

    ViewportMode(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static ViewportMode valueOf(int i) {
        return values.get(i);
    }
}
