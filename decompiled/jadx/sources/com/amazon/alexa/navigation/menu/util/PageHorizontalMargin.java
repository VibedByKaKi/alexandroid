package com.amazon.alexa.navigation.menu.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventing.Event$$ExternalSyntheticLambda2;
import com.amazon.alexa.navigation.menu.R;
import com.amazon.alexa.voice.ui.internal.widget.ContentLayout$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class PageHorizontalMargin {
    private static final float[][] BREAKPOINTS = {new float[]{600.0f, 24.0f}, new float[]{1008.0f, 24.0f}, new float[]{1280.0f, 128.0f}, new float[]{1400.0f, 140.0f}};
    private static final float FALLBACK_RATIO = 0.1f;

    private PageHorizontalMargin() {
    }

    public static void applyFixedHeaderPadding(View view) {
        if (view == null) {
            return;
        }
        final float f = view.getResources().getDisplayMetrics().density;
        final int round = Math.round(24.0f * f);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.amazon.alexa.navigation.menu.util.PageHorizontalMargin$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                PageHorizontalMargin.lambda$applyFixedHeaderPadding$2(f, round, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public static void applyResponsivePadding(View view, View view2) {
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
        view.addOnLayoutChangeListener(new ContentLayout$$ExternalSyntheticLambda0(view2, 1));
    }

    public static int calculate(Context context, int i) {
        float[][] fArr;
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = i / f;
        float[][] fArr2 = BREAKPOINTS;
        if (f2 < fArr2[0][0]) {
            return 0;
        }
        float f3 = fArr2[fArr2.length - 1][1];
        int i2 = 0;
        while (true) {
            fArr = BREAKPOINTS;
            if (i2 >= fArr.length - 1) {
                break;
            }
            int i3 = i2 + 1;
            float[] fArr3 = fArr[i3];
            float f4 = fArr3[0];
            if (f2 <= f4) {
                float[] fArr4 = fArr[i2];
                float f5 = fArr4[0];
                float f6 = fArr4[1];
                f3 = ErrorUtils$$ExternalSyntheticOutline0.m(fArr3[1], f6, (f2 - f5) / (f4 - f5), f6);
                break;
            }
            i2 = i3;
        }
        if (f2 > fArr[fArr.length - 1][0]) {
            f3 = 0.1f * f2;
        }
        return Math.round(f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyFixedHeaderPadding$2(float f, int i, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i4 - i2;
        if (i10 != i8 - i6 || view.getTag(R.id.page_margin_header_listener) == null) {
            if (i10 / f < 600.0f) {
                i = 0;
            }
            view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
            view.setTag(R.id.page_margin_header_listener, Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyResponsivePadding$0(View view, View view2) {
        if (view.isAttachedToWindow()) {
            updateChildMargin(view, view2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyResponsivePadding$1(View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || view2.getTag(R.id.page_margin_listener) == null) {
            view2.post(new Event$$ExternalSyntheticLambda2(view2, view, 19));
            view2.setTag(R.id.page_margin_listener, Boolean.TRUE);
        }
    }

    private static void updateChildMargin(View view, View view2) {
        int width = view.getWidth();
        if (width <= 0) {
            return;
        }
        int calculate = calculate(view.getContext(), width);
        view.setPadding(calculate, view.getPaddingTop(), calculate, view.getPaddingBottom());
        if (view2 != null) {
            if (calculate > 0 && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                if (marginLayoutParams.getMarginStart() != 0 || marginLayoutParams.getMarginEnd() != 0) {
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.setMarginEnd(0);
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
            view2.setPadding(calculate, view2.getPaddingTop(), calculate, view2.getPaddingBottom());
        }
    }
}
