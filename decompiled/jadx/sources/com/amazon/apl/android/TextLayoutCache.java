package com.amazon.apl.android;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.font.FontConstant;
import com.amazon.apl.android.font.TypefaceResolver;
import com.amazon.apl.android.primitive.Dimension;
import com.amazon.apl.android.scenegraph.text.APLTextLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TextLayoutCache {
    private static final boolean DEBUG = false;
    private static final String TAG = "TextLayoutCache";
    private final NoopableLruCache<String, APLTextLayout> mLayoutCache;
    private final NoopableLruCache<String, Integer> mMeasuredTextWidths;
    private final NoopableLruCache<String, TextPaint> mPaintCache;

    public TextLayoutCache(int i, int i2, int i3) {
        this.mLayoutCache = new NoopableLruCache<>(i);
        this.mPaintCache = new NoopableLruCache<>(i2);
        this.mMeasuredTextWidths = new NoopableLruCache<>(i3);
    }

    private static boolean shouldDisableHinting(String str) {
        return FontConstant.fontFamiliesAttachedToAmazonEmber.contains(str);
    }

    public void clear() {
        this.mLayoutCache.evictAll();
        this.mPaintCache.evictAll();
        this.mMeasuredTextWidths.evictAll();
    }

    public TextPaint createTextPaint(int i, ITextProxy iTextProxy, float f) {
        String str;
        Typeface typeface;
        TypefaceResolver.FontTypeFace fontTypeface = TypefaceResolver.getInstance().getFontTypeface(iTextProxy.getFontFamily(), iTextProxy.getFontWeight(), iTextProxy.isItalic(), iTextProxy.getFontLanguage(), i <= 0);
        if (fontTypeface != null) {
            str = fontTypeface.getFontFamily();
            typeface = fontTypeface.getTypeface();
        } else {
            str = "";
            typeface = null;
        }
        TextPaint textPaint = new TextPaint(1);
        if (shouldDisableHinting(str)) {
            textPaint.setHinting(0);
        }
        int shadowOffsetHorizontal = iTextProxy.getShadowOffsetHorizontal();
        int shadowOffsetVertical = iTextProxy.getShadowOffsetVertical();
        int shadowColor = iTextProxy.getShadowColor();
        float shadowRadius = iTextProxy.getShadowRadius();
        if (shadowRadius == 0.0f && (shadowOffsetHorizontal != 0 || shadowOffsetVertical != 0)) {
            shadowRadius = 1.0f;
        }
        int round = Math.round(iTextProxy.getFontSize());
        Dimension letterSpacing = iTextProxy.getLetterSpacing();
        float value = letterSpacing == null ? 1.0f : letterSpacing.value();
        textPaint.setColor(iTextProxy.getColor());
        float f2 = round;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(typeface);
        textPaint.setLetterSpacing(value / f2);
        textPaint.density = f;
        textPaint.setTextScaleX(1.0f);
        textPaint.setShadowLayer(shadowRadius, shadowOffsetHorizontal, shadowOffsetVertical, shadowColor);
        return textPaint;
    }

    @Nullable
    public APLTextLayout getLayout(String str) {
        return this.mLayoutCache.get(str);
    }

    @NonNull
    @VisibleForTesting
    public TextPaint getOrCreateTextPaint(int i, String str, ITextProxy iTextProxy, float f) {
        TextPaint textPaint = this.mPaintCache.get(str);
        if (textPaint != null) {
            return textPaint;
        }
        TextPaint createTextPaint = createTextPaint(i, iTextProxy, f);
        this.mPaintCache.put(str, createTextPaint);
        return createTextPaint;
    }

    @Nullable
    public Integer getTextWidth(String str) {
        return this.mMeasuredTextWidths.get(str);
    }

    public void putLayout(String str, APLTextLayout aPLTextLayout) {
        this.mLayoutCache.put(str, aPLTextLayout);
    }

    public void putTextWidth(String str, int i) {
        this.mMeasuredTextWidths.put(str, Integer.valueOf(i));
    }
}
