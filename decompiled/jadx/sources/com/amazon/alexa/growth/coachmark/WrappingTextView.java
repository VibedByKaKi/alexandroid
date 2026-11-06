package com.amazon.alexa.growth.coachmark;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WrappingTextView extends AppCompatTextView {
    public WrappingTextView(Context context) {
        super(context);
    }

    private float getMaxLineWidth(Layout layout) {
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            if (layout.getLineWidth(i) > f) {
                f = layout.getLineWidth(i);
            }
        }
        return f;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Layout layout;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824 || (layout = getLayout()) == null) {
            return;
        }
        int compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(getMaxLineWidth(layout)));
        if (compoundPaddingRight < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(compoundPaddingRight, Integer.MIN_VALUE), i2);
        }
    }
}
