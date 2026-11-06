package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum GradientProperty implements APLEnum {
    kGradientPropertyType(0),
    kGradientPropertyColorRange(1),
    kGradientPropertyInputRange(2),
    kGradientPropertyAngle(3),
    kGradientPropertySpreadMethod(4),
    kGradientPropertyX1(5),
    kGradientPropertyY1(6),
    kGradientPropertyX2(7),
    kGradientPropertyY2(8),
    kGradientPropertyCenterX(9),
    kGradientPropertyCenterY(10),
    kGradientPropertyRadius(11),
    kGradientPropertyUnits(12);

    private static SparseArray<GradientProperty> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (GradientProperty gradientProperty : values()) {
            values.put(gradientProperty.getIndex(), gradientProperty);
        }
    }

    GradientProperty(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static GradientProperty valueOf(int i) {
        return values.get(i);
    }
}
