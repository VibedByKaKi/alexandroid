package com.amazon.alexa.font;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b/\b\u0086\u0081\u0002\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, d2 = {"Lcom/amazon/alexa/font/Font;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "AMAZON_EMBER_DISPLAY_BOLD", "AMAZON_EMBER_DISPLAY_LIGHT", "AMAZON_EMBER_DISPLAY_MEDIUM", "AMAZON_EMBER_DISPLAY_REGULAR", "AMAZON_EMBER_MONO_BOLD", "AMAZON_EMBER_MONO_REGULAR", "AMAZON_BOOKERLY_BOLD", "AMAZON_BOOKERLY_BOLD_ITALIC", "AMAZON_BOOKERLY_LIGHT", "AMAZON_BOOKERLY_LIGHT_ITALIC", "AMAZON_BOOKERLY_REGULAR", "AMAZON_BOOKERLY_REGULAR_ITALIC", "AMAZON_EMBER_BOLD", "AMAZON_EMBER_BOLD_ITALIC", "AMAZON_EMBER_LIGHT", "AMAZON_EMBER_LIGHT_ITALIC", "AMAZON_EMBER_MEDIUM", "AMAZON_EMBER_MEDIUM_ITALIC", "AMAZON_EMBER_REGULAR", "AMAZON_EMBER_REGULAR_ITALIC", "AMAZON_EMBER_THIN", "AMAZON_EMBER_THIN_ITALIC", "AMAZON_MOSAIC_ICONS", "APP_TEXT", "APP_DISPLAY", "APP_TEXT_REGULAR", "APP_TEXT_BOLD", "APP_TEXT_MEDIUM", "APP_TEXT_LIGHT", "APP_TEXT_REGULAR_OBLIQUE", "APP_TEXT_BOLD_OBLIQUE", "APP_TEXT_MEDIUM_OBLIQUE", "APP_TEXT_LIGHT_OBLIQUE", "APP_DISPLAY_REGULAR", "APP_DISPLAY_BOLD", "APP_DISPLAY_MEDIUM", "APP_DISPLAY_LIGHT", "APP_DISPLAY_REGULAR_OBLIQUE", "APP_DISPLAY_BOLD_OBLIQUE", "APP_DISPLAY_MEDIUM_OBLIQUE", "APP_DISPLAY_LIGHT_OBLIQUE", "APP_MONO_REGULAR", "Companion", "AlexaMobileAndroidFont_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Font {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Font[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int value;
    public static final Font AMAZON_EMBER_DISPLAY_BOLD = new Font("AMAZON_EMBER_DISPLAY_BOLD", 0, 0);
    public static final Font AMAZON_EMBER_DISPLAY_LIGHT = new Font("AMAZON_EMBER_DISPLAY_LIGHT", 1, 1);
    public static final Font AMAZON_EMBER_DISPLAY_MEDIUM = new Font("AMAZON_EMBER_DISPLAY_MEDIUM", 2, 2);
    public static final Font AMAZON_EMBER_DISPLAY_REGULAR = new Font("AMAZON_EMBER_DISPLAY_REGULAR", 3, 3);
    public static final Font AMAZON_EMBER_MONO_BOLD = new Font("AMAZON_EMBER_MONO_BOLD", 4, 4);
    public static final Font AMAZON_EMBER_MONO_REGULAR = new Font("AMAZON_EMBER_MONO_REGULAR", 5, 5);
    public static final Font AMAZON_BOOKERLY_BOLD = new Font("AMAZON_BOOKERLY_BOLD", 6, 6);
    public static final Font AMAZON_BOOKERLY_BOLD_ITALIC = new Font("AMAZON_BOOKERLY_BOLD_ITALIC", 7, 7);
    public static final Font AMAZON_BOOKERLY_LIGHT = new Font("AMAZON_BOOKERLY_LIGHT", 8, 8);
    public static final Font AMAZON_BOOKERLY_LIGHT_ITALIC = new Font("AMAZON_BOOKERLY_LIGHT_ITALIC", 9, 9);
    public static final Font AMAZON_BOOKERLY_REGULAR = new Font("AMAZON_BOOKERLY_REGULAR", 10, 10);
    public static final Font AMAZON_BOOKERLY_REGULAR_ITALIC = new Font("AMAZON_BOOKERLY_REGULAR_ITALIC", 11, 11);
    public static final Font AMAZON_EMBER_BOLD = new Font("AMAZON_EMBER_BOLD", 12, 12);
    public static final Font AMAZON_EMBER_BOLD_ITALIC = new Font("AMAZON_EMBER_BOLD_ITALIC", 13, 13);
    public static final Font AMAZON_EMBER_LIGHT = new Font("AMAZON_EMBER_LIGHT", 14, 14);
    public static final Font AMAZON_EMBER_LIGHT_ITALIC = new Font("AMAZON_EMBER_LIGHT_ITALIC", 15, 15);
    public static final Font AMAZON_EMBER_MEDIUM = new Font("AMAZON_EMBER_MEDIUM", 16, 16);
    public static final Font AMAZON_EMBER_MEDIUM_ITALIC = new Font("AMAZON_EMBER_MEDIUM_ITALIC", 17, 17);
    public static final Font AMAZON_EMBER_REGULAR = new Font("AMAZON_EMBER_REGULAR", 18, 18);
    public static final Font AMAZON_EMBER_REGULAR_ITALIC = new Font("AMAZON_EMBER_REGULAR_ITALIC", 19, 19);
    public static final Font AMAZON_EMBER_THIN = new Font("AMAZON_EMBER_THIN", 20, 20);
    public static final Font AMAZON_EMBER_THIN_ITALIC = new Font("AMAZON_EMBER_THIN_ITALIC", 21, 21);
    public static final Font AMAZON_MOSAIC_ICONS = new Font("AMAZON_MOSAIC_ICONS", 22, 22);
    public static final Font APP_TEXT = new Font("APP_TEXT", 23, 23);
    public static final Font APP_DISPLAY = new Font("APP_DISPLAY", 24, 24);
    public static final Font APP_TEXT_REGULAR = new Font("APP_TEXT_REGULAR", 25, 25);
    public static final Font APP_TEXT_BOLD = new Font("APP_TEXT_BOLD", 26, 26);
    public static final Font APP_TEXT_MEDIUM = new Font("APP_TEXT_MEDIUM", 27, 27);
    public static final Font APP_TEXT_LIGHT = new Font("APP_TEXT_LIGHT", 28, 28);
    public static final Font APP_TEXT_REGULAR_OBLIQUE = new Font("APP_TEXT_REGULAR_OBLIQUE", 29, 29);
    public static final Font APP_TEXT_BOLD_OBLIQUE = new Font("APP_TEXT_BOLD_OBLIQUE", 30, 30);
    public static final Font APP_TEXT_MEDIUM_OBLIQUE = new Font("APP_TEXT_MEDIUM_OBLIQUE", 31, 31);
    public static final Font APP_TEXT_LIGHT_OBLIQUE = new Font("APP_TEXT_LIGHT_OBLIQUE", 32, 32);
    public static final Font APP_DISPLAY_REGULAR = new Font("APP_DISPLAY_REGULAR", 33, 33);
    public static final Font APP_DISPLAY_BOLD = new Font("APP_DISPLAY_BOLD", 34, 34);
    public static final Font APP_DISPLAY_MEDIUM = new Font("APP_DISPLAY_MEDIUM", 35, 35);
    public static final Font APP_DISPLAY_LIGHT = new Font("APP_DISPLAY_LIGHT", 36, 36);
    public static final Font APP_DISPLAY_REGULAR_OBLIQUE = new Font("APP_DISPLAY_REGULAR_OBLIQUE", 37, 37);
    public static final Font APP_DISPLAY_BOLD_OBLIQUE = new Font("APP_DISPLAY_BOLD_OBLIQUE", 38, 38);
    public static final Font APP_DISPLAY_MEDIUM_OBLIQUE = new Font("APP_DISPLAY_MEDIUM_OBLIQUE", 39, 39);
    public static final Font APP_DISPLAY_LIGHT_OBLIQUE = new Font("APP_DISPLAY_LIGHT_OBLIQUE", 40, 40);
    public static final Font APP_MONO_REGULAR = new Font("APP_MONO_REGULAR", 41, 41);

    private static final /* synthetic */ Font[] $values() {
        return new Font[]{AMAZON_EMBER_DISPLAY_BOLD, AMAZON_EMBER_DISPLAY_LIGHT, AMAZON_EMBER_DISPLAY_MEDIUM, AMAZON_EMBER_DISPLAY_REGULAR, AMAZON_EMBER_MONO_BOLD, AMAZON_EMBER_MONO_REGULAR, AMAZON_BOOKERLY_BOLD, AMAZON_BOOKERLY_BOLD_ITALIC, AMAZON_BOOKERLY_LIGHT, AMAZON_BOOKERLY_LIGHT_ITALIC, AMAZON_BOOKERLY_REGULAR, AMAZON_BOOKERLY_REGULAR_ITALIC, AMAZON_EMBER_BOLD, AMAZON_EMBER_BOLD_ITALIC, AMAZON_EMBER_LIGHT, AMAZON_EMBER_LIGHT_ITALIC, AMAZON_EMBER_MEDIUM, AMAZON_EMBER_MEDIUM_ITALIC, AMAZON_EMBER_REGULAR, AMAZON_EMBER_REGULAR_ITALIC, AMAZON_EMBER_THIN, AMAZON_EMBER_THIN_ITALIC, AMAZON_MOSAIC_ICONS, APP_TEXT, APP_DISPLAY, APP_TEXT_REGULAR, APP_TEXT_BOLD, APP_TEXT_MEDIUM, APP_TEXT_LIGHT, APP_TEXT_REGULAR_OBLIQUE, APP_TEXT_BOLD_OBLIQUE, APP_TEXT_MEDIUM_OBLIQUE, APP_TEXT_LIGHT_OBLIQUE, APP_DISPLAY_REGULAR, APP_DISPLAY_BOLD, APP_DISPLAY_MEDIUM, APP_DISPLAY_LIGHT, APP_DISPLAY_REGULAR_OBLIQUE, APP_DISPLAY_BOLD_OBLIQUE, APP_DISPLAY_MEDIUM_OBLIQUE, APP_DISPLAY_LIGHT_OBLIQUE, APP_MONO_REGULAR};
    }

    static {
        Font[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Font(String str, int i, int i2) {
        this.value = i2;
    }

    @JvmStatic
    @Nullable
    public static final Font fromInt(int i) {
        return INSTANCE.fromInt(i);
    }

    @NotNull
    public static EnumEntries<Font> getEntries() {
        return $ENTRIES;
    }

    public static Font valueOf(String str) {
        return (Font) Enum.valueOf(Font.class, str);
    }

    public static Font[] values() {
        return (Font[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/font/Font$Companion;", "", "()V", "fromInt", "Lcom/amazon/alexa/font/Font;", "n", "", "AlexaMobileAndroidFont_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Font fromInt(int n) {
            if (n >= Font.values().length || n < 0) {
                return null;
            }
            return Font.values()[n];
        }

        private Companion() {
        }
    }
}
