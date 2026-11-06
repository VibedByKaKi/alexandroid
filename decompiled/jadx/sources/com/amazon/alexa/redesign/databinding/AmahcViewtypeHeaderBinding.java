package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.font.FontTextView;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcViewtypeHeaderBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView title;

    private AmahcViewtypeHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull FontTextView fontTextView) {
        this.rootView = linearLayout;
        this.title = fontTextView;
    }

    @NonNull
    public static AmahcViewtypeHeaderBinding bind(@NonNull View view) {
        int i = R.id.title;
        FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
        if (fontTextView != null) {
            return new AmahcViewtypeHeaderBinding((LinearLayout) view, fontTextView);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcViewtypeHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_viewtype_header, viewGroup, false);
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
    public static AmahcViewtypeHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
