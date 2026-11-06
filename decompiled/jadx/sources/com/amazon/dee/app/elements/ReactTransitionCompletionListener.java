package com.amazon.dee.app.elements;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.amazon.alexa.transitions.TransitionDirectory;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.regulator.ControllerTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ReactTransitionCompletionListener implements ControllerTransition.CompletionListener {
    public static final int PAGE_TRANSITION_DURATION = 166;
    private static final String TAG = Log.tag((Class<?>) ReactTransitionCompletionListener.class);
    View from;
    LayoutTransition layoutTransition;
    ControllerTransition.CompletionListener listener;
    View to;
    TransitionDirectory transitionDirectory;
    ReactNativeViewDelegate viewDelegate;
    Runnable viewRendered;

    public ReactTransitionCompletionListener(@Nullable View view, View view2, ControllerTransition.CompletionListener completionListener, Runnable runnable, ReactNativeViewDelegate reactNativeViewDelegate, TransitionDirectory transitionDirectory) {
        this.listener = completionListener;
        this.from = view;
        this.to = view2;
        this.viewRendered = runnable;
        this.viewDelegate = reactNativeViewDelegate;
        this.transitionDirectory = transitionDirectory;
        LayoutTransition layoutTransition = new LayoutTransition();
        this.layoutTransition = layoutTransition;
        configureSurfaceRootLayoutTransition(layoutTransition);
        setLayoutTransition((ViewGroup) view, this.layoutTransition);
        setLayoutTransition((ViewGroup) view2, this.layoutTransition);
    }

    public static void configureLayoutTransition(LayoutTransition layoutTransition) {
        layoutTransition.enableTransitionType(2);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.enableTransitionType(3);
        layoutTransition.disableTransitionType(4);
        layoutTransition.setDuration(166L);
    }

    public static void configureSurfaceRootLayoutTransition(LayoutTransition layoutTransition) {
        configureLayoutTransition(layoutTransition);
        layoutTransition.disableTransitionType(3);
    }

    public static void setLayoutTransition(ViewGroup viewGroup, LayoutTransition layoutTransition) {
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }

    @Override // com.amazon.regulator.ControllerTransition.CompletionListener
    public void completeTransition() {
        this.listener.completeTransition();
        this.transitionDirectory.applyTransition();
        Runnable runnable = this.viewRendered;
        if (runnable != null) {
            runnable.run();
        }
        ReactNativeViewDelegate reactNativeViewDelegate = this.viewDelegate;
        if (reactNativeViewDelegate != null) {
            reactNativeViewDelegate.updateIsReactNative();
        } else {
            Log.w(TAG, "completeTransition: viewDelegate is null; cannot update isReactNative");
        }
        setLayoutTransition((ViewGroup) this.from, this.layoutTransition);
        setLayoutTransition((ViewGroup) this.to, this.layoutTransition);
    }
}
