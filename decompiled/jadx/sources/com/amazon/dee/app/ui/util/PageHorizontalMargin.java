package com.amazon.dee.app.ui.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.dee.app.core.R;
import com.swmansion.rnscreens.gamma.tabs.TabsHost$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PageHorizontalMargin {
    private PageHorizontalMargin() {
    }

    public static void applyTo(View view) {
        int width = view.getWidth();
        if (width <= 0) {
            return;
        }
        int calculate = calculate(view.getContext(), width);
        view.setPadding(calculate, view.getPaddingTop(), calculate, view.getPaddingBottom());
    }

    public static int calculate(Context context, int i) {
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = i / f;
        float f3 = 24.0f;
        if (f2 > 1008.0f) {
            f3 = f2 <= 1280.0f ? Math.round((((f2 - 1008.0f) / 272.0f) * 104.0f) + 24.0f) : f2 <= 1400.0f ? Math.round((((f2 - 1280.0f) / 120.0f) * 12.0f) + 128.0f) : Math.round(f2 * 0.1f);
        }
        return Math.round(f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setup$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || view.getTag(R.id.rn_content_margin_applied) == null) {
            applyTo(view);
            view.setTag(R.id.rn_content_margin_applied, Boolean.TRUE);
        }
    }

    public static void setup(View view) {
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
        view.addOnLayoutChangeListener(new TabsHost$$ExternalSyntheticLambda0(2));
    }
}
