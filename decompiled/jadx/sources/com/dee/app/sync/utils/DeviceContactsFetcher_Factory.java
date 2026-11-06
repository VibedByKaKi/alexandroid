package com.dee.app.sync.utils;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class DeviceContactsFetcher_Factory implements Factory<DeviceContactsFetcher> {
    private final Provider<Context> mContextProvider;
    private final Provider<String> mDeviceIdProvider;

    public DeviceContactsFetcher_Factory(Provider<Context> provider, Provider<String> provider2) {
        this.mContextProvider = provider;
        this.mDeviceIdProvider = provider2;
    }

    public static DeviceContactsFetcher_Factory create(Provider<Context> provider, Provider<String> provider2) {
        return new DeviceContactsFetcher_Factory(provider, provider2);
    }

    public static DeviceContactsFetcher newInstance(Context context, String str) {
        return new DeviceContactsFetcher(context, str);
    }

    @Override // javax.inject.Provider
    public DeviceContactsFetcher get() {
        return newInstance(this.mContextProvider.get(), this.mDeviceIdProvider.get());
    }
}
