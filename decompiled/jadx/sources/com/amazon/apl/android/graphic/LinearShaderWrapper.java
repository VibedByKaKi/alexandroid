package com.amazon.apl.android.graphic;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import com.amazon.apl.android.primitive.Gradient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LinearShaderWrapper extends ShaderWrapper {
    private final float mX1;
    private final float mX2;
    private final float mY1;
    private final float mY2;

    public LinearShaderWrapper(Gradient gradient, Rect rect, Matrix matrix) {
        super(gradient, matrix);
        this.mX1 = getAbsoluteXCoordinate(rect, gradient.getX1());
        this.mY1 = getAbsoluteYCoordinate(rect, gradient.getY1());
        this.mX2 = getAbsoluteXCoordinate(rect, gradient.getX2());
        this.mY2 = getAbsoluteYCoordinate(rect, gradient.getY2());
    }

    @Override // com.amazon.apl.android.graphic.ShaderWrapper
    public Shader getShader() {
        LinearGradient linearGradient = new LinearGradient(this.mX1, this.mY1, this.mX2, this.mY2, getColorRange(), getInputRange(), getTileMode());
        linearGradient.setLocalMatrix(getTransform());
        return linearGradient;
    }

    public float getX1() {
        return this.mX1;
    }

    public float getX2() {
        return this.mX2;
    }

    public float getY1() {
        return this.mY1;
    }

    public float getY2() {
        return this.mY2;
    }
}
