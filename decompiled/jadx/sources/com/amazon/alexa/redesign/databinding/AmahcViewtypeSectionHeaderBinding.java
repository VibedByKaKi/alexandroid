package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.font.FontTextView;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.routing.api.RouteParameter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcViewtypeSectionHeaderBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final FontTextView subtitle;

    @NonNull
    public final FontTextView title;

    private AmahcViewtypeSectionHeaderBinding(@NonNull View view, @NonNull FontTextView fontTextView, @NonNull FontTextView fontTextView2) {
        this.rootView = view;
        this.subtitle = fontTextView;
        this.title = fontTextView2;
    }

    @NonNull
    public static AmahcViewtypeSectionHeaderBinding bind(@NonNull View view) {
        int i = R.id.subtitle;
        FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(view, i);
        if (fontTextView != null) {
            i = R.id.title;
            FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(view, i);
            if (fontTextView2 != null) {
                return new AmahcViewtypeSectionHeaderBinding(view, fontTextView, fontTextView2);
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcViewtypeSectionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.amahc_viewtype_section_header, viewGroup);
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
