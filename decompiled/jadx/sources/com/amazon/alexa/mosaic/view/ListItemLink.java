package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ListItemLink extends ListItem {
    private static final String TAG = "ListItemLink";
    protected String linkText;
    protected TextView linkTextView;

    public ListItemLink(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListItemLink, 0, 0);
        try {
            this.linkText = obtainStyledAttributes.getString(R.styleable.ListItemLink_linkText);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.mosaic_list_item_link, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.amazon.alexa.mosaic.view.ListItem, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLinkClickable(this.clickable);
        setLinkText(this.linkText);
        ViewUtils.setMaxLines(this, R.id.primaryText, this.primaryTextMaxLines);
        ViewUtils.setMaxLines(this, R.id.secondaryText, this.secondaryTextMaxLines);
    }

    public void setLinkClickable(boolean z) {
        this.clickable = z;
        TextView textView = (TextView) findViewById(R.id.linkText);
        this.linkTextView = textView;
        if (textView == null) {
            LogUtils.e(TAG, "Null link TextView");
        } else if (z) {
            textView.setTextColor(ThemeUtil.getColorFromAttribute(getContext(), R.attr.mosaicAction10));
        } else {
            textView.setTextColor(ThemeUtil.getColorFromAttribute(getContext(), R.attr.mosaicNeutral10));
        }
    }

    public void setLinkText(CharSequence charSequence) {
        String str = TAG;
        LogUtils.d(str, "Setting link text to: \"" + ((Object) charSequence) + DeviceConfigConstants.DOUBLE_QUOTE);
        if (charSequence != null) {
            setLinkText(charSequence.toString());
        } else {
            LogUtils.e(str, "Cannot update link text with null CharSequence");
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(R.id.linkText);
        this.linkTextView = textView;
        if (textView == null || onClickListener == null) {
            LogUtils.e(TAG, "linkTextView is null");
            setLinkClickable(false);
        } else {
            setLinkClickable(true);
            this.linkTextView.setOnClickListener(onClickListener);
        }
    }

    public ListItemLink(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListItemLink(Context context) {
        this(context, null);
    }

    public void setLinkText(String str) {
        TextView textView = (TextView) findViewById(R.id.linkText);
        this.linkTextView = textView;
        if (textView == null) {
            LogUtils.e(TAG, "linkTextView is null");
        } else if (str != null) {
            textView.setText(str);
            this.linkTextView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
