package com.amazon.alexa.redesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amazon.alexa.redesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmahcDebugMenuBinding implements ViewBinding {

    @NonNull
    public final Switch bypassSwitch;

    @NonNull
    public final Button exitButton;

    @NonNull
    public final Switch localJSONSwitch;

    @NonNull
    private final LinearLayout rootView;

    private AmahcDebugMenuBinding(@NonNull LinearLayout linearLayout, @NonNull Switch r2, @NonNull Button button, @NonNull Switch r4) {
        this.rootView = linearLayout;
        this.bypassSwitch = r2;
        this.exitButton = button;
        this.localJSONSwitch = r4;
    }

    @NonNull
    public static AmahcDebugMenuBinding bind(@NonNull View view) {
        int i = R.id.bypass_switch;
        Switch r1 = (Switch) ViewBindings.findChildViewById(view, i);
        if (r1 != null) {
            i = R.id.exit_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.localJSON_switch;
                Switch r3 = (Switch) ViewBindings.findChildViewById(view, i);
                if (r3 != null) {
                    return new AmahcDebugMenuBinding((LinearLayout) view, r1, button, r3);
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    public static AmahcDebugMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.amahc_debug_menu, viewGroup, false);
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
    public static AmahcDebugMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
