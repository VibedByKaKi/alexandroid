package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class AmahcViewtypeExpandableSectionHeaderBinding implements ViewBinding {

    @NonNull
    public final ImageView caret;

    @NonNull
    public final Space caretMargin;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView seeMoreLess;

    @NonNull
    public final LinearLayout seeMoreLessWrapper;

    @NonNull
    public final FontTextView subtitle;

    @NonNull
    public final FontTextView title;

    private AmahcViewtypeExpandableSectionHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Space space, @NonNull FontTextView fontTextView, @NonNull LinearLayout linearLayout2, @NonNull FontTextView fontTextView2, @NonNull FontTextView fontTextView3) {
        this.rootView = linearLayout;
        this.caret = imageView;
        this.caretMargin = space;
        this.seeMoreLess = fontTextView;
        this.seeMoreLessWrapper = linearLayout2;
        this.subtitle = fontTextView2;
        this.title = fontTextView3;
    }

    @NonNull
    public static AmahcViewtypeExpandableSectionHeaderBinding bind(@NonNull View view) {
        int i = R.id.caret;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.caret_margin;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = R.id.see_more_less;
                FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
                if (fontTextView != null) {
                    i = R.id.see_more_less_wrapper;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.subtitle;
                        FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(view, i);
                        if (fontTextView2 != null) {
                            i = R.id.title;
                            FontTextView fontTextView3 = (FontTextView) ViewBindings.findChildViewById(view, i);
                            if (fontTextView3 != null) {
                                return new AmahcViewtypeExpandableSectionHeaderBinding((LinearLayout) view, imageView, space, fontTextView, linearLayout, fontTextView2, fontTextView3);
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
    public static AmahcViewtypeExpandableSectionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_viewtype_expandable_section_header, viewGroup, false);
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
    public static AmahcViewtypeExpandableSectionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
