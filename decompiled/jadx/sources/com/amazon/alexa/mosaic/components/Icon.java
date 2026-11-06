package com.amazon.alexa.mosaic.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class Icon extends FrameLayout {
    private TextView iconOverlayTextView;
    private TextView iconTextView;

    public Icon(Context context) {
        super(context);
        init(context, null);
    }

    private void setTextColor(int i) {
        this.iconTextView.setTextColor(i);
        this.iconOverlayTextView.setTextColor(i);
    }

    private void setTypeface(Typeface typeface) {
        this.iconTextView.setTypeface(typeface);
        this.iconOverlayTextView.setTypeface(typeface);
    }

    @VisibleForTesting
    public void init(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.mosaic_icon_font, this);
        this.iconTextView = (TextView) findViewById(R.id.icon_text);
        this.iconOverlayTextView = (TextView) findViewById(R.id.icon_overlay_text);
        setTypeface(ResourcesCompat.getFont(context, R.font.mosaic_icons));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Icon);
            setTextSize(obtainStyledAttributes.getInt(R.styleable.Icon_size, 0));
            setTextColor(obtainStyledAttributes.getColor(R.styleable.Icon_tintColor, 0));
            setBackgroundColor(obtainStyledAttributes.getColor(R.styleable.Icon_iconBackground, 0));
            setIconText(obtainStyledAttributes.getString(R.styleable.Icon_source), context.getResources().getConfiguration().getLayoutDirection() != 0);
            setImportantForAccessibility(4);
            setFocusable(false);
            obtainStyledAttributes.recycle();
        }
    }

    public void render(String str, int i, int i2) {
        boolean z = getContext().getResources().getConfiguration().getLayoutDirection() != 0;
        setTextSize(i);
        if (i2 != 0) {
            setTextColor(i2);
        }
        setIconText(str, z);
        setImportantForAccessibility(4);
        setFocusable(false);
    }

    public void setIconText(String str, boolean z) {
        this.iconTextView.setText(str + (z ? "#rtl" : ""));
        this.iconOverlayTextView.setText(str + "_" + (z ? "#rtl" : ""));
    }

    public void setTextSize(int i) {
        float dimension = getResources().getDimension(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.dimen.mosaic_sizes_icon_small_xx : R.dimen.mosaic_sizes_icon_large_x : R.dimen.mosaic_sizes_icon_large : R.dimen.mosaic_sizes_icon_medium : R.dimen.mosaic_sizes_icon_small : R.dimen.mosaic_sizes_icon_small_x : R.dimen.mosaic_sizes_icon_small_xx) / getResources().getDisplayMetrics().density;
        this.iconTextView.setTextSize(1, dimension);
        this.iconOverlayTextView.setTextSize(1, dimension);
    }

    public Icon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public Icon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
