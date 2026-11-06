package com.amazon.alexa.client.alexaservice.ui.display.window;

import com.amazon.alexa.client.alexaservice.ui.drivemode.DriveModeAuthority;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AlexaDisplayWindowComponentStateProvider_Factory implements Factory<AlexaDisplayWindowComponentStateProvider> {
    private final Provider<DriveModeAuthority> driveModeAuthorityProvider;

    public AlexaDisplayWindowComponentStateProvider_Factory(Provider<DriveModeAuthority> provider) {
        this.driveModeAuthorityProvider = provider;
    }

    public static AlexaDisplayWindowComponentStateProvider_Factory create(Provider<DriveModeAuthority> provider) {
        return new AlexaDisplayWindowComponentStateProvider_Factory(provider);
    }

    public static AlexaDisplayWindowComponentStateProvider newInstance(DriveModeAuthority driveModeAuthority) {
        return new AlexaDisplayWindowComponentStateProvider(driveModeAuthority);
    }

    @Override // javax.inject.Provider
    public AlexaDisplayWindowComponentStateProvider get() {
        return newInstance(this.driveModeAuthorityProvider.get());
    }
}
