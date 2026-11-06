package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.alexa.biloba.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class RoundImageButtonView extends LinearLayout {
    private final Drawable iconSrc;
    private final String primaryText;

    public RoundImageButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundImageButtonView, 0, 0);
        try {
            this.iconSrc = obtainStyledAttributes.getDrawable(R.styleable.RoundImageButtonView_iconSrc);
            this.primaryText = obtainStyledAttributes.getString(R.styleable.RoundImageButtonView_primaryText);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.mosaic_round_image_button, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setIconSrc(this.iconSrc);
        setPrimaryText(this.primaryText);
        setButtonContentDescription(this.primaryText);
    }

    public void setButtonContentDescription(String str) {
        ViewUtils.updateViewContentDescription(this, R.id.rounded_icon, str);
    }

    public void setIconSrc(Drawable drawable) {
        ViewUtils.updateImageView(this, R.id.rounded_icon, drawable);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(R.id.rounded_icon_text);
        ImageButton imageButton = (ImageButton) findViewById(R.id.rounded_icon);
        if (textView == null || imageButton == null || onClickListener == null) {
            return;
        }
        textView.setOnClickListener(onClickListener);
        imageButton.setOnClickListener(onClickListener);
    }

    public void setPrimaryText(String str) {
        ViewUtils.updateTextView(this, R.id.rounded_icon_text, str);
    }

    public RoundImageButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageButtonView(Context context) {
        this(context, null);
    }
}
