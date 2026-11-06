package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public class StandardScaleGestureDetector extends ProgressiveGesture<StandardOnScaleGestureListener> {
    private static final float QUICK_SCALE_MULTIPLIER = 0.5f;
    private static final Set<Integer> handledTypes;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private final GestureDetector innerGestureDetector;
    private boolean isScalingOut;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private boolean quickScale;
    private PointF quickScaleFocalPoint;
    private float scaleFactor;
    private float spanDeltaSinceStart;
    private float spanSinceStartThreshold;
    private float startSpan;
    private float startSpanX;
    private float startSpanY;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StandardOnScaleGestureListener {
        boolean onScale(@NonNull StandardScaleGestureDetector standardScaleGestureDetector);

        boolean onScaleBegin(@NonNull StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleEnd(@NonNull StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2);
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public StandardScaleGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.innerGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.mapbox.android.gestures.StandardScaleGestureDetector.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    StandardScaleGestureDetector.this.quickScale = true;
                    StandardScaleGestureDetector.this.quickScaleFocalPoint = new PointF(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }
        });
    }

    private float calculateScaleFactor() {
        if (!this.quickScale) {
            float f = this.previousSpan;
            if (f > 0.0f) {
                return this.currentSpan / f;
            }
            return 1.0f;
        }
        boolean z = (getCurrentEvent().getY() < this.quickScaleFocalPoint.y && this.currentSpan < this.previousSpan) || (getCurrentEvent().getY() > this.quickScaleFocalPoint.y && this.currentSpan > this.previousSpan);
        float abs = Math.abs(1.0f - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= 0.0f) {
            return 1.0f;
        }
        return z ? abs + 1.0f : 1.0f - abs;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture, com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.quickScale) {
            if (actionMasked == 5 || actionMasked == 3) {
                if (isInProgress()) {
                    interrupt();
                } else {
                    this.quickScale = false;
                }
            } else if (!isInProgress() && actionMasked == 1) {
                this.quickScale = false;
            }
        }
        return this.innerGestureDetector.onTouchEvent(motionEvent) | super.analyzeEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        float f;
        super.analyzeMovement();
        boolean z = false;
        if (isInProgress() && this.quickScale && getPointersCount() > 1) {
            gestureStopped();
            return false;
        }
        PointF focalPoint = this.quickScale ? this.quickScaleFocalPoint : getFocalPoint();
        this.currentSpanX = 0.0f;
        this.currentSpanY = 0.0f;
        int i = 0;
        while (true) {
            int pointersCount = getPointersCount();
            f = this.currentSpanX;
            if (i >= pointersCount) {
                break;
            }
            this.currentSpanX = Math.abs(getCurrentEvent().getX(i) - focalPoint.x) + f;
            this.currentSpanY = Math.abs(getCurrentEvent().getY(i) - focalPoint.y) + this.currentSpanY;
            i++;
        }
        float f2 = f * 2.0f;
        this.currentSpanX = f2;
        float f3 = this.currentSpanY * 2.0f;
        this.currentSpanY = f3;
        if (this.quickScale) {
            this.currentSpan = f3;
        } else {
            this.currentSpan = (float) Math.hypot(f2, f3);
        }
        if (this.startSpan == 0.0f) {
            this.startSpan = this.currentSpan;
            this.startSpanX = this.currentSpanX;
            this.startSpanY = this.currentSpanY;
        }
        this.spanDeltaSinceStart = Math.abs(this.startSpan - this.currentSpan);
        float calculateScaleFactor = calculateScaleFactor();
        this.scaleFactor = calculateScaleFactor;
        this.isScalingOut = calculateScaleFactor < 1.0f;
        if (!isInProgress() || this.currentSpan <= 0.0f) {
            if (canExecute(this.quickScale ? 15 : 1) && this.spanDeltaSinceStart >= this.spanSinceStartThreshold && (z = ((StandardOnScaleGestureListener) this.listener).onScaleBegin(this))) {
                gestureStarted();
            }
        } else {
            z = ((StandardOnScaleGestureListener) this.listener).onScale(this);
        }
        this.previousSpan = this.currentSpan;
        this.previousSpanX = this.currentSpanX;
        this.previousSpanY = this.currentSpanY;
        return z;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((StandardOnScaleGestureListener) this.listener).onScaleEnd(this, this.velocityX, this.velocityY);
        this.quickScale = false;
    }

    public float getCurrentSpan() {
        return this.currentSpan;
    }

    public float getCurrentSpanX() {
        return this.currentSpanX;
    }

    public float getCurrentSpanY() {
        return this.currentSpanY;
    }

    public float getPreviousSpan() {
        return this.previousSpan;
    }

    public float getPreviousSpanX() {
        return this.previousSpanX;
    }

    public float getPreviousSpanY() {
        return this.previousSpanY;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public int getRequiredPointersCount() {
        return (!isInProgress() || this.quickScale) ? 1 : 2;
    }

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    public float getSpanSinceStartThreshold() {
        return this.spanSinceStartThreshold;
    }

    public float getStartSpan() {
        return this.startSpan;
    }

    public float getStartSpanX() {
        return this.startSpanX;
    }

    public float getStartSpanY() {
        return this.startSpanY;
    }

    public boolean isScalingOut() {
        return this.isScalingOut;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean isSloppyGesture() {
        if (super.isSloppyGesture()) {
            return true;
        }
        return !this.quickScale && getPointersCount() < 2;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    @NonNull
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.startSpan = 0.0f;
        this.spanDeltaSinceStart = 0.0f;
        this.currentSpan = 0.0f;
        this.previousSpan = 0.0f;
        this.scaleFactor = 1.0f;
    }

    public void setSpanSinceStartThreshold(float f) {
        this.spanSinceStartThreshold = f;
    }

    public void setSpanSinceStartThresholdResource(@DimenRes int i) {
        setSpanSinceStartThreshold(this.context.getResources().getDimension(i));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleStandardOnScaleGestureListener implements StandardOnScaleGestureListener {
        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public boolean onScale(@NonNull StandardScaleGestureDetector standardScaleGestureDetector) {
            return false;
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public boolean onScaleBegin(@NonNull StandardScaleGestureDetector standardScaleGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener
        public void onScaleEnd(@NonNull StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2) {
        }
    }
}
