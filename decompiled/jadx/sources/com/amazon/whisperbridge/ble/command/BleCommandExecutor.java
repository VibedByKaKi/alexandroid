package com.amazon.whisperbridge.ble.command;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BleCommandExecutor {
    private final ExecutorService mCommandExecutor = Executors.newSingleThreadExecutor();

    public <T> Future<T> executeCommand(BleCommand<T> bleCommand) {
        return this.mCommandExecutor.submit(bleCommand);
    }
}
