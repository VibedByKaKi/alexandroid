package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.view.errorPage.ErrorPage;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcAgentForwardHomeRnBinding implements ViewBinding {

    @NonNull
    public final ComposeView composeView;

    @NonNull
    public final ErrorPage errorPage;

    @NonNull
    public final LinearLayout reactContainer;

    @NonNull
    private final RelativeLayout rootView;

    private AmahcAgentForwardHomeRnBinding(@NonNull RelativeLayout relativeLayout, @NonNull ComposeView composeView, @NonNull ErrorPage errorPage, @NonNull LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.composeView = composeView;
        this.errorPage = errorPage;
        this.reactContainer = linearLayout;
    }

    @NonNull
    public static AmahcAgentForwardHomeRnBinding bind(@NonNull View view) {
        int i = R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = R.id.error_page;
            ErrorPage errorPage = (ErrorPage) ViewBindings.findChildViewById(view, i);
            if (errorPage != null) {
                i = R.id.react_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new AmahcAgentForwardHomeRnBinding((RelativeLayout) view, composeView, errorPage, linearLayout);
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcAgentForwardHomeRnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_agent_forward_home_rn, viewGroup, false);
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
    public static AmahcAgentForwardHomeRnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
