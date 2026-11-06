package com.amazon.devicesetup.provisioning.data.device;

import com.amazon.devicesetup.provisioning.ble.ProvisionableEventType;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.GenericHashSetCollection;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisionableEventTypeCollection extends GenericHashSetCollection<ProvisionableEventType> {
    public ProvisionableEventTypeCollection(Map<UUID, Integer> map) {
        for (Map.Entry<UUID, Integer> entry : map.entrySet()) {
            this.values.add(new ProvisionableEventType(entry.getKey(), entry.getValue().intValue()));
        }
    }

    public ProvisionableEventTypeCollection() {
    }
}
