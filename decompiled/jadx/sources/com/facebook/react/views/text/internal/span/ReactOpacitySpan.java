package com.facebook.react.views.text.internal.span;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "opacity", "", "<init>", "(F)V", "getOpacity", "()F", "updateDrawState", "", "paint", "Landroid/text/TextPaint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactOpacitySpan extends CharacterStyle implements UpdateAppearance, ReactSpan {
    private final float opacity;

    public ReactOpacitySpan(float f) {
        this.opacity = f;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        paint.getClass();
        paint.setAlpha(MathKt.roundToInt(Color.alpha(paint.getColor()) * this.opacity));
        if (paint.bgColor != 0) {
            paint.bgColor = Color.argb(MathKt.roundToInt(Color.alpha(r0) * this.opacity), Color.red(paint.bgColor), Color.green(paint.bgColor), Color.blue(paint.bgColor));
        }
    }
}
