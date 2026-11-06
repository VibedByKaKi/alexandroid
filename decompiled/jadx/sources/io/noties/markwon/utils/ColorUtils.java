package io.noties.markwon.utils;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class ColorUtils {
    private ColorUtils() {
    }

    @ColorInt
    public static int applyAlpha(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    @ColorInt
    public static int blend(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((f * Color.blue(i2)) + (f2 * Color.blue(i))));
    }
}
