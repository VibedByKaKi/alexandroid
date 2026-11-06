package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum FontStyle implements APLEnum {
    kFontStyleNormal(0),
    kFontStyleItalic(1);

    private static SparseArray<FontStyle> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (FontStyle fontStyle : values()) {
            values.put(fontStyle.getIndex(), fontStyle);
        }
    }

    FontStyle(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static FontStyle valueOf(int i) {
        return values.get(i);
    }
}
