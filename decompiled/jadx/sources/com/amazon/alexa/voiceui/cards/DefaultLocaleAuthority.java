package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voice.ui.locale.GetLocaleAuthority;
import com.amazon.alexa.voiceui.LocalePreference;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class DefaultLocaleAuthority implements GetLocaleAuthority {
    private final LocalePreference alexaLocalePreference;
    private Locale locale;
    private List<Locale> locales;

    @Inject
    public DefaultLocaleAuthority(LocalePreference localePreference) {
        this.alexaLocalePreference = localePreference;
    }

    @Override // com.amazon.alexa.voice.ui.locale.GetLocaleAuthority
    public Locale getLocale() {
        Locale locale = this.locale;
        return locale == null ? this.alexaLocalePreference.getSingleLocale() : locale;
    }

    @Override // com.amazon.alexa.voice.ui.locale.GetLocaleAuthority
    public List<Locale> getLocales() {
        return this.locales;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
        this.alexaLocalePreference.storeSingleLocale(locale);
    }

    public void setLocales(List<Locale> list) {
        this.locales = list;
    }
}
