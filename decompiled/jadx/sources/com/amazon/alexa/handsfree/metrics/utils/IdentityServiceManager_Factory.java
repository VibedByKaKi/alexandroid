package com.amazon.alexa.handsfree.metrics.utils;

import com.amazon.alexa.identity.api.IdentityService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class IdentityServiceManager_Factory implements Factory<IdentityServiceManager> {
    private final Provider<IdentityService> identityServiceProvider;

    public IdentityServiceManager_Factory(Provider<IdentityService> provider) {
        this.identityServiceProvider = provider;
    }

    public static Factory<IdentityServiceManager> create(Provider<IdentityService> provider) {
        return new IdentityServiceManager_Factory(provider);
    }

    public static IdentityServiceManager newIdentityServiceManager(IdentityService identityService) {
        return new IdentityServiceManager(identityService);
    }

    @Override // javax.inject.Provider
    public IdentityServiceManager get() {
        return new IdentityServiceManager(this.identityServiceProvider.get());
    }
}
