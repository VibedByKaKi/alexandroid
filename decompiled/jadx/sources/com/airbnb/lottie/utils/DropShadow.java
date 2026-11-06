package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.utils.OffscreenLayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DropShadow {
    private int color;
    private float dx;
    private float dy;
    private float radius;

    @Nullable
    private float[] vecs;

    public DropShadow(DropShadow dropShadow) {
        this.radius = 0.0f;
        this.dx = 0.0f;
        this.dy = 0.0f;
        this.color = 0;
        this.radius = dropShadow.radius;
        this.dx = dropShadow.dx;
        this.dy = dropShadow.dy;
        this.color = dropShadow.color;
        this.vecs = null;
    }

    public void applyTo(Paint paint) {
        if (Color.alpha(this.color) > 0) {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.dx, this.dy, this.color);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i, Paint paint) {
        int mixOpacities = Utils.mixOpacities(Color.alpha(this.color), MiscUtils.clamp(i, 0, 255));
        if (mixOpacities <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.dx, this.dy, Color.argb(mixOpacities, Color.red(this.color), Color.green(this.color), Color.blue(this.color)));
        }
    }

    public int getColor() {
        return this.color;
    }

    public float getDx() {
        return this.dx;
    }

    public float getDy() {
        return this.dy;
    }

    public float getRadius() {
        return this.radius;
    }

    public void multiplyOpacity(int i) {
        this.color = Color.argb(Math.round((MiscUtils.clamp(i, 0, 255) * Color.alpha(this.color)) / 255.0f), Color.red(this.color), Color.green(this.color), Color.blue(this.color));
    }

    public boolean sameAs(DropShadow dropShadow) {
        return this.radius == dropShadow.radius && this.dx == dropShadow.dx && this.dy == dropShadow.dy && this.color == dropShadow.color;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setDx(float f) {
        this.dx = f;
    }

    public void setDy(float f) {
        this.dy = f;
    }

    public void setRadius(float f) {
        this.radius = f;
    }

    public void transformBy(Matrix matrix) {
        if (this.vecs == null) {
            this.vecs = new float[2];
        }
        float[] fArr = this.vecs;
        fArr[0] = this.dx;
        fArr[1] = this.dy;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.vecs;
        this.dx = fArr2[0];
        this.dy = fArr2[1];
        this.radius = matrix.mapRadius(this.radius);
    }

    public void applyTo(OffscreenLayer.ComposeOp composeOp) {
        if (Color.alpha(this.color) > 0) {
            composeOp.shadow = this;
        } else {
            composeOp.shadow = null;
        }
    }

    public DropShadow(float f, float f2, float f3, int i) {
        this.radius = f;
        this.dx = f2;
        this.dy = f3;
        this.color = i;
        this.vecs = null;
    }

    public DropShadow() {
        this.radius = 0.0f;
        this.dx = 0.0f;
        this.dy = 0.0f;
        this.color = 0;
    }

    public void applyWithAlpha(int i, OffscreenLayer.ComposeOp composeOp) {
        DropShadow dropShadow = new DropShadow(this);
        composeOp.shadow = dropShadow;
        dropShadow.multiplyOpacity(i);
    }
}
