package com.amazon.dee.app.services.entitlement;

import com.amazon.alexa.benefits.api.BenefitsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DefaultEntitlementCheckerUseCase_Factory implements Factory<DefaultEntitlementCheckerUseCase> {
    private final Provider<BenefitsService> benefitsServiceProvider;

    public DefaultEntitlementCheckerUseCase_Factory(Provider<BenefitsService> provider) {
        this.benefitsServiceProvider = provider;
    }

    public static DefaultEntitlementCheckerUseCase_Factory create(Provider<BenefitsService> provider) {
        return new DefaultEntitlementCheckerUseCase_Factory(provider);
    }

    public static DefaultEntitlementCheckerUseCase newInstance(BenefitsService benefitsService) {
        return new DefaultEntitlementCheckerUseCase(benefitsService);
    }

    @Override // javax.inject.Provider
    public DefaultEntitlementCheckerUseCase get() {
        return newInstance(this.benefitsServiceProvider.get());
    }
}
