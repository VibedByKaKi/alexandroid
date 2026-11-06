package com.amazon.alexa.handsfree.ui.views;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.mosaic.themes.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class URLTextView extends TextView {
    public URLTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getText().length() > 0) {
            setupView();
        }
    }

    private void setupView() {
        setLinkTextColor(ThemeUtil.getColorFromAttribute(getContext(), R.attr.mosaicAction10));
        setMovementMethod(LinkMovementMethod.getInstance());
        Spannable spannable = (Spannable) getText();
        int i = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL(), i), spanStart, spanEnd, 0);
        }
        setText(spannable);
    }

    public void setURLText(int i) {
        setText(i);
        setupView();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class URLSpanNoUnderline extends URLSpan {
        public /* synthetic */ URLSpanNoUnderline(String str, int i) {
            this(str);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        private URLSpanNoUnderline(@NonNull String str) {
            super(str);
        }
    }

    public URLTextView(@NonNull Context context) {
        super(context);
    }
}
