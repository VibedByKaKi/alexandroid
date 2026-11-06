package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ParsedLocaleIdentifier {
    ParsedLanguageIdentifier languageIdentifier;
    TreeMap<Character, ArrayList<String>> otherExtensionsMap;
    ArrayList<String> puExtensions;
    TreeMap<String, ArrayList<String>> transformedExtensionFields;
    ParsedLanguageIdentifier transformedLanguageIdentifier;
    ArrayList<CharSequence> unicodeExtensionAttributes;
    TreeMap<String, ArrayList<String>> unicodeExtensionKeywords;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ParsedLanguageIdentifier {
        String languageSubtag;
        String regionSubtag;
        String scriptSubtag;
        ArrayList<String> variantSubtagList;
    }
}
