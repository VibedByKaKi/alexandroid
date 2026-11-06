package com.amazon.alexa.biloba.network.api;

import com.amazon.alexa.biloba.generated.network.SchedulerProvider;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.dee.app.http.CoralService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class GroupV2Api_Factory implements Factory<GroupV2Api> {
    private final Provider<CoralService> coralServiceProvider;
    private final Provider<PersonIdProvider> personIdProvider;
    private final Provider<SchedulerProvider> schedulerProvider;

    public GroupV2Api_Factory(Provider<CoralService> provider, Provider<PersonIdProvider> provider2, Provider<SchedulerProvider> provider3) {
        this.coralServiceProvider = provider;
        this.personIdProvider = provider2;
        this.schedulerProvider = provider3;
    }

    public static GroupV2Api_Factory create(Provider<CoralService> provider, Provider<PersonIdProvider> provider2, Provider<SchedulerProvider> provider3) {
        return new GroupV2Api_Factory(provider, provider2, provider3);
    }

    public static GroupV2Api newInstance(CoralService coralService, PersonIdProvider personIdProvider, SchedulerProvider schedulerProvider) {
        return new GroupV2Api(coralService, personIdProvider, schedulerProvider);
    }

    @Override // javax.inject.Provider
    public GroupV2Api get() {
        return new GroupV2Api(this.coralServiceProvider.get(), this.personIdProvider.get(), this.schedulerProvider.get());
    }
}
