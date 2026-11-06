package com.amazon.alexa.enrollment.utils;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.amazon.alexa.enrollment.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AnimationHelper {
    private static final Interpolator CUBIC_BEZIER_INTERPOLATOR = PathInterpolatorCompat.create(0.0f, 0.6f, 0.4f, 1.0f);
    private static final float FROM_ALPHA_FOR_PULSE = 0.4f;
    private static final long PULSE_DURATION = 500;
    private static final long PULSE_START_OFFSET = 333;
    private static final String TAG = "VoxEn_AnimationHelper";
    private static final float TO_ALPHA_FOR_PULSE = 1.0f;

    @VisibleForTesting
    public Animation getAnimation(Context context, int i) {
        return AnimationUtils.loadAnimation(context, i);
    }

    @VisibleForTesting
    public Animation getPulseAnimation() {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.4f, 1.0f);
        alphaAnimation.setInterpolator(linearInterpolator);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setStartOffset(PULSE_START_OFFSET);
        return alphaAnimation;
    }

    @VisibleForTesting
    public Animation getVerticalFadeInAnimation(Context context) {
        Animation animation = getAnimation(context, R.anim.vertical_fade_anim);
        animation.setInterpolator(CUBIC_BEZIER_INTERPOLATOR);
        return animation;
    }

    @VisibleForTesting
    public Animation getVerticalFadeInAnimationForAllSetPage(Context context) {
        Animation animation = getAnimation(context, R.anim.vertical_fade_anim_all_set);
        animation.setInterpolator(CUBIC_BEZIER_INTERPOLATOR);
        return animation;
    }

    public void renderFadeInAnimation(Context context, View view) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animation animation = getAnimation(context, R.anim.fade_in_anim);
        animation.setInterpolator(linearInterpolator);
        view.setAnimation(animation);
    }

    public void renderFadeInAnimationForButton(Context context, View view) {
        view.setAnimation(getAnimation(context, R.anim.button_anim));
    }

    public void renderProgressBarBounceAnimation(Context context, View view) {
        view.setAnimation(getAnimation(context, R.anim.image_update_anim));
    }

    public void renderPulseAnimation(Context context, View view) {
        view.setAnimation(getPulseAnimation());
    }

    public void renderTickBoxAnimation(ImageView imageView) {
        imageView.setBackgroundResource(R.drawable.done_check_box);
        ((AnimationDrawable) imageView.getBackground()).start();
    }

    public void renderVerticalFadeInAnimation(Context context, View view) {
        view.setAnimation(getVerticalFadeInAnimation(context));
    }

    public void renderVerticalFadeInAnimationForCompletionPage(Context context, View view) {
        view.setAnimation(getVerticalFadeInAnimationForAllSetPage(context));
    }

    public void renderVerticalSideWithPulseAnimation(Context context, View view) {
        Animation pulseAnimation = getPulseAnimation();
        Animation verticalFadeInAnimation = getVerticalFadeInAnimation(context);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(verticalFadeInAnimation);
        animationSet.addAnimation(pulseAnimation);
        view.setAnimation(animationSet);
    }
}
