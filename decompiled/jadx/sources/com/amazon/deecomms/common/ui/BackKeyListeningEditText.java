package com.amazon.deecomms.common.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BackKeyListeningEditText extends EditText {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, BackKeyListeningEditText.class);

    public BackKeyListeningEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initAttributes(context, attributeSet);
    }

    private void initAttributes(Context context, AttributeSet attributeSet) {
        Typeface typefaceFromAttributes = FontHelper.getTypefaceFromAttributes(context, attributeSet);
        if (typefaceFromAttributes != null) {
            setTypeface(typefaceFromAttributes);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i, keyEvent);
        }
        dispatchKeyEvent(keyEvent);
        return false;
    }

    public BackKeyListeningEditText(Context context) {
        super(context);
    }

    public BackKeyListeningEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initAttributes(context, attributeSet);
    }
}
