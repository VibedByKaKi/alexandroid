package com.amazon.comms.calling.presentation.ui.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.comms.calling.R;
import com.amazon.deecomms.common.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/presentation/ui/utils/FontHelper;", "", "<init>", "()V", "fontNameMap", "", "", "Lcom/amazon/alexa/font/Font;", "getTypefaceFromAttributes", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "attributes", "Landroid/util/AttributeSet;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class FontHelper {

    @NotNull
    public static final FontHelper INSTANCE = new FontHelper();

    @NotNull
    private static final Map<String, Font> fontNameMap;

    static {
        HashMap hashMap = new HashMap();
        fontNameMap = hashMap;
        hashMap.put("fonts/AmazonEmber/Amazon_Ember_Bd.ttf", Font.APP_TEXT_BOLD);
        hashMap.put("fonts/AmazonEmber/Amazon-Ember-Medium.ttf", Font.APP_TEXT_MEDIUM);
        hashMap.put(Constants.AMAZON_EMBER_REGULAR_FONT, Font.APP_TEXT_REGULAR);
        hashMap.put("fonts/AmazonEmber/Amazon_Ember_Lt.ttf", Font.APP_TEXT_LIGHT);
    }

    private FontHelper() {
    }

    @Nullable
    public final Typeface getTypefaceFromAttributes(@NotNull Context context, @Nullable AttributeSet attributes) {
        context.getClass();
        if (attributes == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributes, R.styleable.CommsTextView);
        obtainStyledAttributes.getClass();
        String string = obtainStyledAttributes.getString(R.styleable.CommsTextView_typeface);
        obtainStyledAttributes.recycle();
        if (string == null) {
            return null;
        }
        Map<String, Font> map = fontNameMap;
        if (!map.containsKey(string)) {
            return null;
        }
        Font font = map.get(string);
        font.getClass();
        return FontResolver.getFont(context, font);
    }
}
