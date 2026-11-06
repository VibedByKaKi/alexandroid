package com.amazon.apl.android.touch;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.enums.PointerEventType;
import com.amazon.apl.enums.PointerType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PointerInfo {
    private int mActionIndex;
    private MotionEvent mMotionEvent;
    private Pointer mPrimaryPointer;
    private int mPrimaryPointerIndex;

    private PointerInfo(@Nullable Pointer pointer, @NonNull MotionEvent motionEvent) {
        update(pointer, motionEvent);
    }

    public static PointerInfo create(@Nullable Pointer pointer, @NonNull MotionEvent motionEvent) {
        return new PointerInfo(pointer, motionEvent);
    }

    private void handleCancelAction() {
        if (isPrimaryPointerInEvent()) {
            this.mPrimaryPointer.update(PointerEventType.kPointerCancel, this.mMotionEvent.getX(), this.mMotionEvent.getY());
        }
    }

    private void handleDownAction() {
        this.mPrimaryPointer = Pointer.create(this.mMotionEvent.getPointerId(this.mActionIndex), this.mMotionEvent.getToolType(this.mActionIndex) == 3 ? PointerType.kMousePointer : PointerType.kTouchPointer, PointerEventType.kPointerDown, this.mMotionEvent.getX(), this.mMotionEvent.getY());
    }

    private void handleMoveAction() {
        if (isPrimaryPointerInEvent()) {
            this.mPrimaryPointer.update(PointerEventType.kPointerMove, this.mMotionEvent.getX(this.mPrimaryPointerIndex), this.mMotionEvent.getY(this.mPrimaryPointerIndex));
        }
    }

    private void handlePointerUpAction() {
        if (isPrimaryPointerEventTarget()) {
            this.mPrimaryPointer.update(PointerEventType.kPointerUp, this.mMotionEvent.getX(this.mActionIndex), this.mMotionEvent.getY(this.mActionIndex));
        } else {
            handleMoveAction();
        }
    }

    private void handleUpAction() {
        if (isPrimaryPointerInEvent()) {
            this.mPrimaryPointer.update(PointerEventType.kPointerUp, this.mMotionEvent.getX(), this.mMotionEvent.getY());
        }
    }

    private boolean isPrimaryPointerEventTarget() {
        return this.mPrimaryPointerIndex == this.mActionIndex;
    }

    private boolean isPrimaryPointerInEvent() {
        return this.mPrimaryPointerIndex != -1;
    }

    private void translate() {
        int actionMasked = this.mMotionEvent.getActionMasked();
        if (actionMasked == 0) {
            handleDownAction();
            return;
        }
        if (actionMasked == 1) {
            handleUpAction();
            return;
        }
        if (actionMasked == 3) {
            handleCancelAction();
        } else if (actionMasked != 6) {
            handleMoveAction();
        } else {
            handlePointerUpAction();
        }
    }

    @Nullable
    public Pointer getPointer() {
        return this.mPrimaryPointer;
    }

    public void update(@Nullable Pointer pointer, @NonNull MotionEvent motionEvent) {
        this.mPrimaryPointer = pointer;
        this.mMotionEvent = motionEvent;
        this.mActionIndex = motionEvent.getActionIndex();
        Pointer pointer2 = this.mPrimaryPointer;
        this.mPrimaryPointerIndex = pointer2 != null ? this.mMotionEvent.findPointerIndex(pointer2.getId()) : -1;
        translate();
    }
}
