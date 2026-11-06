package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcTemplateMiniBinding implements ViewBinding {

    @NonNull
    public final View pulseOverlay;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout slot0;

    @NonNull
    public final LinearLayout slot1;

    private AmahcTemplateMiniBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.pulseOverlay = view;
        this.slot0 = linearLayout2;
        this.slot1 = linearLayout3;
    }

    @NonNull
    public static AmahcTemplateMiniBinding bind(@NonNull View view) {
        int i = R.id.pulse_overlay;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.slot0;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.slot1;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    return new AmahcTemplateMiniBinding((LinearLayout) view, findChildViewById, linearLayout, linearLayout2);
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcTemplateMiniBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_template_mini, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AmahcTemplateMiniBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
