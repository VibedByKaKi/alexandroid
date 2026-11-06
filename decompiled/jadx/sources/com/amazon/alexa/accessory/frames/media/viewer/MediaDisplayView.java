package com.amazon.alexa.accessory.frames.media.viewer;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class MediaDisplayView extends FrameLayout {
    private static final float DISMISS_TRANSLATION_THRESHOLD = 300.0f;
    protected static final float DOUBLE_TAP_ZOOM = 2.5f;
    protected static final float EDGE_SWIPE_THRESHOLD = 20.0f;
    private static final float FLING_FRICTION = 0.05f;
    protected static final float MAX_ZOOM = 10.0f;
    protected static final float MIN_ZOOM = 1.0f;
    private static final String TAG = "MediaDisplayView";
    protected float currentScale;

    @Nullable
    private OverScroller flingScroller;
    private final Runnable flingStep;

    @NonNull
    protected GestureDetector gestureDetector;
    protected float initialY;
    protected boolean isDragging;
    private boolean isFlinging;
    protected boolean isPinching;
    protected boolean isZoomed;
    private int lastFlingX;
    private int lastFlingY;

    @NonNull
    protected PointF lastTouchPoint;

    @Nullable
    private OnMediaLoadedListener mediaLoadedListener;

    @NonNull
    protected ScaleGestureDetector scaleGestureDetector;

    @Nullable
    private OnSingleTapListener singleTapListener;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    private OnZoomChangedListener zoomChangedListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EdgeState {
        final boolean atBottom;
        final boolean atLeft;
        final boolean atRight;
        final boolean atTop;

        public EdgeState(boolean z, boolean z2, boolean z3, boolean z4) {
            this.atLeft = z;
            this.atRight = z2;
            this.atTop = z3;
            this.atBottom = z4;
        }

        public boolean canSwipeToNextMedia(float f) {
            if (f >= 0.0f || !this.atRight) {
                return f > 0.0f && this.atLeft;
            }
            return true;
        }

        public boolean isAtHorizontalEdge() {
            return this.atLeft || this.atRight;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnMediaLoadedListener {
        void onMediaLoaded();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnSingleTapListener {
        void onSingleTap();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnZoomChangedListener {
        void onZoomChanged(boolean z);
    }

    public MediaDisplayView(@NonNull Context context) {
        super(context);
        this.currentScale = 1.0f;
        this.lastTouchPoint = new PointF();
        this.isZoomed = false;
        this.isPinching = false;
        this.initialY = 0.0f;
        this.isDragging = false;
        this.flingStep = new MediaDisplayView$$ExternalSyntheticLambda0(this, 0);
        setupZoomGestureDetectors();
    }

    private float constrainHorizontalPan(float f, @NonNull EdgeState edgeState) {
        if ((f <= 0.0f || !edgeState.atLeft) && (f >= 0.0f || !edgeState.atRight)) {
            return f;
        }
        return 0.0f;
    }

    private float constrainVerticalPan(float f, @NonNull EdgeState edgeState) {
        if ((f <= 0.0f || !edgeState.atTop) && (f >= 0.0f || !edgeState.atBottom)) {
            return f;
        }
        return 0.0f;
    }

    private boolean handleActionDown(@NonNull MotionEvent motionEvent, boolean z, boolean z2) {
        stopFling();
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.velocityTracker.addMovement(motionEvent);
        this.lastTouchPoint.set(motionEvent.getX(), motionEvent.getY());
        this.initialY = motionEvent.getRawY();
        this.isDragging = false;
        return true;
    }

    private boolean handleActionMove(@NonNull MotionEvent motionEvent, boolean z, boolean z2) {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (shouldCheckEdgeSwipe() && handleEdgeBasedSwipe(motionEvent)) {
            return false;
        }
        return handleDragToDismiss(motionEvent) || z || z2;
    }

    private boolean handleActionUp(@NonNull MotionEvent motionEvent, boolean z, boolean z2) {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
            if (this.isZoomed && (motionEvent.getAction() & 255) == 1) {
                this.velocityTracker.computeCurrentVelocity(1000);
                maybeStartFling(this.velocityTracker.getXVelocity(), this.velocityTracker.getYVelocity());
            }
            this.velocityTracker.recycle();
            this.velocityTracker = null;
        }
        if (!this.isZoomed) {
            getParent().requestDisallowInterceptTouchEvent(false);
            Log.d(TAG, "Touch ended - re-enabling gestures (not zoomed)");
        }
        return handleDragEnd(motionEvent) || z || z2;
    }

    private void maybeStartFling(float f, float f2) {
        float scaledMinimumFlingVelocity = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        if (Math.abs(f) >= scaledMinimumFlingVelocity || Math.abs(f2) >= scaledMinimumFlingVelocity) {
            if (this.flingScroller == null) {
                OverScroller overScroller = new OverScroller(getContext());
                this.flingScroller = overScroller;
                overScroller.setFriction(0.05f);
            }
            this.flingScroller.forceFinished(true);
            this.lastFlingX = 0;
            this.lastFlingY = 0;
            this.flingScroller.fling(0, 0, (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            this.isFlinging = true;
            postOnAnimation(this.flingStep);
        }
    }

    private boolean shouldCheckEdgeSwipe() {
        ScaleGestureDetector scaleGestureDetector;
        return (!this.isZoomed || this.isPinching || (scaleGestureDetector = this.scaleGestureDetector) == null || scaleGestureDetector.isInProgress()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stepFling() {
        OverScroller overScroller;
        if (!this.isFlinging || (overScroller = this.flingScroller) == null || !this.isZoomed) {
            this.isFlinging = false;
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            this.isFlinging = false;
            return;
        }
        int currX = this.flingScroller.getCurrX();
        int currY = this.flingScroller.getCurrY();
        applyPan(currX - this.lastFlingX, currY - this.lastFlingY);
        this.lastFlingX = currX;
        this.lastFlingY = currY;
        postOnAnimation(this.flingStep);
    }

    private void stopFling() {
        this.isFlinging = false;
        OverScroller overScroller = this.flingScroller;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
        removeCallbacks(this.flingStep);
    }

    public void animateAndClose() {
        animate().translationY(getHeight()).alpha(0.0f).setDuration(200L).withEndAction(new MediaDisplayView$$ExternalSyntheticLambda0(this, 1)).start();
    }

    public void animateSnapBack() {
        animate().translationY(0.0f).alpha(1.0f).setDuration(200L).start();
    }

    public abstract void applyPan(float f, float f2);

    public abstract void applyZoom(float f, float f2, float f3, float f4);

    public abstract void cleanup();

    public void closeActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            Log.i(TAG, "Closing activity via swipe down gesture");
            ((Activity) context).finish();
        }
    }

    @NonNull
    public abstract EdgeState getEdgeState();

    public float getMaxZoomScale() {
        return 10.0f;
    }

    public boolean handleDragEnd(@NonNull MotionEvent motionEvent) {
        if (!this.isDragging || this.isZoomed) {
            return false;
        }
        if (motionEvent.getRawY() - this.initialY > 300.0f) {
            Log.d(TAG, "Drag-to-dismiss threshold reached, closing activity");
            animateAndClose();
        } else {
            Log.d(TAG, "Drag cancelled, snapping back to original position");
            animateSnapBack();
        }
        this.isDragging = false;
        return true;
    }

    public boolean handleDragToDismiss(@NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (!this.isZoomed && !this.scaleGestureDetector.isInProgress()) {
            float rawY = motionEvent.getRawY() - this.initialY;
            if (rawY > 20.0f) {
                z = true;
                if (!this.isDragging) {
                    this.isDragging = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Log.d(TAG, "Vertical drag detected - disabling ViewPager2 intercept");
                }
                float f = rawY * 0.5f;
                setTranslationY(f);
                setAlpha(1.0f - ((Math.min(f, 300.0f) / 300.0f) * 0.5f));
            }
        }
        return z;
    }

    public boolean handleEdgeBasedSwipe(@NonNull MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.lastTouchPoint.x;
        EdgeState edgeState = getEdgeState();
        boolean z = x < 0.0f;
        boolean z2 = x > 0.0f;
        String str = TAG;
        Log.d(str, "isAtLeftEdge: %s, isAtRightEdge: %s", Boolean.valueOf(edgeState.atLeft), Boolean.valueOf(edgeState.atRight));
        Log.d(str, "isMovingLeft: %s, isMovingRight: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!edgeState.canSwipeToNextMedia(x)) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    public boolean handlePanWhenZoomed(@NonNull MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.lastTouchPoint.x;
        float y = motionEvent.getY() - this.lastTouchPoint.y;
        EdgeState edgeState = getEdgeState();
        if (edgeState.canSwipeToNextMedia(x)) {
            return false;
        }
        Log.d(TAG, "atTopEdge: %s, atBottomEdge: %s", Boolean.valueOf(edgeState.atTop), Boolean.valueOf(edgeState.atBottom));
        applyPan(constrainHorizontalPan(x, edgeState), constrainVerticalPan(y, edgeState));
        this.lastTouchPoint.set(motionEvent.getX(), motionEvent.getY());
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public boolean isScaleGestureActive() {
        if (this.isPinching) {
            return true;
        }
        ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
        return scaleGestureDetector != null && scaleGestureDetector.isInProgress();
    }

    public abstract void loadMedia(@NonNull Uri uri);

    public void notifyMediaLoaded() {
        OnMediaLoadedListener onMediaLoadedListener = this.mediaLoadedListener;
        if (onMediaLoadedListener != null) {
            onMediaLoadedListener.onMediaLoaded();
        }
    }

    public void notifySingleTap() {
        OnSingleTapListener onSingleTapListener = this.singleTapListener;
        if (onSingleTapListener != null) {
            onSingleTapListener.onSingleTap();
        }
    }

    public void notifyZoomChanged(boolean z) {
        OnZoomChangedListener onZoomChangedListener = this.zoomChangedListener;
        if (onZoomChangedListener != null) {
            onZoomChangedListener.onZoomChanged(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        stopFling();
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (supportsZoom()) {
            z = this.scaleGestureDetector.onTouchEvent(motionEvent);
            z2 = this.gestureDetector.onTouchEvent(motionEvent);
        } else {
            z = false;
            z2 = false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            return handleActionDown(motionEvent, z, z2);
        }
        if (action != 1) {
            if (action == 2) {
                return handleActionMove(motionEvent, z, z2);
            }
            if (action != 3) {
                return z || z2;
            }
        }
        return handleActionUp(motionEvent, z, z2);
    }

    public void resetZoom() {
        if (supportsZoom()) {
            float f = this.currentScale;
            this.currentScale = 1.0f;
            this.isZoomed = false;
            applyZoom(f, 1.0f, 0.0f, 0.0f);
        }
    }

    public void setOnMediaLoadedListener(@Nullable OnMediaLoadedListener onMediaLoadedListener) {
        this.mediaLoadedListener = onMediaLoadedListener;
    }

    public void setOnSingleTapListener(@Nullable OnSingleTapListener onSingleTapListener) {
        this.singleTapListener = onSingleTapListener;
    }

    public void setOnZoomChangedListener(@Nullable OnZoomChangedListener onZoomChangedListener) {
        this.zoomChangedListener = onZoomChangedListener;
    }

    public void setupZoomGestureDetectors() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(@NonNull MotionEvent motionEvent) {
                if (!MediaDisplayView.this.supportsZoom()) {
                    return false;
                }
                MediaDisplayView mediaDisplayView = MediaDisplayView.this;
                float f = mediaDisplayView.currentScale;
                float min = f > 1.0f ? 1.0f : Math.min(MediaDisplayView.DOUBLE_TAP_ZOOM, mediaDisplayView.getMaxZoomScale());
                MediaDisplayView mediaDisplayView2 = MediaDisplayView.this;
                mediaDisplayView2.currentScale = min;
                boolean z = min > 1.0f;
                mediaDisplayView2.isZoomed = z;
                mediaDisplayView2.notifyZoomChanged(z);
                MediaDisplayView.this.applyZoom(f, min, motionEvent.getX(), motionEvent.getY());
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NonNull MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
                if (MediaDisplayView.this.singleTapListener == null) {
                    return false;
                }
                MediaDisplayView.this.notifySingleTap();
                return true;
            }
        });
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView.2
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(@NonNull ScaleGestureDetector scaleGestureDetector) {
                if (!MediaDisplayView.this.supportsZoom()) {
                    return false;
                }
                float f = MediaDisplayView.this.currentScale;
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                MediaDisplayView mediaDisplayView = MediaDisplayView.this;
                float max = Math.max(1.0f, Math.min(mediaDisplayView.currentScale * scaleFactor, mediaDisplayView.getMaxZoomScale()));
                MediaDisplayView mediaDisplayView2 = MediaDisplayView.this;
                if (max != mediaDisplayView2.currentScale) {
                    boolean z = mediaDisplayView2.isZoomed;
                    mediaDisplayView2.currentScale = max;
                    mediaDisplayView2.isZoomed = max > 1.0f;
                    mediaDisplayView2.applyZoom(f, max, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    MediaDisplayView mediaDisplayView3 = MediaDisplayView.this;
                    boolean z2 = mediaDisplayView3.isZoomed;
                    if (z2 != z) {
                        mediaDisplayView3.notifyZoomChanged(z2);
                    }
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(@NonNull ScaleGestureDetector scaleGestureDetector) {
                if (!MediaDisplayView.this.supportsZoom()) {
                    return false;
                }
                MediaDisplayView mediaDisplayView = MediaDisplayView.this;
                mediaDisplayView.isPinching = true;
                mediaDisplayView.setTranslationY(0.0f);
                MediaDisplayView.this.setAlpha(1.0f);
                MediaDisplayView mediaDisplayView2 = MediaDisplayView.this;
                mediaDisplayView2.isDragging = false;
                mediaDisplayView2.getParent().requestDisallowInterceptTouchEvent(true);
                MediaDisplayView.this.notifyZoomChanged(true);
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(@NonNull ScaleGestureDetector scaleGestureDetector) {
                MediaDisplayView mediaDisplayView = MediaDisplayView.this;
                mediaDisplayView.isPinching = false;
                if (mediaDisplayView.velocityTracker != null) {
                    MediaDisplayView.this.velocityTracker.clear();
                }
                MediaDisplayView mediaDisplayView2 = MediaDisplayView.this;
                if (mediaDisplayView2.isZoomed) {
                    return;
                }
                mediaDisplayView2.getParent().requestDisallowInterceptTouchEvent(false);
                MediaDisplayView.this.notifyZoomChanged(false);
            }
        });
    }

    public abstract boolean supportsZoom();
}
