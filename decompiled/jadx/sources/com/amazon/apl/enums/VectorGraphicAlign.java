package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum VectorGraphicAlign implements APLEnum {
    kVectorGraphicAlignBottom(0),
    kVectorGraphicAlignBottomLeft(1),
    kVectorGraphicAlignBottomRight(2),
    kVectorGraphicAlignCenter(3),
    kVectorGraphicAlignLeft(4),
    kVectorGraphicAlignRight(5),
    kVectorGraphicAlignTop(6),
    kVectorGraphicAlignTopLeft(7),
    kVectorGraphicAlignTopRight(8);

    private static SparseArray<VectorGraphicAlign> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (VectorGraphicAlign vectorGraphicAlign : values()) {
            values.put(vectorGraphicAlign.getIndex(), vectorGraphicAlign);
        }
    }

    VectorGraphicAlign(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static VectorGraphicAlign valueOf(int i) {
        return values.get(i);
    }
}
