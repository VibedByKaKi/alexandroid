package com.amazon.whisperbridge.ble;

import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class BleGattClientFactory_MembersInjector implements MembersInjector<BleGattClientFactory> {
    private final Provider<BluetoothGattFactory> mBluetoothGattFactoryProvider;

    public BleGattClientFactory_MembersInjector(Provider<BluetoothGattFactory> provider) {
        this.mBluetoothGattFactoryProvider = provider;
    }

    public static MembersInjector<BleGattClientFactory> create(Provider<BluetoothGattFactory> provider) {
        return new BleGattClientFactory_MembersInjector(provider);
    }

    public static void injectMBluetoothGattFactory(BleGattClientFactory bleGattClientFactory, BluetoothGattFactory bluetoothGattFactory) {
        bleGattClientFactory.mBluetoothGattFactory = bluetoothGattFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BleGattClientFactory bleGattClientFactory) {
        injectMBluetoothGattFactory(bleGattClientFactory, this.mBluetoothGattFactoryProvider.get());
    }
}
