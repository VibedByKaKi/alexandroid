package com.amazon.dee.app.ui.main;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.ui.TabBarAnimator;
import com.amazon.dee.app.core.databinding.MainBinding;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.util.ThreadConditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class MainTabBarAnimator implements TabBarAnimator {
    private static final int CONTENT_ANIMATION_DURATION = 50;
    private static final String TAG = Log.tag((Class<?>) MainTabBarAnimator.class);
    private static final int TIME_TO_WAIT_BEFORE_TAB_ANIMATION = 150;
    private static final float VIEW_OPAQUE_FULL = 1.0f;
    private static final int VIEW_TRANSLATION_ORIGIN = 0;
    private static final float VIEW_TRANSPARENT_FULL = 0.0f;
    private volatile boolean animateHidingTab;
    private volatile boolean animateRevealingTab;
    private final FrameLayout mainContent;
    private final int shortAnimationDuration;
    private View tabContainer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.dee.app.ui.main.MainTabBarAnimator$3, reason: invalid class name */
    public class AnonymousClass3 extends SimpleAnimationListener {
        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAnimationEnd$0() {
            MainTabBarAnimator.this.tabContainer.setAlpha(1.0f);
            MainTabBarAnimator.this.tabContainer.animate().translationY(MainTabBarAnimator.this.tabContainer.getHeight()).alpha(0.0f).setDuration(MainTabBarAnimator.this.shortAnimationDuration).setListener(new AnimatorListenerAdapter() { // from class: com.amazon.dee.app.ui.main.MainTabBarAnimator.3.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    MainTabBarAnimator.this.tabContainer.setVisibility(8);
                    MainTabBarAnimator.this.animateHidingTab = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    MainTabBarAnimator.this.tabContainer.setVisibility(8);
                    MainTabBarAnimator.this.animateHidingTab = false;
                }
            }).start();
        }

        @Override // com.amazon.dee.app.ui.main.MainTabBarAnimator.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MainTabBarAnimator.this.tabContainer.postDelayed(new MainViewModel$$ExternalSyntheticLambda3(this, 1), 150L);
        }
    }

    public MainTabBarAnimator(MainBinding mainBinding, Resources resources) {
        this.tabContainer = mainBinding.tabLayoutContainerStub;
        this.mainContent = mainBinding.mainContent;
        this.shortAnimationDuration = resources.getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recoverFromAnimation() {
        if (this.tabContainer.getTranslationY() > 0.0f) {
            this.tabContainer.setTranslationY(0.0f);
            this.tabContainer.setAlpha(1.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mainContent.getLayoutParams();
            layoutParams.addRule(2, this.tabContainer.getId());
            this.mainContent.setLayoutParams(layoutParams);
        }
    }

    @Override // com.amazon.alexa.protocols.ui.TabBarAnimator
    public void hide(TabBarAnimator.AnimationSpeed animationSpeed) {
        if (!ThreadConditions.isOnMainThread()) {
            Log.w(TAG, "Hide was not called from the main thread");
            return;
        }
        boolean equals = TabBarAnimator.AnimationSpeed.IMMEDIATE.equals(animationSpeed);
        View view = this.tabContainer;
        if (equals) {
            view.setVisibility(8);
            return;
        }
        if (view == null || (view.getVisibility() == 0 && !this.animateHidingTab)) {
            Animation animation = new Animation() { // from class: com.amazon.dee.app.ui.main.MainTabBarAnimator.2
                @Override // android.view.animation.Animation
                public void applyTransformation(float f, Transformation transformation) {
                    super.applyTransformation(f, transformation);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) MainTabBarAnimator.this.mainContent.getLayoutParams();
                    layoutParams.removeRule(2);
                    MainTabBarAnimator.this.mainContent.setLayoutParams(layoutParams);
                }
            };
            animation.setAnimationListener(new AnonymousClass3());
            animation.setDuration(50L);
            this.mainContent.startAnimation(animation);
            this.animateHidingTab = true;
        }
    }

    public void reset() {
        if (!ThreadConditions.isOnMainThread()) {
            Log.w(TAG, "Reset was not called from the main thread");
        } else {
            this.animateRevealingTab = false;
            this.animateHidingTab = false;
        }
    }

    @Override // com.amazon.alexa.protocols.ui.TabBarAnimator
    public void reveal(TabBarAnimator.AnimationSpeed animationSpeed) {
        if (!ThreadConditions.isOnMainThread()) {
            Log.w(TAG, "Reveal was not called from the main thread");
            return;
        }
        boolean equals = TabBarAnimator.AnimationSpeed.IMMEDIATE.equals(animationSpeed);
        View view = this.tabContainer;
        if (equals) {
            view.setVisibility(0);
            recoverFromAnimation();
            return;
        }
        if (view == null || !(view.getVisibility() == 0 || this.animateRevealingTab)) {
            this.animateRevealingTab = true;
            this.tabContainer.setVisibility(0);
            this.tabContainer.animate().translationY(0.0f).alpha(1.0f).setDuration(this.shortAnimationDuration).setListener(new AnimatorListenerAdapter() { // from class: com.amazon.dee.app.ui.main.MainTabBarAnimator.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    MainTabBarAnimator.this.animateRevealingTab = false;
                    MainTabBarAnimator.this.recoverFromAnimation();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    MainTabBarAnimator.this.animateRevealingTab = false;
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) MainTabBarAnimator.this.mainContent.getLayoutParams();
                    layoutParams.addRule(2, MainTabBarAnimator.this.tabContainer.getId());
                    MainTabBarAnimator.this.mainContent.setLayoutParams(layoutParams);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public void onAnimationPause(Animator animator) {
                    super.onAnimationPause(animator);
                    MainTabBarAnimator.this.animateRevealingTab = false;
                    MainTabBarAnimator.this.recoverFromAnimation();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    MainTabBarAnimator.this.tabContainer.setAlpha(0.0f);
                }
            }).start();
        } else {
            Handler handler = this.tabContainer.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleAnimationListener implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    @VisibleForTesting
    public MainTabBarAnimator(View view, FrameLayout frameLayout, int i) {
        this.tabContainer = view;
        this.mainContent = frameLayout;
        this.shortAnimationDuration = i;
    }
}
