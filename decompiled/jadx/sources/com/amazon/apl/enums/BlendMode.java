package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum BlendMode implements APLEnum {
    kBlendModeNormal(0),
    kBlendModeMultiply(1),
    kBlendModeScreen(2),
    kBlendModeOverlay(3),
    kBlendModeDarken(4),
    kBlendModeLighten(5),
    kBlendModeColorDodge(6),
    kBlendModeColorBurn(7),
    kBlendModeHardLight(8),
    kBlendModeSoftLight(9),
    kBlendModeDifference(10),
    kBlendModeExclusion(11),
    kBlendModeHue(12),
    kBlendModeSaturation(13),
    kBlendModeColor(14),
    kBlendModeLuminosity(15),
    kBlendModeSourceAtop(16),
    kBlendModeSourceIn(17),
    kBlendModeSourceOut(18);

    private static SparseArray<BlendMode> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (BlendMode blendMode : values()) {
            values.put(blendMode.getIndex(), blendMode);
        }
    }

    BlendMode(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static BlendMode valueOf(int i) {
        return values.get(i);
    }
}
