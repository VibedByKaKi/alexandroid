package com.amazon.alexa.voiceui;

import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface LocalePreference {
    void clearLocale();

    Locale getSingleLocale();

    void storeSingleLocale(Locale locale);
}
