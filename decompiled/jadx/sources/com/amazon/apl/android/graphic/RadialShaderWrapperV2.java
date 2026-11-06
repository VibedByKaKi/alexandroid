package com.amazon.apl.android.graphic;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.amazon.apl.android.primitive.Gradient;
import com.amazon.apl.enums.GradientUnits;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RadialShaderWrapperV2 extends RadialShaderWrapper {
    private final float mRadius;
    private final Matrix mTransform;

    public RadialShaderWrapperV2(Gradient gradient, Rect rect, Matrix matrix) {
        super(gradient, rect, matrix);
        this.mRadius = getAbsoluteRadius(gradient.getUnits(), rect, gradient.getRadius());
        this.mTransform = getScaledTransform(gradient.getUnits(), rect);
    }

    private float getAbsoluteRadius(GradientUnits gradientUnits, Rect rect, float f) {
        return gradientUnits.equals(GradientUnits.kGradientUnitsUserSpace) ? f : f * Math.max(rect.width(), rect.height());
    }

    private Matrix getScaledTransform(GradientUnits gradientUnits, Rect rect) {
        Matrix matrix = new Matrix(super.getTransform());
        if (gradientUnits.equals(GradientUnits.kGradientUnitsBoundingBox)) {
            float max = Math.max(rect.width(), rect.height());
            matrix.preScale(rect.width() / max, rect.height() / max, getCenterX(), getCenterY());
        }
        return matrix;
    }

    @Override // com.amazon.apl.android.graphic.RadialShaderWrapper
    public float getRadius() {
        return this.mRadius;
    }

    @Override // com.amazon.apl.android.graphic.ShaderWrapper
    public Matrix getTransform() {
        return this.mTransform;
    }
}
