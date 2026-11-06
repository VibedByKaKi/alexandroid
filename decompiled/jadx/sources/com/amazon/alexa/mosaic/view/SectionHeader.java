package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.LogUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class SectionHeader extends RelativeLayout {
    private static final String TAG = "SectionHeader";
    private final String dividerText;
    private final boolean showBackground;

    public SectionHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SectionHeader, 0, 0);
        try {
            this.dividerText = obtainStyledAttributes.getString(R.styleable.SectionHeader_text);
            this.showBackground = obtainStyledAttributes.getBoolean(R.styleable.SectionHeader_showBackground, true);
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void init() {
        View.inflate(getContext(), R.layout.mosaic_list_divider, this);
        ((TextView) findViewById(R.id.dividerTextView)).setText(this.dividerText);
        if (this.showBackground) {
            LogUtils.v(TAG, "setting the background color to match the theme");
        } else {
            LogUtils.v(TAG, "setting the background color to be transparent");
            setBackground(new ColorDrawable(getContext().getResources().getColor(R.color.transparent)));
        }
    }

    public void setText(String str) {
        ((TextView) findViewById(R.id.dividerTextView)).setText(str);
    }

    public SectionHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionHeader(Context context) {
        this(context, null);
    }
}
