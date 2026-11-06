package com.amazon.alexa.voice.ui.onedesign.bottomsheetcards;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.amazon.alexa.vox.ui.onedesign.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VoiceChromeAnimator {
    private final Context context;
    private Animation invokeChromeAnimations = null;
    private Animation dismissChromeAnimations = null;

    public VoiceChromeAnimator(Context context) {
        this.context = context;
        initializeChromeViewAnimations();
    }

    private void initializeChromeViewAnimations() {
        long integer = this.context.getResources().getInteger(R.integer.alexachrome_view_open_duration);
        long integer2 = this.context.getResources().getInteger(R.integer.alexachrome_view_dismiss_duration);
        float integer3 = this.context.getResources().getInteger(R.integer.chrome_view_y_delta);
        float integer4 = this.context.getResources().getInteger(R.integer.chrome_view_y_delta);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(this.context, R.anim.motion_easing_decelerate_mild);
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(this.context, R.anim.motion_easing_accelerate);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, integer4, 0.0f);
        this.invokeChromeAnimations = translateAnimation;
        translateAnimation.setDuration(integer);
        this.invokeChromeAnimations.setInterpolator(loadInterpolator);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, integer3);
        this.dismissChromeAnimations = translateAnimation2;
        translateAnimation2.setDuration(integer2);
        this.dismissChromeAnimations.setInterpolator(loadInterpolator2);
    }

    public Animation getDismissChromeAnimations() {
        return this.dismissChromeAnimations;
    }

    public Animation getInvokeChromeAnimations() {
        return this.invokeChromeAnimations;
    }
}
