package com.amazon.alexa.client.alexaservice.features.camera.video;

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
public final class VideoCaptureSessionStateProvider_Factory implements Factory<VideoCaptureSessionStateProvider> {
    private final Provider<VideoCaptureSessionAuthority> authorityProvider;

    public VideoCaptureSessionStateProvider_Factory(Provider<VideoCaptureSessionAuthority> provider) {
        this.authorityProvider = provider;
    }

    public static VideoCaptureSessionStateProvider_Factory create(Provider<VideoCaptureSessionAuthority> provider) {
        return new VideoCaptureSessionStateProvider_Factory(provider);
    }

    public static VideoCaptureSessionStateProvider newInstance(VideoCaptureSessionAuthority videoCaptureSessionAuthority) {
        return new VideoCaptureSessionStateProvider(videoCaptureSessionAuthority);
    }

    @Override // javax.inject.Provider
    public VideoCaptureSessionStateProvider get() {
        return newInstance(this.authorityProvider.get());
    }
}
