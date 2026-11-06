package com.amazon.alexa.growth.coachmark;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.amazon.alexa.growth.R;
import com.github.florent37.viewtooltip.ViewTooltip;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CoachMarkAnimation implements ViewTooltip.TooltipAnimation {
    private final TextView customTextView;
    public boolean enableTextFadeIn = true;
    private final Resources resources;

    public CoachMarkAnimation(Resources resources, TextView textView) {
        this.resources = resources;
        this.customTextView = textView;
    }

    @Override // com.github.florent37.viewtooltip.ViewTooltip.TooltipAnimation
    public void animateEnter(View view, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator;
        Property property = View.SCALE_X;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.05f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 0.0f, 1.05f));
        ofPropertyValuesHolder.setDuration(this.resources.getInteger(R.integer.coachmark_animate_enter_scale_up_duration));
        ofPropertyValuesHolder.setInterpolator(new PathInterpolator(0.333f, 0.0f, 0.333f, 1.0f));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, 0.0f, 1.0f);
        ofFloat2.setDuration(this.resources.getInteger(R.integer.coachmark_animate_enter_bubble_fade_in_duration));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.0f));
        ofPropertyValuesHolder2.setDuration(this.resources.getInteger(R.integer.coachmark_animate_enter_scale_down_duration));
        ofPropertyValuesHolder2.setInterpolator(new PathInterpolator(0.6f, 0.0f, 1.0f, 0.4f));
        if (this.enableTextFadeIn) {
            this.customTextView.setAlpha(0.0f);
            objectAnimator = ObjectAnimator.ofFloat(this.customTextView, (Property<TextView, Float>) property3, 0.0f, 1.0f);
            objectAnimator.setDuration(this.resources.getInteger(R.integer.coachmark_animate_enter_text_fade_in_duration));
            objectAnimator.setInterpolator(new LinearInterpolator());
        } else {
            objectAnimator = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(animatorListener);
        AnimatorSet.Builder with = animatorSet.play(ofPropertyValuesHolder).with(ofFloat2);
        if (this.enableTextFadeIn && objectAnimator != null) {
            with = with.before(objectAnimator);
        }
        with.before(ofPropertyValuesHolder2);
        animatorSet.start();
    }

    @Override // com.github.florent37.viewtooltip.ViewTooltip.TooltipAnimation
    public void animateExit(View view, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        ofFloat.setDuration(this.resources.getInteger(R.integer.coachmark_animate_exit_text_fade_out_duration));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(animatorListener);
        ofFloat.start();
    }
}
