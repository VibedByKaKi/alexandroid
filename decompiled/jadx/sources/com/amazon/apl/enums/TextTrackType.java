package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum TextTrackType implements APLEnum {
    kTextTrackTypeCaption(0);

    private static SparseArray<TextTrackType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (TextTrackType textTrackType : values()) {
            values.put(textTrackType.getIndex(), textTrackType);
        }
    }

    TextTrackType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static TextTrackType valueOf(int i) {
        return values.get(i);
    }
}
