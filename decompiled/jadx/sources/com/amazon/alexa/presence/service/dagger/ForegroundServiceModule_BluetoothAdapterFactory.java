package com.amazon.alexa.presence.service.dagger;

import android.bluetooth.BluetoothAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceModule_BluetoothAdapterFactory implements Factory<BluetoothAdapter> {
    private final ForegroundServiceModule module;

    public ForegroundServiceModule_BluetoothAdapterFactory(ForegroundServiceModule foregroundServiceModule) {
        this.module = foregroundServiceModule;
    }

    public static BluetoothAdapter bluetoothAdapter(ForegroundServiceModule foregroundServiceModule) {
        return (BluetoothAdapter) Preconditions.checkNotNullFromProvides(foregroundServiceModule.bluetoothAdapter());
    }

    public static ForegroundServiceModule_BluetoothAdapterFactory create(ForegroundServiceModule foregroundServiceModule) {
        return new ForegroundServiceModule_BluetoothAdapterFactory(foregroundServiceModule);
    }

    @Override // javax.inject.Provider
    public BluetoothAdapter get() {
        return bluetoothAdapter(this.module);
    }
}
