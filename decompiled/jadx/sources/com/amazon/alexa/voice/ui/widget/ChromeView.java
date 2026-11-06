package com.amazon.alexa.voice.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.chrome.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ChromeView extends View {
    private static final int CYAN_FADE_DURATION = 70;
    private static final int ENTER_ANIMATION_DELAY = 0;
    private static final int ENTER_ANIMATION_DURATION = 250;
    private static final float LEVEL_DIFFERENCE_THRESHOLD = 0.1f;
    private static final float LEVEL_MAX = 1.0f;
    private static final float LEVEL_MIN = 0.35f;
    private static final int MAXIMUM_OPACITY = 255;
    static final Property<ChromeView, Float> RENDER_LEVEL = new Property<ChromeView, Float>(Float.class, "renderLevel") { // from class: com.amazon.alexa.voice.ui.widget.ChromeView.1
        @Override // android.util.Property
        public Float get(ChromeView chromeView) {
            return Float.valueOf(chromeView.getRenderLevel());
        }

        @Override // android.util.Property
        public void set(ChromeView chromeView, Float f) {
            chromeView.setRenderLevel(f.floatValue());
        }
    };
    private static final int WAIT_TIME_BEFORE_FADING_A_CYAN = 150;
    private int animatedDistance;
    private long animatedDuration;
    private float animatedFraction;
    private int backgroundColor;
    private Drawable chromeDrawable;
    private boolean completedInitialChromeAnimation;
    private Drawable leftChromeDrawable;
    private float level;
    private ObjectAnimator levelAnimator;
    private Interpolator levelInterpolator;
    private boolean locked;
    private Paint paint;
    private float renderLevel;
    private Drawable rightChromeDrawable;
    private Drawable shadowDrawable;
    private int shadowHeight;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AnimationRunnable implements Runnable {
        private final Interpolator interpolator;
        private final WeakReference<ChromeView> weakView;

        public AnimationRunnable(ChromeView chromeView, Interpolator interpolator) {
            this.weakView = new WeakReference<>(chromeView);
            this.interpolator = interpolator;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.weakView.get() == null) {
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) (((r0.getWidth() * 1.0f) + r0.getWidth()) / 2.0f));
            ofInt.setInterpolator(this.interpolator);
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.alexa.voice.ui.widget.ChromeView.AnimationRunnable.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChromeView chromeView = (ChromeView) AnimationRunnable.this.weakView.get();
                    if (AnimationRunnable.this.weakView.get() == null) {
                        valueAnimator.cancel();
                        return;
                    }
                    chromeView.setAnimatedDistance(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    chromeView.setAnimatedFraction(valueAnimator.getAnimatedFraction());
                    chromeView.setAnimatedDuration(valueAnimator.getCurrentPlayTime());
                    chromeView.postInvalidateOnAnimation();
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.amazon.alexa.voice.ui.widget.ChromeView.AnimationRunnable.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    ChromeView chromeView = (ChromeView) AnimationRunnable.this.weakView.get();
                    if (AnimationRunnable.this.weakView.get() != null) {
                        chromeView.setChromeAnimationStatus(true);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ChromeView chromeView = (ChromeView) AnimationRunnable.this.weakView.get();
                    if (AnimationRunnable.this.weakView.get() != null) {
                        chromeView.setChromeAnimationStatus(true);
                    }
                }
            });
            ofInt.start();
        }
    }

    public ChromeView(Context context) {
        super(context);
        this.completedInitialChromeAnimation = false;
        initialize(context, null);
    }

    private void drawInitialAnimationFrame(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        this.paint.setColor(this.backgroundColor);
        this.paint.setAlpha((int) (this.animatedFraction * 255.0f));
        float f = width;
        canvas.drawRect(0.0f, this.shadowHeight, f, height, this.paint);
        this.shadowDrawable.setBounds(0, 0, width, this.shadowHeight);
        this.shadowDrawable.draw(canvas);
        int i = (int) (f * 1.0f);
        int max = Math.max(this.animatedDistance - i, 0);
        int min = Math.min(this.animatedDistance, i) + max;
        int min2 = Math.min(width, width - this.animatedDistance);
        int min3 = Math.min(this.animatedDistance, i) + min2;
        this.leftChromeDrawable.setBounds(max, 0, min, height);
        this.rightChromeDrawable.setBounds(min2, 0, min3, height);
        long j = this.animatedDuration;
        if (j >= 150) {
            this.leftChromeDrawable.setAlpha((int) (255 - ((Math.min(j - 150, 70L) * 255) / 150)));
        } else {
            this.leftChromeDrawable.setAlpha(255);
        }
        this.leftChromeDrawable.draw(canvas);
        this.rightChromeDrawable.draw(canvas);
    }

    private void enterAnimation() {
        postDelayed(new AnimationRunnable(this, this.levelInterpolator), 0L);
    }

    private static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ChromeView, 0, 0);
        try {
            this.shadowHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ChromeView_voiceShadowHeight, (int) Math.ceil(displayMetrics.density * 8.0f));
            this.shadowDrawable = obtainStyledAttributes.getDrawable(R.styleable.ChromeView_voiceShadow);
            this.chromeDrawable = obtainStyledAttributes.getDrawable(R.styleable.ChromeView_voiceChrome);
            this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.ChromeView_voiceColor, -14855178);
            obtainStyledAttributes.recycle();
            if (this.shadowDrawable == null) {
                this.shadowDrawable = getDrawable(context, R.drawable.voice_ui_chrome_shadow);
            }
            if (this.chromeDrawable == null) {
                this.chromeDrawable = getDrawable(context, R.drawable.voice_ui_chrome_glow);
            }
            if (this.leftChromeDrawable == null) {
                this.leftChromeDrawable = getDrawable(context, R.drawable.voice_ui_chrome_glow_left);
            }
            if (this.rightChromeDrawable == null) {
                this.rightChromeDrawable = getDrawable(context, R.drawable.voice_ui_chrome_glow_right);
            }
            this.paint = new Paint();
            this.levelInterpolator = new DecelerateInterpolator(1.72f);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void prepareLevelAnimator(boolean z) {
        ObjectAnimator objectAnimator = this.levelAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        boolean z2 = this.levelAnimator == null;
        if (z2) {
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            this.levelAnimator = objectAnimator2;
            objectAnimator2.setTarget(this);
            this.levelAnimator.setProperty(RENDER_LEVEL);
        }
        if (z2 || z) {
            this.levelAnimator.setRepeatCount(0);
            this.levelAnimator.setInterpolator(this.levelInterpolator);
            this.levelAnimator.setDuration(300L);
        }
    }

    public float getLevel() {
        return this.level;
    }

    public float getRenderLevel() {
        return this.renderLevel;
    }

    public void hideCyanOverlay() {
        setLevel(-0.53846157f);
    }

    public boolean isLocked() {
        return this.locked;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        enterAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.completedInitialChromeAnimation) {
            drawInitialAnimationFrame(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.paint.setColor(this.backgroundColor);
        float f = width;
        canvas.drawRect(0.0f, this.shadowHeight, f, height, this.paint);
        this.shadowDrawable.setBounds(0, 0, width, this.shadowHeight);
        this.shadowDrawable.draw(canvas);
        int m = (int) DoubleList$$ExternalSyntheticOutline0.m(this.renderLevel, 0.65f, 0.35f, f);
        int i = (width - m) / 2;
        this.chromeDrawable.setBounds(i, 0, m + i, height);
        if (!this.locked) {
            this.chromeDrawable.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(0, this.shadowHeight, width, height);
        this.chromeDrawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void setAnimatedDistance(int i) {
        this.animatedDistance = i;
    }

    public void setAnimatedDuration(long j) {
        this.animatedDuration = j;
    }

    public void setAnimatedFraction(float f) {
        this.animatedFraction = f;
    }

    public void setChromeAnimationStatus(boolean z) {
        this.completedInitialChromeAnimation = z;
    }

    public void setLevel(float f) {
        if (this.level == f) {
            return;
        }
        this.level = f;
        if (this.locked) {
            return;
        }
        ObjectAnimator objectAnimator = this.levelAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.renderLevel = f;
        postInvalidateOnAnimation();
    }

    public void setLevelAnimated(float f) {
        if (Math.abs(this.level - f) < 0.1f) {
            return;
        }
        this.level = f;
        if (this.locked) {
            return;
        }
        prepareLevelAnimator(false);
        this.levelAnimator.setFloatValues(f);
        this.levelAnimator.start();
    }

    public void setLocked(boolean z) {
        if (this.locked != z) {
            this.locked = z;
            postInvalidateOnAnimation();
        }
    }

    public void setLockedAnimated(boolean z) {
        if (this.locked == z) {
            return;
        }
        this.locked = z;
        prepareLevelAnimator(!z);
        ObjectAnimator objectAnimator = this.levelAnimator;
        if (z) {
            objectAnimator.setFloatValues(0.35f, 1.0f);
            this.levelAnimator.setRepeatCount(-1);
            this.levelAnimator.setRepeatMode(1);
            this.levelAnimator.setDuration(600L);
            this.levelAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            objectAnimator.setFloatValues(this.level);
        }
        this.levelAnimator.start();
    }

    public void setRenderLevel(float f) {
        if (this.renderLevel != f) {
            this.renderLevel = f;
            postInvalidateOnAnimation();
        }
    }

    public ChromeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.completedInitialChromeAnimation = false;
        initialize(context, attributeSet);
    }

    public ChromeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.completedInitialChromeAnimation = false;
        initialize(context, attributeSet);
    }
}
