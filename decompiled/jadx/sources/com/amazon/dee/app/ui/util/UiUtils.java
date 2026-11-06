package com.amazon.dee.app.ui.util;

import android.content.Context;
import com.amazon.alexa.mosaic.components.ThemeUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class UiUtils {
    private UiUtils() {
    }

    public static boolean isLightMode(Context context) {
        return ThemeUtil.isLightMode(context);
    }

    public static int transformDpiToPx(Context context, int i) {
        return (int) Math.ceil(i * context.getResources().getDisplayMetrics().density);
    }

    public static int transformSpToPx(Context context, int i) {
        return (int) Math.ceil(i * context.getResources().getDisplayMetrics().scaledDensity);
    }
}
