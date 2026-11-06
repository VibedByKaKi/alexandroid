package com.amazon.apl.android.font;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.amazon.apl.android.thread.SequentialExecutor;
import com.amazon.apl.android.thread.Threading;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class FontUtil {
    private static final String ARABIC_TEXT_PREFIX = "ar-";
    static final SequentialExecutor SEQUENTIAL_EXECUTOR = Threading.createSequentialExecutor();
    private static final String TAG = "FontUtil";

    public static List<String> debugGetSystemFontFamily(Map<String, Typeface> map, Typeface typeface) {
        return new ArrayList();
    }

    private static Map<String, Typeface> debugGetSystemFontMap() {
        return null;
    }

    public static boolean isArabicFontKey(FontKey fontKey) {
        return !TextUtils.isEmpty(fontKey.getLanguage()) && fontKey.getLanguage().startsWith("ar-");
    }
}
