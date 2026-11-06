package com.amazon.alexa.biloba.dependency;

import androidx.annotation.NonNull;
import com.amazon.alexa.biloba.generated.network.SchedulerProvider;
import com.amazon.alexa.biloba.generated.network.api.DevicesApi;
import com.amazon.alexa.biloba.service.AlertConfigurationApi;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.dee.app.http.CoralService;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public final class AlertConfigurationModule {
    private AlertConfigurationModule() {
    }

    @Provides
    public static AlertConfigurationApi provideAlertConfigurationApi(@NonNull CoralService coralService, @NonNull PersonIdProvider personIdProvider, @NonNull SchedulerProvider schedulerProvider) {
        return new AlertConfigurationApi(coralService, personIdProvider, schedulerProvider);
    }

    @Provides
    public static DevicesApi provideDevicesApi(@NonNull CoralService coralService, @NonNull PersonIdProvider personIdProvider, @NonNull SchedulerProvider schedulerProvider) {
        return new DevicesApi(coralService, personIdProvider, schedulerProvider);
    }
}
