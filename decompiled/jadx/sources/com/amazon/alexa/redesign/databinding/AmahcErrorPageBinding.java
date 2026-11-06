package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.font.FontTextView;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.routing.api.RouteParameter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcErrorPageBinding implements ViewBinding {

    @NonNull
    public final ImageView errorPageImage;

    @NonNull
    public final FontTextView errorPageSubtitle;

    @NonNull
    public final FontTextView errorPageTitle;

    @NonNull
    private final View rootView;

    private AmahcErrorPageBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull FontTextView fontTextView, @NonNull FontTextView fontTextView2) {
        this.rootView = view;
        this.errorPageImage = imageView;
        this.errorPageSubtitle = fontTextView;
        this.errorPageTitle = fontTextView2;
    }

    @NonNull
    public static AmahcErrorPageBinding bind(@NonNull View view) {
        int i = R.id.error_page_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.error_page_subtitle;
            FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
            if (fontTextView != null) {
                i = R.id.error_page_title;
                FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(view, i);
                if (fontTextView2 != null) {
                    return new AmahcErrorPageBinding(view, imageView, fontTextView, fontTextView2);
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcErrorPageBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.amahc_error_page, viewGroup);
            return bind(viewGroup);
        }
        Single$$ExternalSyntheticBUOutline0.m$1(RouteParameter.PARENT);
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
