package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning.ProvisioningFailure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisioningDoneFailureEvent extends ProvisionableEvent<ProvisioningFailure> {
    public ProvisioningDoneFailureEvent(ProvisioningFailure provisioningFailure) {
        super(ProvisionableEvents.PROVISIONING_DONE_FAILURE_EVENT_UUID, provisioningFailure);
    }
}
