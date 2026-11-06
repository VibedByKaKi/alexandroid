package com.amazon.alexa.mosaic.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ListItemToggleButton extends ListItem {
    private static final String TAG = "ListItemToggleButton";
    protected String checkedText;
    boolean clickable;
    protected boolean isChecked;
    protected int toggleBackground;
    protected ToggleButton toggleButton;
    protected String toggleButtonText;
    protected int toggleHorizontalPadding;
    protected String uncheckedText;

    public ListItemToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListItemToggleButton, 0, 0);
        try {
            this.toggleButtonText = obtainStyledAttributes.getString(R.styleable.ListItemToggleButton_toggleButtonText);
            this.isChecked = obtainStyledAttributes.getBoolean(R.styleable.ListItemToggleButton_isChecked, false);
            this.checkedText = obtainStyledAttributes.getString(R.styleable.ListItemToggleButton_checkedText);
            this.uncheckedText = obtainStyledAttributes.getString(R.styleable.ListItemToggleButton_uncheckedText);
            this.toggleBackground = obtainStyledAttributes.getResourceId(R.styleable.ListItemToggleButton_toggleBackground, -1);
            this.toggleHorizontalPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ListItemToggleButton_toggleHorizontalPadding, 0);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.mosaic_list_item_toggle, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setWidthToMaxText(String str, String str2, int i) {
        TextPaint paint = this.toggleButton.getPaint();
        this.toggleButton.getLayoutParams().width = ((int) Math.max(paint.measureText(str), paint.measureText(str2))) + ((int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics()));
    }

    public boolean isChecked() {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton != null) {
            return toggleButton.isChecked();
        }
        LogUtils.d(TAG, "cannot return checked value of null toggleButton");
        return false;
    }

    @Override // com.amazon.alexa.mosaic.view.ListItem, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setClickable(this.clickable);
        setUncheckedText(this.uncheckedText);
        setCheckedText(this.checkedText);
        setWidthToMaxText(this.checkedText, this.uncheckedText, this.toggleHorizontalPadding);
        setIsChecked(this.isChecked);
        setToggleBackground(this.toggleBackground);
    }

    public void setCheckedText(String str) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton == null) {
            LogUtils.e(TAG, "toggleButton is null");
        } else if (str == null) {
            toggleButton.setVisibility(8);
        } else {
            toggleButton.setTextOn(str);
            this.toggleButton.setVisibility(0);
        }
    }

    public void setIsAlertToggleEnabled(boolean z) {
        setClickable(z);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        toggleButton.setEnabled(z);
    }

    public void setIsChecked(boolean z) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton == null) {
            LogUtils.d(TAG, "cannot set checked value of null toggleButton");
        } else {
            toggleButton.setChecked(z);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton == null) {
            LogUtils.d(TAG, "cannot add OnCheckedChangeListener to null inputSwitch");
        } else {
            toggleButton.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setClickable(true);
    }

    public void setToggleBackground(int i) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton == null || this.checkedText == null || i == -1) {
            LogUtils.e(TAG, "Cannot update toggle background");
        } else {
            toggleButton.setBackgroundResource(i);
        }
    }

    public void setToggleButtonText(CharSequence charSequence) {
        String str = TAG;
        LogUtils.d(str, "Setting link text to: \"" + ((Object) charSequence) + DeviceConfigConstants.DOUBLE_QUOTE);
        if (charSequence != null) {
            setToggleButtonText(charSequence.toString());
        } else {
            LogUtils.e(str, "Cannot update link text with null CharSequence");
        }
    }

    public void setUncheckedText(String str) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton == null) {
            LogUtils.e(TAG, "toggleButton is null");
        } else if (str == null) {
            toggleButton.setVisibility(8);
        } else {
            toggleButton.setTextOff(str);
            this.toggleButton.setVisibility(0);
        }
    }

    public void setToggleButtonText(String str) {
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle);
        this.toggleButton = toggleButton;
        if (toggleButton == null) {
            LogUtils.e(TAG, "toggleButton is null");
        } else if (str != null) {
            toggleButton.setText(str);
            this.toggleButton.setVisibility(0);
        } else {
            toggleButton.setVisibility(8);
        }
    }

    public ListItemToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListItemToggleButton(Context context) {
        this(context, null);
    }
}
