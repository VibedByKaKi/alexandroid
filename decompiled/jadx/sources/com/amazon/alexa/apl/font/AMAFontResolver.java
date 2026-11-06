package com.amazon.alexa.apl.font;

import android.content.Context;
import android.graphics.Typeface;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.apl.android.font.FontKey;
import com.amazon.apl.android.font.IFontResolver;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/apl/font/AMAFontResolver;", "Lcom/amazon/apl/android/font/IFontResolver;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sArabicFontWeights", "", "Lcom/amazon/alexa/apl/font/AMAFontResolver$ResFontKey;", "sFontWeights", "findAPLFont", "Landroid/graphics/Typeface;", "fontKey", "Lcom/amazon/apl/android/font/FontKey;", "findFont", "initialize", "", "isArabicFontKey", "", "Companion", "ResFontKey", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AMAFontResolver implements IFontResolver {

    @NotNull
    private static final String ARABIC_TEXT_PREFIX = "ar-";
    private static final String TAG = "AMAFontResolver";

    @NotNull
    private Context mContext;

    @NotNull
    private final List<ResFontKey> sArabicFontWeights;

    @NotNull
    private final List<ResFontKey> sFontWeights;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/apl/font/AMAFontResolver$ResFontKey;", "", "weight", "", "fontRef", "Lcom/amazon/alexa/font/Font;", "(ILcom/amazon/alexa/font/Font;)V", "getFontRef", "()Lcom/amazon/alexa/font/Font;", "getWeight", "()I", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResFontKey {

        @NotNull
        private final Font fontRef;
        private final int weight;

        public ResFontKey(int i, @NotNull Font font) {
            font.getClass();
            this.weight = i;
            this.fontRef = font;
        }

        @NotNull
        public final Font getFontRef() {
            return this.fontRef;
        }

        public final int getWeight() {
            return this.weight;
        }
    }

    @Inject
    public AMAFontResolver(@NotNull Context context) {
        context.getClass();
        this.mContext = context;
        Font font = Font.AMAZON_EMBER_REGULAR;
        ResFontKey resFontKey = new ResFontKey(100, font);
        ResFontKey resFontKey2 = new ResFontKey(300, font);
        ResFontKey resFontKey3 = new ResFontKey(400, font);
        ResFontKey resFontKey4 = new ResFontKey(500, Font.AMAZON_EMBER_MEDIUM);
        Font font2 = Font.AMAZON_EMBER_BOLD;
        this.sArabicFontWeights = CollectionsKt.listOf((Object[]) new ResFontKey[]{resFontKey, resFontKey2, resFontKey3, resFontKey4, new ResFontKey(700, font2), new ResFontKey(900, font2)});
        Font font3 = Font.AMAZON_EMBER_DISPLAY_LIGHT;
        ResFontKey resFontKey5 = new ResFontKey(100, font3);
        ResFontKey resFontKey6 = new ResFontKey(300, font3);
        ResFontKey resFontKey7 = new ResFontKey(400, Font.AMAZON_EMBER_DISPLAY_REGULAR);
        ResFontKey resFontKey8 = new ResFontKey(500, Font.AMAZON_EMBER_DISPLAY_MEDIUM);
        Font font4 = Font.AMAZON_EMBER_DISPLAY_BOLD;
        this.sFontWeights = CollectionsKt.listOf((Object[]) new ResFontKey[]{resFontKey5, resFontKey6, resFontKey7, resFontKey8, new ResFontKey(700, font4), new ResFontKey(900, font4)});
    }

    private final Typeface findAPLFont(FontKey fontKey) {
        List<ResFontKey> list = this.sFontWeights;
        boolean isArabicFontKey = isArabicFontKey(fontKey);
        if (isArabicFontKey) {
            list = this.sArabicFontWeights;
        }
        int i = Integer.MAX_VALUE;
        ResFontKey resFontKey = null;
        ResFontKey resFontKey2 = null;
        for (ResFontKey resFontKey3 : list) {
            int weight = resFontKey3.getWeight();
            if (i > Math.abs(weight - fontKey.getWeight())) {
                i = Math.abs(weight - fontKey.getWeight());
                resFontKey2 = resFontKey3;
            }
        }
        Context context = this.mContext;
        if (resFontKey2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bestKey");
        } else {
            resFontKey = resFontKey2;
        }
        Typeface font = FontResolver.getFont(context, resFontKey.getFontRef());
        return (!fontKey.isItalic() || isArabicFontKey) ? font : Typeface.create(font, 2);
    }

    private final boolean isArabicFontKey(FontKey fontKey) {
        boolean startsWith$default;
        String language = fontKey.getLanguage();
        language.getClass();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(language, "ar-", false, 2, null);
        return startsWith$default;
    }

    @Override // com.amazon.apl.android.font.IFontResolver
    @Nullable
    public Typeface findFont(@NotNull FontKey fontKey) {
        fontKey.getClass();
        Typeface findAPLFont = findAPLFont(fontKey);
        if (findAPLFont == null) {
            Objects.toString(fontKey);
        }
        return findAPLFont;
    }

    @Override // com.amazon.apl.android.font.IFontResolver
    public void initialize() {
    }
}
