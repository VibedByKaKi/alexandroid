package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public abstract class MultiFingerGesture<L> extends BaseGesture<L> {
    private static final int DEFAULT_REQUIRED_FINGERS_COUNT = 2;
    private static final float PRESSURE_THRESHOLD = 0.67f;
    private DisplayMetrics displayMetrics;
    private final float edgeSlop;
    private PointF focalPoint;
    private final PermittedActionsGuard permittedActionsGuard;
    final List<Integer> pointerIdList;
    final HashMap<PointerDistancePair, MultiFingerDistancesObject> pointersDistanceMap;
    private float spanThreshold;

    public MultiFingerGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.permittedActionsGuard = new PermittedActionsGuard();
        this.pointerIdList = new ArrayList();
        this.pointersDistanceMap = new HashMap<>();
        this.focalPoint = new PointF();
        this.edgeSlop = ViewConfiguration.get(context).getScaledEdgeSlop();
        queryDisplayMetrics();
    }

    private void calculateDistances() {
        this.pointersDistanceMap.clear();
        int i = 0;
        while (i < this.pointerIdList.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.pointerIdList.size(); i3++) {
                Integer num = this.pointerIdList.get(i);
                int intValue = num.intValue();
                Integer num2 = this.pointerIdList.get(i3);
                int intValue2 = num2.intValue();
                float x = getPreviousEvent().getX(getPreviousEvent().findPointerIndex(intValue));
                float y = getPreviousEvent().getY(getPreviousEvent().findPointerIndex(intValue));
                this.pointersDistanceMap.put(new PointerDistancePair(num, num2), new MultiFingerDistancesObject(getPreviousEvent().getX(getPreviousEvent().findPointerIndex(intValue2)) - x, getPreviousEvent().getY(getPreviousEvent().findPointerIndex(intValue2)) - y, getCurrentEvent().getX(getCurrentEvent().findPointerIndex(intValue2)) - getCurrentEvent().getX(getCurrentEvent().findPointerIndex(intValue)), getCurrentEvent().getY(getCurrentEvent().findPointerIndex(intValue2)) - getCurrentEvent().getY(getCurrentEvent().findPointerIndex(intValue))));
            }
            i = i2;
        }
    }

    private boolean checkSpanBelowThreshold() {
        Iterator<MultiFingerDistancesObject> it2 = this.pointersDistanceMap.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().getCurrFingersDiffXY() < this.spanThreshold) {
                return true;
            }
        }
        return false;
    }

    private boolean isMissingPointers(MotionEvent motionEvent) {
        Iterator<Integer> it2 = this.pointerIdList.iterator();
        while (it2.hasNext()) {
            if (motionEvent.findPointerIndex(it2.next().intValue()) == -1) {
                return true;
            }
        }
        return false;
    }

    private void queryDisplayMetrics() {
        if (this.windowManager == null) {
            this.displayMetrics = this.context.getResources().getDisplayMetrics();
        } else {
            this.displayMetrics = new DisplayMetrics();
            this.windowManager.getDefaultDisplay().getRealMetrics(this.displayMetrics);
        }
    }

    private void updatePointerList(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            this.pointerIdList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 6) {
            this.pointerIdList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
    }

    private boolean verifyPointers(int i, int i2) {
        return i != i2 && i >= 0 && i2 >= 0 && i < getPointersCount() && i2 < getPointersCount();
    }

    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            queryDisplayMetrics();
        }
        boolean z = this.permittedActionsGuard.isMissingActions(actionMasked, motionEvent.getPointerCount(), this.pointerIdList.size()) || (actionMasked == 2 && isMissingPointers(motionEvent));
        if (z) {
            if (this instanceof ProgressiveGesture) {
                ProgressiveGesture progressiveGesture = (ProgressiveGesture) this;
                if (progressiveGesture.isInProgress()) {
                    progressiveGesture.gestureStopped();
                }
            }
            this.pointerIdList.clear();
            this.pointersDistanceMap.clear();
        }
        if (!z || actionMasked == 0) {
            updatePointerList(motionEvent);
        }
        this.focalPoint = Utils.determineFocalPoint(motionEvent);
        if (z) {
            Log.w("MultiFingerGesture", "Some MotionEvents were not passed to the library or events from different view trees are merged.");
            return false;
        }
        if (actionMasked == 2 && this.pointerIdList.size() >= getRequiredPointersCount() && checkPressure()) {
            calculateDistances();
            if (!isSloppyGesture()) {
                return analyzeMovement();
            }
        }
        return false;
    }

    public boolean analyzeMovement() {
        return false;
    }

    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i) {
        return super.canExecute(i) && !isSloppyGesture();
    }

    public boolean checkPressure() {
        return getCurrentEvent().getPressure() / getPreviousEvent().getPressure() > PRESSURE_THRESHOLD;
    }

    public float getCurrentSpan(int i, int i2) {
        if (verifyPointers(i, i2)) {
            return this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i), this.pointerIdList.get(i2))).getCurrFingersDiffXY();
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getCurrentSpanX(int i, int i2) {
        if (verifyPointers(i, i2)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i), this.pointerIdList.get(i2))).getCurrFingersDiffX());
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getCurrentSpanY(int i, int i2) {
        if (verifyPointers(i, i2)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i), this.pointerIdList.get(i2))).getCurrFingersDiffY());
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There is no such pair of pointers!");
        return 0.0f;
    }

    public PointF getFocalPoint() {
        return this.focalPoint;
    }

    public int getPointersCount() {
        return this.pointerIdList.size();
    }

    public float getPreviousSpan(int i, int i2) {
        if (verifyPointers(i, i2)) {
            return this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i), this.pointerIdList.get(i2))).getPrevFingersDiffXY();
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getPreviousSpanX(int i, int i2) {
        if (verifyPointers(i, i2)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i), this.pointerIdList.get(i2))).getPrevFingersDiffX());
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There is no such pair of pointers!");
        return 0.0f;
    }

    public float getPreviousSpanY(int i, int i2) {
        if (verifyPointers(i, i2)) {
            return Math.abs(this.pointersDistanceMap.get(new PointerDistancePair(this.pointerIdList.get(i), this.pointerIdList.get(i2))).getPrevFingersDiffY());
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There is no such pair of pointers!");
        return 0.0f;
    }

    public int getRequiredPointersCount() {
        return 2;
    }

    public float getSpanThreshold() {
        return this.spanThreshold;
    }

    public boolean isSloppyGesture() {
        float f = this.displayMetrics.widthPixels;
        float f2 = this.edgeSlop;
        float f3 = f - f2;
        float f4 = r0.heightPixels - f2;
        Iterator<Integer> it2 = this.pointerIdList.iterator();
        while (it2.hasNext()) {
            int findPointerIndex = getCurrentEvent().findPointerIndex(it2.next().intValue());
            float rawX = Utils.getRawX(getCurrentEvent(), findPointerIndex);
            float rawY = Utils.getRawY(getCurrentEvent(), findPointerIndex);
            if (rawX < f2 || rawY < f2 || rawX > f3 || rawY > f4) {
                return true;
            }
        }
        return checkSpanBelowThreshold();
    }

    public void setSpanThreshold(float f) {
        this.spanThreshold = f;
    }

    public void setSpanThresholdResource(@DimenRes int i) {
        setSpanThreshold(this.context.getResources().getDimension(i));
    }

    public void reset() {
    }
}
