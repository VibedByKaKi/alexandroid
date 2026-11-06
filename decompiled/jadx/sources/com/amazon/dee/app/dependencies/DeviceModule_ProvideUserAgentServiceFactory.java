package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.useragent.UserAgentService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeviceModule_ProvideUserAgentServiceFactory implements Factory<UserAgentService> {
    private final DeviceModule module;

    public DeviceModule_ProvideUserAgentServiceFactory(DeviceModule deviceModule) {
        this.module = deviceModule;
    }

    public static DeviceModule_ProvideUserAgentServiceFactory create(DeviceModule deviceModule) {
        return new DeviceModule_ProvideUserAgentServiceFactory(deviceModule);
    }

    public static UserAgentService provideUserAgentService(DeviceModule deviceModule) {
        return (UserAgentService) Preconditions.checkNotNullFromProvides(deviceModule.provideUserAgentService());
    }

    @Override // javax.inject.Provider
    public UserAgentService get() {
        return provideUserAgentService(this.module);
    }
}
