package com.amazon.deecomms.calling.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.amazon.deecomms.R;
import com.amazon.deecomms.common.ui.CommsTextView;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda3;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DialPadButton extends FrameLayout {
    private DialPad dialPad;
    private String letters;

    @Inject
    CapabilitiesManager mCapabilitiesManager;
    private String number;

    public DialPadButton(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        this.letters = "";
        this.number = "";
        if (!isInEditMode()) {
            CommsDaggerWrapper.getComponent().inject(this);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialPadButton);
        String string = obtainStyledAttributes.getString(R.styleable.DialPadButton_letters);
        String string2 = obtainStyledAttributes.getString(R.styleable.DialPadButton_numberName);
        if (string != null) {
            setLetters(string.toString());
        }
        if (string2 != null) {
            setNumber(string2.toString());
        }
        obtainStyledAttributes.recycle();
        inflateLayout(context);
    }

    private void inflateLayout(Context context) {
        if (isInEditMode() || !this.mCapabilitiesManager.isThemedUIEnabled()) {
            View.inflate(context, R.layout.dial_pad_button, this);
        } else {
            View.inflate(context, R.layout.fiesta_dial_pad_button, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAttachedToWindow$0(View view) {
        DialPad dialPad = this.dialPad;
        if (dialPad != null) {
            dialPad.dial(this.number);
        }
    }

    public String getLetters() {
        return this.letters;
    }

    public String getNumber() {
        return this.number;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((CommsTextView) findViewById(R.id.dial_pad_button_letters)).setText(this.letters);
        ((CommsTextView) findViewById(R.id.dial_pad_button_num)).setText(this.number);
        setOnClickListener(new SearchBarView$$ExternalSyntheticLambda3(this, 5));
    }

    public void setDialPad(DialPad dialPad) {
        this.dialPad = dialPad;
    }

    public void setLetters(String str) {
        this.letters = str;
        if (isAttachedToWindow()) {
            ((CommsTextView) findViewById(R.id.dial_pad_button_letters)).setText(str);
        }
    }

    public void setNumber(String str) {
        this.number = str;
        if (isAttachedToWindow()) {
            ((CommsTextView) findViewById(R.id.dial_pad_button_num)).setText(str);
        }
    }

    public DialPadButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialPadButton(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public DialPadButton(@NonNull Context context) {
        this(context, null);
    }
}
