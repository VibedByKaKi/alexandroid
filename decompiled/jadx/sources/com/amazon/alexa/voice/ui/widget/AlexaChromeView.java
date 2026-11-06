package com.amazon.alexa.voice.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.chrome.R;
import com.amazon.alexa.voice.ui.widget.AnimationMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AlexaChromeView extends View {
    private static final float CHROME_SCALE_FACTOR = 0.75f;
    private static final int CHROME_TOP_OFFSET = 45;
    private static final int CHROME_WIDTH_FOR_RESPONDING = 2;
    private static final float LEVEL_DIFFERENCE_THRESHOLD = 0.1f;
    private static final int MAX_OPACITY = 255;
    private static final int MIN_OPACITY = 0;
    private static final Property<AlexaChromeView, Float> RENDER_LEVEL = new Property<AlexaChromeView, Float>(Float.class, "renderLevel") { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.11
        @Override // android.util.Property
        public Float get(AlexaChromeView alexaChromeView) {
            return Float.valueOf(alexaChromeView.getRenderLevel());
        }

        @Override // android.util.Property
        public void set(AlexaChromeView alexaChromeView, Float f) {
            alexaChromeView.setRenderLevel(f.floatValue());
        }
    };
    private int backgroundColor;
    private Drawable chromeDrawable;
    private int leftAnimatedDistance;
    private Drawable leftChromeDrawable;
    private int openingOpacityValue;
    private AnimatorSet openingStateAnimatorSet;
    private ValueAnimator openingStateLeftAnimator;
    private ValueAnimator openingStateOpacityAnimator;
    private ValueAnimator openingStateRightAnimator;
    private float renderLevel;
    private AnimatorSet respondingStateAnimatorSet;
    private ValueAnimator respondingStateOpacityAnimatorFirst;
    private ValueAnimator respondingStateOpacityAnimatorSecond;
    private int responseOpacityValue;
    private int rightAnimatedDistance;
    private Drawable rightChromeDrawable;
    private float soundLevel;
    private ObjectAnimator soundLevelAnimator;
    private int thinkingOpacityAnimatedDistance;
    private AnimatorSet thinkingStateAnimatorSet;
    private ValueAnimator thinkingStateOpacityAnimatorFirst;
    private ValueAnimator thinkingStateOpacityAnimatorSecond;
    private VoiceChromeState voiceChromeState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.widget.AlexaChromeView$12, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass12 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$voice$ui$widget$AlexaChromeView$VoiceChromeState;

        static {
            int[] iArr = new int[VoiceChromeState.values().length];
            $SwitchMap$com$amazon$alexa$voice$ui$widget$AlexaChromeView$VoiceChromeState = iArr;
            try {
                iArr[VoiceChromeState.THINKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$widget$AlexaChromeView$VoiceChromeState[VoiceChromeState.RESPONDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$widget$AlexaChromeView$VoiceChromeState[VoiceChromeState.LISTENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VoiceChromeState {
        OPENING,
        LISTENING,
        THINKING,
        RESPONDING,
        IDLE
    }

    public AlexaChromeView(Context context) {
        super(context);
        this.voiceChromeState = VoiceChromeState.IDLE;
        initialize(context, null);
    }

    private void cancelAnimatorSets() {
        ObjectAnimator objectAnimator = this.soundLevelAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet = this.openingStateAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.openingStateLeftAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.openingStateRightAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.openingStateOpacityAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        AnimatorSet animatorSet2 = this.thinkingStateAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.respondingStateAnimatorSet;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        if (this.thinkingStateOpacityAnimatorFirst != null) {
            this.thinkingStateAnimatorSet.cancel();
        }
        ValueAnimator valueAnimator4 = this.thinkingStateOpacityAnimatorSecond;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.respondingStateOpacityAnimatorFirst;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.respondingStateOpacityAnimatorSecond;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    private void drawChrome(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        int i6 = (i - i4) / 2;
        this.chromeDrawable.setAlpha(i5);
        this.chromeDrawable.setBounds(i6, (i2 - i3) - 45, i4 + i6, i2);
        int save = canvas.save();
        canvas.clipRect(0, 0, i, i2);
        canvas.drawColor(this.backgroundColor);
        this.chromeDrawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    private void drawOpeningAnimationFrame(Canvas canvas, int i, int i2, int i3) {
        int i4 = (i2 - i3) - 45;
        int i5 = this.leftAnimatedDistance;
        float f = (i * 0.75f) / 2.0f;
        int i6 = this.rightAnimatedDistance;
        this.leftChromeDrawable.setAlpha(this.openingOpacityValue);
        this.leftChromeDrawable.setBounds((int) (i5 - f), i4, (int) (i5 + f), i2);
        this.rightChromeDrawable.setBounds((int) (i6 - f), i4, (int) (i6 + f), i2);
        int save = canvas.save();
        canvas.clipRect(0, 0, i, i2);
        canvas.drawColor(this.backgroundColor);
        this.leftChromeDrawable.draw(canvas);
        this.rightChromeDrawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    private static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getRenderLevel() {
        return this.renderLevel;
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ChromeView, 0, 0);
        try {
            this.chromeDrawable = obtainStyledAttributes.getDrawable(R.styleable.ChromeView_voiceChrome);
            this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.ChromeView_voiceColor, -14855178);
            obtainStyledAttributes.recycle();
            if (this.chromeDrawable == null) {
                this.chromeDrawable = getDrawable(context, R.drawable.ctr_voice_chrome_glow);
            }
            if (this.leftChromeDrawable == null) {
                this.leftChromeDrawable = getDrawable(context, R.drawable.ctr_voice_chrome_glow_left);
            }
            if (this.rightChromeDrawable == null) {
                this.rightChromeDrawable = getDrawable(context, R.drawable.ctr_voice_chrome_glow_right);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private boolean isIdleState() {
        return this.voiceChromeState.equals(VoiceChromeState.IDLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isListeningState() {
        return this.voiceChromeState.equals(VoiceChromeState.LISTENING);
    }

    private boolean isOpeningState() {
        return this.voiceChromeState.equals(VoiceChromeState.OPENING);
    }

    private boolean isRespondingState() {
        return this.voiceChromeState.equals(VoiceChromeState.RESPONDING);
    }

    private boolean isThinkingState() {
        return this.voiceChromeState.equals(VoiceChromeState.THINKING);
    }

    private void prepareSoundLevelAnimator() {
        if (this.soundLevelAnimator == null) {
            ObjectAnimator objectAnimator = new ObjectAnimator();
            this.soundLevelAnimator = objectAnimator;
            objectAnimator.setTarget(this);
            this.soundLevelAnimator.setProperty(RENDER_LEVEL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshVoiceChromeState(VoiceChromeState voiceChromeState) {
        this.voiceChromeState = voiceChromeState;
        this.renderLevel = 0.0f;
        cancelAnimatorSets();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftAnimatedDistance(int i) {
        this.leftAnimatedDistance = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningOpacityValue(int i) {
        this.openingOpacityValue = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderLevel(float f) {
        if (this.renderLevel != f) {
            this.renderLevel = f;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseOpacityValue(int i) {
        this.responseOpacityValue = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightAnimatedDistance(int i) {
        this.rightAnimatedDistance = i;
    }

    private void setSoundLevel(float f) {
        this.soundLevel = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThinkingOpacityAnimatedDistance(int i) {
        if (this.thinkingOpacityAnimatedDistance != i) {
            this.thinkingOpacityAnimatedDistance = i;
            postInvalidateOnAnimation();
        }
    }

    private void startOpeningAnimation() {
        int width = getWidth();
        int i = width / 2;
        this.openingStateLeftAnimator = ValueAnimator.ofInt(0, i);
        this.openingStateRightAnimator = ValueAnimator.ofInt(width, i);
        this.openingStateOpacityAnimator = ValueAnimator.ofInt(255, 0);
        this.openingStateLeftAnimator.setStartDelay(0L);
        this.openingStateLeftAnimator.setInterpolator(AnimationMetrics.OpeningState.LEFT_ANIMATOR_INTERPOLATOR);
        this.openingStateLeftAnimator.setDuration(500L);
        this.openingStateRightAnimator.setStartDelay(0L);
        this.openingStateRightAnimator.setInterpolator(AnimationMetrics.OpeningState.RIGHT_ANIMATOR_INTERPOLATOR);
        this.openingStateRightAnimator.setDuration(500L);
        this.openingStateOpacityAnimator.setStartDelay(300L);
        this.openingStateOpacityAnimator.setDuration(166L);
        this.openingStateOpacityAnimator.setInterpolator(AnimationMetrics.OpeningState.OPACITY_ANIMATOR_INTERPOLATOR);
        this.openingOpacityValue = 255;
        this.openingStateLeftAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setLeftAnimatedDistance(((Integer) valueAnimator.getAnimatedValue()).intValue());
                AlexaChromeView.this.postInvalidateOnAnimation();
            }
        });
        this.openingStateRightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setRightAnimatedDistance(((Integer) valueAnimator.getAnimatedValue()).intValue());
                AlexaChromeView.this.postInvalidateOnAnimation();
            }
        });
        this.openingStateOpacityAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setOpeningOpacityValue(((Integer) valueAnimator.getAnimatedValue()).intValue());
                AlexaChromeView.this.postInvalidateOnAnimation();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.openingStateAnimatorSet = animatorSet;
        animatorSet.playTogether(this.openingStateLeftAnimator, this.openingStateRightAnimator, this.openingStateOpacityAnimator);
        this.openingStateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                if (AlexaChromeView.this.isListeningState()) {
                    return;
                }
                AlexaChromeView.this.refreshVoiceChromeState(VoiceChromeState.LISTENING);
                AlexaChromeView.this.postInvalidateOnAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (AlexaChromeView.this.isListeningState()) {
                    return;
                }
                AlexaChromeView.this.refreshVoiceChromeState(VoiceChromeState.LISTENING);
                AlexaChromeView.this.postInvalidateOnAnimation();
            }
        });
        this.openingStateAnimatorSet.start();
    }

    private void startRespondingAnimation() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        this.respondingStateOpacityAnimatorFirst = ofInt;
        ofInt.setStartDelay(0L);
        this.respondingStateOpacityAnimatorFirst.setDuration(916L);
        this.respondingStateOpacityAnimatorFirst.setInterpolator(AnimationMetrics.RespondingState.FIRST_OPACITY_ANIMATOR_INTERPOLATOR);
        this.respondingStateOpacityAnimatorFirst.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setResponseOpacityValue(((Integer) valueAnimator.getAnimatedValue()).intValue());
                AlexaChromeView.this.postInvalidateOnAnimation();
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
        this.respondingStateOpacityAnimatorSecond = ofInt2;
        ofInt2.setStartDelay(916L);
        this.respondingStateOpacityAnimatorSecond.setDuration(916L);
        this.respondingStateOpacityAnimatorSecond.setInterpolator(AnimationMetrics.RespondingState.SECOND_OPACITY_ANIMATOR_INTERPOLATOR);
        this.respondingStateOpacityAnimatorSecond.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setResponseOpacityValue(((Integer) valueAnimator.getAnimatedValue()).intValue());
                AlexaChromeView.this.postInvalidateOnAnimation();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.respondingStateAnimatorSet = animatorSet;
        animatorSet.playTogether(this.respondingStateOpacityAnimatorFirst, this.respondingStateOpacityAnimatorSecond);
        this.respondingStateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.10
            private boolean animationCancelled = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.animationCancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.animationCancelled) {
                    animator.cancel();
                } else {
                    animator.start();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.animationCancelled = false;
            }
        });
        this.respondingStateAnimatorSet.start();
    }

    private void startThinkingAnimation() {
        prepareSoundLevelAnimator();
        this.soundLevelAnimator.setFloatValues(0.2f, 1.0f);
        this.soundLevelAnimator.setStartDelay(0L);
        this.soundLevelAnimator.setDuration(666L);
        this.soundLevelAnimator.setInterpolator(AnimationMetrics.ThinkingState.SCALE_ANIMATOR_INTERPOLATOR);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        this.thinkingStateOpacityAnimatorFirst = ofInt;
        ofInt.setStartDelay(0L);
        this.thinkingStateOpacityAnimatorFirst.setDuration(100L);
        this.thinkingStateOpacityAnimatorFirst.setInterpolator(AnimationMetrics.ThinkingState.FIRST_OPACITY_ANIMATOR_INTERPOLATOR);
        this.thinkingStateOpacityAnimatorFirst.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setThinkingOpacityAnimatedDistance(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
        this.thinkingStateOpacityAnimatorSecond = ofInt2;
        ofInt2.setStartDelay(400L);
        this.thinkingStateOpacityAnimatorSecond.setDuration(266L);
        this.thinkingStateOpacityAnimatorSecond.setInterpolator(AnimationMetrics.ThinkingState.SECOND_OPACITY_ANIMATOR_INTERPOLATOR);
        this.thinkingStateOpacityAnimatorSecond.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                AlexaChromeView.this.setThinkingOpacityAnimatedDistance(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.thinkingStateAnimatorSet = animatorSet;
        animatorSet.playTogether(this.soundLevelAnimator, this.thinkingStateOpacityAnimatorFirst, this.thinkingStateOpacityAnimatorSecond);
        this.thinkingStateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.amazon.alexa.voice.ui.widget.AlexaChromeView.7
            private boolean animationCancelled = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.animationCancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.animationCancelled) {
                    animator.cancel();
                } else {
                    animator.start();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.animationCancelled = false;
            }
        });
        this.thinkingStateAnimatorSet.start();
    }

    public void animateSoundLevelChange(float f) {
        if (!isListeningState() || Math.abs(this.soundLevel - f) < 0.1f) {
            return;
        }
        setSoundLevel(f);
        prepareSoundLevelAnimator();
        ObjectAnimator objectAnimator = this.soundLevelAnimator;
        if (f == 1.0f) {
            objectAnimator.setFloatValues(f, 0.0f);
            this.soundLevelAnimator.setInterpolator(AnimationMetrics.ListeningState.SCALE_DOWN_ANIMATOR_INTERPOLATOR);
            this.soundLevelAnimator.setDuration(200L);
        } else {
            objectAnimator.setFloatValues(this.soundLevel);
            this.soundLevelAnimator.setInterpolator(AnimationMetrics.ListeningState.SCALE_ANIMATOR_INTERPOLATOR);
            this.soundLevelAnimator.setDuration(66L);
        }
        this.soundLevelAnimator.start();
    }

    public VoiceChromeState getCurrentState() {
        return this.voiceChromeState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
        cancelAnimatorSets();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int width = getWidth();
        int height = getHeight();
        int intrinsicWidth = this.chromeDrawable.getIntrinsicWidth();
        int intrinsicHeight = this.chromeDrawable.getIntrinsicHeight();
        if (isOpeningState()) {
            drawOpeningAnimationFrame(canvas, width, height, intrinsicHeight);
            return;
        }
        if (isIdleState()) {
            return;
        }
        int i2 = AnonymousClass12.$SwitchMap$com$amazon$alexa$voice$ui$widget$AlexaChromeView$VoiceChromeState[this.voiceChromeState.ordinal()];
        if (i2 == 1) {
            intrinsicWidth = (int) (intrinsicWidth * this.renderLevel * 0.6d);
            i = this.thinkingOpacityAnimatedDistance;
        } else if (i2 != 2) {
            i = 255;
            if (i2 == 3) {
                float f = intrinsicWidth;
                float f2 = (width * 0.75f) / f;
                intrinsicWidth = (int) DoubleList$$ExternalSyntheticOutline0.m(1.0f - f2, this.renderLevel, f2, f);
            }
        } else {
            i = this.responseOpacityValue;
            intrinsicWidth *= 2;
        }
        drawChrome(canvas, width, height, intrinsicHeight, intrinsicWidth, i);
    }

    public void startListening() {
        if (isListeningState()) {
            return;
        }
        refreshVoiceChromeState(VoiceChromeState.LISTENING);
    }

    public void startOpening() {
        if (isOpeningState()) {
            return;
        }
        refreshVoiceChromeState(VoiceChromeState.OPENING);
        startOpeningAnimation();
    }

    public void startResponding() {
        if (isRespondingState()) {
            return;
        }
        refreshVoiceChromeState(VoiceChromeState.RESPONDING);
        startRespondingAnimation();
    }

    public void startThinking() {
        if (isThinkingState()) {
            return;
        }
        refreshVoiceChromeState(VoiceChromeState.THINKING);
        startThinkingAnimation();
    }

    public AlexaChromeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.voiceChromeState = VoiceChromeState.IDLE;
        initialize(context, attributeSet);
    }

    public AlexaChromeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.voiceChromeState = VoiceChromeState.IDLE;
        initialize(context, attributeSet);
    }
}
