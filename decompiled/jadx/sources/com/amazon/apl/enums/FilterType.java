package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum FilterType implements APLEnum {
    kFilterTypeBlend(0),
    kFilterTypeBlur(1),
    kFilterTypeColor(2),
    kFilterTypeExtension(3),
    kFilterTypeGradient(4),
    kFilterTypeGrayscale(5),
    kFilterTypeNoise(6),
    kFilterTypeSaturate(7);

    private static SparseArray<FilterType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (FilterType filterType : values()) {
            values.put(filterType.getIndex(), filterType);
        }
    }

    FilterType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static FilterType valueOf(int i) {
        return values.get(i);
    }
}
