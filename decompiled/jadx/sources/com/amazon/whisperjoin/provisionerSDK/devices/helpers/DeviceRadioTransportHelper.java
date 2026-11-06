package com.amazon.whisperjoin.provisionerSDK.devices.helpers;

import com.amazon.whisperbridge.ProvisioningStatus;
import com.amazon.whisperbridge.Transport;
import com.amazon.whisperjoin.common.sharedtypes.devices.DiscoveredRadio;
import com.amazon.whisperjoin.provisionerSDK.devices.DeviceCommandExecutor;
import com.amazon.whisperjoin.provisionerSDK.devices.handlers.DeviceConnectionStateEventHandler;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface DeviceRadioTransportHelper {
    void closeConnection();

    DeviceCommandExecutor getCommandExecutor();

    DiscoveredRadio getSelectedRadio();

    boolean isConnected();

    Future<Void> onProvisioningComplete();

    Future<Void> openConnection(DeviceConnectionStateEventHandler deviceConnectionStateEventHandler) throws Exception;

    void setEventNotificationCallback(Transport.ProvisionableEventNotificationCallback provisionableEventNotificationCallback) throws Exception;

    Future<ProvisioningStatus> startProvisioning() throws Exception;
}
