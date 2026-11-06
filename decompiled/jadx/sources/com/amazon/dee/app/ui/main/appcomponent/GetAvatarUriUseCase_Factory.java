package com.amazon.dee.app.ui.main.appcomponent;

import com.amazon.alexa.identity.ApesCallerInterface;
import com.amazon.alexa.identity.api.IdentityService;
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
public final class GetAvatarUriUseCase_Factory implements Factory<GetAvatarUriUseCase> {
    private final Provider<ApesCallerInterface> apesCallerProvider;
    private final Provider<GlobalHeaderState> globalHeaderStateProvider;
    private final Provider<IdentityService> identityServiceProvider;

    public GetAvatarUriUseCase_Factory(Provider<ApesCallerInterface> provider, Provider<GlobalHeaderState> provider2, Provider<IdentityService> provider3) {
        this.apesCallerProvider = provider;
        this.globalHeaderStateProvider = provider2;
        this.identityServiceProvider = provider3;
    }

    public static GetAvatarUriUseCase_Factory create(Provider<ApesCallerInterface> provider, Provider<GlobalHeaderState> provider2, Provider<IdentityService> provider3) {
        return new GetAvatarUriUseCase_Factory(provider, provider2, provider3);
    }

    public static GetAvatarUriUseCase newInstance(ApesCallerInterface apesCallerInterface, GlobalHeaderState globalHeaderState, IdentityService identityService) {
        return new GetAvatarUriUseCase(apesCallerInterface, globalHeaderState, identityService);
    }

    @Override // javax.inject.Provider
    public GetAvatarUriUseCase get() {
        return newInstance(this.apesCallerProvider.get(), this.globalHeaderStateProvider.get(), this.identityServiceProvider.get());
    }
}
