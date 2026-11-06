package com.dee.app.contacts.core;

import com.dee.app.contacts.api.DevicesApiHandler;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class DeviceManager_MembersInjector implements MembersInjector<DeviceManager> {
    private final Provider<DevicesApiHandler> mDevicesApiHandlerProvider;

    public DeviceManager_MembersInjector(Provider<DevicesApiHandler> provider) {
        this.mDevicesApiHandlerProvider = provider;
    }

    public static MembersInjector<DeviceManager> create(Provider<DevicesApiHandler> provider) {
        return new DeviceManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.dee.app.contacts.core.DeviceManager.mDevicesApiHandler")
    public static void injectMDevicesApiHandler(DeviceManager deviceManager, DevicesApiHandler devicesApiHandler) {
        deviceManager.mDevicesApiHandler = devicesApiHandler;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DeviceManager deviceManager) {
        injectMDevicesApiHandler(deviceManager, this.mDevicesApiHandlerProvider.get());
    }
}
