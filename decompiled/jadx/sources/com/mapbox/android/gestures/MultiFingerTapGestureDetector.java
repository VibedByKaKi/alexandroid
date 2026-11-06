package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public class MultiFingerTapGestureDetector extends MultiFingerGesture<OnMultiFingerTapGestureListener> {
    private boolean invalidMovement;
    private int lastPointersDownCount;
    private float multiFingerTapMovementThreshold;
    private long multiFingerTapTimeThreshold;
    private boolean pointerLifted;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnMultiFingerTapGestureListener {
        boolean onMultiFingerTap(@NonNull MultiFingerTapGestureDetector multiFingerTapGestureDetector, int i);
    }

    public MultiFingerTapGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(@NonNull MotionEvent motionEvent) {
        super.analyzeEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            boolean onMultiFingerTap = canExecute(4) ? ((OnMultiFingerTapGestureListener) this.listener).onMultiFingerTap(this, this.lastPointersDownCount) : false;
            reset();
            return onMultiFingerTap;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (this.pointerLifted) {
                    this.invalidMovement = true;
                }
                this.lastPointersDownCount = this.pointerIdList.size();
            } else if (actionMasked == 6) {
                this.pointerLifted = true;
            }
        } else if (!this.invalidMovement) {
            this.invalidMovement = exceededMovementThreshold(this.pointersDistanceMap);
        }
        return false;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture, com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i) {
        return this.lastPointersDownCount > 1 && !this.invalidMovement && getGestureDuration() < this.multiFingerTapTimeThreshold && super.canExecute(i);
    }

    public boolean exceededMovementThreshold(HashMap<PointerDistancePair, MultiFingerDistancesObject> hashMap) {
        boolean z;
        Iterator<MultiFingerDistancesObject> it2 = hashMap.values().iterator();
        do {
            if (!it2.hasNext()) {
                return false;
            }
            MultiFingerDistancesObject next = it2.next();
            float abs = Math.abs(next.getCurrFingersDiffX() - next.getPrevFingersDiffX());
            float abs2 = Math.abs(next.getCurrFingersDiffY() - next.getPrevFingersDiffY());
            float f = this.multiFingerTapMovementThreshold;
            z = abs > f || abs2 > f;
            this.invalidMovement = z;
        } while (!z);
        return true;
    }

    public float getMultiFingerTapMovementThreshold() {
        return this.multiFingerTapMovementThreshold;
    }

    public long getMultiFingerTapTimeThreshold() {
        return this.multiFingerTapTimeThreshold;
    }

    @Override // com.mapbox.android.gestures.MultiFingerGesture
    public void reset() {
        super.reset();
        this.lastPointersDownCount = 0;
        this.invalidMovement = false;
        this.pointerLifted = false;
    }

    public void setMultiFingerTapMovementThreshold(float f) {
        this.multiFingerTapMovementThreshold = f;
    }

    public void setMultiFingerTapMovementThresholdResource(@DimenRes int i) {
        setMultiFingerTapMovementThreshold(this.context.getResources().getDimension(i));
    }

    public void setMultiFingerTapTimeThreshold(long j) {
        this.multiFingerTapTimeThreshold = j;
    }
}
