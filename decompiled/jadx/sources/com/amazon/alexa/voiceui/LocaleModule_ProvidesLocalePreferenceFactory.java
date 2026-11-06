package com.amazon.alexa.voiceui;

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
/* loaded from: classes20.dex */
public final class LocaleModule_ProvidesLocalePreferenceFactory implements Factory<LocalePreference> {
    private final Provider<Context> contextProvider;

    public LocaleModule_ProvidesLocalePreferenceFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static LocaleModule_ProvidesLocalePreferenceFactory create(Provider<Context> provider) {
        return new LocaleModule_ProvidesLocalePreferenceFactory(provider);
    }

    public static LocalePreference providesLocalePreference(Context context) {
        return (LocalePreference) Preconditions.checkNotNullFromProvides(LocaleModule.providesLocalePreference(context));
    }

    @Override // javax.inject.Provider
    public LocalePreference get() {
        return providesLocalePreference(this.contextProvider.get());
    }
}
