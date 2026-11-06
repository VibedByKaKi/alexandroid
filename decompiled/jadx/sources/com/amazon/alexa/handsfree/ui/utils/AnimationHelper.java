package com.amazon.alexa.handsfree.ui.utils;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AnimationHelper {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RelativeDimension {
        SCREEN_WIDTH,
        SCREEN_HEIGHT
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TranslationAxis {
        HORIZONTAL("translationX"),
        VERTICAL("translationY");

        private final String mPropertyName;

        TranslationAxis(@NonNull String str) {
            this.mPropertyName = str;
        }

        @NonNull
        public String getPropertyName() {
            return this.mPropertyName;
        }
    }

    public void applyAnimatorResource(@AnimatorRes int i, @NonNull View view, @Nullable Animator.AnimatorListener animatorListener) {
        Animator loadAnimator = loadAnimator(i, view);
        loadAnimator.setTarget(view);
        if (animatorListener != null) {
            loadAnimator.addListener(animatorListener);
        }
        loadAnimator.start();
    }

    public void applyTranslation(@NonNull ObjectAnimator objectAnimator, @NonNull Activity activity, @NonNull RelativeDimension relativeDimension, @NonNull TranslationAxis translationAxis, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = relativeDimension == RelativeDimension.SCREEN_WIDTH ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        objectAnimator.setPropertyName(translationAxis.getPropertyName());
        objectAnimator.setFloatValues(i * f, 0.0f);
    }

    @VisibleForTesting
    public Animator loadAnimator(@AnimatorRes int i, @NonNull View view) {
        return AnimatorInflater.loadAnimator(view.getContext(), i);
    }

    public void applyAnimatorResource(@AnimatorRes int i, @NonNull View view) {
        applyAnimatorResource(i, view, null);
    }
}
