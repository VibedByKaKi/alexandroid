package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ImageScale implements APLEnum {
    kImageScaleNone(0),
    kImageScaleFill(1),
    kImageScaleBestFill(2),
    kImageScaleBestFit(3),
    kImageScaleBestFitDown(4);

    private static SparseArray<ImageScale> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (ImageScale imageScale : values()) {
            values.put(imageScale.getIndex(), imageScale);
        }
    }

    ImageScale(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static ImageScale valueOf(int i) {
        return values.get(i);
    }
}
