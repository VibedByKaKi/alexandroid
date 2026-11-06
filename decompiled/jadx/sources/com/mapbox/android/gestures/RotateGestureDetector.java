package com.mapbox.android.gestures;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public class RotateGestureDetector extends ProgressiveGesture<OnRotateGestureListener> {
    private static final Set<Integer> handledTypes;
    private float angleThreshold;
    float deltaSinceLast;
    float deltaSinceStart;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnRotateGestureListener {
        boolean onRotate(@NonNull RotateGestureDetector rotateGestureDetector, float f, float f2);

        boolean onRotateBegin(@NonNull RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(@NonNull RotateGestureDetector rotateGestureDetector, float f, float f2, float f3);
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(2);
    }

    public RotateGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        super.analyzeMovement();
        float rotationDegreesSinceLast = getRotationDegreesSinceLast();
        this.deltaSinceLast = rotationDegreesSinceLast;
        this.deltaSinceStart += rotationDegreesSinceLast;
        if (isInProgress()) {
            float f = this.deltaSinceLast;
            if (f != 0.0f) {
                return ((OnRotateGestureListener) this.listener).onRotate(this, f, this.deltaSinceStart);
            }
        }
        if (!canExecute(2) || !((OnRotateGestureListener) this.listener).onRotateBegin(this)) {
            return false;
        }
        gestureStarted();
        return true;
    }

    public float calculateAngularVelocityVector(float f, float f2) {
        float abs = Math.abs((float) (((getFocalPoint().y * f) + (getFocalPoint().x * f2)) / (Math.pow(getFocalPoint().y, 2.0d) + Math.pow(getFocalPoint().x, 2.0d))));
        return this.deltaSinceLast < 0.0f ? -abs : abs;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i) {
        return Math.abs(this.deltaSinceStart) >= this.angleThreshold && super.canExecute(i);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        if (this.deltaSinceLast == 0.0f) {
            this.velocityX = 0.0f;
            this.velocityY = 0.0f;
        }
        ((OnRotateGestureListener) this.listener).onRotateEnd(this, this.velocityX, this.velocityY, calculateAngularVelocityVector(this.velocityX, this.velocityY));
    }

    public float getAngleThreshold() {
        return this.angleThreshold;
    }

    public float getDeltaSinceLast() {
        return this.deltaSinceLast;
    }

    public float getDeltaSinceStart() {
        return this.deltaSinceStart;
    }

    public float getRotationDegreesSinceLast() {
        MultiFingerDistancesObject multiFingerDistancesObject = this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(0), this.pointerIdList.get(1)));
        return (float) Math.toDegrees(Math.atan2(multiFingerDistancesObject.getPrevFingersDiffY(), multiFingerDistancesObject.getPrevFingersDiffX()) - Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX()));
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    @NonNull
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.deltaSinceStart = 0.0f;
    }

    public void setAngleThreshold(float f) {
        this.angleThreshold = f;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleOnRotateGestureListener implements OnRotateGestureListener {
        @Override // com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public boolean onRotate(@NonNull RotateGestureDetector rotateGestureDetector, float f, float f2) {
            return true;
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public boolean onRotateBegin(@NonNull RotateGestureDetector rotateGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener
        public void onRotateEnd(@NonNull RotateGestureDetector rotateGestureDetector, float f, float f2, float f3) {
        }
    }
}
