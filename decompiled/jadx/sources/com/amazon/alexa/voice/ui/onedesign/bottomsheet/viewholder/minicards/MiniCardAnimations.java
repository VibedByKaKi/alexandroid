package com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.MiniCardAnimationListener;
import com.amazon.alexa.vox.ui.onedesign.R;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MiniCardAnimations {
    private MiniCardAnimations() {
    }

    public static void animateMiniCardReveal(View view, final Runnable runnable, final Runnable runnable2) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(view.getContext(), R.animator.ra_mini_card_reveal);
        loadAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards.MiniCardAnimations.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                runnable2.run();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                runnable2.run();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                runnable.run();
            }
        });
        loadAnimator.setTarget(view);
        loadAnimator.start();
    }

    private static Animation setExpandBackAnimation(View view) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(view.getContext(), R.anim.motion_easing_decelerate_mild);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.mini_card_scale_onrelease);
        loadAnimation.setInterpolator(loadInterpolator);
        return loadAnimation;
    }

    private static Animation setShrinkAnimation(View view) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(view.getContext(), R.anim.motion_easing_decelerate_mild);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.mini_card_scale_on_press);
        loadAnimation.setInterpolator(loadInterpolator);
        return loadAnimation;
    }

    public static void startOnPressAnimation(final View view, final View view2, @Nullable final Integer num, final MiniCardAnimationListener miniCardAnimationListener) {
        Animation shrinkAnimation = setShrinkAnimation(view);
        final Animation expandBackAnimation = setExpandBackAnimation(view);
        shrinkAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards.MiniCardAnimations.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(expandBackAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        expandBackAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards.MiniCardAnimations.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MiniCardAnimationListener miniCardAnimationListener2 = MiniCardAnimationListener.this;
                if (miniCardAnimationListener2 != null) {
                    miniCardAnimationListener2.onAnimationComplete(view2, num);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(shrinkAnimation);
    }
}
