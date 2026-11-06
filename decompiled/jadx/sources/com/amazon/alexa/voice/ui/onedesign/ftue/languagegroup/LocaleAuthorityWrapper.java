package com.amazon.alexa.voice.ui.onedesign.ftue.languagegroup;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority;
import com.amazon.alexa.voice.ui.locale.LocaleUpdateCallback;
import com.amazon.regulator.Component;
import com.amazon.regulator.internal.Preconditions;
import java.util.List;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class LocaleAuthorityWrapper {
    private static final String TAG = "LocaleAuthorityWrapper";
    private final AlexaLocaleAuthority alexaLocaleAuthority;

    @VisibleForTesting
    public LocaleAuthorityWrapper(@Nullable AlexaLocaleAuthority alexaLocaleAuthority) {
        this.alexaLocaleAuthority = alexaLocaleAuthority;
    }

    public static LocaleAuthorityWrapper from(Component component) {
        Preconditions.nonNull(component, "component must not be null");
        if (component.isRegistered(AlexaLocaleAuthority.class)) {
            return new LocaleAuthorityWrapper((AlexaLocaleAuthority) component.get(AlexaLocaleAuthority.class));
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Requires a localeAuthority object. Couldn't find any");
        return null;
    }

    public Locale getLocale() {
        AlexaLocaleAuthority alexaLocaleAuthority = this.alexaLocaleAuthority;
        if (alexaLocaleAuthority != null) {
            return alexaLocaleAuthority.getLocale();
        }
        return null;
    }

    public List<Locale> getLocales() {
        AlexaLocaleAuthority alexaLocaleAuthority = this.alexaLocaleAuthority;
        if (alexaLocaleAuthority != null) {
            return alexaLocaleAuthority.getLocales();
        }
        return null;
    }

    public void setLocale(Locale locale, LocaleUpdateCallback localeUpdateCallback) {
        AlexaLocaleAuthority alexaLocaleAuthority = this.alexaLocaleAuthority;
        if (alexaLocaleAuthority == null) {
            Log.w(TAG, "All the locale authorities are null");
        } else {
            alexaLocaleAuthority.setLocale(locale);
            localeUpdateCallback.onSuccess();
        }
    }

    public void setLocales(List<Locale> list, LocaleUpdateCallback localeUpdateCallback) {
        AlexaLocaleAuthority alexaLocaleAuthority = this.alexaLocaleAuthority;
        if (alexaLocaleAuthority == null) {
            Log.w(TAG, "AlexaLocaleAuthority is null");
        } else {
            alexaLocaleAuthority.setLocales(list);
            localeUpdateCallback.onSuccess();
        }
    }
}
