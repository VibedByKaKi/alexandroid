package com.amazon.alexa.benefits.models.service;

import com.dee.app.http.CoralService;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class GetAllBenefitsApi_MembersInjector implements MembersInjector<GetAllBenefitsApi> {
    private final Provider<CoralService> coralServiceProvider;
    private final Provider<SchedulerProvider> schedulerProvider;

    public GetAllBenefitsApi_MembersInjector(Provider<CoralService> provider, Provider<SchedulerProvider> provider2) {
        this.coralServiceProvider = provider;
        this.schedulerProvider = provider2;
    }

    public static MembersInjector<GetAllBenefitsApi> create(Provider<CoralService> provider, Provider<SchedulerProvider> provider2) {
        return new GetAllBenefitsApi_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.alexa.benefits.models.service.GetAllBenefitsApi.coralService")
    public static void injectCoralService(GetAllBenefitsApi getAllBenefitsApi, Lazy<CoralService> lazy) {
        getAllBenefitsApi.coralService = lazy;
    }

    @InjectedFieldSignature("com.amazon.alexa.benefits.models.service.GetAllBenefitsApi.schedulerProvider")
    public static void injectSchedulerProvider(GetAllBenefitsApi getAllBenefitsApi, Lazy<SchedulerProvider> lazy) {
        getAllBenefitsApi.schedulerProvider = lazy;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GetAllBenefitsApi getAllBenefitsApi) {
        injectCoralService(getAllBenefitsApi, DoubleCheck.lazy(this.coralServiceProvider));
        injectSchedulerProvider(getAllBenefitsApi, DoubleCheck.lazy(this.schedulerProvider));
    }
}
