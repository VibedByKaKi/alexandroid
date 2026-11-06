package com.amazon.alexa.voice.locale;

import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface LocalePreference {
    void clearData();

    List<Locale> fetchCurrentLocale();

    void settingUpdatedByUser(boolean z);

    void storeCurrentLocale(@NotNull List<Locale> list);

    boolean wasUpdatedByUser();
}
