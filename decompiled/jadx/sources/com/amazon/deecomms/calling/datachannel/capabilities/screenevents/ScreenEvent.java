package com.amazon.deecomms.calling.datachannel.capabilities.screenevents;

import android.view.MotionEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ScreenEvent {
    private String action;
    private MotionEvent.PointerCoords pointerCoords;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String action;
        private MotionEvent.PointerCoords pointerCoords;

        public ScreenEvent build() {
            return new ScreenEvent(this.pointerCoords, this.action, 0);
        }

        public Builder withAction(String str) {
            this.action = str;
            return this;
        }

        public Builder withPointerCoords(MotionEvent.PointerCoords pointerCoords) {
            this.pointerCoords = pointerCoords;
            return this;
        }
    }

    private ScreenEvent(MotionEvent.PointerCoords pointerCoords, String str) {
        this.pointerCoords = pointerCoords;
        this.action = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAction() {
        return this.action;
    }

    public MotionEvent.PointerCoords getPointerCoords() {
        return this.pointerCoords;
    }

    public /* synthetic */ ScreenEvent(MotionEvent.PointerCoords pointerCoords, String str, int i) {
        this(pointerCoords, str);
    }
}
