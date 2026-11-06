package com.amazon.alexa.voice.locale;

import com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup.LocaleGroup;
import com.amazon.alexa.voice.utils.Preconditions;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class LocaleRecommendationPreselectionHelper {
    private static final Map<String, ArrayList<Locale>> OTHER_RECOMMENDED_LOCALES_LIST;
    private static final Map<String, ArrayList<LocaleGroup>> OTHER_RECOMMENDED_LOCALES_LIST_COMBINATIONS;

    static {
        HashMap hashMap = new HashMap();
        OTHER_RECOMMENDED_LOCALES_LIST = hashMap;
        HashMap hashMap2 = new HashMap();
        OTHER_RECOMMENDED_LOCALES_LIST_COMBINATIONS = hashMap2;
        hashMap.put("NL", Lists.newArrayList(new Locale("nl", "NL"), new Locale("en", "GB"), new Locale("de", "DE")));
        hashMap.put("AE", Lists.newArrayList(new Locale("ar", "SA")));
        hashMap2.put("NL", Lists.newArrayList(new LocaleGroup(Arrays.asList(new Locale("nl", "NL"))), new LocaleGroup(Arrays.asList(new Locale("en", "GB"))), new LocaleGroup(Arrays.asList(new Locale("de", "DE")))));
        hashMap2.put("AE", Lists.newArrayList(new LocaleGroup(Arrays.asList(new Locale("ar", "SA")))));
    }

    private LocaleRecommendationPreselectionHelper() {
    }

    private static boolean doAllLocalesMatchPFMCountryCode(List<Locale> list, String str) {
        Preconditions.notNullOrEmpty("locales", list);
        Preconditions.notBlank("marketPlaceCountryCode", str);
        Iterator<Locale> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!it2.next().getCountry().equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static Locale getPreselectedLocale(Locale locale, List<Locale> list) {
        Preconditions.notNullOrEmpty("recommendedLocales", list);
        Preconditions.notNull("currentSystemLocale", locale);
        if (list.size() == 1) {
            return list.get(0);
        }
        for (Locale locale2 : list) {
            if (locale2.getLanguage().equals(locale.getLanguage())) {
                return locale2;
            }
        }
        for (Locale locale3 : list) {
            if (locale3.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                return locale3;
            }
        }
        return list.get(0);
    }

    public static LocaleGroup getPreselectedLocaleCombination(Locale locale, List<LocaleGroup> list) {
        Preconditions.notNullOrEmpty("recommendedLocales", list);
        Preconditions.notNull("currentSystemLocale", locale);
        if (list.size() == 1) {
            return list.get(0);
        }
        for (LocaleGroup localeGroup : list) {
            if (localeGroup.getLocales().size() == 1 && localeGroup.getLocales().get(0).getLanguage().equals(locale.getLanguage())) {
                return localeGroup;
            }
        }
        for (LocaleGroup localeGroup2 : list) {
            if (localeGroup2.getLocales().size() == 1 && localeGroup2.getLocales().get(0).getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                return localeGroup2;
            }
        }
        return list.get(0);
    }

    public static ArrayList<Locale> getRecommendedLocale(String str, List<Locale> list) {
        Preconditions.notNullOrEmpty("alexaSupportedLocales", list);
        Preconditions.notBlank("marketPlaceCountryCode", str);
        ArrayList<Locale> arrayList = new ArrayList<>();
        for (Locale locale : list) {
            if (locale.getCountry().equals(str)) {
                arrayList.add(locale);
            }
        }
        ArrayList<Locale> arrayList2 = OTHER_RECOMMENDED_LOCALES_LIST.get(str);
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList<Locale> arrayList3 = new ArrayList<>();
            Iterator<Locale> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Locale next = it2.next();
                if (list.contains(next)) {
                    arrayList3.add(next);
                }
            }
            if (arrayList3.size() > 0) {
                return arrayList3;
            }
        }
        return arrayList;
    }

    public static ArrayList<LocaleGroup> getRecommendedLocaleCombination(String str, List<List<Locale>> list) {
        Preconditions.notNullOrEmpty("alexaSupportedLocales", list);
        Preconditions.notBlank("marketPlaceCountryCode", str);
        ArrayList<LocaleGroup> arrayList = new ArrayList<>();
        for (List<Locale> list2 : list) {
            if (doAllLocalesMatchPFMCountryCode(list2, str)) {
                arrayList.add(new LocaleGroup(list2));
            }
        }
        ArrayList<LocaleGroup> arrayList2 = OTHER_RECOMMENDED_LOCALES_LIST_COMBINATIONS.get(str);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList<LocaleGroup> arrayList3 = new ArrayList<>();
            Iterator<LocaleGroup> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                LocaleGroup next = it2.next();
                if (list.contains(next.getLocales())) {
                    arrayList3.add(next);
                }
            }
            if (!arrayList3.isEmpty()) {
                return arrayList3;
            }
        }
        return arrayList;
    }
}
