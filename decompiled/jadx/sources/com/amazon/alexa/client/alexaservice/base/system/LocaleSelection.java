package com.amazon.alexa.client.alexaservice.base.system;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class LocaleSelection {
    private final List<Locale> requestedLocales;
    private final List<Locale> systemLocales;

    private LocaleSelection(List<Locale> list, List<Locale> list2) {
        this.requestedLocales = immutableCopy(list);
        this.systemLocales = immutableCopy(list2);
    }

    public static LocaleSelection create(List<Locale> list, List<Locale> list2) {
        return new LocaleSelection(list, list2);
    }

    private static List<Locale> immutableCopy(List<Locale> list) {
        return ErrorUtils$$ExternalSyntheticOutline0.m(list);
    }

    public List<Locale> getRequestedLocales() {
        return this.requestedLocales;
    }

    public List<Locale> getSystemLocales() {
        return this.systemLocales;
    }
}
