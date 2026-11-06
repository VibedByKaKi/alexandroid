package com.amazon.alexa.client.alexaservice.features.profiles;

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
public final class AlexaIdentityRecognitionStateProvider_Factory implements Factory<AlexaIdentityRecognitionStateProvider> {
    private final Provider<UserProfileAuthority> userProfileAuthorityProvider;

    public AlexaIdentityRecognitionStateProvider_Factory(Provider<UserProfileAuthority> provider) {
        this.userProfileAuthorityProvider = provider;
    }

    public static AlexaIdentityRecognitionStateProvider_Factory create(Provider<UserProfileAuthority> provider) {
        return new AlexaIdentityRecognitionStateProvider_Factory(provider);
    }

    public static AlexaIdentityRecognitionStateProvider newInstance(UserProfileAuthority userProfileAuthority) {
        return new AlexaIdentityRecognitionStateProvider(userProfileAuthority);
    }

    @Override // javax.inject.Provider
    public AlexaIdentityRecognitionStateProvider get() {
        return newInstance(this.userProfileAuthorityProvider.get());
    }
}
