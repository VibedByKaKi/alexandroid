package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voiceui.LocalePreference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class DefaultLocaleAuthority_Factory implements Factory<DefaultLocaleAuthority> {
    private final Provider<LocalePreference> alexaLocalePreferenceProvider;

    public DefaultLocaleAuthority_Factory(Provider<LocalePreference> provider) {
        this.alexaLocalePreferenceProvider = provider;
    }

    public static DefaultLocaleAuthority_Factory create(Provider<LocalePreference> provider) {
        return new DefaultLocaleAuthority_Factory(provider);
    }

    public static DefaultLocaleAuthority newInstance(LocalePreference localePreference) {
        return new DefaultLocaleAuthority(localePreference);
    }

    @Override // javax.inject.Provider
    public DefaultLocaleAuthority get() {
        return newInstance(this.alexaLocalePreferenceProvider.get());
    }
}
