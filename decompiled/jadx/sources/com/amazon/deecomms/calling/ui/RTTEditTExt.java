package com.amazon.deecomms.calling.ui;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.amazon.deecomms.common.ui.CommsEditText;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTTEditTExt extends CommsEditText {
    public RTTEditTExt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (text == null || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }
}
