package com.amazon.dee.app.databinding;

import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class FontAdapter {
    private static Map<String, Font> fontNameMap;

    static {
        HashMap hashMap = new HashMap();
        fontNameMap = hashMap;
        Font font = Font.APP_TEXT_REGULAR;
        hashMap.put("app_text_regular", font);
        Map<String, Font> map = fontNameMap;
        Font font2 = Font.APP_TEXT_MEDIUM;
        map.put("app_text_medium", font2);
        Map<String, Font> map2 = fontNameMap;
        Font font3 = Font.APP_TEXT_BOLD;
        map2.put("app_text_bold", font3);
        fontNameMap.put("ember-regular", font);
        fontNameMap.put("ember-medium", font2);
        fontNameMap.put("ember-bold", font3);
    }

    private FontAdapter() {
    }

    @BindingAdapter({"font"})
    public static void setFont(TextView textView, String str) {
        textView.setTypeface(FontResolver.getFont(textView.getContext(), fontNameMap.get(str)));
    }
}
