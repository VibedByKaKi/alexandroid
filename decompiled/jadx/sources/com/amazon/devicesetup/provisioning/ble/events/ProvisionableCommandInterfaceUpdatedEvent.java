package com.amazon.devicesetup.provisioning.ble.events;

import com.amazon.devicesetup.provisioning.data.device.UuidCollection;
import com.amazon.whisperjoin.common.sharedtypes.ble.events.ProvisionableEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisionableCommandInterfaceUpdatedEvent extends ProvisionableEvent<UuidCollection> {
    public ProvisionableCommandInterfaceUpdatedEvent(UuidCollection uuidCollection) {
        super(ProvisionableEvents.PROVISIONING_COMMAND_INTERFACE_UPDATED_EVENT_UUID, uuidCollection);
    }
}
