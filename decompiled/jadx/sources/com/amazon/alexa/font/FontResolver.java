package com.amazon.alexa.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import com.dee.app.contacts.common.constants.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/font/FontResolver;", "", "()V", Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "TYPEFACE_CACHE", "", "Lcom/amazon/alexa/font/Font;", "Landroid/graphics/Typeface;", "getTYPEFACE_CACHE$annotations", "V2_TYPEFACE_CACHE", "getV2_TYPEFACE_CACHE$annotations", "assetFontPaths", "", "", "v2AssetFontPaths", "v2FontMapping", "getFont", "context", "Landroid/content/Context;", "font", "isLocaleArabic", "", "AlexaMobileAndroidFont_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FontResolver {

    @NotNull
    public static final FontResolver INSTANCE = new FontResolver();
    private static final String TAG = "FontResolver";

    @JvmField
    @NotNull
    public static final Map<Font, Typeface> TYPEFACE_CACHE = new HashMap();

    @JvmField
    @NotNull
    public static final Map<Font, Typeface> V2_TYPEFACE_CACHE = new HashMap();

    @NotNull
    private static final Map<Font, Integer> assetFontPaths;

    @NotNull
    private static final Map<Font, Integer> v2AssetFontPaths;

    @NotNull
    private static final Map<Font, Font> v2FontMapping;

    static {
        Font font = Font.AMAZON_EMBER_DISPLAY_BOLD;
        Pair pair = TuplesKt.to(font, Integer.valueOf(R.font.amazon_ember_display_bold));
        Font font2 = Font.AMAZON_EMBER_DISPLAY_LIGHT;
        Pair pair2 = TuplesKt.to(font2, Integer.valueOf(R.font.amazon_ember_display_light));
        Font font3 = Font.AMAZON_EMBER_DISPLAY_MEDIUM;
        Pair pair3 = TuplesKt.to(font3, Integer.valueOf(R.font.amazon_ember_display_medium));
        Font font4 = Font.AMAZON_EMBER_DISPLAY_REGULAR;
        Pair pair4 = TuplesKt.to(font4, Integer.valueOf(R.font.amazon_ember_display_regular));
        Font font5 = Font.AMAZON_EMBER_MONO_BOLD;
        Pair pair5 = TuplesKt.to(font5, Integer.valueOf(R.font.amazon_ember_mono_bold));
        Font font6 = Font.AMAZON_EMBER_MONO_REGULAR;
        Pair pair6 = TuplesKt.to(font6, Integer.valueOf(R.font.amazon_ember_mono_regular));
        Font font7 = Font.AMAZON_BOOKERLY_BOLD;
        Pair pair7 = TuplesKt.to(font7, Integer.valueOf(R.font.bookerly_bold));
        Font font8 = Font.AMAZON_BOOKERLY_BOLD_ITALIC;
        Pair pair8 = TuplesKt.to(font8, Integer.valueOf(R.font.bookerly_bold_italic));
        Font font9 = Font.AMAZON_BOOKERLY_LIGHT;
        Pair pair9 = TuplesKt.to(font9, Integer.valueOf(R.font.bookerly_light));
        Font font10 = Font.AMAZON_BOOKERLY_LIGHT_ITALIC;
        Pair pair10 = TuplesKt.to(font10, Integer.valueOf(R.font.bookerly_light_italic));
        Font font11 = Font.AMAZON_BOOKERLY_REGULAR;
        Pair pair11 = TuplesKt.to(font11, Integer.valueOf(R.font.bookerly_regular));
        Font font12 = Font.AMAZON_BOOKERLY_REGULAR_ITALIC;
        Pair pair12 = TuplesKt.to(font12, Integer.valueOf(R.font.bookerly_regular_italic));
        Font font13 = Font.AMAZON_EMBER_BOLD;
        Pair pair13 = TuplesKt.to(font13, Integer.valueOf(R.font.ember_bold));
        Font font14 = Font.AMAZON_EMBER_BOLD_ITALIC;
        Pair pair14 = TuplesKt.to(font14, Integer.valueOf(R.font.ember_bold_italic));
        Font font15 = Font.AMAZON_EMBER_LIGHT;
        Pair pair15 = TuplesKt.to(font15, Integer.valueOf(R.font.ember_light));
        Font font16 = Font.AMAZON_EMBER_LIGHT_ITALIC;
        Pair pair16 = TuplesKt.to(font16, Integer.valueOf(R.font.ember_light_italic));
        Font font17 = Font.AMAZON_EMBER_MEDIUM;
        Pair pair17 = TuplesKt.to(font17, Integer.valueOf(R.font.ember_medium));
        Font font18 = Font.AMAZON_EMBER_MEDIUM_ITALIC;
        Pair pair18 = TuplesKt.to(font18, Integer.valueOf(R.font.ember_medium_italic));
        Font font19 = Font.AMAZON_EMBER_REGULAR;
        Pair pair19 = TuplesKt.to(font19, Integer.valueOf(R.font.ember_regular));
        Font font20 = Font.AMAZON_EMBER_REGULAR_ITALIC;
        Pair pair20 = TuplesKt.to(font20, Integer.valueOf(R.font.ember_regular_italic));
        Font font21 = Font.AMAZON_EMBER_THIN;
        Pair pair21 = TuplesKt.to(font21, Integer.valueOf(R.font.ember_thin));
        Font font22 = Font.AMAZON_EMBER_THIN_ITALIC;
        Pair pair22 = TuplesKt.to(font22, Integer.valueOf(R.font.ember_thin_italic));
        Font font23 = Font.AMAZON_MOSAIC_ICONS;
        Pair pair23 = TuplesKt.to(font23, Integer.valueOf(R.font.mosaic_icons));
        Font font24 = Font.APP_TEXT;
        Pair pair24 = TuplesKt.to(font24, Integer.valueOf(R.font.app_text));
        Font font25 = Font.APP_DISPLAY;
        Pair pair25 = TuplesKt.to(font25, Integer.valueOf(R.font.app_display));
        Font font26 = Font.APP_TEXT_REGULAR;
        Pair pair26 = TuplesKt.to(font26, Integer.valueOf(R.font.alexa_sans_text_regular));
        Font font27 = Font.APP_TEXT_BOLD;
        Pair pair27 = TuplesKt.to(font27, Integer.valueOf(R.font.alexa_sans_text_bold));
        Font font28 = Font.APP_TEXT_MEDIUM;
        Pair pair28 = TuplesKt.to(font28, Integer.valueOf(R.font.alexa_sans_text_medium));
        Font font29 = Font.APP_TEXT_LIGHT;
        Pair pair29 = TuplesKt.to(font29, Integer.valueOf(R.font.alexa_sans_text_light));
        Font font30 = Font.APP_TEXT_REGULAR_OBLIQUE;
        Pair pair30 = TuplesKt.to(font30, Integer.valueOf(R.font.alexa_sans_text_regular_oblique));
        Font font31 = Font.APP_TEXT_BOLD_OBLIQUE;
        Pair pair31 = TuplesKt.to(font31, Integer.valueOf(R.font.alexa_sans_text_bold_oblique));
        Font font32 = Font.APP_TEXT_MEDIUM_OBLIQUE;
        Pair pair32 = TuplesKt.to(font32, Integer.valueOf(R.font.alexa_sans_text_medium_oblique));
        Font font33 = Font.APP_TEXT_LIGHT_OBLIQUE;
        Pair pair33 = TuplesKt.to(font33, Integer.valueOf(R.font.alexa_sans_text_light_oblique));
        Font font34 = Font.APP_DISPLAY_REGULAR;
        Pair pair34 = TuplesKt.to(font34, Integer.valueOf(R.font.alexa_sans_display_regular));
        Font font35 = Font.APP_DISPLAY_BOLD;
        Pair pair35 = TuplesKt.to(font35, Integer.valueOf(R.font.alexa_sans_display_bold));
        Font font36 = Font.APP_DISPLAY_MEDIUM;
        Pair pair36 = TuplesKt.to(font36, Integer.valueOf(R.font.alexa_sans_display_medium));
        Font font37 = Font.APP_DISPLAY_LIGHT;
        Pair pair37 = TuplesKt.to(font37, Integer.valueOf(R.font.alexa_sans_display_light));
        Font font38 = Font.APP_DISPLAY_REGULAR_OBLIQUE;
        Pair pair38 = TuplesKt.to(font38, Integer.valueOf(R.font.alexa_sans_display_regular_oblique));
        Font font39 = Font.APP_DISPLAY_BOLD_OBLIQUE;
        Pair pair39 = TuplesKt.to(font39, Integer.valueOf(R.font.alexa_sans_display_bold_oblique));
        Font font40 = Font.APP_DISPLAY_MEDIUM_OBLIQUE;
        Pair pair40 = TuplesKt.to(font40, Integer.valueOf(R.font.alexa_sans_display_medium_oblique));
        Font font41 = Font.APP_DISPLAY_LIGHT_OBLIQUE;
        Pair pair41 = TuplesKt.to(font41, Integer.valueOf(R.font.alexa_sans_display_light_oblique));
        Font font42 = Font.APP_MONO_REGULAR;
        assetFontPaths = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, TuplesKt.to(font42, Integer.valueOf(R.font.amazon_ember_mono_regular)));
        v2AssetFontPaths = MapsKt.mapOf(TuplesKt.to(font13, Integer.valueOf(R.font.ember_bold_v2)), TuplesKt.to(font17, Integer.valueOf(R.font.ember_medium_v2)), TuplesKt.to(font19, Integer.valueOf(R.font.ember_regular_v2)), TuplesKt.to(font24, Integer.valueOf(R.font.app_text)), TuplesKt.to(font25, Integer.valueOf(R.font.app_display)), TuplesKt.to(font26, Integer.valueOf(R.font.alexa_sans_text_regular)), TuplesKt.to(font27, Integer.valueOf(R.font.alexa_sans_text_bold)), TuplesKt.to(font28, Integer.valueOf(R.font.alexa_sans_text_medium)), TuplesKt.to(font29, Integer.valueOf(R.font.alexa_sans_text_light)), TuplesKt.to(font30, Integer.valueOf(R.font.alexa_sans_text_regular_oblique)), TuplesKt.to(font31, Integer.valueOf(R.font.alexa_sans_text_bold_oblique)), TuplesKt.to(font32, Integer.valueOf(R.font.alexa_sans_text_medium_oblique)), TuplesKt.to(font33, Integer.valueOf(R.font.alexa_sans_text_light_oblique)), TuplesKt.to(font34, Integer.valueOf(R.font.alexa_sans_display_regular)), TuplesKt.to(font35, Integer.valueOf(R.font.alexa_sans_display_bold)), TuplesKt.to(font36, Integer.valueOf(R.font.alexa_sans_display_medium)), TuplesKt.to(font37, Integer.valueOf(R.font.alexa_sans_display_light)), TuplesKt.to(font38, Integer.valueOf(R.font.alexa_sans_display_regular_oblique)), TuplesKt.to(font39, Integer.valueOf(R.font.alexa_sans_display_bold_oblique)), TuplesKt.to(font40, Integer.valueOf(R.font.alexa_sans_display_medium_oblique)), TuplesKt.to(font41, Integer.valueOf(R.font.alexa_sans_display_light_oblique)), TuplesKt.to(font42, Integer.valueOf(R.font.amazon_ember_mono_regular)));
        v2FontMapping = MapsKt.mapOf(TuplesKt.to(font7, font13), TuplesKt.to(font8, font13), TuplesKt.to(font9, font19), TuplesKt.to(font10, font19), TuplesKt.to(font11, font19), TuplesKt.to(font12, font19), TuplesKt.to(font13, font13), TuplesKt.to(font14, font13), TuplesKt.to(font, font13), TuplesKt.to(font2, font19), TuplesKt.to(font3, font17), TuplesKt.to(font4, font19), TuplesKt.to(font5, font6), TuplesKt.to(font6, font6), TuplesKt.to(font15, font19), TuplesKt.to(font16, font19), TuplesKt.to(font17, font17), TuplesKt.to(font18, font17), TuplesKt.to(font19, font19), TuplesKt.to(font20, font19), TuplesKt.to(font21, font19), TuplesKt.to(font22, font19), TuplesKt.to(font23, font23), TuplesKt.to(font24, font24), TuplesKt.to(font25, font25), TuplesKt.to(font26, font26), TuplesKt.to(font27, font27), TuplesKt.to(font28, font28), TuplesKt.to(font29, font29), TuplesKt.to(font30, font30), TuplesKt.to(font31, font31), TuplesKt.to(font32, font32), TuplesKt.to(font33, font33), TuplesKt.to(font34, font34), TuplesKt.to(font35, font35), TuplesKt.to(font36, font36), TuplesKt.to(font37, font37), TuplesKt.to(font38, font38), TuplesKt.to(font39, font39), TuplesKt.to(font40, font40), TuplesKt.to(font41, font41), TuplesKt.to(font42, font42));
    }

    private FontResolver() {
    }

    @JvmStatic
    @Nullable
    public static final Typeface getFont(@Nullable Context context, @Nullable Font font) {
        Map<Font, Typeface> map;
        Map<Font, Integer> map2;
        if (context == null || font == null) {
            return null;
        }
        if (isLocaleArabic(context)) {
            font = v2FontMapping.get(font);
            map = V2_TYPEFACE_CACHE;
            map2 = v2AssetFontPaths;
        } else {
            map = TYPEFACE_CACHE;
            map2 = assetFontPaths;
        }
        if (font == null) {
            return null;
        }
        if (!map.containsKey(font)) {
            Integer num = map2.get(font);
            map.put(font, num != null ? ResourcesCompat.getFont(context, num.intValue()) : null);
        }
        return map.get(font);
    }

    @JvmStatic
    public static final boolean isLocaleArabic(@NotNull Context context) {
        boolean startsWith$default;
        context.getClass();
        try {
            String locale = context.getResources().getConfiguration().locale.toString();
            locale.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(locale, "ar", false, 2, null);
            return startsWith$default;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getTYPEFACE_CACHE$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getV2_TYPEFACE_CACHE$annotations() {
    }
}
