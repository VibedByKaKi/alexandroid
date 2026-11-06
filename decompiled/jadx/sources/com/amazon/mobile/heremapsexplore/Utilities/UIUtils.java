package com.amazon.mobile.heremapsexplore.Utilities;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class UIUtils {
    private UIUtils() {
    }

    public static int colorWithAlpha(int i, float f) {
        return Color.argb(Math.round(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static float dpToPx(View view, int i) {
        return TypedValue.applyDimension(1, i, view.getResources().getDisplayMetrics());
    }

    public static float dpToPx(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
