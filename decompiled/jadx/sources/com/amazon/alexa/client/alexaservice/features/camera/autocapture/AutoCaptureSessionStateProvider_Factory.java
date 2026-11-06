package com.amazon.alexa.client.alexaservice.features.camera.autocapture;

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
public final class AutoCaptureSessionStateProvider_Factory implements Factory<AutoCaptureSessionStateProvider> {
    private final Provider<AutoCaptureSessionAuthority> authorityProvider;

    public AutoCaptureSessionStateProvider_Factory(Provider<AutoCaptureSessionAuthority> provider) {
        this.authorityProvider = provider;
    }

    public static AutoCaptureSessionStateProvider_Factory create(Provider<AutoCaptureSessionAuthority> provider) {
        return new AutoCaptureSessionStateProvider_Factory(provider);
    }

    public static AutoCaptureSessionStateProvider newInstance(AutoCaptureSessionAuthority autoCaptureSessionAuthority) {
        return new AutoCaptureSessionStateProvider(autoCaptureSessionAuthority);
    }

    @Override // javax.inject.Provider
    public AutoCaptureSessionStateProvider get() {
        return newInstance(this.authorityProvider.get());
    }
}
