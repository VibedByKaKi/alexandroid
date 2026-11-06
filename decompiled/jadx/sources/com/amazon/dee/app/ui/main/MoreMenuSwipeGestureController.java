package com.amazon.dee.app.ui.main;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class MoreMenuSwipeGestureController {
    private static final float HORIZONTAL_DOMINANCE_RATIO = 1.2f;
    private boolean candidate;
    private Direction direction;
    private long downTime;
    private float downX;
    private float downY;
    private boolean intercepting;
    private float lastProgress;
    private final Listener listener;
    private final int longPressTimeoutMs = ViewConfiguration.getLongPressTimeout();
    private int screenWidth;
    private final int touchSlop;
    private VelocityTracker velocityTracker;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Direction {
        OPEN,
        CLOSE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DispatchResult {
        PASS_THROUGH,
        STARTED_INTERCEPTING,
        CONSUMED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onSwipeFinished(Direction direction, boolean z, float f, float f2);

        void onSwipeProgress(Direction direction, float f);

        boolean onSwipeStarted(Direction direction);
    }

    public MoreMenuSwipeGestureController(ViewConfiguration viewConfiguration, Listener listener) {
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.listener = listener;
    }

    private DispatchResult cancelGesture() {
        Direction direction;
        if (!this.intercepting || (direction = this.direction) == null) {
            reset();
            return DispatchResult.PASS_THROUGH;
        }
        this.listener.onSwipeFinished(direction, false, this.lastProgress, 0.0f);
        reset();
        return DispatchResult.CONSUMED;
    }

    private DispatchResult handleMove(MotionEvent motionEvent) {
        if (!this.candidate || this.direction == null || this.screenWidth <= 0) {
            return DispatchResult.PASS_THROUGH;
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        float x = motionEvent.getX() - this.downX;
        float y = motionEvent.getY() - this.downY;
        if (this.intercepting) {
            float progressFor = progressFor(this.direction, x, this.screenWidth);
            this.lastProgress = progressFor;
            this.listener.onSwipeProgress(this.direction, progressFor);
            return DispatchResult.CONSUMED;
        }
        if (motionEvent.getEventTime() - this.downTime >= this.longPressTimeoutMs) {
            reset();
            return DispatchResult.PASS_THROUGH;
        }
        if (Math.abs(y) > this.touchSlop && Math.abs(y) >= Math.abs(x)) {
            reset();
            return DispatchResult.PASS_THROUGH;
        }
        if (!isHorizontalIntent(x, y, this.touchSlop) || !isExpectedDirection(this.direction, x)) {
            return DispatchResult.PASS_THROUGH;
        }
        if (!this.listener.onSwipeStarted(this.direction)) {
            reset();
            return DispatchResult.PASS_THROUGH;
        }
        this.intercepting = true;
        float progressFor2 = progressFor(this.direction, x, this.screenWidth);
        this.lastProgress = progressFor2;
        this.listener.onSwipeProgress(this.direction, progressFor2);
        return DispatchResult.STARTED_INTERCEPTING;
    }

    private DispatchResult handleUp(MotionEvent motionEvent) {
        if (!this.intercepting || this.direction == null) {
            reset();
            return DispatchResult.PASS_THROUGH;
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
            this.velocityTracker.computeCurrentVelocity(1000);
        }
        float progressFor = progressFor(this.direction, motionEvent.getX() - this.downX, this.screenWidth);
        float releaseVelocity = releaseVelocity(this.direction, this.screenWidth);
        this.listener.onSwipeFinished(this.direction, MoreMenuTransitionMotion.projectsPastMidpoint(progressFor, releaseVelocity), progressFor, releaseVelocity);
        reset();
        return DispatchResult.CONSUMED;
    }

    @VisibleForTesting
    public static boolean isExpectedDirection(Direction direction, float f) {
        return direction == Direction.OPEN ? f > 0.0f : f < 0.0f;
    }

    @VisibleForTesting
    public static boolean isHorizontalIntent(float f, float f2, int i) {
        return Math.abs(f) > ((float) i) && Math.abs(f) > Math.abs(f2) * HORIZONTAL_DOMINANCE_RATIO;
    }

    @VisibleForTesting
    public static boolean isOpenEdgeStart(float f, float f2) {
        return f >= 0.0f && f <= f2;
    }

    @VisibleForTesting
    public static float progressFor(Direction direction, float f, int i) {
        if (direction != Direction.OPEN) {
            f = -f;
        }
        return MoreMenuTransitionMotion.tracking(0.0f, f, i);
    }

    private float releaseVelocity(Direction direction, int i) {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        float xVelocity = velocityTracker.getXVelocity();
        if (direction != Direction.OPEN) {
            xVelocity = -xVelocity;
        }
        return MoreMenuTransitionMotion.velocity(xVelocity, i);
    }

    public DispatchResult onTouchEvent(MotionEvent motionEvent, boolean z, boolean z2, int i, float f) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked != 1 ? actionMasked != 2 ? (actionMasked == 3 || actionMasked == 5) ? cancelGesture() : this.intercepting ? DispatchResult.CONSUMED : DispatchResult.PASS_THROUGH : handleMove(motionEvent) : handleUp(motionEvent);
        }
        reset();
        this.screenWidth = i;
        this.downX = motionEvent.getX();
        this.downY = motionEvent.getY();
        this.downTime = motionEvent.getEventTime();
        if (z && isOpenEdgeStart(this.downX, f)) {
            this.candidate = true;
            this.direction = Direction.OPEN;
        } else if (z2) {
            this.candidate = true;
            this.direction = Direction.CLOSE;
        }
        if (this.candidate) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.velocityTracker = obtain;
            obtain.addMovement(motionEvent);
        }
        return DispatchResult.PASS_THROUGH;
    }

    public void reset() {
        this.candidate = false;
        this.intercepting = false;
        this.direction = null;
        this.downX = 0.0f;
        this.downY = 0.0f;
        this.downTime = 0L;
        this.screenWidth = 0;
        this.lastProgress = 0.0f;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }
}
