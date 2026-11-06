package com.amazon.alexa.handsfree.uservoicerecognition.ui.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatButton;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BoldTextButton extends AppCompatButton {
    private static final String TAG = "BoldTextButton";

    @VisibleForTesting
    static Typeface defaultTypeface;

    public BoldTextButton(Context context) {
        super(context);
        Log.d(TAG, "Inside one arg constructor, so not setting any fonts");
    }

    private void setTypeFace(Context context, Typeface typeface) {
        if (typeface == null) {
            typeface = FontResolver.getFont(context, Font.AMAZON_EMBER_DISPLAY_BOLD);
        }
        setTypeface(typeface);
    }

    public BoldTextButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, defaultTypeface);
    }

    public BoldTextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, defaultTypeface);
    }

    @VisibleForTesting
    public BoldTextButton(Context context, AttributeSet attributeSet, Typeface typeface) {
        super(context, attributeSet);
        setTypeFace(context, typeface);
    }
}
