package com.mapbox.maps.plugin.gestures;

import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.mapbox.android.gestures.StandardGestureDetector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class StandardGestureListenerShim extends StandardGestureDetector.SimpleStandardOnGestureListener {
    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@Nullable MotionEvent motionEvent) {
        return super.onDoubleTap(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(@Nullable MotionEvent motionEvent) {
        return super.onDoubleTapEvent(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@Nullable MotionEvent motionEvent) {
        return super.onDown(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(@Nullable MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onShowPress(@Nullable MotionEvent motionEvent) {
        super.onShowPress(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@Nullable MotionEvent motionEvent) {
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // com.mapbox.android.gestures.StandardGestureDetector.SimpleStandardOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
        return super.onSingleTapUp(motionEvent);
    }
}
