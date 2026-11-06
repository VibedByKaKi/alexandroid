package com.amazon.alexa.voice.ui.onedesign.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.alexa.voice.ui.onedesign.util.ViewUtils;
import com.amazon.alexa.vox.ui.onedesign.R;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TextViewWithLink extends AppCompatTextView {
    private int clickableSubTextColor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnEmbeddedLinkClickListener {
        void onEmbeddedLinkClick();
    }

    public TextViewWithLink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextViewWithLink);
        this.clickableSubTextColor = obtainStyledAttributes.getColor(R.styleable.TextViewWithLink_clickableSubTextColor, 0);
        obtainStyledAttributes.recycle();
    }

    public void setTextWithLink(CharSequence charSequence, CharSequence charSequence2, final OnEmbeddedLinkClickListener onEmbeddedLinkClickListener) {
        if (TextUtils.isEmpty(charSequence2)) {
            ViewUtils.setTextOrRemove(this, charSequence);
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            Single$$ExternalSyntheticBUOutline0.m$3("the content should not be null when link text is not empty.");
            return;
        }
        if (onEmbeddedLinkClickListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("the linkTextClickListener should not be nullwhen link text is not empty.");
            return;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.amazon.alexa.voice.ui.onedesign.widget.TextViewWithLink.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                onEmbeddedLinkClickListener.onEmbeddedLinkClick();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(TextViewWithLink.this.clickableSubTextColor);
            }
        };
        int indexOf = charSequence.toString().indexOf(charSequence2.toString());
        spannableString.setSpan(clickableSpan, indexOf, charSequence2.length() + indexOf, 33);
        setText(spannableString);
        setVisibility(0);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public TextViewWithLink(Context context) {
        super(context);
    }
}
