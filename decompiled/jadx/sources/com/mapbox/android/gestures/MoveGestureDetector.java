package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public class MoveGestureDetector extends ProgressiveGesture<OnMoveGestureListener> {
    private static final int MOVE_REQUIRED_POINTERS_COUNT = 1;
    private static final Set<Integer> handledTypes;
    float lastDistanceX;
    float lastDistanceY;
    private final Map<Integer, MoveDistancesObject> moveDistancesObjectMap;
    private float moveThreshold;

    @Nullable
    private RectF moveThresholdRect;

    @Nullable
    private Float multiFingerMoveThreshold;
    private PointF previousFocalPoint;
    private boolean resetFocal;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnMoveGestureListener {
        boolean onMove(@NonNull MoveGestureDetector moveGestureDetector, float f, float f2);

        boolean onMoveBegin(@NonNull MoveGestureDetector moveGestureDetector);

        void onMoveEnd(@NonNull MoveGestureDetector moveGestureDetector, float f, float f2);
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(13);
    }

    public MoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.moveDistancesObjectMap = new HashMap();
    }

    private float getCurrentMoveThreshold() {
        Float f;
        return (getPointersCount() <= 1 || (f = this.multiFingerMoveThreshold) == null) ? this.moveThreshold : f.floatValue();
    }

    private void resetMoveDistancesExcept(int i, MotionEvent motionEvent) {
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (pointerId != i && this.moveDistancesObjectMap.containsKey(Integer.valueOf(pointerId))) {
                this.moveDistancesObjectMap.put(Integer.valueOf(pointerId), new MoveDistancesObject(motionEvent.getX(i2), motionEvent.getY(i2)));
            }
        }
    }

    private void updateMoveDistancesObjects() {
        for (Integer num : this.pointerIdList) {
            int intValue = num.intValue();
            this.moveDistancesObjectMap.get(num).addNewPosition(getCurrentEvent().getX(getCurrentEvent().findPointerIndex(intValue)), getCurrentEvent().getY(getCurrentEvent().findPointerIndex(intValue)));
        }
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture, com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.moveDistancesObjectMap.clear();
            } else if (actionMasked == 3) {
                this.moveDistancesObjectMap.clear();
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    this.resetFocal = true;
                    this.moveDistancesObjectMap.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                    resetMoveDistancesExcept(-1, motionEvent);
                }
            }
            return super.analyzeEvent(motionEvent);
        }
        this.resetFocal = true;
        this.moveDistancesObjectMap.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new MoveDistancesObject(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        resetMoveDistancesExcept(motionEvent.getPointerId(motionEvent.getActionIndex()), motionEvent);
        return super.analyzeEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        super.analyzeMovement();
        updateMoveDistancesObjects();
        if (!isInProgress()) {
            if (!canExecute(13) || !((OnMoveGestureListener) this.listener).onMoveBegin(this)) {
                return false;
            }
            gestureStarted();
            this.previousFocalPoint = getFocalPoint();
            this.resetFocal = false;
            return true;
        }
        PointF focalPoint = getFocalPoint();
        PointF pointF = this.previousFocalPoint;
        float f = pointF.x - focalPoint.x;
        this.lastDistanceX = f;
        float f2 = pointF.y - focalPoint.y;
        this.lastDistanceY = f2;
        this.previousFocalPoint = focalPoint;
        if (!this.resetFocal) {
            return ((OnMoveGestureListener) this.listener).onMove(this, f, f2);
        }
        this.resetFocal = false;
        return ((OnMoveGestureListener) this.listener).onMove(this, 0.0f, 0.0f);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i) {
        return super.canExecute(i) && checkAnyMoveAboveThreshold();
    }

    public boolean checkAnyMoveAboveThreshold() {
        float currentMoveThreshold = getCurrentMoveThreshold();
        RectF rectF = this.moveThresholdRect;
        boolean z = rectF != null && rectF.contains(getFocalPoint().x, getFocalPoint().y);
        for (MoveDistancesObject moveDistancesObject : this.moveDistancesObjectMap.values()) {
            boolean z2 = Math.abs(moveDistancesObject.getDistanceXSinceStart()) >= currentMoveThreshold || Math.abs(moveDistancesObject.getDistanceYSinceStart()) >= currentMoveThreshold;
            if (!z && z2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((OnMoveGestureListener) this.listener).onMoveEnd(this, this.velocityX, this.velocityY);
    }

    public float getLastDistanceX() {
        return this.lastDistanceX;
    }

    public float getLastDistanceY() {
        return this.lastDistanceY;
    }

    public MoveDistancesObject getMoveObject(int i) {
        if (!isInProgress() || i < 0 || i >= getPointersCount()) {
            return null;
        }
        return this.moveDistancesObjectMap.get(this.pointerIdList.get(i));
    }

    public float getMoveThreshold() {
        return this.moveThreshold;
    }

    @Nullable
    public RectF getMoveThresholdRect() {
        return this.moveThresholdRect;
    }

    public float getMultiFingerMoveThreshold() {
        Float f = this.multiFingerMoveThreshold;
        return f != null ? f.floatValue() : this.moveThreshold;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public int getRequiredPointersCount() {
        return 1;
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    @NonNull
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
    }

    public void setMoveThreshold(float f) {
        this.moveThreshold = f;
    }

    public void setMoveThresholdRect(@Nullable RectF rectF) {
        this.moveThresholdRect = rectF;
    }

    public void setMoveThresholdResource(@DimenRes int i) {
        setMoveThreshold(this.context.getResources().getDimension(i));
    }

    public void setMultiFingerMoveThreshold(float f) {
        this.multiFingerMoveThreshold = Float.valueOf(f);
    }

    public void setMultiFingerMoveThresholdResource(@DimenRes int i) {
        setMultiFingerMoveThreshold(this.context.getResources().getDimension(i));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleOnMoveGestureListener implements OnMoveGestureListener {
        @Override // com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public boolean onMove(@NonNull MoveGestureDetector moveGestureDetector, float f, float f2) {
            return false;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public boolean onMoveBegin(@NonNull MoveGestureDetector moveGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener
        public void onMoveEnd(@NonNull MoveGestureDetector moveGestureDetector, float f, float f2) {
        }
    }
}
