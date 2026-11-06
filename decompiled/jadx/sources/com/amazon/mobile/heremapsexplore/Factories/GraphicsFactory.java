package com.amazon.mobile.heremapsexplore.Factories;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GraphicsFactory implements GraphicsBuilder {
    private static final GraphicsFactory instance = new GraphicsFactory();

    private GraphicsFactory() {
    }

    public static GraphicsFactory getInstance() {
        return instance;
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public BlurMaskFilter createBlurMaskFilter(float f, BlurMaskFilter.Blur blur) {
        return new BlurMaskFilter(f, blur);
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public Canvas createCanvas(Bitmap bitmap) {
        return new Canvas(bitmap);
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public Matrix createMatrix() {
        return new Matrix();
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public Paint createPaint() {
        return new Paint();
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public PorterDuffColorFilter createPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        return new PorterDuffColorFilter(i, mode);
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public Rect createRect() {
        return new Rect();
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public Matrix createMatrix(Matrix matrix) {
        return new Matrix(matrix);
    }

    @Override // com.amazon.mobile.heremapsexplore.Factories.Builders.GraphicsBuilder
    public Paint createPaint(int i) {
        return new Paint(i);
    }
}
