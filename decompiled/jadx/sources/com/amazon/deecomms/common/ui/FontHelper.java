package com.amazon.deecomms.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.deecomms.R;
import com.amazon.deecomms.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class FontHelper {
    private static final Map<String, Font> fontNameMap;

    static {
        HashMap hashMap = new HashMap();
        fontNameMap = hashMap;
        hashMap.put("fonts/AmazonEmber/Amazon_Ember_Bd.ttf", Font.AMAZON_EMBER_BOLD);
        hashMap.put("fonts/AmazonEmber/Amazon-Ember-Medium.ttf", Font.AMAZON_EMBER_MEDIUM);
        hashMap.put(Constants.AMAZON_EMBER_REGULAR_FONT, Font.AMAZON_EMBER_REGULAR);
        hashMap.put("fonts/AmazonEmber/Amazon_Ember_Lt.ttf", Font.AMAZON_EMBER_LIGHT);
    }

    private FontHelper() {
    }

    public static Typeface getTypefaceFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CommsTextView);
        String string = obtainStyledAttributes.getString(R.styleable.CommsTextView_typeface);
        obtainStyledAttributes.recycle();
        if (string == null) {
            return null;
        }
        Map<String, Font> map = fontNameMap;
        if (map.containsKey(string)) {
            return FontResolver.getFont(context, map.get(string));
        }
        return null;
    }
}
