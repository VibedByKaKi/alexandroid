package com.amazon.alexa.client.alexaservice.features.speaker;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UpdateVolumeFromSystemCallable_Factory implements Factory<UpdateVolumeFromSystemCallable> {
    private final Provider<VolumeAuthority> volumeAuthorityProvider;

    public UpdateVolumeFromSystemCallable_Factory(Provider<VolumeAuthority> provider) {
        this.volumeAuthorityProvider = provider;
    }

    public static UpdateVolumeFromSystemCallable_Factory create(Provider<VolumeAuthority> provider) {
        return new UpdateVolumeFromSystemCallable_Factory(provider);
    }

    public static UpdateVolumeFromSystemCallable newInstance(VolumeAuthority volumeAuthority) {
        return new UpdateVolumeFromSystemCallable(volumeAuthority);
    }

    @Override // javax.inject.Provider
    public UpdateVolumeFromSystemCallable get() {
        return newInstance(this.volumeAuthorityProvider.get());
    }
}
