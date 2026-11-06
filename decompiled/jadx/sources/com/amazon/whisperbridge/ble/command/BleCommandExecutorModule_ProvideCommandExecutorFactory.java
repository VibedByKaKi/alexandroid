package com.amazon.whisperbridge.ble.command;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class BleCommandExecutorModule_ProvideCommandExecutorFactory implements Factory<BleCommandExecutor> {
    private final BleCommandExecutorModule module;

    public BleCommandExecutorModule_ProvideCommandExecutorFactory(BleCommandExecutorModule bleCommandExecutorModule) {
        this.module = bleCommandExecutorModule;
    }

    public static BleCommandExecutorModule_ProvideCommandExecutorFactory create(BleCommandExecutorModule bleCommandExecutorModule) {
        return new BleCommandExecutorModule_ProvideCommandExecutorFactory(bleCommandExecutorModule);
    }

    public static BleCommandExecutor provideCommandExecutor(BleCommandExecutorModule bleCommandExecutorModule) {
        return (BleCommandExecutor) Preconditions.checkNotNull(bleCommandExecutorModule.provideCommandExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public BleCommandExecutor get() {
        return provideCommandExecutor(this.module);
    }
}
