package com.amazon.alexa.sharing.util;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class DeviceInfoUtil_Factory implements Factory<DeviceInfoUtil> {
    private final Provider<Context> contextProvider;

    public DeviceInfoUtil_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static DeviceInfoUtil_Factory create(Provider<Context> provider) {
        return new DeviceInfoUtil_Factory(provider);
    }

    public static DeviceInfoUtil newInstance(Context context) {
        return new DeviceInfoUtil(context);
    }

    @Override // javax.inject.Provider
    public DeviceInfoUtil get() {
        return newInstance(this.contextProvider.get());
    }
}
