package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ComponentType implements APLEnum {
    kComponentTypeContainer(0),
    kComponentTypeEditText(1),
    kComponentTypeExtension(2),
    kComponentTypeFrame(3),
    kComponentTypeGridSequence(4),
    kComponentTypeHost(5),
    kComponentTypeImage(6),
    kComponentTypePager(7),
    kComponentTypeScrollView(8),
    kComponentTypeSequence(9),
    kComponentTypeText(10),
    kComponentTypeTouchWrapper(11),
    kComponentTypeVectorGraphic(12),
    kComponentTypeVideo(13),
    kComponentTypeFlexSequenceComponent(14),
    kComponentTypeConstraint(15);

    private static SparseArray<ComponentType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (ComponentType componentType : values()) {
            values.put(componentType.getIndex(), componentType);
        }
    }

    ComponentType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static ComponentType valueOf(int i) {
        return values.get(i);
    }
}
