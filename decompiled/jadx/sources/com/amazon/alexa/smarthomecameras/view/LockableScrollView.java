package com.amazon.alexa.smarthomecameras.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LockableScrollView extends ScrollView {
    private boolean scrollingEnabled;

    public LockableScrollView(Context context) {
        super(context);
        this.scrollingEnabled = true;
    }

    public boolean isScrollingEnabled() {
        return this.scrollingEnabled;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.scrollingEnabled && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.scrollingEnabled && super.onTouchEvent(motionEvent);
    }

    public void setScrollingEnabled(boolean z) {
        this.scrollingEnabled = z;
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollingEnabled = true;
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollingEnabled = true;
    }
}
