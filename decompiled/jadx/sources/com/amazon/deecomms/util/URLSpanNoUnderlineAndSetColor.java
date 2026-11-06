package com.amazon.deecomms.util;

import android.content.Context;
import android.text.TextPaint;
import androidx.core.content.ContextCompat;
import com.amazon.deecomms.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class URLSpanNoUnderlineAndSetColor extends URLSpanNoUnderline {
    private final boolean isThemedUIEnabled;
    private final Context mContext;

    public URLSpanNoUnderlineAndSetColor(Context context, String str, boolean z) {
        super(str);
        this.mContext = context;
        this.isThemedUIEnabled = z;
    }

    @Override // com.amazon.deecomms.util.URLSpanNoUnderline, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        boolean z = this.isThemedUIEnabled;
        Context context = this.mContext;
        if (z) {
            textPaint.setColor(ContextCompat.getColor(context, R.color.fiesta_color_accent));
        } else {
            textPaint.setColor(ContextCompat.getColor(context, R.color.alexaBlue));
        }
    }
}
