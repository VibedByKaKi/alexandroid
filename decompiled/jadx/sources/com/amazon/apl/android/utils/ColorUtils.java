package com.amazon.apl.android.utils;

import android.graphics.Color;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ColorUtils {
    private ColorUtils() {
    }

    public static int toARGB(long j) {
        return Color.argb((int) (j & 255), (int) ((j >> 24) & 255), (int) ((j >> 16) & 255), (int) ((j >> 8) & 255));
    }
}
