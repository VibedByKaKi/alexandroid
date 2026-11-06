package com.amazon.apl.android.font;

import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.here.sdk.search.PlaceCategory;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class FontListParser {
    private static final String TAG = "FontListParser";
    private static List<Family> deviceFonts;

    @NonNull
    private static Map<String, String> sAliasMap;

    @NonNull
    private static final Map<String, String> sInCorrectMap;
    private static final File FONTS_XML = new File("/system/etc/fonts.xml");
    private static final File SYSTEM_FONTS_XML = new File("/system/etc/system_fonts.xml");
    private static String[][] defaultSystemFonts = {new String[]{"Amazon Ember", PlaceCategory.TRANSPORT, BaseTemplateProvider.NON_INVITATION_KEY, "Amazon-Ember-Regular.ttf"}, new String[]{"Amazon Ember", PlaceCategory.TRANSPORT, "italic", "Amazon-Ember-RegularItalic.ttf"}, new String[]{"Amazon Ember", PlaceCategory.BUSINESS_AND_SERVICES, BaseTemplateProvider.NON_INVITATION_KEY, "Amazon-Ember-Bold.ttf"}, new String[]{"Amazon Ember", PlaceCategory.BUSINESS_AND_SERVICES, "italic", "Amazon-Ember-BoldItalic.ttf"}, new String[]{"Amazon Ember", PlaceCategory.SIGHTS_AND_MUSEUMS, BaseTemplateProvider.NON_INVITATION_KEY, "Amazon-Ember-Light.ttf"}, new String[]{"Amazon Ember", PlaceCategory.SIGHTS_AND_MUSEUMS, "italic", "Amazon-Ember-LightItalic.ttf"}, new String[]{"Amazon Ember", PlaceCategory.EAT_AND_DRINK, BaseTemplateProvider.NON_INVITATION_KEY, "Amazon-Ember-Thin.ttf"}, new String[]{"Amazon Ember", PlaceCategory.EAT_AND_DRINK, "italic", "Amazon-Ember-ThinItalic.ttf"}, new String[]{"Amazon Ember", PlaceCategory.LEISURE_AND_OUTDOOR, BaseTemplateProvider.NON_INVITATION_KEY, "Amazon-Ember-Medium.ttf"}, new String[]{"Amazon Ember", PlaceCategory.LEISURE_AND_OUTDOOR, "italic", "Amazon-Ember-MediumItalic.ttf"}};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Alias {
        public String name;
        String toName;
        int weight;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Config {
        final List<Family> families = new ArrayList();
        final List<Alias> aliases = new ArrayList();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Family {
        final List<FileFontKey> fonts;
        public final String lang;

        @Nullable
        public final String name;
        final String variant;

        public Family(@Nullable String str, List<FileFontKey> list, String str2, String str3) {
            this.name = str;
            this.fonts = list;
            this.lang = str2;
            this.variant = str3;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FileFontKey {
        final String fileName;
        final boolean italic;
        final int weight;

        public FileFontKey(int i, boolean z, String str) {
            this.weight = i;
            this.italic = z;
            this.fileName = str;
        }
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        sInCorrectMap = arrayMap;
        arrayMap.put("/system/fonts/Amazon-Ember-Italic.ttf", "/system/fonts/Amazon-Ember-RegularItalic.ttf");
        arrayMap.put("/system/fonts/AmazonEmberDipslay_Bd.ttf", "/system/fonts/AmazonEmberDisplay_Bd.ttf");
        ArrayMap arrayMap2 = new ArrayMap();
        sAliasMap = arrayMap2;
        arrayMap2.put("amazon-ember", "Amazon Ember");
    }

    private FontListParser() {
    }

    @Nullable
    private static String filter(List<FileFontKey> list, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (FileFontKey fileFontKey : list) {
            if (fileFontKey.italic == z) {
                arrayList.add(fileFontKey);
            }
        }
        if (arrayList.size() != 0) {
            list = arrayList;
        }
        String str = null;
        if (list.size() != 0) {
            int i2 = Integer.MAX_VALUE;
            for (FileFontKey fileFontKey2 : list) {
                if (i2 > Math.abs(fileFontKey2.weight - i)) {
                    String str2 = fileFontKey2.fileName;
                    str = str2;
                    i2 = Math.abs(fileFontKey2.weight - i);
                }
            }
        }
        return str;
    }

    @NonNull
    private static List<Family> getFontFamilies() throws IOException, XmlPullParserException {
        String absolutePath;
        File file = FONTS_XML;
        if (file.exists()) {
            absolutePath = file.getAbsolutePath();
        } else {
            File file2 = SYSTEM_FONTS_XML;
            if (!file2.exists()) {
                Single$$ExternalSyntheticBUOutline0.m("fonts.xml does not exist on this system");
                return null;
            }
            absolutePath = file2.getAbsolutePath();
        }
        List<Family> list = parse(new FileInputStream(absolutePath)).families;
        if (list != null) {
            return list;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Parsing returned no fonts!");
        return null;
    }

    @Nullable
    private static String getMatchingFont(FontKey fontKey) {
        if (fontKey != null && fontKey.getFamily() != null) {
            for (Family family : deviceFonts) {
                if (fontKey.getFamily().equalsIgnoreCase(family.name) || fontKey.getFamily().equalsIgnoreCase(sAliasMap.get(family.name))) {
                    return filter(family.fonts, fontKey.getWeight(), fontKey.isItalic());
                }
                if (family.lang != null && fontKey.getLanguage().split("-")[0].equalsIgnoreCase(family.lang)) {
                    return filter(family.fonts, fontKey.getWeight(), fontKey.isItalic());
                }
            }
        }
        return null;
    }

    @Nullable
    public static synchronized Typeface getMatchingTypeface(FontKey fontKey) {
        synchronized (FontListParser.class) {
            String safelyGetMatchingFont = safelyGetMatchingFont(fontKey);
            if (safelyGetMatchingFont != null) {
                Map<String, String> map = sInCorrectMap;
                if (map.containsKey(safelyGetMatchingFont)) {
                    Log.e(TAG, "incorrect font file ".concat(safelyGetMatchingFont));
                    safelyGetMatchingFont = map.get(safelyGetMatchingFont);
                    if (safelyGetMatchingFont == null) {
                        return null;
                    }
                }
            }
            try {
                Typeface createFromFile = Typeface.createFromFile(safelyGetMatchingFont);
                if (createFromFile != null) {
                    return createFromFile;
                }
            } catch (RuntimeException e) {
                Log.e(TAG, "FileFontKey file " + safelyGetMatchingFont + " not found on the device", e);
            }
            return null;
        }
    }

    public static synchronized boolean initialize() {
        synchronized (FontListParser.class) {
            try {
                if (deviceFonts == null) {
                    deviceFonts = getFontFamilies();
                }
            } catch (IOException | RuntimeException | XmlPullParserException e) {
                Log.e(TAG, "Failed to load system fonts", e);
                return false;
            }
        }
        return true;
    }

    @NonNull
    private static Config parse(@NonNull InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            return readFamilies(newPullParser);
        } finally {
            inputStream.close();
        }
    }

    @NonNull
    private static Alias readAlias(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Alias alias = new Alias();
        alias.name = xmlPullParser.getAttributeValue(null, "name");
        alias.toName = xmlPullParser.getAttributeValue(null, TypedValues.TransitionType.S_TO);
        String attributeValue = xmlPullParser.getAttributeValue(null, "mWeight");
        if (attributeValue == null) {
            alias.weight = 0;
        } else {
            alias.weight = Integer.parseInt(attributeValue);
        }
        skip(xmlPullParser);
        return alias;
    }

    @NonNull
    private static Config readFamilies(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Config config = new Config();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("family")) {
                        config.families.add(readFamily(xmlPullParser));
                    } else if (xmlPullParser.getName().equals(NotificationConstants.ALIAS)) {
                        config.aliases.add(readAlias(xmlPullParser));
                    } else {
                        skip(xmlPullParser);
                    }
                }
            } catch (XmlPullParserException unused) {
                Log.wtf(TAG, "System fonts.xml could not be parsed properly");
                return new Config();
            }
        }
        return config;
    }

    private static Family readFamily(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "variant");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(null, "weight");
                    int parseInt = attributeValue4 == null ? 400 : Integer.parseInt(attributeValue4);
                    boolean equals = "italic".equals(xmlPullParser.getAttributeValue(null, "style"));
                    if (xmlPullParser.next() == 4) {
                        arrayList.add(new FileFontKey(parseInt, equals, a$$ExternalSyntheticOutline0.m("/system/fonts/", xmlPullParser.getText())));
                        while (true) {
                            if (xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equals("font")) {
                                xmlPullParser.next();
                            }
                        }
                    }
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        return new Family(attributeValue, arrayList, attributeValue2, attributeValue3);
    }

    @Nullable
    private static String safelyGetMatchingFont(FontKey fontKey) {
        try {
            return getMatchingFont(fontKey);
        } catch (RuntimeException unused) {
            Log.e(TAG, "Could not load /system/etc/fonts.xml file - defaulting to standard file");
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : defaultSystemFonts) {
                if (new File("/system/fonts/", strArr[3]).exists()) {
                    arrayList.add(new FileFontKey(Integer.parseInt(strArr[1]), strArr[2].equalsIgnoreCase("italic"), strArr[3]));
                }
            }
            return filter(arrayList, fontKey.getWeight(), fontKey.isItalic());
        }
    }

    private static void skip(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
