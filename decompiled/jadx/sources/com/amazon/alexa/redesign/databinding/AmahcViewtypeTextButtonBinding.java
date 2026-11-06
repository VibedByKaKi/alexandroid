package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcViewtypeTextButtonBinding implements ViewBinding {

    @NonNull
    public final CardView borderCardView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final Button textButton;

    @NonNull
    public final LinearLayout textButtonLinearLayout;

    private AmahcViewtypeTextButtonBinding(@NonNull LinearLayout linearLayout, @NonNull CardView cardView, @NonNull Button button, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.borderCardView = cardView;
        this.textButton = button;
        this.textButtonLinearLayout = linearLayout2;
    }

    @NonNull
    public static AmahcViewtypeTextButtonBinding bind(@NonNull View view) {
        int i = R.id.border_card_view;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.text_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new AmahcViewtypeTextButtonBinding(linearLayout, cardView, button, linearLayout);
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcViewtypeTextButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_viewtype_text_button, viewGroup, false);
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
    public static AmahcViewtypeTextButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
