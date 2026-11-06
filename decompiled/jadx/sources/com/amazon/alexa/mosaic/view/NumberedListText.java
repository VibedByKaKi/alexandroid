package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.amazon.alexa.biloba.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class NumberedListText extends LinearLayout {
    private static final String TAG = "NumberedListText";
    private final String numberText;
    private final String primaryText;

    public NumberedListText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NumberedListText, 0, 0);
        try {
            this.primaryText = obtainStyledAttributes.getString(R.styleable.NumberedListText_primaryText);
            this.numberText = obtainStyledAttributes.getString(R.styleable.NumberedListText_numberText);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.mosaic_numbered_list_text, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPrimaryText(this.primaryText);
        setNumberText(this.numberText);
    }

    public void setNumberText(String str) {
        ViewUtils.updateTextView(this, R.id.numberText, str);
    }

    public void setPrimaryText(String str) {
        ViewUtils.updateTextView(this, R.id.primaryText, str);
    }

    public void setPrimaryText(SpannableStringBuilder spannableStringBuilder) {
        ViewUtils.updateTextView(this, R.id.primaryText, spannableStringBuilder);
    }

    public NumberedListText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberedListText(Context context) {
        this(context, null);
    }
}
