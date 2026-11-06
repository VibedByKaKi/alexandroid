package com.caverock.androidsvg;

import android.graphics.Canvas;
import java.lang.reflect.Method;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CanvasLegacy {
    static final int MATRIX_SAVE_FLAG;
    private static final Method SAVE;

    static {
        try {
            MATRIX_SAVE_FLAG = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            SAVE = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    public static void save(Canvas canvas, int i) {
        try {
            SAVE.invoke(canvas, Integer.valueOf(i));
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    private static RuntimeException sneakyThrow(Throwable th) {
        if (th != null) {
            return (RuntimeException) sneakyThrow0(th);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("t");
        return null;
    }

    private static <T extends Throwable> T sneakyThrow0(Throwable th) throws Throwable {
        throw th;
    }
}
