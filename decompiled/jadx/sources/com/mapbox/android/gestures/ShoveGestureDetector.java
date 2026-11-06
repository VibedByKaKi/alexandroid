package com.mapbox.android.gestures;

import android.content.Context;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public class ShoveGestureDetector extends ProgressiveGesture<OnShoveGestureListener> {
    private static final Set<Integer> handledTypes;
    float deltaPixelSinceLast;
    float deltaPixelsSinceStart;
    private float maxShoveAngle;
    private float pixelDeltaThreshold;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnShoveGestureListener {
        boolean onShove(@NonNull ShoveGestureDetector shoveGestureDetector, float f, float f2);

        boolean onShoveBegin(@NonNull ShoveGestureDetector shoveGestureDetector);

        void onShoveEnd(@NonNull ShoveGestureDetector shoveGestureDetector, float f, float f2);
    }

    static {
        HashSet hashSet = new HashSet();
        handledTypes = hashSet;
        hashSet.add(3);
    }

    public ShoveGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean analyzeMovement() {
        super.analyzeMovement();
        float calculateDeltaPixelsSinceLast = calculateDeltaPixelsSinceLast();
        this.deltaPixelSinceLast = calculateDeltaPixelsSinceLast;
        this.deltaPixelsSinceStart += calculateDeltaPixelsSinceLast;
        if (isInProgress()) {
            float f = this.deltaPixelSinceLast;
            if (f != 0.0f) {
                return ((OnShoveGestureListener) this.listener).onShove(this, f, this.deltaPixelsSinceStart);
            }
        }
        if (!canExecute(3) || !((OnShoveGestureListener) this.listener).onShoveBegin(this)) {
            return false;
        }
        gestureStarted();
        return true;
    }

    public float calculateDeltaPixelsSinceLast() {
        return ((getCurrentEvent().getY(getCurrentEvent().findPointerIndex(this.pointerIdList.get(1).intValue())) + getCurrentEvent().getY(getCurrentEvent().findPointerIndex(this.pointerIdList.get(0).intValue()))) / 2.0f) - ((getPreviousEvent().getY(getPreviousEvent().findPointerIndex(this.pointerIdList.get(1).intValue())) + getPreviousEvent().getY(getPreviousEvent().findPointerIndex(this.pointerIdList.get(0).intValue()))) / 2.0f);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i) {
        return Math.abs(this.deltaPixelsSinceStart) >= this.pixelDeltaThreshold && super.canExecute(i);
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    public void gestureStopped() {
        super.gestureStopped();
        ((OnShoveGestureListener) this.listener).onShoveEnd(this, this.velocityX, this.velocityY);
    }

    public float getDeltaPixelSinceLast() {
        return this.deltaPixelSinceLast;
    }

    public float getDeltaPixelsSinceStart() {
        return this.deltaPixelsSinceStart;
    }

    public float getMaxShoveAngle() {
        return this.maxShoveAngle;
    }

    public float getPixelDeltaThreshold() {
        return this.pixelDeltaThreshold;
    }

    public boolean isAngleAcceptable() {
        MultiFingerDistancesObject multiFingerDistancesObject = this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(0), this.pointerIdList.get(1)));
        double degrees = Math.toDegrees(Math.abs(Math.atan2(multiFingerDistancesObject.getCurrFingersDiffY(), multiFingerDistancesObject.getCurrFingersDiffX())));
        float f = this.maxShoveAngle;
        return degrees <= ((double) f) || 180.0d - degrees <= ((double) f);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public boolean isSloppyGesture() {
        return super.isSloppyGesture() || !isAngleAcceptable();
    }

    @Override // com.mapbox.android.gestures.ProgressiveGesture
    @NonNull
    public Set<Integer> provideHandledTypes() {
        return handledTypes;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.deltaPixelsSinceStart = 0.0f;
    }

    public void setMaxShoveAngle(float f) {
        this.maxShoveAngle = f;
    }

    public void setPixelDeltaThreshold(float f) {
        this.pixelDeltaThreshold = f;
    }

    public void setPixelDeltaThresholdResource(@DimenRes int i) {
        setPixelDeltaThreshold(this.context.getResources().getDimension(i));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleOnShoveGestureListener implements OnShoveGestureListener {
        @Override // com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public boolean onShove(@NonNull ShoveGestureDetector shoveGestureDetector, float f, float f2) {
            return false;
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public boolean onShoveBegin(@NonNull ShoveGestureDetector shoveGestureDetector) {
            return true;
        }

        @Override // com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener
        public void onShoveEnd(@NonNull ShoveGestureDetector shoveGestureDetector, float f, float f2) {
        }
    }
}
