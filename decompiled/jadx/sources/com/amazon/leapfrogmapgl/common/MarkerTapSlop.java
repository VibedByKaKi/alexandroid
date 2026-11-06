package com.amazon.leapfrogmapgl.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nJ.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/leapfrogmapgl/common/MarkerTapSlop;", "", "<init>", "()V", "TOUCH_SLOP_MULTIPLIER", "", "slopPx", "touchSlopPx", "", "distancePx", "", "startX", "startY", "endX", "endY", "isTap", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MarkerTapSlop {

    @NotNull
    public static final MarkerTapSlop INSTANCE = new MarkerTapSlop();
    public static final float TOUCH_SLOP_MULTIPLIER = 2.0f;

    private MarkerTapSlop() {
    }

    public final double distancePx(double startX, double startY, double endX, double endY) {
        return Math.hypot(endX - startX, endY - startY);
    }

    public final boolean isTap(double startX, double startY, double endX, double endY, float slopPx) {
        return distancePx(startX, startY, endX, endY) < ((double) slopPx);
    }

    public final float slopPx(int touchSlopPx) {
        return touchSlopPx * 2.0f;
    }
}
