package com.amazon.apl.android.font;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import com.amazon.apl.android.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EmbeddedFontResolver implements IFontResolver {
    private static final String TAG = "EmbeddedFontResolver";
    private static final List<ResFontKey> sArabicFontWeights = Collections.unmodifiableList(Arrays.asList(new ResFontKey(100, R.font.amazon_ember_regular_v2), new ResFontKey(300, R.font.amazon_ember_regular_v2), new ResFontKey(400, R.font.amazon_ember_regular_v2), new ResFontKey(500, R.font.amazon_ember_medium_v2), new ResFontKey(700, R.font.amazon_ember_bold_v2), new ResFontKey(900, R.font.amazon_ember_bold_v2)));
    private static final List<ResFontKey> sFontWeights = Collections.unmodifiableList(Arrays.asList(new ResFontKey(100, R.font.amazon_ember_display_light), new ResFontKey(300, R.font.amazon_ember_display_light), new ResFontKey(400, R.font.amazon_ember_display_regular), new ResFontKey(500, R.font.amazon_ember_display_medium), new ResFontKey(700, R.font.amazon_ember_display_bold), new ResFontKey(900, R.font.amazon_ember_display_heavy)));
    private final Context mAppContext;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ResFontKey {

        @FontRes
        final int fontRes;
        final int weight;

        public ResFontKey(int i, @FontRes int i2) {
            this.weight = i;
            this.fontRes = i2;
        }
    }

    public EmbeddedFontResolver(@NonNull Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    @Nullable
    private Typeface findAPLFont(@NonNull FontKey fontKey) {
        List<ResFontKey> list = sFontWeights;
        boolean isArabicFontKey = FontUtil.isArabicFontKey(fontKey);
        if (isArabicFontKey) {
            list = sArabicFontWeights;
        }
        int i = Integer.MAX_VALUE;
        ResFontKey resFontKey = null;
        for (ResFontKey resFontKey2 : list) {
            int i2 = resFontKey2.weight;
            if (i > Math.abs(i2 - fontKey.getWeight())) {
                i = Math.abs(i2 - fontKey.getWeight());
                resFontKey = resFontKey2;
            }
        }
        if (resFontKey == null) {
            return null;
        }
        Typeface font = ResourcesCompat.getFont(this.mAppContext, resFontKey.fontRes);
        return (!fontKey.isItalic() || isArabicFontKey) ? font : Typeface.create(font, 2);
    }

    @Override // com.amazon.apl.android.font.IFontResolver
    @NonNull
    public Typeface findFont(@NonNull FontKey fontKey) {
        Typeface typeface;
        try {
            typeface = findAPLFont(fontKey);
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Exception finding embedded app font", e);
            typeface = null;
        }
        if (typeface == null) {
            Log.w(TAG, "Did not find font with key: " + fontKey);
        }
        return typeface;
    }

    @Override // com.amazon.apl.android.font.IFontResolver
    public void initialize() {
    }
}
