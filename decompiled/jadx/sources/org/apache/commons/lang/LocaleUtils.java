package org.apache.commons.lang;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LocaleUtils {
    private static List cAvailableLocaleList;
    private static Set cAvailableLocaleSet;
    private static final Map cLanguagesByCountry = ParcelCompat$$ExternalSyntheticOutline0.m();
    private static final Map cCountriesByLanguage = ParcelCompat$$ExternalSyntheticOutline0.m();

    public static List availableLocaleList() {
        if (cAvailableLocaleList == null) {
            initAvailableLocaleList();
        }
        return cAvailableLocaleList;
    }

    public static Set availableLocaleSet() {
        if (cAvailableLocaleSet == null) {
            initAvailableLocaleSet();
        }
        return cAvailableLocaleSet;
    }

    public static List countriesByLanguage(String str) {
        List list = (List) cCountriesByLanguage.get(str);
        if (list == null) {
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                List availableLocaleList = availableLocaleList();
                for (int i = 0; i < availableLocaleList.size(); i++) {
                    Locale locale = (Locale) availableLocaleList.get(i);
                    if (str.equals(locale.getLanguage()) && locale.getCountry().length() != 0 && locale.getVariant().length() == 0) {
                        arrayList.add(locale);
                    }
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = Collections.EMPTY_LIST;
            }
            cCountriesByLanguage.put(str, list);
        }
        return list;
    }

    private static synchronized void initAvailableLocaleList() {
        synchronized (LocaleUtils.class) {
            if (cAvailableLocaleList == null) {
                cAvailableLocaleList = Collections.unmodifiableList(Arrays.asList(Locale.getAvailableLocales()));
            }
        }
    }

    private static synchronized void initAvailableLocaleSet() {
        synchronized (LocaleUtils.class) {
            if (cAvailableLocaleSet == null) {
                cAvailableLocaleSet = Collections.unmodifiableSet(new HashSet(availableLocaleList()));
            }
        }
    }

    public static boolean isAvailableLocale(Locale locale) {
        return availableLocaleList().contains(locale);
    }

    public static List languagesByCountry(String str) {
        List list = (List) cLanguagesByCountry.get(str);
        if (list == null) {
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                List availableLocaleList = availableLocaleList();
                for (int i = 0; i < availableLocaleList.size(); i++) {
                    Locale locale = (Locale) availableLocaleList.get(i);
                    if (str.equals(locale.getCountry()) && locale.getVariant().length() == 0) {
                        arrayList.add(locale);
                    }
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = Collections.EMPTY_LIST;
            }
            cLanguagesByCountry.put(str, list);
        }
        return list;
    }

    public static List localeLookupList(Locale locale, Locale locale2) {
        ArrayList arrayList = new ArrayList(4);
        if (locale != null) {
            arrayList.add(locale);
            if (locale.getVariant().length() > 0) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (locale.getCountry().length() > 0) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Locale toLocale(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length != 2 && length != 5 && length < 7) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid locale format: ".concat(str));
            return null;
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        if (charAt < 'a' || charAt > 'z' || charAt2 < 'a' || charAt2 > 'z') {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid locale format: ".concat(str));
            return null;
        }
        if (length == 2) {
            return new Locale(str, "");
        }
        if (str.charAt(2) != '_') {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid locale format: ".concat(str));
            return null;
        }
        char charAt3 = str.charAt(3);
        if (charAt3 == '_') {
            return new Locale(str.substring(0, 2), "", str.substring(4));
        }
        char charAt4 = str.charAt(4);
        if (charAt3 < 'A' || charAt3 > 'Z' || charAt4 < 'A' || charAt4 > 'Z') {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid locale format: ".concat(str));
            return null;
        }
        if (length == 5) {
            return new Locale(str.substring(0, 2), str.substring(3, 5));
        }
        if (str.charAt(5) == '_') {
            return new Locale(str.substring(0, 2), str.substring(3, 5), str.substring(6));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid locale format: ".concat(str));
        return null;
    }

    public static List localeLookupList(Locale locale) {
        return localeLookupList(locale, locale);
    }
}
