package com.amazon.alexa.voice.ui.locale;

import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AlexaLocaleAuthority extends GetLocaleAuthority {
    void setLocale(Locale locale);

    void setLocale(Locale locale, LocaleUpdateCallback localeUpdateCallback);

    void setLocales(List<Locale> list);

    void setLocales(List<Locale> list, LocaleUpdateCallback localeUpdateCallback);
}
