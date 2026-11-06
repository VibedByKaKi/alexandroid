package com.amazon.alexa.client.alexaservice.metrics;

import com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementAuthority;
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
public final class EntitlementStatusProviderImpl_Factory implements Factory<EntitlementStatusProviderImpl> {
    private final Provider<BMCLEntitlementAuthority> bmclEntitlementAuthorityProvider;

    public EntitlementStatusProviderImpl_Factory(Provider<BMCLEntitlementAuthority> provider) {
        this.bmclEntitlementAuthorityProvider = provider;
    }

    public static EntitlementStatusProviderImpl_Factory create(Provider<BMCLEntitlementAuthority> provider) {
        return new EntitlementStatusProviderImpl_Factory(provider);
    }

    public static EntitlementStatusProviderImpl newInstance(BMCLEntitlementAuthority bMCLEntitlementAuthority) {
        return new EntitlementStatusProviderImpl(bMCLEntitlementAuthority);
    }

    @Override // javax.inject.Provider
    public EntitlementStatusProviderImpl get() {
        return newInstance(this.bmclEntitlementAuthorityProvider.get());
    }
}
