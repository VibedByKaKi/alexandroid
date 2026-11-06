package com.amazon.alexa.voice.tta;

import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.ra.RaFeatureEnabler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class TypeToAlexaModule {
    private TypeToAlexaModule() {
    }

    @Provides
    @Singleton
    public static TypeToAlexaFeatureEnabler provideTypeToAlexaFeatureEnabler(LocaleInteractor localeInteractor, RaFeatureEnabler raFeatureEnabler) {
        return new TypeToAlexaFeatureEnabler(localeInteractor, raFeatureEnabler);
    }
}
