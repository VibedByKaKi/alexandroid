package com.amazon.dee.app.databinding;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class FrameLayoutAdapter {
    private FrameLayoutAdapter() {
    }

    @BindingAdapter({"layout_constraintWidth_percent"})
    public static void setConstraintWidthPercent(FrameLayout frameLayout, float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.matchConstraintPercentWidth = f;
        frameLayout.setLayoutParams(layoutParams);
    }
}
