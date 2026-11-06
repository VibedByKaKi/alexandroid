package com.amazon.alexa.matter.utils.os;

import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.matter.identity.GetCustomerTimezoneClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class TimezoneBasedCountryCodeSupplier_Factory implements Factory<TimezoneBasedCountryCodeSupplier> {
    private final Provider<GetCustomerTimezoneClient> getCustomerTimezoneClientProvider;
    private final Provider<MatterLogger> matterLoggerProvider;

    public TimezoneBasedCountryCodeSupplier_Factory(Provider<GetCustomerTimezoneClient> provider, Provider<MatterLogger> provider2) {
        this.getCustomerTimezoneClientProvider = provider;
        this.matterLoggerProvider = provider2;
    }

    public static TimezoneBasedCountryCodeSupplier_Factory create(Provider<GetCustomerTimezoneClient> provider, Provider<MatterLogger> provider2) {
        return new TimezoneBasedCountryCodeSupplier_Factory(provider, provider2);
    }

    public static TimezoneBasedCountryCodeSupplier newInstance(GetCustomerTimezoneClient getCustomerTimezoneClient, MatterLogger matterLogger) {
        return new TimezoneBasedCountryCodeSupplier(getCustomerTimezoneClient, matterLogger);
    }

    @Override // javax.inject.Provider
    public TimezoneBasedCountryCodeSupplier get() {
        return newInstance(this.getCustomerTimezoneClientProvider.get(), this.matterLoggerProvider.get());
    }
}
