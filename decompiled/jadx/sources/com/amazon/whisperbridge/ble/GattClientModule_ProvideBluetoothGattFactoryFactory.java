package com.amazon.whisperbridge.ble;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class GattClientModule_ProvideBluetoothGattFactoryFactory implements Factory<BluetoothGattFactory> {
    private final GattClientModule module;

    public GattClientModule_ProvideBluetoothGattFactoryFactory(GattClientModule gattClientModule) {
        this.module = gattClientModule;
    }

    public static GattClientModule_ProvideBluetoothGattFactoryFactory create(GattClientModule gattClientModule) {
        return new GattClientModule_ProvideBluetoothGattFactoryFactory(gattClientModule);
    }

    public static BluetoothGattFactory provideBluetoothGattFactory(GattClientModule gattClientModule) {
        return (BluetoothGattFactory) Preconditions.checkNotNull(gattClientModule.provideBluetoothGattFactory(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public BluetoothGattFactory get() {
        return provideBluetoothGattFactory(this.module);
    }
}
