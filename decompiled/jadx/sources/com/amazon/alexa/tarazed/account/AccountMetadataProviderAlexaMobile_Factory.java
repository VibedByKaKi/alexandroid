package com.amazon.alexa.tarazed.account;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.tarazed.utility.AccountPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AccountMetadataProviderAlexaMobile_Factory implements Factory<AccountMetadataProviderAlexaMobile> {
    private final Provider<AccountPreferences> accountPreferencesProvider;
    private final Provider<DeviceInformation> alexaMobileDeviceInformationProvider;
    private final Provider<IdentityService> identityServiceProvider;

    public AccountMetadataProviderAlexaMobile_Factory(Provider<IdentityService> provider, Provider<DeviceInformation> provider2, Provider<AccountPreferences> provider3) {
        this.identityServiceProvider = provider;
        this.alexaMobileDeviceInformationProvider = provider2;
        this.accountPreferencesProvider = provider3;
    }

    public static Factory<AccountMetadataProviderAlexaMobile> create(Provider<IdentityService> provider, Provider<DeviceInformation> provider2, Provider<AccountPreferences> provider3) {
        return new AccountMetadataProviderAlexaMobile_Factory(provider, provider2, provider3);
    }

    @Override // javax.inject.Provider
    public AccountMetadataProviderAlexaMobile get() {
        return new AccountMetadataProviderAlexaMobile(this.identityServiceProvider.get(), this.alexaMobileDeviceInformationProvider.get(), this.accountPreferencesProvider.get());
    }
}
