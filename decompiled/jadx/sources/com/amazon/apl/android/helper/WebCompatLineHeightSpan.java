package com.amazon.apl.android.helper;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WebCompatLineHeightSpan implements LineHeightSpan {
    private final float height;

    public WebCompatLineHeightSpan(float f) {
        this.height = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int ceil = (int) Math.ceil(this.height);
        double d = (ceil - ((-r8) + fontMetricsInt.descent)) / 2.0f;
        fontMetricsInt.ascent = fontMetricsInt.ascent - ((int) Math.ceil(d));
        fontMetricsInt.descent += (int) Math.floor(d);
        if (i == 0) {
            fontMetricsInt.top = fontMetricsInt.ascent;
        }
        if (i2 == charSequence.length()) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
    }
}
