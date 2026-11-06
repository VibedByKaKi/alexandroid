package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.LogUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ListItemIconLink extends ListItem {
    private static final String TAG = "ListItemIconLink";
    protected int iconLink;
    protected AppCompatImageView iconLinkImageView;
    protected ColorStateList iconLinkTint;

    public ListItemIconLink(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListItemIconLink, 0, 0);
        try {
            this.iconLink = obtainStyledAttributes.getResourceId(R.styleable.ListItemIconLink_iconLink, -1);
            this.iconLinkTint = obtainStyledAttributes.getColorStateList(R.styleable.ListItemIconLink_iconLinkTint);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.mosaic_list_item_icon_link, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void updateIconLink() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.iconLink);
        this.iconLinkImageView = appCompatImageView;
        if (appCompatImageView == null) {
            LogUtils.e(TAG, "IconLinkImageView is null");
        } else if (this.iconLink == -1 || appCompatImageView.isShown()) {
            this.iconLinkImageView.setVisibility(8);
        } else {
            this.iconLinkImageView.setImageResource(this.iconLink);
            this.iconLinkImageView.setVisibility(0);
        }
    }

    @Override // com.amazon.alexa.mosaic.view.ListItem, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateIconLink();
        setIconLinkTint(this.iconLinkTint);
        ViewUtils.setMaxLines(this, R.id.primaryText, this.primaryTextMaxLines);
        ViewUtils.setMaxLines(this, R.id.secondaryText, this.secondaryTextMaxLines);
    }

    public void setIconLinkTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            ViewUtils.updateImageColor(this, R.id.iconLink, colorStateList);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.iconLink);
        this.iconLinkImageView = appCompatImageView;
        if (appCompatImageView == null || onClickListener == null) {
            return;
        }
        LogUtils.i(TAG, "Setting OnClickListener for rightIcon");
        this.iconLinkImageView.setOnClickListener(onClickListener);
    }

    public ListItemIconLink(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListItemIconLink(Context context) {
        this(context, null);
    }
}
