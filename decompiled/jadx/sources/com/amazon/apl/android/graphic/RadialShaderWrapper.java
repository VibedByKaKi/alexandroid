package com.amazon.apl.android.graphic;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.apl.android.primitive.Gradient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RadialShaderWrapper extends ShaderWrapper {
    private static final String TAG = "RadialShaderWrapper";
    private final float mCenterX;
    private final float mCenterY;
    private final float mRadius;

    public RadialShaderWrapper(Gradient gradient, Rect rect, Matrix matrix) {
        super(gradient, matrix);
        this.mCenterX = getAbsoluteXCoordinate(rect, gradient.getCenterX());
        this.mCenterY = getAbsoluteYCoordinate(rect, gradient.getCenterY());
        this.mRadius = getScaledRadius(rect, gradient.getRadius());
    }

    public float getCenterX() {
        return this.mCenterX;
    }

    public float getCenterY() {
        return this.mCenterY;
    }

    public float getRadius() {
        return this.mRadius;
    }

    public float getScaledRadius(Rect rect, float f) {
        float width = rect.width();
        float height = rect.height();
        return (((float) Math.sqrt((height * height) + (width * width))) / 2.0f) * f;
    }

    @Override // com.amazon.apl.android.graphic.ShaderWrapper
    @Nullable
    public Shader getShader() {
        if (this.mRadius <= 0.0f) {
            Log.w(TAG, "Cannot create a RadialGradient shader with a non-positive radius");
            return null;
        }
        RadialGradient radialGradient = new RadialGradient(getCenterX(), getCenterY(), getRadius(), getColorRange(), getInputRange(), getTileMode());
        radialGradient.setLocalMatrix(getTransform());
        return radialGradient;
    }
}
