package com.amazon.alexa.presence.service.dagger;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceModule_BluetoothManagerFactory implements Factory<BluetoothManager> {
    private final Provider<Context> applicationContextProvider;
    private final ForegroundServiceModule module;

    public ForegroundServiceModule_BluetoothManagerFactory(ForegroundServiceModule foregroundServiceModule, Provider<Context> provider) {
        this.module = foregroundServiceModule;
        this.applicationContextProvider = provider;
    }

    public static BluetoothManager bluetoothManager(ForegroundServiceModule foregroundServiceModule, Context context) {
        return (BluetoothManager) Preconditions.checkNotNullFromProvides(foregroundServiceModule.bluetoothManager(context));
    }

    public static ForegroundServiceModule_BluetoothManagerFactory create(ForegroundServiceModule foregroundServiceModule, Provider<Context> provider) {
        return new ForegroundServiceModule_BluetoothManagerFactory(foregroundServiceModule, provider);
    }

    @Override // javax.inject.Provider
    public BluetoothManager get() {
        return bluetoothManager(this.module, this.applicationContextProvider.get());
    }
}
