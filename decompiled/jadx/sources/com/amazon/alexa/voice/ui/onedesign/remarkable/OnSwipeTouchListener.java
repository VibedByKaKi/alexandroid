package com.amazon.alexa.voice.ui.onedesign.remarkable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OnSwipeTouchListener implements View.OnTouchListener {
    private static final String TAG = "OnSwipeTouchListener";
    private static GestureDetector gestureDetector;
    private final Context context;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface GestureActionListener {
        void onSwipedDown();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;
        private final GestureActionListener listener;

        public GestureListener(GestureActionListener gestureActionListener) {
            this.listener = gestureActionListener;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureActionListener gestureActionListener;
            try {
                float y = motionEvent2.getY() - motionEvent.getY();
                if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f || y <= 0.0f || (gestureActionListener = this.listener) == null) {
                    return false;
                }
                gestureActionListener.onSwipedDown();
                return true;
            } catch (Exception e) {
                Log.e(OnSwipeTouchListener.TAG, "Exception occurred while detecting swipe! ", e);
                return false;
            }
        }
    }

    public OnSwipeTouchListener(Context context, GestureActionListener gestureActionListener) {
        this.context = context;
        gestureDetector = new GestureDetector(context, new GestureListener(gestureActionListener));
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
