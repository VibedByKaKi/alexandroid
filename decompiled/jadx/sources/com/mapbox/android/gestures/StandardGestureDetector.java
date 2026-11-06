package com.mapbox.android.gestures;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiThread
/* loaded from: classes8.dex */
public class StandardGestureDetector extends BaseGesture<StandardOnGestureListener> {
    private final GestureDetector gestureDetector;
    final StandardOnGestureListener innerListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StandardOnGestureListener extends GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    }

    public StandardGestureDetector(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        StandardOnGestureListener standardOnGestureListener = new StandardOnGestureListener() { // from class: com.mapbox.android.gestures.StandardGestureDetector.1
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                return StandardGestureDetector.this.canExecute(10) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return StandardGestureDetector.this.canExecute(11) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onDoubleTapEvent(motionEvent);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return StandardGestureDetector.this.canExecute(9) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onDown(motionEvent);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return StandardGestureDetector.this.canExecute(7) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (StandardGestureDetector.this.canExecute(6)) {
                    ((StandardOnGestureListener) StandardGestureDetector.this.listener).onLongPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return StandardGestureDetector.this.canExecute(0) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
                if (StandardGestureDetector.this.canExecute(8)) {
                    ((StandardOnGestureListener) StandardGestureDetector.this.listener).onShowPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return StandardGestureDetector.this.canExecute(12) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onSingleTapConfirmed(motionEvent);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return StandardGestureDetector.this.canExecute(5) && ((StandardOnGestureListener) StandardGestureDetector.this.listener).onSingleTapUp(motionEvent);
            }
        };
        this.innerListener = standardOnGestureListener;
        this.gestureDetector = new GestureDetector(context, standardOnGestureListener);
    }

    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(@NonNull MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public boolean isLongpressEnabled() {
        return this.gestureDetector.isLongpressEnabled();
    }

    public void setIsLongpressEnabled(boolean z) {
        this.gestureDetector.setIsLongpressEnabled(z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleStandardOnGestureListener implements StandardOnGestureListener {
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }
}
