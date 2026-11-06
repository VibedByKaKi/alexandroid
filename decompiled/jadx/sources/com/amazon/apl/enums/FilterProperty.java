package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum FilterProperty implements APLEnum {
    kFilterPropertyAmount(0),
    kFilterPropertyColor(1),
    kFilterPropertyDestination(2),
    kFilterPropertyExtension(3),
    kFilterPropertyExtensionURI(4),
    kFilterPropertyGradient(5),
    kFilterPropertyKind(6),
    kFilterPropertyMode(7),
    kFilterPropertyName(8),
    kFilterPropertyRadius(9),
    kFilterPropertySigma(10),
    kFilterPropertySource(11),
    kFilterPropertyUseColor(12);

    private static SparseArray<FilterProperty> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (FilterProperty filterProperty : values()) {
            values.put(filterProperty.getIndex(), filterProperty);
        }
    }

    FilterProperty(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static FilterProperty valueOf(int i) {
        return values.get(i);
    }
}
