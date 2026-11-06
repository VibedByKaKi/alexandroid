package com.amazon.alexa.navigation.menu.util;

import android.content.Context;
import com.amazon.alexa.navigation.menu.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class UiUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ToolbarVisibilityInfoPayload {
        Boolean floating;
        Float height;
        Boolean isVisible;
    }

    private UiUtils() {
    }

    public static int computePaddingBottomForPagesWithToolbar(ToolbarVisibilityInfoPayload toolbarVisibilityInfoPayload, Context context) {
        Boolean bool = toolbarVisibilityInfoPayload.isVisible;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = toolbarVisibilityInfoPayload.floating;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Float f = toolbarVisibilityInfoPayload.height;
        int round = f != null ? Math.round(f.floatValue()) : 0;
        if (booleanValue && booleanValue2) {
            return transformDpiToPx(context, round) + ((int) context.getResources().getDimension(R.dimen.elements_toolbar_padding_top));
        }
        return 0;
    }

    public static int transformDpiToPx(Context context, int i) {
        return (int) Math.ceil(i * context.getResources().getDisplayMetrics().density);
    }
}
