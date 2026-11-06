package com.amazon.alexa.voice.ui.onedesign.widget.gradient;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import com.amazon.alexa.voice.ui.onedesign.widget.gradient.DefaultGradientCompositor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class DefaultGradientCompositor$$ExternalSyntheticLambda0 implements DefaultGradientCompositor.BitmapFactory, DefaultGradientCompositor.CanvasFactory, DefaultGradientCompositor.PaintFactory, DefaultGradientCompositor.LinearGradientFactory {
    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.DefaultGradientCompositor.BitmapFactory
    public Bitmap createInstance(int i, int i2) {
        Bitmap createBitmap;
        createBitmap = DefaultGradientCompositor.createBitmap(i, i2);
        return createBitmap;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.DefaultGradientCompositor.CanvasFactory
    public Canvas createInstance(Bitmap bitmap) {
        Canvas createCanvas;
        createCanvas = DefaultGradientCompositor.createCanvas(bitmap);
        return createCanvas;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.DefaultGradientCompositor.LinearGradientFactory
    public LinearGradient createInstance(GradientModel gradientModel) {
        LinearGradient createLinearGradient;
        createLinearGradient = DefaultGradientCompositor.createLinearGradient(gradientModel);
        return createLinearGradient;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.gradient.DefaultGradientCompositor.PaintFactory
    public Paint createInstance() {
        Paint createPaint;
        createPaint = DefaultGradientCompositor.createPaint();
        return createPaint;
    }
}
