package com.amazon.alexa.handsfree.notification.utils;

import android.content.Context;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SupportedLocales_Factory implements Factory<SupportedLocales> {
    private final Provider<Context> contextProvider;
    private final Provider<DeviceTypeInformationProvider> deviceTypeInformationProvider;

    public SupportedLocales_Factory(Provider<Context> provider, Provider<DeviceTypeInformationProvider> provider2) {
        this.contextProvider = provider;
        this.deviceTypeInformationProvider = provider2;
    }

    public static SupportedLocales_Factory create(Provider<Context> provider, Provider<DeviceTypeInformationProvider> provider2) {
        return new SupportedLocales_Factory(provider, provider2);
    }

    public static SupportedLocales newInstance(Context context, DeviceTypeInformationProvider deviceTypeInformationProvider) {
        return new SupportedLocales(context, deviceTypeInformationProvider);
    }

    @Override // javax.inject.Provider
    public SupportedLocales get() {
        return newInstance(this.contextProvider.get(), this.deviceTypeInformationProvider.get());
    }
}
