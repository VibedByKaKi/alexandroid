package com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.accumulator;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.result.WJResult;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WJWorkflowStateStore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class AbstractDeviceEventAccumulator<R> implements Accumulator<WJResult, R> {
    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.accumulator.Accumulator
    public R accumulate(WJResult wJResult, WJWorkflowStateStore wJWorkflowStateStore) {
        if (wJResult.isA(WJResult.Discovery.class)) {
            return handleDiscoveryEvent(wJWorkflowStateStore, (WJResult.Discovery) wJResult);
        }
        if (wJResult.isA(WJResult.Connection.class)) {
            return handleConnectionEvent(wJWorkflowStateStore, (WJResult.Connection) wJResult);
        }
        if (wJResult.isA(WJResult.Disconnection.class)) {
            return handleDisconnectionEvent(wJWorkflowStateStore, (WJResult.Disconnection) wJResult);
        }
        if (wJResult.isA(WJResult.GetProvisioningDetails.class)) {
            return handleGetProvisioningDetails(wJWorkflowStateStore, (WJResult.GetProvisioningDetails) wJResult);
        }
        if (wJResult.isA(WJResult.ProvisionDevice.class)) {
            return handleProvisionDeviceEvent(wJWorkflowStateStore, (WJResult.ProvisionDevice) wJResult);
        }
        if (wJResult.isA(WJResult.VerifyProvisioning.class)) {
            return handleVerifyProvisioningEvent(wJWorkflowStateStore, (WJResult.VerifyProvisioning) wJResult);
        }
        if (wJResult.isA(WJResult.WorkflowIdle.class)) {
            return handleWorkflowIdle(wJWorkflowStateStore, (WJResult.WorkflowIdle) wJResult);
        }
        if (wJResult.isA(WJResult.DeviceNetworkDebugTunnel.class)) {
            return handleDeviceNetworkDebugTunnel(wJWorkflowStateStore, (WJResult.DeviceNetworkDebugTunnel) wJResult);
        }
        if (wJResult.isA(WJResult.SendCustomCommand.class)) {
            return handleSendCustomCommand(wJWorkflowStateStore, (WJResult.SendCustomCommand) wJResult);
        }
        throw new RuntimeException("Unhandled Device WJResult " + wJResult.toString());
    }

    public abstract R handleConnectionEvent(WJWorkflowStateStore wJWorkflowStateStore, WJResult.Connection connection);

    public abstract R handleDeviceNetworkDebugTunnel(WJWorkflowStateStore wJWorkflowStateStore, WJResult.DeviceNetworkDebugTunnel deviceNetworkDebugTunnel);

    public abstract R handleDisconnectionEvent(WJWorkflowStateStore wJWorkflowStateStore, WJResult.Disconnection disconnection);

    public abstract R handleDiscoveryEvent(WJWorkflowStateStore wJWorkflowStateStore, WJResult.Discovery discovery);

    public abstract R handleGetProvisioningDetails(WJWorkflowStateStore wJWorkflowStateStore, WJResult.GetProvisioningDetails getProvisioningDetails);

    public abstract R handleProvisionDeviceEvent(WJWorkflowStateStore wJWorkflowStateStore, WJResult.ProvisionDevice provisionDevice);

    public abstract R handleSendCustomCommand(WJWorkflowStateStore wJWorkflowStateStore, WJResult.SendCustomCommand sendCustomCommand);

    public abstract R handleVerifyProvisioningEvent(WJWorkflowStateStore wJWorkflowStateStore, WJResult.VerifyProvisioning verifyProvisioning);

    public abstract R handleWorkflowIdle(WJWorkflowStateStore wJWorkflowStateStore, WJResult.WorkflowIdle workflowIdle);
}
