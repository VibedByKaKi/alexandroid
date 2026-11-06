package com.amazon.alexa.voice.locale;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface LocaleInteractor {
    void fetchSupportedLocales(SupportedLocalesCallback supportedLocalesCallback);

    void fetchSupportedLocalesCombinations(SupportedLocaleCombinationsCallback supportedLocaleCombinationsCallback);

    List<Locale> getCurrentLocales();

    Locale getPrimaryLocale();

    void initialize();

    boolean needsLanguagePickerEducation();

    void release();

    void setSystemLocalesUpdatedTo(@NonNull List<Locale> list, int i, @Nullable LocaleUpdateCallback localeUpdateCallback);
}
