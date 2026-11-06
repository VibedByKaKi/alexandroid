package com.amazon.whisperbridge;

import com.amazon.whisperbridge.constants.Command;
import com.amazon.whisperjoin.common.sharedtypes.ble.events.ProvisionableEventNotification;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.RadioNotEnabledException;
import java.io.IOException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface Transport {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DeviceConnectionStateChangedListener {
        void onConnect();

        void onConnectionFailure(int i);

        void onDisconnect();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ProvisionableEventNotificationCallback {
        void onProvisionableEventNotification(ProvisionableEventNotification provisionableEventNotification);
    }

    void close(Object obj);

    Future<Void> connect(Object obj, DeviceConnectionStateChangedListener deviceConnectionStateChangedListener) throws RadioNotEnabledException, IOException;

    Future<Void> onProvisioningComplete(Object obj);

    Future<byte[]> sendCommand(Object obj, Command command, byte[] bArr) throws RadioNotEnabledException, IOException;

    void setProvisionableEventNotificationCallback(Object obj, ProvisionableEventNotificationCallback provisionableEventNotificationCallback) throws IOException;

    Future<ProvisioningStatus> startProvisioning(Object obj) throws RadioNotEnabledException, IOException;
}
