package com.amazon.whisperbridge.ble.command;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class BleCommandExecutorModule {
    private static BleCommandExecutor sCommandExecutor;

    public static void setComponent(BleCommandExecutor bleCommandExecutor) {
        if (bleCommandExecutor != null) {
            sCommandExecutor = bleCommandExecutor;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("BleCommandExecutor cannot be null");
        }
    }

    @Provides
    @Singleton
    public BleCommandExecutor provideCommandExecutor() {
        if (sCommandExecutor == null) {
            sCommandExecutor = new BleCommandExecutor();
        }
        return sCommandExecutor;
    }
}
