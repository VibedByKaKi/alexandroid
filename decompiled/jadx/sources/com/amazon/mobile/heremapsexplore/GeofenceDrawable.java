package com.amazon.mobile.heremapsexplore;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GeofenceDrawable extends ShapeDrawable {
    private final Paint fillPaint;
    private boolean showBorder;
    private final Paint strokePaint;

    public GeofenceDrawable(int i, int i2) {
        super(new OvalShape());
        Paint paint = getPaint();
        this.fillPaint = paint;
        Paint paint2 = new Paint(paint);
        this.strokePaint = paint2;
        this.showBorder = false;
        paint.setColor(i);
        paint2.setColor(i2);
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public void onDraw(Shape shape, Canvas canvas, Paint paint) {
        shape.draw(canvas, paint);
        if (this.showBorder) {
            shape.draw(canvas, this.strokePaint);
        }
    }

    public void setShowBorder(boolean z) {
        this.showBorder = z;
    }

    public void setStrokeWidth(float f) {
        this.strokePaint.setStrokeWidth(f);
    }
}
