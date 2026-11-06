package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.AndroidUtils;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.imageloader.api.ImageLoader;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.bumptech.glide.request.RequestOptions;
import java.net.URI;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public abstract class ListItem extends ConstraintLayout {
    protected static final int RESOURCE_NOT_FOUND = -1;
    private static final String TAG = "ListItem";
    private static final int iconSize = 72;
    protected boolean active;
    protected boolean clickable;
    protected String iconSrc;
    protected ColorStateList iconTint;
    private ImageLoader imageLoader;
    protected int leftIcon;
    protected AppCompatImageView leftIconImageView;
    protected String primaryText;
    protected int primaryTextMaxLines;
    protected TextView primaryTextView;
    protected String secondaryText;
    protected ColorStateList secondaryTextColor;
    protected int secondaryTextMaxLines;
    protected TextView secondaryTextView;

    public ListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListItem, 0, 0);
        try {
            this.clickable = obtainStyledAttributes.getBoolean(R.styleable.ListItem_clickable, false);
            this.primaryText = obtainStyledAttributes.getString(R.styleable.ListItem_primaryText);
            this.secondaryText = obtainStyledAttributes.getString(R.styleable.ListItem_secondaryText);
            this.iconSrc = obtainStyledAttributes.getString(R.styleable.ListItem_iconSrc);
            this.leftIcon = obtainStyledAttributes.getResourceId(R.styleable.ListItem_leftIcon, -1);
            this.active = obtainStyledAttributes.getBoolean(R.styleable.ListItem_active, false);
            this.primaryTextMaxLines = obtainStyledAttributes.getInt(R.styleable.ListItem_primaryTextMaxLines, 2);
            this.secondaryTextMaxLines = obtainStyledAttributes.getInt(R.styleable.ListItem_secondaryTextMaxLines, 1);
            this.secondaryTextColor = obtainStyledAttributes.getColorStateList(R.styleable.ListItem_secondaryTextColor);
            this.iconTint = obtainStyledAttributes.getColorStateList(R.styleable.ListItem_iconTint);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void adjustTextBoxPadding() {
        this.primaryTextView = (TextView) findViewById(R.id.primaryText);
        TextView textView = (TextView) findViewById(R.id.secondaryText);
        this.secondaryTextView = textView;
        TextView textView2 = this.primaryTextView;
        if (textView2 == null || textView == null) {
            LogUtils.e(TAG, "failed to adjust margins for null TextViews");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.secondaryTextView.getLayoutParams();
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_margin_lr);
        if (this.leftIcon != -1) {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_twoline_margin_between);
            layoutParams.setMargins(0, resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_twoline_margin_top), dimensionPixelSize, 0);
            layoutParams2.setMargins(0, dimensionPixelSize2, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_with_image_twoline_margin_bottom));
            constraintSet.connect(this.primaryTextView.getId(), 3, 0, 3);
            constraintSet.clear(this.primaryTextView.getId(), 4);
            constraintSet.connect(this.secondaryTextView.getId(), 3, this.primaryTextView.getId(), 4);
        } else if (this.secondaryText == null) {
            LogUtils.v(TAG, "Adjusting margins for primary text only");
            layoutParams.setMargins(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_oneline_margin_top), dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_oneline_margin_bottom));
            constraintSet.connect(this.primaryTextView.getId(), 3, 0, 3);
            constraintSet.connect(this.primaryTextView.getId(), 4, 0, 4);
        } else {
            LogUtils.v(TAG, "Adjusting margins for primary and secondary text");
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_twoline_margin_between);
            layoutParams.setMargins(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_twoline_margin_top), dimensionPixelSize, 0);
            layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.mosaic_list_item_textbox_twoline_margin_bottom));
            constraintSet.connect(this.primaryTextView.getId(), 3, 0, 3);
            constraintSet.clear(this.primaryTextView.getId(), 4);
            constraintSet.connect(this.secondaryTextView.getId(), 3, this.primaryTextView.getId(), 4);
        }
        this.primaryTextView.setLayoutParams(layoutParams);
        this.secondaryTextView.setLayoutParams(layoutParams2);
        constraintSet.applyTo(this);
        invalidate();
    }

    private void updateLeftIcon() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.leftIcon);
        this.leftIconImageView = appCompatImageView;
        if (appCompatImageView == null) {
            LogUtils.e(TAG, "leftIconImageView is null");
        } else {
            if (this.leftIcon == -1 || appCompatImageView.isShown()) {
                return;
            }
            this.leftIconImageView.setImageResource(this.leftIcon);
            this.leftIconImageView.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setClickable(this.clickable);
        setFocusable(this.clickable);
        updateLeftIcon();
        setIconSrc(this.iconSrc);
        setPrimaryText(this.primaryText);
        setSecondaryText(this.secondaryText);
        setSecondaryTextColor();
        setActive(this.active);
        adjustTextBoxPadding();
    }

    public void setActive(boolean z) {
        if (z) {
            ViewUtils.updateTextColor(this, R.id.primaryText, ThemeUtil.getColorFromAttribute(getContext(), R.attr.mosaicAction10));
        } else {
            ViewUtils.updateTextColor(this, R.id.primaryText, ThemeUtil.getColorFromAttribute(getContext(), R.attr.mosaicNeutral10));
        }
    }

    public void setIconSrc(String str) {
        Object obj;
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.leftIcon);
        this.leftIconImageView = appCompatImageView;
        if (appCompatImageView == null) {
            LogUtils.e(TAG, "leftIconImageView is null");
            return;
        }
        if (str != null) {
            appCompatImageView.setVisibility(0);
            ColorStateList colorStateList = this.iconTint;
            if (colorStateList != null) {
                this.leftIconImageView.setImageTintList(colorStateList);
            }
            if (this.imageLoader == null) {
                obj = ComponentRegistry.getInstance().get(ImageLoader.class).get();
                this.imageLoader = (ImageLoader) obj;
            }
            this.imageLoader.loadInto(URI.create(str), this.leftIconImageView, new RequestOptions().override(72));
        }
    }

    public void setPrimaryText(String str) {
        this.primaryText = str;
        ViewUtils.updateTextView(this, R.id.primaryText, str);
    }

    public void setSecondaryText(String str) {
        this.secondaryText = str;
        ViewUtils.updateTextView(this, R.id.secondaryText, str);
        if (AndroidUtils.isEmpty(this.secondaryText)) {
            return;
        }
        adjustTextBoxPadding();
    }

    public void setSecondaryTextColor() {
        ColorStateList colorStateList = this.secondaryTextColor;
        if (colorStateList != null) {
            ViewUtils.updateTextColor(this, R.id.secondaryText, colorStateList);
        }
    }

    public void setViewOnClick(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public ListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListItem(Context context) {
        this(context, null);
    }
}
