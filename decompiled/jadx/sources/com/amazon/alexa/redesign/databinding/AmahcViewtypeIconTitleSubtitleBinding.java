package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.routing.api.RouteParameter;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcViewtypeIconTitleSubtitleBinding implements ViewBinding {

    @NonNull
    public final ImageView icon;

    @NonNull
    public final RelativeLayout iconContainer;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView subtitle;

    @NonNull
    public final TextView title;

    private AmahcViewtypeIconTitleSubtitleBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.icon = imageView;
        this.iconContainer = relativeLayout;
        this.subtitle = textView;
        this.title = textView2;
    }

    @NonNull
    public static AmahcViewtypeIconTitleSubtitleBinding bind(@NonNull View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.icon_container;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.subtitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new AmahcViewtypeIconTitleSubtitleBinding(view, imageView, relativeLayout, textView, textView2);
                    }
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcViewtypeIconTitleSubtitleBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.amahc_viewtype_icon_title_subtitle, viewGroup);
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
