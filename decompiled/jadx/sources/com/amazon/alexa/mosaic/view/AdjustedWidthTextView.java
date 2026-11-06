package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AdjustedWidthTextView extends AppCompatTextView {
    public AdjustedWidthTextView(Context context) {
        this(context, null);
    }

    private int getMaxLineWidth(Layout layout) {
        float f = 0.0f;
        for (int i = 0; i < layout.getLineCount(); i++) {
            float lineWidth = layout.getLineWidth(i);
            if (lineWidth > f) {
                f = lineWidth;
            }
        }
        return (int) Math.ceil(f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Layout layout;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && (layout = getLayout()) != null) {
            i = View.MeasureSpec.makeMeasureSpec(getCompoundPaddingRight() + getCompoundPaddingLeft() + getMaxLineWidth(layout), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public AdjustedWidthTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdjustedWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
