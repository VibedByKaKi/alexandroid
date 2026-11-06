package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/swmansion/gesturehandler/core/GestureUtils;", "", "<init>", "()V", "getLastPointerX", "", "event", "Landroid/view/MotionEvent;", "averageTouches", "", "getLastPointerY", "coneToDeviation", "", "angle", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GestureUtils {

    @NotNull
    public static final GestureUtils INSTANCE = new GestureUtils();

    private GestureUtils() {
    }

    public final double coneToDeviation(double angle) {
        return Math.cos(Math.toRadians(angle / 2.0d));
    }

    public final float getLastPointerX(@NotNull MotionEvent event, boolean averageTouches) {
        event.getClass();
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!averageTouches) {
            int pointerCount = event.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return event.getX(i);
        }
        int pointerCount2 = event.getPointerCount();
        float f = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                i2++;
                f = event.getX(i3) + f;
            }
        }
        return f / i2;
    }

    public final float getLastPointerY(@NotNull MotionEvent event, boolean averageTouches) {
        event.getClass();
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!averageTouches) {
            int pointerCount = event.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return event.getY(i);
        }
        int pointerCount2 = event.getPointerCount();
        float f = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                i2++;
                f = event.getY(i3) + f;
            }
        }
        return f / i2;
    }
}
