package com.amazon.mobile.heremapsexplore.Factories.Builders;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface GraphicsBuilder {
    BlurMaskFilter createBlurMaskFilter(float f, BlurMaskFilter.Blur blur);

    Canvas createCanvas(Bitmap bitmap);

    Matrix createMatrix();

    Matrix createMatrix(Matrix matrix);

    Paint createPaint();

    Paint createPaint(int i);

    PorterDuffColorFilter createPorterDuffColorFilter(int i, PorterDuff.Mode mode);

    Rect createRect();
}
