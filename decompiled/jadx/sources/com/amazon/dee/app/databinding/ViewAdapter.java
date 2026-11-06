package com.amazon.dee.app.databinding;

import android.view.View;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@BindingMethods({@BindingMethod(attribute = "android:onClick", method = "setOnClickListener", type = View.class)})
/* loaded from: classes3.dex */
public final class ViewAdapter {
    private ViewAdapter() {
    }

    @BindingAdapter({"fadeVisibility"})
    public static void fadeVisibility(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).start();
        }
        view.setVisibility(i);
    }
}
