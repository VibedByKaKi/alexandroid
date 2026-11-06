package com.amazon.alexa.voiceui.chrome;

import com.amazon.alexa.voiceui.AlexaServicesApis;
import com.amazon.alexa.voiceui.cards.DefaultLocaleAuthority;
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
public final class VoiceChromeModel_Factory implements Factory<VoiceChromeModel> {
    private final Provider<AlexaServicesApis> alexaServicesApisProvider;
    private final Provider<DefaultLocaleAuthority> localeAuthorityProvider;

    public VoiceChromeModel_Factory(Provider<AlexaServicesApis> provider, Provider<DefaultLocaleAuthority> provider2) {
        this.alexaServicesApisProvider = provider;
        this.localeAuthorityProvider = provider2;
    }

    public static VoiceChromeModel_Factory create(Provider<AlexaServicesApis> provider, Provider<DefaultLocaleAuthority> provider2) {
        return new VoiceChromeModel_Factory(provider, provider2);
    }

    public static VoiceChromeModel newInstance(AlexaServicesApis alexaServicesApis, DefaultLocaleAuthority defaultLocaleAuthority) {
        return new VoiceChromeModel(alexaServicesApis, defaultLocaleAuthority);
    }

    @Override // javax.inject.Provider
    public VoiceChromeModel get() {
        return newInstance(this.alexaServicesApisProvider.get(), this.localeAuthorityProvider.get());
    }
}
