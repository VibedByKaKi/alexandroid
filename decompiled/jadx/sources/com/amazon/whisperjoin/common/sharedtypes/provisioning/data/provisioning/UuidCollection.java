package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.provisioning;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.GenericHashSetCollection;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.ValidatableUuid;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UuidCollection extends GenericHashSetCollection<ValidatableUuid> {
    public UuidCollection(Collection<UUID> collection) {
        Iterator<UUID> it2 = collection.iterator();
        while (it2.hasNext()) {
            this.values.add(new ValidatableUuid(it2.next()));
        }
    }

    public UuidCollection() {
    }
}
