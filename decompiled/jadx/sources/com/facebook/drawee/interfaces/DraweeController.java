package com.facebook.drawee.interfaces;

import android.graphics.drawable.Animatable;
import android.view.MotionEvent;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes6.dex */
public interface DraweeController {
    Animatable getAnimatable();

    String getContentDescription();

    @Nullable
    DraweeHierarchy getHierarchy();

    boolean isSameImageRequest(DraweeController draweeController);

    void onAttach();

    void onDetach();

    boolean onTouchEvent(MotionEvent motionEvent);

    void onViewportVisibilityHint(boolean z);

    void setContentDescription(String str);

    void setHierarchy(@Nullable DraweeHierarchy draweeHierarchy);
}
