package com.dee.app.contacts.core;

import com.dee.app.contacts.api.DevicesApiHandler;
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
public final class DeviceManager_Factory implements Factory<DeviceManager> {
    private final Provider<DevicesApiHandler> mDevicesApiHandlerProvider;

    public DeviceManager_Factory(Provider<DevicesApiHandler> provider) {
        this.mDevicesApiHandlerProvider = provider;
    }

    public static DeviceManager_Factory create(Provider<DevicesApiHandler> provider) {
        return new DeviceManager_Factory(provider);
    }

    public static DeviceManager newInstance() {
        return new DeviceManager();
    }

    @Override // javax.inject.Provider
    public DeviceManager get() {
        DeviceManager newInstance = newInstance();
        DeviceManager_MembersInjector.injectMDevicesApiHandler(newInstance, this.mDevicesApiHandlerProvider.get());
        return newInstance;
    }
}
