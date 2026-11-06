package com.amazon.alexa.smarthomecameras.handlers;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.alexa.smarthomecameras.ptz.PtzGestureListener;
import com.amazon.ptz.gestures.handlers.GestureHandler;
import com.amazon.ptz.gestures.listeners.OldScaleGestureDetector;
import com.amazon.ptz.gestures.listeners.PtzListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewPtzListener extends PtzListener {
    private static final String TAG = "LiveViewPtzListener";
    private final PtzGestureListener listener;

    public LiveViewPtzListener(GestureHandler gestureHandler, GestureDetector gestureDetector, OldScaleGestureDetector oldScaleGestureDetector, Context context, PtzGestureListener ptzGestureListener) {
        super(gestureHandler, gestureDetector, oldScaleGestureDetector, context);
        this.listener = ptzGestureListener;
    }

    @Override // com.amazon.ptz.gestures.listeners.PtzListener, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.getAction();
        boolean onTouch = super.onTouch(view, motionEvent);
        if (motionEvent.getAction() != 2) {
            this.listener.onTouch();
        }
        return onTouch;
    }
}
