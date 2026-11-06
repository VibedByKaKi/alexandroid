package com.amazon.alexa.voice.handsfree.settings.locale.languagedata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LanguageData {
    private final String mCountryCode;
    private final Locale mDeviceLanguage;
    private final Locale mPreferredLanguage;
    private final Set<Locale> mSupportedLanguages;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LanguageCode {
        en,
        es,
        pt,
        fr,
        de,
        it,
        ja,
        hi
    }

    public LanguageData(@Nullable String str, @NonNull Locale locale, @NonNull Locale locale2, @NonNull Set<Locale> set) {
        this.mDeviceLanguage = locale;
        this.mCountryCode = str;
        this.mPreferredLanguage = locale2;
        this.mSupportedLanguages = set;
    }

    @Nullable
    public String getCountryCode() {
        return this.mCountryCode;
    }

    @NonNull
    public Locale getDeviceLanguage() {
        return this.mDeviceLanguage;
    }

    public Locale getPreferredLanguage() {
        return this.mPreferredLanguage;
    }

    public Set<Locale> getSupportedLanguages() {
        return this.mSupportedLanguages;
    }
}
