package com.facebook.drawee.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class GestureDetector {

    @VisibleForTesting
    long mActionDownTime;

    @VisibleForTesting
    float mActionDownX;

    @VisibleForTesting
    float mActionDownY;

    @Nullable
    @VisibleForTesting
    ClickListener mClickListener;

    @VisibleForTesting
    boolean mIsCapturingGesture;

    @VisibleForTesting
    boolean mIsClickCandidate;

    @VisibleForTesting
    final float mSingleTapSlopPx;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ClickListener {
        boolean onClick();
    }

    public GestureDetector(Context context) {
        this.mSingleTapSlopPx = ViewConfiguration.get(context).getScaledTouchSlop();
        init();
    }

    public static GestureDetector newInstance(Context context) {
        return new GestureDetector(context);
    }

    public void init() {
        this.mClickListener = null;
        reset();
    }

    public boolean isCapturingGesture() {
        return this.mIsCapturingGesture;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickListener clickListener;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mIsCapturingGesture = true;
            this.mIsClickCandidate = true;
            this.mActionDownTime = motionEvent.getEventTime();
            this.mActionDownX = motionEvent.getX();
            this.mActionDownY = motionEvent.getY();
        } else if (action == 1) {
            this.mIsCapturingGesture = false;
            if (Math.abs(motionEvent.getX() - this.mActionDownX) > this.mSingleTapSlopPx || Math.abs(motionEvent.getY() - this.mActionDownY) > this.mSingleTapSlopPx) {
                this.mIsClickCandidate = false;
            }
            if (this.mIsClickCandidate && motionEvent.getEventTime() - this.mActionDownTime <= ViewConfiguration.getLongPressTimeout() && (clickListener = this.mClickListener) != null) {
                clickListener.onClick();
            }
            this.mIsClickCandidate = false;
        } else if (action != 2) {
            if (action == 3) {
                this.mIsCapturingGesture = false;
                this.mIsClickCandidate = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.mActionDownX) > this.mSingleTapSlopPx || Math.abs(motionEvent.getY() - this.mActionDownY) > this.mSingleTapSlopPx) {
            this.mIsClickCandidate = false;
        }
        return true;
    }

    public void reset() {
        this.mIsCapturingGesture = false;
        this.mIsClickCandidate = false;
    }

    public void setClickListener(ClickListener clickListener) {
        this.mClickListener = clickListener;
    }
}
