package io.noties.markwon.utils;

import android.text.Layout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class LayoutUtils {
    private static final float DEFAULT_EXTRA = 0.0f;
    private static final float DEFAULT_MULTIPLIER = 1.0f;

    private LayoutUtils() {
    }

    public static int getLineBottomWithoutPaddingAndSpacing(@NonNull Layout layout, int i) {
        int lineBottom = layout.getLineBottom(i);
        boolean z = i == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd != 0.0f || spacingMultiplier != 1.0f) && !z) {
            if (Float.compare(1.0f, spacingMultiplier) != 0) {
                float lineHeight = getLineHeight(layout, i);
                spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) ((lineBottom - spacingAdd) + 0.5f);
        }
        return (z && i == layout.getLineCount() - 1) ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public static int getLineHeight(@NonNull Layout layout, int i) {
        return layout.getLineTop(i + 1) - layout.getLineTop(i);
    }

    public static int getLineTopWithoutPadding(@NonNull Layout layout, int i) {
        int lineTop = layout.getLineTop(i);
        return i == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
