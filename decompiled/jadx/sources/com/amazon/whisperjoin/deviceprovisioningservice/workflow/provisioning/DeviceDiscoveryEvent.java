package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning;

import com.amazon.whisperjoin.common.sharedtypes.devices.AbstractPeripheralDeviceDetails;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceDiscoveryEvent extends Event<AbstractPeripheralDeviceDetails> {
    private DeviceDiscoveryEvent(AbstractPeripheralDeviceDetails abstractPeripheralDeviceDetails, Event.State state, Throwable th) {
        super(abstractPeripheralDeviceDetails, state, th);
    }

    public static DeviceDiscoveryEvent error(Throwable th) {
        return new DeviceDiscoveryEvent(null, Event.State.ERROR, th);
    }

    public static DeviceDiscoveryEvent idle() {
        return new DeviceDiscoveryEvent(null, Event.State.IDLE, null);
    }

    public static DeviceDiscoveryEvent inProgress() {
        return new DeviceDiscoveryEvent(null, Event.State.IN_PROGRESS, null);
    }

    public static DeviceDiscoveryEvent success(AbstractPeripheralDeviceDetails abstractPeripheralDeviceDetails) {
        return new DeviceDiscoveryEvent(abstractPeripheralDeviceDetails, Event.State.SUCCESS, null);
    }

    public static DeviceDiscoveryEvent update(AbstractPeripheralDeviceDetails abstractPeripheralDeviceDetails) {
        return new DeviceDiscoveryEvent(abstractPeripheralDeviceDetails, Event.State.UPDATE, null);
    }
}
