package com.amazon.alexa.voiceui;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AlexaLocalePreference implements LocalePreference {

    @VisibleForTesting
    static final String ALEXA_LOCALE_PREFS_FILE_NAME = "alexa_locale_prefs";

    @VisibleForTesting
    static final String SINGLE_LOCALE_KEY = "single_locale_key";
    private static final String TAG = "AlexaLocalePreference";
    private final SharedPreferences sharedPreferences;

    public AlexaLocalePreference(@NonNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(ALEXA_LOCALE_PREFS_FILE_NAME, 0);
    }

    @Override // com.amazon.alexa.voiceui.LocalePreference
    public void clearLocale() {
        this.sharedPreferences.edit().remove(SINGLE_LOCALE_KEY).apply();
    }

    @Override // com.amazon.alexa.voiceui.LocalePreference
    public Locale getSingleLocale() {
        String string = this.sharedPreferences.getString(SINGLE_LOCALE_KEY, null);
        if (string != null) {
            return Locale.forLanguageTag(string);
        }
        return null;
    }

    @Override // com.amazon.alexa.voiceui.LocalePreference
    public void storeSingleLocale(Locale locale) {
        if (locale != null) {
            this.sharedPreferences.edit().putString(SINGLE_LOCALE_KEY, locale.toLanguageTag()).apply();
        }
    }
}
