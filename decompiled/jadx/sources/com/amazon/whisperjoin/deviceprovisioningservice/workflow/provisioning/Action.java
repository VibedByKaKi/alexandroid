package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning;

import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration.DeviceConnectionConfiguration;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.DeviceNetworkDebugTunnelRequest;
import com.amazon.whisperjoin.deviceprovisioningservice.device.WJProvisionee;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.CustomCommandRequest;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.GetProvisioningDetailsOptions;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ProvisionableConfiguration;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WJWorkflowStateStore;
import com.google.common.base.MoreObjects;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Action<T> {
    private T mData;
    private WJProvisionee mWJProvisionee;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BlessDiscoveredDevice extends Action<WhisperJoinPeripheralDeviceDetails> {
        public BlessDiscoveredDevice(WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails) {
            super(whisperJoinPeripheralDeviceDetails);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ConnectToDevice extends Action<DeviceConnectionConfiguration> {
        public ConnectToDevice(WJProvisionee wJProvisionee, DeviceConnectionConfiguration deviceConnectionConfiguration) {
            super(wJProvisionee, deviceConnectionConfiguration, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeviceNetworkDebugTunnel extends Action<DeviceNetworkDebugTunnelRequest> {
        public DeviceNetworkDebugTunnel(WJProvisionee wJProvisionee, DeviceNetworkDebugTunnelRequest deviceNetworkDebugTunnelRequest) {
            super(wJProvisionee, deviceNetworkDebugTunnelRequest, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Disconnect extends Action {
        public Disconnect(WJProvisionee wJProvisionee) {
            super(wJProvisionee, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetProvisioningDetails extends Action<GetProvisioningDetailsOptions> {
        public GetProvisioningDetails(WJProvisionee wJProvisionee, GetProvisioningDetailsOptions getProvisioningDetailsOptions) {
            super(wJProvisionee, getProvisioningDetailsOptions, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProvisionDevice extends Action<ProvisionableConfiguration> {
        public ProvisionDevice(WJProvisionee wJProvisionee, ProvisionableConfiguration provisionableConfiguration) {
            super(wJProvisionee, provisionableConfiguration, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SendCustomCommand extends Action<CustomCommandRequest> {
        public SendCustomCommand(WJProvisionee wJProvisionee, CustomCommandRequest customCommandRequest) {
            super(wJProvisionee, customCommandRequest, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StartDiscovery extends Action {
        public StartDiscovery() {
            super(0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StopDiscovery extends Action {
        public StopDiscovery() {
            super(0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TerminateSetup extends Action<WJWorkflowStateStore> {
        public TerminateSetup(WJWorkflowStateStore wJWorkflowStateStore) {
            super(null, wJWorkflowStateStore, 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VerifyProvisioning extends Action<ProvisionableConfiguration> {
        public VerifyProvisioning(WJProvisionee wJProvisionee, ProvisionableConfiguration provisionableConfiguration) {
            super(wJProvisionee, provisionableConfiguration, 0);
        }
    }

    private Action(WJProvisionee wJProvisionee, T t) {
        this.mWJProvisionee = wJProvisionee;
        this.mData = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Action action = (Action) obj;
        return new EqualsBuilder().append(this.mWJProvisionee, action.mWJProvisionee).append(this.mData, action.mData).isEquals();
    }

    public T getData() {
        return this.mData;
    }

    public WJProvisionee getWJProvisionee() {
        return this.mWJProvisionee;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mWJProvisionee).append(this.mData).toHashCode();
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("Action Type", getClass().getSimpleName()).add("mWJProvisionee", this.mWJProvisionee).add("mData", this.mData).toString();
    }

    public /* synthetic */ Action(WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails) {
        this(whisperJoinPeripheralDeviceDetails);
    }

    public /* synthetic */ Action(WJProvisionee wJProvisionee, int i) {
        this(wJProvisionee);
    }

    public /* synthetic */ Action(WJProvisionee wJProvisionee, Object obj, int i) {
        this(wJProvisionee, obj);
    }

    private Action() {
        this((WJProvisionee) null, (Object) null);
    }

    private Action(T t) {
        this((WJProvisionee) null, t);
    }

    private Action(WJProvisionee wJProvisionee) {
        this(wJProvisionee, (Object) null);
    }

    public /* synthetic */ Action(int i) {
        this();
    }
}
