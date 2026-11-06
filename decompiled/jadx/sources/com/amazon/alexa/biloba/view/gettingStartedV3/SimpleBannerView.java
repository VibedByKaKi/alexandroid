package com.amazon.alexa.biloba.view.gettingStartedV3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.mosaic.view.ViewUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SimpleBannerView extends LinearLayout {
    private static final int NOT_SET = -1;
    private static final String TAG = "SimpleBannerView";
    private int backgroundColor;
    private String linkText;
    private String primaryText;

    public SimpleBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backgroundColor = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SimpleBannerView, 0, 0);
        for (int i2 = 0; i2 < obtainStyledAttributes.length(); i2++) {
            try {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.SimpleBannerView_primaryText) {
                    this.primaryText = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.SimpleBannerView_linkText) {
                    this.linkText = obtainStyledAttributes.getString(index);
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), R.layout.simple_banner, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPrimaryText(this.primaryText);
        setLinkText(this.linkText);
        setBackgroundColor(this.backgroundColor);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.backgroundColor != -1) {
            ViewUtils.updateBackgroundColor(this, R.id.notice_banner_root, i);
        }
    }

    public void setLinkText(String str) {
        ViewUtils.updateTextView(this, R.id.linkText, str);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(R.id.linkText);
        if (textView == null || onClickListener == null) {
            return;
        }
        LogUtils.i(TAG, "Setting OnClickListener for linkText");
        textView.setOnClickListener(onClickListener);
    }

    public void setPrimaryText(String str) {
        ViewUtils.updateTextView(this, R.id.primaryText, str);
    }

    public SimpleBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleBannerView(Context context) {
        this(context, null);
    }
}
