package com.dee.app.contacts.api;

import com.dee.app.contacts.api.devices.GetDevicesApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class DevicesApiHandler_Factory implements Factory<DevicesApiHandler> {
    private final Provider<GetDevicesApi> getDevicesApiProvider;

    public DevicesApiHandler_Factory(Provider<GetDevicesApi> provider) {
        this.getDevicesApiProvider = provider;
    }

    public static DevicesApiHandler_Factory create(Provider<GetDevicesApi> provider) {
        return new DevicesApiHandler_Factory(provider);
    }

    public static DevicesApiHandler newInstance(GetDevicesApi getDevicesApi) {
        return new DevicesApiHandler(getDevicesApi);
    }

    @Override // javax.inject.Provider
    public DevicesApiHandler get() {
        return newInstance(this.getDevicesApiProvider.get());
    }
}
