package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class AspectRatioMeasure {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Spec {
        public int height;
        public int width;
    }

    private static boolean shouldAdjust(int i) {
        return i == 0 || i == -2;
    }

    public static void updateMeasureSpec(Spec spec, float f, @Nullable ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (shouldAdjust(layoutParams.height)) {
            spec.height = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.width) - i) / f) + i2), spec.height), 1073741824);
        } else if (shouldAdjust(layoutParams.width)) {
            spec.width = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(spec.height) - i2) * f) + i), spec.width), 1073741824);
        }
    }
}
