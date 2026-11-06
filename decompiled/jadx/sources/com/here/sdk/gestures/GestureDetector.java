package com.here.sdk.gestures;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import com.here.sdk.core.Point2D;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class GestureDetector {
    private InternalGestureDetector mDetector;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TouchEvent {
        Map<Long, TouchPoint> points;
        long timestamp;
        TouchPhase touchPhase;

        public TouchEvent(Map<Long, TouchPoint> map, long j, TouchPhase touchPhase) {
            this.points = map;
            this.timestamp = j;
            this.touchPhase = touchPhase;
        }
    }

    public GestureDetector(InternalGestureDetector internalGestureDetector) {
        this.mDetector = internalGestureDetector;
    }

    @SuppressLint({"UseSparseArrays"})
    private static TouchEvent convert(MotionEvent motionEvent) {
        HashMap hashMap = new HashMap();
        int pointerCount = motionEvent.getPointerCount();
        TouchPhase eventPhase = getEventPhase(motionEvent);
        int i = 0;
        while (i < pointerCount) {
            long pointerId = motionEvent.getPointerId(i);
            hashMap.put(Long.valueOf(pointerId), new TouchPoint(pointerId, new Point2D(motionEvent.getX(i), motionEvent.getY(i)), (motionEvent.getActionIndex() == i || eventPhase == TouchPhase.MOVE) ? eventPhase : TouchPhase.STATIONARY));
            i++;
        }
        return new TouchEvent(hashMap, motionEvent.getEventTime(), eventPhase);
    }

    private static TouchPhase getEventPhase(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    return TouchPhase.MOVE;
                }
                if (actionMasked == 3) {
                    return TouchPhase.CANCEL;
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            return TouchPhase.END;
        }
        return TouchPhase.BEGIN;
    }

    public Gestures getGestures() {
        return this.mDetector.getGestures();
    }

    public void processMotionEvent(MotionEvent motionEvent) {
        TouchEvent convert = convert(motionEvent);
        this.mDetector.processTouchEvent(convert.points, convert.timestamp, convert.touchPhase);
    }
}
