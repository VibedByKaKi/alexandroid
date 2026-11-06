package com.amazon.whisperbridge.ble;

import com.amazon.whisperbridge.ble.command.BleCommandExecutor;
import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class BleGattClient_MembersInjector implements MembersInjector<BleGattClient> {
    private final Provider<BleCommandExecutor> mClientCommandExecutorProvider;

    public BleGattClient_MembersInjector(Provider<BleCommandExecutor> provider) {
        this.mClientCommandExecutorProvider = provider;
    }

    public static MembersInjector<BleGattClient> create(Provider<BleCommandExecutor> provider) {
        return new BleGattClient_MembersInjector(provider);
    }

    public static void injectMClientCommandExecutor(BleGattClient bleGattClient, BleCommandExecutor bleCommandExecutor) {
        bleGattClient.mClientCommandExecutor = bleCommandExecutor;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BleGattClient bleGattClient) {
        injectMClientCommandExecutor(bleGattClient, this.mClientCommandExecutorProvider.get());
    }
}
