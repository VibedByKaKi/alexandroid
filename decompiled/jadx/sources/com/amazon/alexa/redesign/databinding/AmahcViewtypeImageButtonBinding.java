package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.routing.api.RouteParameter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcViewtypeImageButtonBinding implements ViewBinding {

    @NonNull
    public final ImageButton imageButton;

    @NonNull
    private final View rootView;

    private AmahcViewtypeImageButtonBinding(@NonNull View view, @NonNull ImageButton imageButton) {
        this.rootView = view;
        this.imageButton = imageButton;
    }

    @NonNull
    public static AmahcViewtypeImageButtonBinding bind(@NonNull View view) {
        int i = R.id.image_button;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            return new AmahcViewtypeImageButtonBinding(view, imageButton);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcViewtypeImageButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.amahc_viewtype_image_button, viewGroup);
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
