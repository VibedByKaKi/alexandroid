package com.amazon.alexa.voice.locale;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class LocaleModule_ProvideLocaleSettingFactory implements Factory<LocalePreference> {
    private final Provider<Context> applicationContextProvider;

    public LocaleModule_ProvideLocaleSettingFactory(Provider<Context> provider) {
        this.applicationContextProvider = provider;
    }

    public static LocaleModule_ProvideLocaleSettingFactory create(Provider<Context> provider) {
        return new LocaleModule_ProvideLocaleSettingFactory(provider);
    }

    public static LocalePreference provideLocaleSetting(Context context) {
        return (LocalePreference) Preconditions.checkNotNullFromProvides(LocaleModule.provideLocaleSetting(context));
    }

    @Override // javax.inject.Provider
    public LocalePreference get() {
        return provideLocaleSetting(this.applicationContextProvider.get());
    }
}
