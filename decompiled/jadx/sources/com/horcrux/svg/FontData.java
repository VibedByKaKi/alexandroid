package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.TextProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class FontData {
    static final double DEFAULT_FONT_SIZE = 12.0d;
    private static final double DEFAULT_KERNING = 0.0d;
    private static final double DEFAULT_LETTER_SPACING = 0.0d;
    private static final double DEFAULT_WORD_SPACING = 0.0d;
    static final FontData Defaults = new FontData();
    private static final String FONT_DATA = "fontData";
    private static final String FONT_FEATURE_SETTINGS = "fontFeatureSettings";
    private static final String FONT_VARIANT_LIGATURES = "fontVariantLigatures";
    private static final String FONT_VARIATION_SETTINGS = "fontVariationSettings";
    private static final String KERNING = "kerning";
    private static final String LETTER_SPACING = "letterSpacing";
    private static final String TEXT_ANCHOR = "textAnchor";
    private static final String TEXT_DECORATION = "textDecoration";
    private static final String WORD_SPACING = "wordSpacing";
    int absoluteFontWeight;
    final ReadableMap fontData;
    final String fontFamily;
    final String fontFeatureSettings;
    final double fontSize;
    final TextProperties.FontStyle fontStyle;
    final TextProperties.FontVariantLigatures fontVariantLigatures;
    final String fontVariationSettings;
    TextProperties.FontWeight fontWeight;
    final double kerning;
    final double letterSpacing;
    final boolean manualKerning;
    final TextProperties.TextAnchor textAnchor;
    private final TextProperties.TextDecoration textDecoration;
    final double wordSpacing;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AbsoluteFontWeight {
        private static final TextProperties.FontWeight[] WEIGHTS;
        private static final int[] absoluteFontWeights;
        static final int normal = 400;

        static {
            TextProperties.FontWeight fontWeight = TextProperties.FontWeight.w100;
            TextProperties.FontWeight fontWeight2 = TextProperties.FontWeight.w200;
            TextProperties.FontWeight fontWeight3 = TextProperties.FontWeight.w300;
            TextProperties.FontWeight fontWeight4 = TextProperties.FontWeight.Normal;
            TextProperties.FontWeight fontWeight5 = TextProperties.FontWeight.w500;
            TextProperties.FontWeight fontWeight6 = TextProperties.FontWeight.w600;
            TextProperties.FontWeight fontWeight7 = TextProperties.FontWeight.Bold;
            TextProperties.FontWeight fontWeight8 = TextProperties.FontWeight.w800;
            TextProperties.FontWeight fontWeight9 = TextProperties.FontWeight.w900;
            WEIGHTS = new TextProperties.FontWeight[]{fontWeight, fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9, fontWeight9};
            absoluteFontWeights = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int bolder(int i) {
            if (i < 350) {
                return 400;
            }
            if (i < 550) {
                return 700;
            }
            if (i < 900) {
                return 900;
            }
            return i;
        }

        public static int from(TextProperties.FontWeight fontWeight, FontData fontData) {
            return fontWeight == TextProperties.FontWeight.Bolder ? bolder(fontData.absoluteFontWeight) : fontWeight == TextProperties.FontWeight.Lighter ? lighter(fontData.absoluteFontWeight) : absoluteFontWeights[fontWeight.ordinal()];
        }

        private static int lighter(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? 400 : 700;
        }

        public static TextProperties.FontWeight nearestFontWeight(int i) {
            return WEIGHTS[Math.round(i / 100.0f)];
        }
    }

    public FontData(ReadableMap readableMap, FontData fontData, double d) {
        FontData fontData2;
        ReadableMap readableMap2;
        double d2;
        double d3;
        double d4 = fontData.fontSize;
        if (readableMap.hasKey("fontSize")) {
            fontData2 = this;
            readableMap2 = readableMap;
            fontData2.fontSize = fontData2.toAbsolute(readableMap2, "fontSize", 1.0d, d4, d4);
        } else {
            fontData2 = this;
            readableMap2 = readableMap;
            fontData2.fontSize = d4;
        }
        if (!readableMap2.hasKey("fontWeight")) {
            fontData2.setInheritedWeight(fontData);
        } else if (readableMap2.getType("fontWeight") == ReadableType.Number) {
            fontData2.handleNumericWeight(fontData, readableMap2.getDouble("fontWeight"));
        } else {
            String string = readableMap2.getString("fontWeight");
            if (TextProperties.FontWeight.hasEnum(string)) {
                int from = AbsoluteFontWeight.from(TextProperties.FontWeight.get(string), fontData);
                fontData2.absoluteFontWeight = from;
                fontData2.fontWeight = AbsoluteFontWeight.nearestFontWeight(from);
            } else if (string != null) {
                fontData2.handleNumericWeight(fontData, Double.parseDouble(string));
            } else {
                fontData2.setInheritedWeight(fontData);
            }
        }
        fontData2.fontData = readableMap2.hasKey(FONT_DATA) ? readableMap2.getMap(FONT_DATA) : fontData.fontData;
        fontData2.fontFamily = readableMap2.hasKey("fontFamily") ? readableMap2.getString("fontFamily") : fontData.fontFamily;
        fontData2.fontStyle = readableMap2.hasKey("fontStyle") ? TextProperties.FontStyle.valueOf(readableMap2.getString("fontStyle")) : fontData.fontStyle;
        fontData2.fontFeatureSettings = readableMap2.hasKey(FONT_FEATURE_SETTINGS) ? readableMap2.getString(FONT_FEATURE_SETTINGS) : fontData.fontFeatureSettings;
        fontData2.fontVariationSettings = readableMap2.hasKey(FONT_VARIATION_SETTINGS) ? readableMap2.getString(FONT_VARIATION_SETTINGS) : fontData.fontVariationSettings;
        fontData2.fontVariantLigatures = readableMap2.hasKey(FONT_VARIANT_LIGATURES) ? TextProperties.FontVariantLigatures.valueOf(readableMap2.getString(FONT_VARIANT_LIGATURES)) : fontData.fontVariantLigatures;
        fontData2.textAnchor = readableMap2.hasKey(TEXT_ANCHOR) ? TextProperties.TextAnchor.valueOf(readableMap2.getString(TEXT_ANCHOR)) : fontData.textAnchor;
        fontData2.textDecoration = readableMap2.hasKey("textDecoration") ? TextProperties.TextDecoration.getEnum(readableMap2.getString("textDecoration")) : fontData.textDecoration;
        boolean hasKey = readableMap2.hasKey(KERNING);
        fontData2.manualKerning = hasKey || fontData.manualKerning;
        if (hasKey) {
            d2 = d;
            d3 = fontData2.toAbsolute(readableMap2, KERNING, d2, fontData2.fontSize, 0.0d);
        } else {
            d2 = d;
            d3 = fontData.kerning;
        }
        fontData2.kerning = d3;
        fontData2.wordSpacing = readableMap2.hasKey(WORD_SPACING) ? fontData2.toAbsolute(readableMap2, WORD_SPACING, d2, fontData2.fontSize, 0.0d) : fontData.wordSpacing;
        fontData2.letterSpacing = readableMap2.hasKey("letterSpacing") ? fontData2.toAbsolute(readableMap2, "letterSpacing", d2, fontData2.fontSize, 0.0d) : fontData.letterSpacing;
    }

    private void handleNumericWeight(FontData fontData, double d) {
        long round = Math.round(d);
        if (round < 1 || round > 1000) {
            setInheritedWeight(fontData);
            return;
        }
        int i = (int) round;
        this.absoluteFontWeight = i;
        this.fontWeight = AbsoluteFontWeight.nearestFontWeight(i);
    }

    private void setInheritedWeight(FontData fontData) {
        this.absoluteFontWeight = fontData.absoluteFontWeight;
        this.fontWeight = fontData.fontWeight;
    }

    private double toAbsolute(ReadableMap readableMap, String str, double d, double d2, double d3) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) * d : PropHelper.fromRelative(readableMap.getString(str), d3, d, d2);
    }

    private FontData() {
        this.fontData = null;
        this.fontFamily = "";
        this.fontStyle = TextProperties.FontStyle.normal;
        this.fontWeight = TextProperties.FontWeight.Normal;
        this.absoluteFontWeight = 400;
        this.fontFeatureSettings = "";
        this.fontVariationSettings = "";
        this.fontVariantLigatures = TextProperties.FontVariantLigatures.normal;
        this.textAnchor = TextProperties.TextAnchor.start;
        this.textDecoration = TextProperties.TextDecoration.None;
        this.manualKerning = false;
        this.kerning = 0.0d;
        this.fontSize = 12.0d;
        this.wordSpacing = 0.0d;
        this.letterSpacing = 0.0d;
    }
}
