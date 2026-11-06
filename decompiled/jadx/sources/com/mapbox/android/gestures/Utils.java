package com.mapbox.android.gestures;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Utils {
    public static PointF determineFocalPoint(@NonNull MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    public static float dpToPx(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getRawX(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getX(i) + rawX;
        }
        return 0.0f;
    }

    public static float getRawY(MotionEvent motionEvent, int i) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getY(i) + rawY;
        }
        return 0.0f;
    }

    public static float pxToDp(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    public static float pxToMm(float f, Context context) {
        return f / TypedValue.applyDimension(5, 1.0f, context.getResources().getDisplayMetrics());
    }
}
