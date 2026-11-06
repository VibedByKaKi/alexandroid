package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.Action;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.operation.DeviceOperation;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceActionsExecutorBuilder {
    private DeviceOperation<Action.BlessDiscoveredDevice> mBlessDiscoveredDeviceDeviceOperation;
    private DeviceOperation<Action.ConnectToDevice> mConnectToDeviceDeviceOperation;
    private DeviceOperation<Action.DeviceNetworkDebugTunnel> mDeviceNetworkDebugTunnelOperation;
    private DeviceOperation<Action.Disconnect> mDisconnectFromDeviceOperation;
    private DeviceOperation<Action.GetProvisioningDetails> mGetProvisioningDetailsDeviceOperation;
    private DeviceOperation<Action.ProvisionDevice> mProvisionDeviceOperation;
    private DeviceOperation<Action.SendCustomCommand> mSendCustomCommandOperation;
    private DeviceOperation<Action.StartDiscovery> mStartDiscoveryOperation;
    private DeviceOperation<Action.StopDiscovery> mStopDiscoveryOperation;
    private DeviceOperation<Action.TerminateSetup> mTerminateSetupDeviceOperation;
    private DeviceOperation<Action.VerifyProvisioning> mVerifyProvisioningOperation;

    public DeviceActionsExecutor createDeviceActionsExecutor() {
        DeviceOperation<Action.StartDiscovery> deviceOperation = this.mStartDiscoveryOperation;
        if (deviceOperation == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mStartDiscoveryOperation can't be null");
            return null;
        }
        DeviceOperation<Action.StopDiscovery> deviceOperation2 = this.mStopDiscoveryOperation;
        if (deviceOperation2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mStopDiscoveryOperation can't be null");
            return null;
        }
        DeviceOperation<Action.BlessDiscoveredDevice> deviceOperation3 = this.mBlessDiscoveredDeviceDeviceOperation;
        if (deviceOperation3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mBlessDiscoveredDeviceOperation can't be null");
            return null;
        }
        DeviceOperation<Action.ConnectToDevice> deviceOperation4 = this.mConnectToDeviceDeviceOperation;
        if (deviceOperation4 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mConnectToDeviceDeviceOperation can't be null");
            return null;
        }
        DeviceOperation<Action.Disconnect> deviceOperation5 = this.mDisconnectFromDeviceOperation;
        if (deviceOperation5 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mDisconnectFromDeviceOperation can't be null");
            return null;
        }
        DeviceOperation<Action.GetProvisioningDetails> deviceOperation6 = this.mGetProvisioningDetailsDeviceOperation;
        if (deviceOperation6 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mGetProvisioningDetailsDeviceOperation can't be null");
            return null;
        }
        DeviceOperation<Action.ProvisionDevice> deviceOperation7 = this.mProvisionDeviceOperation;
        if (deviceOperation7 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mProvisionDeviceOperation can't be null");
            return null;
        }
        DeviceOperation<Action.VerifyProvisioning> deviceOperation8 = this.mVerifyProvisioningOperation;
        if (deviceOperation8 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mVerifyProvisioningOperation can't be null");
            return null;
        }
        DeviceOperation<Action.TerminateSetup> deviceOperation9 = this.mTerminateSetupDeviceOperation;
        if (deviceOperation9 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mTerminateSetupDeviceOperation can't be null");
            return null;
        }
        DeviceOperation<Action.DeviceNetworkDebugTunnel> deviceOperation10 = this.mDeviceNetworkDebugTunnelOperation;
        if (deviceOperation10 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mDeviceNetworkDebugTunnelOperation can't be null");
            return null;
        }
        DeviceOperation<Action.SendCustomCommand> deviceOperation11 = this.mSendCustomCommandOperation;
        if (deviceOperation11 != null) {
            return new DeviceActionsExecutor(deviceOperation, deviceOperation2, deviceOperation3, deviceOperation4, deviceOperation6, deviceOperation7, deviceOperation8, deviceOperation9, deviceOperation5, deviceOperation10, deviceOperation11);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("mSendCustomCommandOperation can't be null");
        return null;
    }

    public DeviceActionsExecutorBuilder setBlessDiscoveredDeviceOperation(DeviceOperation<Action.BlessDiscoveredDevice> deviceOperation) {
        this.mBlessDiscoveredDeviceDeviceOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setConnectToDeviceDeviceOperation(DeviceOperation<Action.ConnectToDevice> deviceOperation) {
        this.mConnectToDeviceDeviceOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setDeviceNetworkDebugTunnelOperation(DeviceOperation<Action.DeviceNetworkDebugTunnel> deviceOperation) {
        this.mDeviceNetworkDebugTunnelOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setDisconnectFromDeviceOperation(DeviceOperation<Action.Disconnect> deviceOperation) {
        this.mDisconnectFromDeviceOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setGetProvisioningDetailsOperation(DeviceOperation<Action.GetProvisioningDetails> deviceOperation) {
        this.mGetProvisioningDetailsDeviceOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setProvisionDeviceOperation(DeviceOperation<Action.ProvisionDevice> deviceOperation) {
        this.mProvisionDeviceOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setSendCustomCommandOperation(DeviceOperation<Action.SendCustomCommand> deviceOperation) {
        this.mSendCustomCommandOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setStartDiscoveryOperation(DeviceOperation<Action.StartDiscovery> deviceOperation) {
        this.mStartDiscoveryOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setStopDiscoveryOperation(DeviceOperation<Action.StopDiscovery> deviceOperation) {
        this.mStopDiscoveryOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setTerminateSetupDeviceOperation(DeviceOperation<Action.TerminateSetup> deviceOperation) {
        this.mTerminateSetupDeviceOperation = deviceOperation;
        return this;
    }

    public DeviceActionsExecutorBuilder setVerifyProvisioningOperation(DeviceOperation<Action.VerifyProvisioning> deviceOperation) {
        this.mVerifyProvisioningOperation = deviceOperation;
        return this;
    }
}
