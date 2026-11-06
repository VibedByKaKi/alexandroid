package com.amazon.alexa.biloba.dependency;

import com.amazon.alexa.biloba.generated.network.SchedulerProvider;
import com.amazon.alexa.biloba.service.TimeZoneApi;
import com.dee.app.http.CoralService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class TimeZoneModule_ProvideTimeZoneApiFactory implements Factory<TimeZoneApi> {
    private final Provider<CoralService> coralServiceProvider;
    private final Provider<SchedulerProvider> schedulerProvider;

    public TimeZoneModule_ProvideTimeZoneApiFactory(Provider<CoralService> provider, Provider<SchedulerProvider> provider2) {
        this.coralServiceProvider = provider;
        this.schedulerProvider = provider2;
    }

    public static TimeZoneModule_ProvideTimeZoneApiFactory create(Provider<CoralService> provider, Provider<SchedulerProvider> provider2) {
        return new TimeZoneModule_ProvideTimeZoneApiFactory(provider, provider2);
    }

    public static TimeZoneApi provideTimeZoneApi(CoralService coralService, SchedulerProvider schedulerProvider) {
        return (TimeZoneApi) Preconditions.checkNotNull(TimeZoneModule.provideTimeZoneApi(coralService, schedulerProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public TimeZoneApi get() {
        return provideTimeZoneApi(this.coralServiceProvider.get(), this.schedulerProvider.get());
    }
}
