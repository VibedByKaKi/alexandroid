package com.amazon.apl.android.touch;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.enums.PointerEventType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PointerTracker {

    @Nullable
    private Pointer mPointer;
    private PointerInfo mPointerInfo;

    private void createOrUpdatePointerInfo(@NonNull MotionEvent motionEvent) {
        PointerInfo pointerInfo = this.mPointerInfo;
        Pointer pointer = this.mPointer;
        if (pointerInfo == null) {
            this.mPointerInfo = PointerInfo.create(pointer, motionEvent);
        } else {
            pointerInfo.update(pointer, motionEvent);
        }
        updatePointer();
    }

    private boolean isPointerUp() {
        Pointer pointer = this.mPointer;
        if (pointer != null) {
            return pointer.getPointerEventType() == PointerEventType.kPointerUp || this.mPointer.getPointerEventType() == PointerEventType.kPointerCancel;
        }
        return false;
    }

    private void updatePointer() {
        this.mPointer = this.mPointerInfo.getPointer();
        if (isPointerUp()) {
            this.mPointer = null;
        }
    }

    @Nullable
    public final Pointer cancelPointer() {
        Pointer pointer = this.mPointer;
        Pointer cancel = pointer != null ? pointer.toCancel() : null;
        this.mPointer = null;
        return cancel;
    }

    @Nullable
    public Pointer trackAndGetPointer(@NonNull MotionEvent motionEvent) {
        createOrUpdatePointerInfo(motionEvent);
        return this.mPointerInfo.getPointer();
    }
}
