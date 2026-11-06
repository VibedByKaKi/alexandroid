package com.amazon.alexa.voice.locale;

import androidx.core.os.LocaleListCompat;
import com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultLocaleAuthority implements AlexaLocaleAuthority {
    private final LocaleInteractor localeInteractor;

    public DefaultLocaleAuthority(LocaleInteractor localeInteractor) {
        this.localeInteractor = localeInteractor;
    }

    @Override // com.amazon.alexa.voice.ui.locale.GetLocaleAuthority
    public Locale getLocale() {
        return LocaleListCompat.getDefault().get(0);
    }

    @Override // com.amazon.alexa.voice.ui.locale.GetLocaleAuthority
    public List<Locale> getLocales() {
        ArrayList arrayList = new ArrayList();
        LocaleListCompat localeListCompat = LocaleListCompat.getDefault();
        for (int i = 0; i < localeListCompat.size(); i++) {
            arrayList.add(localeListCompat.get(i));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority
    public void setLocale(Locale locale) {
        setLocales(Arrays.asList(locale));
    }

    @Override // com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority
    public void setLocales(List<Locale> list, com.amazon.alexa.voice.ui.locale.LocaleUpdateCallback localeUpdateCallback) {
        this.localeInteractor.setSystemLocalesUpdatedTo(list, 1, null);
    }

    @Override // com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority
    public void setLocales(List<Locale> list) {
        setLocales(list, null);
    }

    @Override // com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority
    public void setLocale(Locale locale, com.amazon.alexa.voice.ui.locale.LocaleUpdateCallback localeUpdateCallback) {
        setLocales(Arrays.asList(locale), localeUpdateCallback);
    }
}
