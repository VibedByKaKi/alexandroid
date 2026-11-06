package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.font.FontTextView;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcBaseCardBinding implements ViewBinding {

    @NonNull
    public final View bottomAnchorView;

    @NonNull
    public final ConstraintLayout cardBackgroundBase;

    @NonNull
    public final FrameLayout cardForegroundBase;

    @NonNull
    public final LinearLayout cardForegroundBaseWithMargin;

    @NonNull
    public final Space peSpaceStart;

    @NonNull
    public final FontTextView removeCardButton;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View topAnchorView;

    private AmahcBaseCardBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull Space space, @NonNull FontTextView fontTextView, @NonNull View view2) {
        this.rootView = frameLayout;
        this.bottomAnchorView = view;
        this.cardBackgroundBase = constraintLayout;
        this.cardForegroundBase = frameLayout2;
        this.cardForegroundBaseWithMargin = linearLayout;
        this.peSpaceStart = space;
        this.removeCardButton = fontTextView;
        this.topAnchorView = view2;
    }

    @NonNull
    public static AmahcBaseCardBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bottom_anchor_view;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            i = R.id.card_background_base;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.card_foreground_base;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.card_foreground_base_with_margin;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.pe_space_start;
                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                        if (space != null) {
                            i = R.id.remove_card_button;
                            FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
                            if (fontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.top_anchor_view))) != null) {
                                return new AmahcBaseCardBinding((FrameLayout) view, findChildViewById2, constraintLayout, frameLayout, linearLayout, space, fontTextView, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcBaseCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_base_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AmahcBaseCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
