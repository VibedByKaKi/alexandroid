package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class ObjectsPool {
    private static final Rect RECT = new Rect();
    private static final RectF RECT_F = new RectF();
    private static final Paint PAINT = new Paint(1);

    private ObjectsPool() {
    }

    public static Paint paint() {
        return PAINT;
    }

    public static Rect rect() {
        return RECT;
    }

    public static RectF rectF() {
        return RECT_F;
    }
}
