package com.amazon.alexa.voice.tta;

import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.ra.RaFeatureEnabler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TypeToAlexaFeatureEnabler {
    public static final Map<Locale, Locale> DEVICE_LOCALE_AVS_LOCALE_MAP;
    private static final Set<Locale> RA_ONLY_SUPPORTED_LOCALES;
    private static final String TAG = "TypeToAlexaFeatureEnabler";
    private final LocaleInteractor localeInteractor;
    private final RaFeatureEnabler raFeatureEnabler;

    static {
        Object[] objArr = {new Locale("hi", "IN")};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RA_ONLY_SUPPORTED_LOCALES = new HashSet(Collections.unmodifiableList(arrayList));
        HashMap hashMap = new HashMap();
        DEVICE_LOCALE_AVS_LOCALE_MAP = hashMap;
        hashMap.put(new Locale("en", "NZ"), new Locale("en", "AU"));
        hashMap.put(new Locale("en", "IE"), new Locale("en", "GB"));
        hashMap.put(new Locale("de", "AT"), new Locale("de", "DE"));
    }

    @Inject
    public TypeToAlexaFeatureEnabler(LocaleInteractor localeInteractor, RaFeatureEnabler raFeatureEnabler) {
        this.localeInteractor = localeInteractor;
        this.raFeatureEnabler = raFeatureEnabler;
    }

    public boolean isLocaleExcluded(Locale locale) {
        if (locale == null) {
            return true;
        }
        locale.toString();
        return RA_ONLY_SUPPORTED_LOCALES.contains(locale) && !this.raFeatureEnabler.isEnabled();
    }

    public boolean isTypeToAlexaAvailable() {
        Locale stripExtensions = Locale.getDefault().stripExtensions();
        return !isLocaleExcluded(DEVICE_LOCALE_AVS_LOCALE_MAP.getOrDefault(stripExtensions, stripExtensions));
    }

    public boolean isTypeToAlexaEnabled() {
        Locale primaryLocale = this.localeInteractor.getPrimaryLocale();
        return (primaryLocale == null || isLocaleExcluded(primaryLocale)) ? false : true;
    }
}
