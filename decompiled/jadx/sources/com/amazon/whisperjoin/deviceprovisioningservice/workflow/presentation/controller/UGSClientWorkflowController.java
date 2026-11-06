package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.controller;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.DeviceNetworkDebugTunnelRequest;
import com.amazon.whisperjoin.deviceprovisioningservice.device.DiscoveredDevice;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ClientProvisioningDataModel;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.CustomCommandRequest;
import com.google.common.base.Function;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UGSClientWorkflowController {
    private final Function<DiscoveredDevice, Void> mConnectToDevice;
    private final Function<DeviceNetworkDebugTunnelRequest, Void> mDeviceNetworkDebugTunnel;
    private final Function<Void, Void> mDiscoverDevices;
    private final Function<Void, Void> mRefreshAvailableNetworks;
    private final Function<CustomCommandRequest, Void> mSendCustomCommand;
    private final Function<ClientProvisioningDataModel, Void> mSendProvisioningData;
    private final Function<Void, Void> mTerminateSetup;

    public UGSClientWorkflowController(Function<Void, Void> function, Function<DiscoveredDevice, Void> function2, Function<ClientProvisioningDataModel, Void> function3, Function<Void, Void> function4, Function<Void, Void> function5, Function<DeviceNetworkDebugTunnelRequest, Void> function6, Function<CustomCommandRequest, Void> function7) {
        this.mDiscoverDevices = function;
        this.mConnectToDevice = function2;
        this.mSendProvisioningData = function3;
        this.mRefreshAvailableNetworks = function4;
        this.mDeviceNetworkDebugTunnel = function6;
        this.mSendCustomCommand = function7;
        if (function5 != null) {
            this.mTerminateSetup = function5;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Terminate Setup can not be null");
            throw null;
        }
    }

    public void chooseDevice(DiscoveredDevice discoveredDevice) {
        Function<DiscoveredDevice, Void> function = this.mConnectToDevice;
        if (function != null) {
            function.apply(discoveredDevice);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("ConnectToDevice to Device is not supported in this state");
        }
    }

    public void deviceNetworkDebugTunnel(DeviceNetworkDebugTunnelRequest deviceNetworkDebugTunnelRequest) {
        Function<DeviceNetworkDebugTunnelRequest, Void> function = this.mDeviceNetworkDebugTunnel;
        if (function != null) {
            function.apply(deviceNetworkDebugTunnelRequest);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Device Network Debug Tunnel is not supported in this state");
        }
    }

    public void discoverDevices() {
        Function<Void, Void> function = this.mDiscoverDevices;
        if (function != null) {
            function.apply(null);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Discover Devices is not supported in this state");
        }
    }

    public void refreshAvailableNetworks() {
        Function<Void, Void> function = this.mRefreshAvailableNetworks;
        if (function != null) {
            function.apply(null);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Refresh Available Networks is not supported in this state");
        }
    }

    public void sendCustomCommand(CustomCommandRequest customCommandRequest) {
        Function<CustomCommandRequest, Void> function = this.mSendCustomCommand;
        if (function != null) {
            function.apply(customCommandRequest);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Send Custom Command is not supported in this state");
        }
    }

    public void sendProvisioningData(ClientProvisioningDataModel clientProvisioningDataModel) {
        Function<ClientProvisioningDataModel, Void> function = this.mSendProvisioningData;
        if (function != null) {
            function.apply(clientProvisioningDataModel);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Send Provisioning Data is not supported in this state");
        }
    }

    public void terminateSetup() {
        this.mTerminateSetup.apply(null);
    }
}
