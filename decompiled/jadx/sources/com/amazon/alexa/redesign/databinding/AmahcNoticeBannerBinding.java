package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.font.FontTextView;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcNoticeBannerBinding implements ViewBinding {

    @NonNull
    public final ImageView nbCloseButton;

    @NonNull
    public final ImageView nbLeftIcon;

    @NonNull
    public final FontTextView nbLink;

    @NonNull
    public final FontTextView nbTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final LinearLayout textContainer;

    private AmahcNoticeBannerBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull FontTextView fontTextView, @NonNull FontTextView fontTextView2, @NonNull LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.nbCloseButton = imageView;
        this.nbLeftIcon = imageView2;
        this.nbLink = fontTextView;
        this.nbTitle = fontTextView2;
        this.textContainer = linearLayout;
    }

    @NonNull
    public static AmahcNoticeBannerBinding bind(@NonNull View view) {
        int i = R.id.nb_close_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.nb_left_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.nb_link;
                FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
                if (fontTextView != null) {
                    i = R.id.nb_title;
                    FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(view, i);
                    if (fontTextView2 != null) {
                        i = R.id.text_container;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new AmahcNoticeBannerBinding((RelativeLayout) view, imageView, imageView2, fontTextView, fontTextView2, linearLayout);
                        }
                    }
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcNoticeBannerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_notice_banner, viewGroup, false);
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
    public static AmahcNoticeBannerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
