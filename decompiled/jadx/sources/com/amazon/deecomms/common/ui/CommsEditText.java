package com.amazon.deecomms.common.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsEditText extends EditText {
    public CommsEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface typefaceFromAttributes = FontHelper.getTypefaceFromAttributes(context, attributeSet);
        if (typefaceFromAttributes != null) {
            setTypeface(typefaceFromAttributes);
        }
    }
}
