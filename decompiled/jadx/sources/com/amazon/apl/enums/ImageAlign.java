package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ImageAlign implements APLEnum {
    kImageAlignBottom(0),
    kImageAlignBottomLeft(1),
    kImageAlignBottomRight(2),
    kImageAlignCenter(3),
    kImageAlignLeft(4),
    kImageAlignRight(5),
    kImageAlignTop(6),
    kImageAlignTopLeft(7),
    kImageAlignTopRight(8);

    private static SparseArray<ImageAlign> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (ImageAlign imageAlign : values()) {
            values.put(imageAlign.getIndex(), imageAlign);
        }
    }

    ImageAlign(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static ImageAlign valueOf(int i) {
        return values.get(i);
    }
}
