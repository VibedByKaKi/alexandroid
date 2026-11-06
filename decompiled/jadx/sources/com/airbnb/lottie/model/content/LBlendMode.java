package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum LBlendMode {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    @Nullable
    public BlendModeCompat toNativeBlendMode() {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return BlendModeCompat.MODULATE;
        }
        if (ordinal == 2) {
            return BlendModeCompat.SCREEN;
        }
        if (ordinal == 3) {
            return BlendModeCompat.OVERLAY;
        }
        if (ordinal == 4) {
            return BlendModeCompat.DARKEN;
        }
        if (ordinal == 5) {
            return BlendModeCompat.LIGHTEN;
        }
        if (ordinal != 16) {
            return null;
        }
        return BlendModeCompat.PLUS;
    }
}
