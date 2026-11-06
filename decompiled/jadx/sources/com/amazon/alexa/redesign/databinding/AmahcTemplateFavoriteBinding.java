package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.font.FontTextView;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcTemplateFavoriteBinding implements ViewBinding {

    @NonNull
    public final ImageView icon;

    @NonNull
    public final Space leftSpace;

    @NonNull
    public final LinearLayout otherSlotsWrapper;

    @NonNull
    public final Space rightSpace;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final LinearLayout slot0;

    @NonNull
    public final LinearLayout slot2;

    @NonNull
    public final LinearLayout slot3;

    @NonNull
    public final LinearLayout slot4;

    @NonNull
    public final RelativeLayout slotsWrapper;

    @NonNull
    public final FontTextView title;

    @NonNull
    public final Space topSpace;

    private AmahcTemplateFavoriteBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Space space, @NonNull LinearLayout linearLayout, @NonNull Space space2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull RelativeLayout relativeLayout2, @NonNull FontTextView fontTextView, @NonNull Space space3) {
        this.rootView = relativeLayout;
        this.icon = imageView;
        this.leftSpace = space;
        this.otherSlotsWrapper = linearLayout;
        this.rightSpace = space2;
        this.slot0 = linearLayout2;
        this.slot2 = linearLayout3;
        this.slot3 = linearLayout4;
        this.slot4 = linearLayout5;
        this.slotsWrapper = relativeLayout2;
        this.title = fontTextView;
        this.topSpace = space3;
    }

    @NonNull
    public static AmahcTemplateFavoriteBinding bind(@NonNull View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.left_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = R.id.other_slots_wrapper;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.right_space;
                    Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                    if (space2 != null) {
                        i = R.id.slot0;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.slot2;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.slot3;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout4 != null) {
                                    i = R.id.slot4;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout5 != null) {
                                        i = R.id.slots_wrapper;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout != null) {
                                            i = R.id.title;
                                            FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
                                            if (fontTextView != null) {
                                                i = R.id.top_space;
                                                Space space3 = (Space) ViewBindings.findChildViewById(view, i);
                                                if (space3 != null) {
                                                    return new AmahcTemplateFavoriteBinding((RelativeLayout) view, imageView, space, linearLayout, space2, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, fontTextView, space3);
                                                }
                                            }
                                        }
                                    }
                                }
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
    public static AmahcTemplateFavoriteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_template_favorite, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AmahcTemplateFavoriteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
