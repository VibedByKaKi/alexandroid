package com.amazon.alexa.smarthomecameras.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.smarthomecameras.R;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewLoadingIndicator extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 30;
    private static final int DEFAULT_CIRCLE_COLOR = Color.argb(255, 2, 203, TelnetCommand.WONT);
    private static final int DEFAULT_DOT_PADDING = 30;
    private static final int DEFAULT_END_RADIUS = 24;
    private static final int DEFAULT_START_RADIUS = 12;
    private static final int DELTA_ALPHA = 18;
    private static final int DELTA_RADIUS = 2;
    private static final int END_ALPHA = 255;
    private static final int HALFWAY_POINT = 28;
    private static final int MAX_STEPS = 48;
    private static final int START_ALPHA = 0;
    private final int animationDuration;
    private Runnable animationRunnable;
    private int currentAlpha1;
    private int currentAlpha2;
    private int currentAlpha3;
    private int currentRadius1;
    private int currentRadius2;
    private int currentRadius3;
    private int currentStep;
    private int cx1;
    private int cx2;
    private int cx3;
    private int cy;
    private final int dotPadding;
    private final int endRadius;
    private final int fillColor;
    private Handler handler;
    private boolean isAnimating;
    private Paint paint;
    private final int startRadius;

    public LiveViewLoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animationRunnable = new Runnable() { // from class: com.amazon.alexa.smarthomecameras.view.LiveViewLoadingIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                int visibility = LiveViewLoadingIndicator.this.getVisibility();
                LiveViewLoadingIndicator liveViewLoadingIndicator = LiveViewLoadingIndicator.this;
                if (visibility != 0) {
                    liveViewLoadingIndicator.isAnimating = false;
                    return;
                }
                int i = liveViewLoadingIndicator.currentStep;
                liveViewLoadingIndicator.currentStep = i + 1;
                if (i == 48) {
                    LiveViewLoadingIndicator.this.resetSteps();
                }
                LiveViewLoadingIndicator.this.invalidate();
                LiveViewLoadingIndicator.this.handler.postDelayed(this, LiveViewLoadingIndicator.this.animationDuration);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LiveViewLoadingIndicator);
        this.fillColor = obtainStyledAttributes.getColor(R.styleable.LiveViewLoadingIndicator_fillColor, DEFAULT_CIRCLE_COLOR);
        this.startRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveViewLoadingIndicator_minRadius, 12);
        this.endRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveViewLoadingIndicator_maxRadius, 24);
        this.animationDuration = obtainStyledAttributes.getInt(R.styleable.LiveViewLoadingIndicator_animDuration, 30);
        this.dotPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LiveViewLoadingIndicator_dotPadding, 30);
        init();
        obtainStyledAttributes.recycle();
    }

    private int decrementAlpha(int i) {
        int i2 = i - 18;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    private int decrementRadius(int i) {
        int i2 = i - 2;
        int i3 = this.startRadius;
        return i2 < i3 ? i3 : i2;
    }

    private int incrementAlpha(int i) {
        int i2 = i + 18;
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    private int incrementRadius(int i) {
        int i2 = i + 2;
        int i3 = this.endRadius;
        return i2 > i3 ? i3 : i2;
    }

    private void init() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.fillColor);
        this.handler = new Handler(Looper.getMainLooper());
        resetSteps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSteps() {
        this.currentStep = 0;
        int i = this.startRadius;
        this.currentRadius1 = i;
        this.currentRadius2 = i;
        this.currentRadius3 = i;
        this.currentAlpha1 = 0;
        this.currentAlpha2 = 0;
        this.currentAlpha3 = 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.currentStep;
        if (i <= 48) {
            if (i < 28) {
                int incrementAlpha = incrementAlpha(this.currentAlpha1);
                this.currentAlpha1 = incrementAlpha;
                this.paint.setAlpha(incrementAlpha);
                canvas.drawCircle(this.cx1, this.cy, this.currentRadius1, this.paint);
                this.currentRadius1 = incrementRadius(this.currentRadius1);
                if (this.currentStep > 6) {
                    int incrementAlpha2 = incrementAlpha(this.currentAlpha2);
                    this.currentAlpha2 = incrementAlpha2;
                    this.paint.setAlpha(incrementAlpha2);
                    canvas.drawCircle(this.cx2, this.cy, this.currentRadius2, this.paint);
                    this.currentRadius2 = incrementRadius(this.currentRadius2);
                    if (this.currentStep > 12) {
                        int incrementAlpha3 = incrementAlpha(this.currentAlpha3);
                        this.currentAlpha3 = incrementAlpha3;
                        this.paint.setAlpha(incrementAlpha3);
                        canvas.drawCircle(this.cx3, this.cy, this.currentRadius3, this.paint);
                        this.currentRadius3 = incrementRadius(this.currentRadius3);
                    }
                }
            } else {
                this.currentRadius1 = decrementRadius(this.currentRadius1);
                int decrementAlpha = decrementAlpha(this.currentAlpha1);
                this.currentAlpha1 = decrementAlpha;
                this.paint.setAlpha(decrementAlpha);
                canvas.drawCircle(this.cx1, this.cy, this.currentRadius1, this.paint);
                if (this.currentStep < 33) {
                    this.paint.setAlpha(this.currentAlpha2);
                    canvas.drawCircle(this.cx2, this.cy, this.currentRadius2, this.paint);
                    this.paint.setAlpha(this.currentAlpha3);
                    canvas.drawCircle(this.cx3, this.cy, this.currentRadius3, this.paint);
                } else {
                    this.currentRadius2 = decrementRadius(this.currentRadius2);
                    int decrementAlpha2 = decrementAlpha(this.currentAlpha2);
                    this.currentAlpha2 = decrementAlpha2;
                    this.paint.setAlpha(decrementAlpha2);
                    canvas.drawCircle(this.cx2, this.cy, this.currentRadius2, this.paint);
                    if (this.currentStep < 43) {
                        this.paint.setAlpha(this.currentAlpha3);
                        canvas.drawCircle(this.cx3, this.cy, this.currentRadius3, this.paint);
                    } else {
                        int decrementAlpha3 = decrementAlpha(this.currentAlpha3);
                        this.currentAlpha3 = decrementAlpha3;
                        this.paint.setAlpha(decrementAlpha3);
                        canvas.drawCircle(this.cx3, this.cy, this.currentRadius3, this.paint);
                    }
                }
            }
        }
        if (this.isAnimating) {
            return;
        }
        this.isAnimating = true;
        this.handler.postDelayed(this.animationRunnable, this.animationDuration);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = size / 2;
        this.cx2 = i3;
        int i4 = this.endRadius;
        int i5 = this.dotPadding;
        this.cx1 = i3 - ((i4 * 2) + i5);
        this.cx3 = BitVector$$ExternalSyntheticOutline0.m(i4, 2, i3, i5);
        this.cy = size2 / 2;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            this.isAnimating = false;
            this.handler.removeCallbacks(this.animationRunnable);
        }
    }

    public LiveViewLoadingIndicator(Context context) {
        super(context);
        this.animationRunnable = new Runnable() { // from class: com.amazon.alexa.smarthomecameras.view.LiveViewLoadingIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                int visibility = LiveViewLoadingIndicator.this.getVisibility();
                LiveViewLoadingIndicator liveViewLoadingIndicator = LiveViewLoadingIndicator.this;
                if (visibility != 0) {
                    liveViewLoadingIndicator.isAnimating = false;
                    return;
                }
                int i = liveViewLoadingIndicator.currentStep;
                liveViewLoadingIndicator.currentStep = i + 1;
                if (i == 48) {
                    LiveViewLoadingIndicator.this.resetSteps();
                }
                LiveViewLoadingIndicator.this.invalidate();
                LiveViewLoadingIndicator.this.handler.postDelayed(this, LiveViewLoadingIndicator.this.animationDuration);
            }
        };
        this.fillColor = DEFAULT_CIRCLE_COLOR;
        this.startRadius = 12;
        this.endRadius = 24;
        this.animationDuration = 30;
        this.dotPadding = 30;
        init();
    }
}
