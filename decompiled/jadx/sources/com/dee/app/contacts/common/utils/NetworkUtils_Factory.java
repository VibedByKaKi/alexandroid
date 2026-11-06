package com.dee.app.contacts.common.utils;

import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class NetworkUtils_Factory implements Factory<NetworkUtils> {
    private final Provider<AlexaCommsCoreIdentityService> commsIdentityManagerProvider;

    public NetworkUtils_Factory(Provider<AlexaCommsCoreIdentityService> provider) {
        this.commsIdentityManagerProvider = provider;
    }

    public static NetworkUtils_Factory create(Provider<AlexaCommsCoreIdentityService> provider) {
        return new NetworkUtils_Factory(provider);
    }

    public static NetworkUtils newInstance(AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        return new NetworkUtils(alexaCommsCoreIdentityService);
    }

    @Override // javax.inject.Provider
    public NetworkUtils get() {
        return newInstance(this.commsIdentityManagerProvider.get());
    }
}
