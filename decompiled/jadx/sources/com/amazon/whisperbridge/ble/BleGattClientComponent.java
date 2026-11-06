package com.amazon.whisperbridge.ble;

import com.amazon.whisperbridge.ble.command.BleCommandExecutorModule;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {BleCommandExecutorModule.class})
@Singleton
/* loaded from: classes19.dex */
public interface BleGattClientComponent {
    void inject(BleGattClient bleGattClient);
}
