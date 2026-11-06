package com.amazon.alexa.reactnative;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.font.R;
import com.amazon.alexa.reactnative.api.RNFontMapping;
import com.facebook.react.views.text.ReactFontManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ReactNativeFontMapping implements RNFontMapping {
    private static final Map<String, Integer> rnUnmodifiableFontMap;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("amazon-ember-display-bold", Integer.valueOf(R.font.app_display_bold));
        hashMap.put("amazon-ember-display-light", Integer.valueOf(R.font.app_display_light));
        hashMap.put("amazon-ember-display-medium", Integer.valueOf(R.font.app_display_medium));
        hashMap.put("amazon-ember-display-regular", Integer.valueOf(R.font.app_display_regular));
        hashMap.put("bookerly-bold", Integer.valueOf(R.font.app_text_bold));
        hashMap.put("bookerly-bold_italic", Integer.valueOf(R.font.app_text_bold_oblique));
        hashMap.put("bookerly-light", Integer.valueOf(R.font.app_text_light));
        hashMap.put("bookerly-light_italic", Integer.valueOf(R.font.app_text_light_oblique));
        hashMap.put("bookerly-regular", Integer.valueOf(R.font.app_text_regular));
        hashMap.put("bookerly-regular_italic", Integer.valueOf(R.font.app_text_regular_oblique));
        hashMap.put("ember-bold", Integer.valueOf(R.font.app_text_bold));
        hashMap.put("ember-bold_italic", Integer.valueOf(R.font.app_text_bold_oblique));
        hashMap.put("ember-bold-v2", Integer.valueOf(R.font.app_text_bold));
        hashMap.put("ember-light", Integer.valueOf(R.font.app_text_light));
        hashMap.put("ember-light_italic", Integer.valueOf(R.font.app_text_light_oblique));
        hashMap.put("ember-medium", Integer.valueOf(R.font.app_text_medium));
        hashMap.put("ember-medium_italic", Integer.valueOf(R.font.app_text_medium_oblique));
        hashMap.put("ember-medium-v2", Integer.valueOf(R.font.app_text_medium));
        hashMap.put("ember-regular", Integer.valueOf(R.font.app_text_regular));
        hashMap.put("ember-regular_italic", Integer.valueOf(R.font.app_text_regular_oblique));
        hashMap.put("ember-regular-v2", Integer.valueOf(R.font.app_text_regular));
        hashMap.put("ember-thin", Integer.valueOf(R.font.app_text_light));
        hashMap.put("ember-thin_italic", Integer.valueOf(R.font.app_text_light_oblique));
        hashMap.put("mosaic-icons", Integer.valueOf(R.font.mosaic_icons));
        rnUnmodifiableFontMap = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.amazon.alexa.reactnative.api.RNFontMapping
    public void setCustomFonts(@NonNull Context context, @NonNull ReactFontManager reactFontManager) {
        for (Map.Entry<String, Integer> entry : rnUnmodifiableFontMap.entrySet()) {
            reactFontManager.addCustomFont(context, entry.getKey(), entry.getValue().intValue());
        }
    }
}
