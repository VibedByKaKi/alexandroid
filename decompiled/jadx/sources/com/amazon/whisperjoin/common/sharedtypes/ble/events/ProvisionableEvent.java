package com.amazon.whisperjoin.common.sharedtypes.ble.events;

import com.google.common.base.Objects;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisionableEvent<T> {
    private final T eventData;
    private final UUID uuid;

    public ProvisionableEvent(UUID uuid, T t) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            throw null;
        }
        this.uuid = uuid;
        this.eventData = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProvisionableEvent provisionableEvent = (ProvisionableEvent) obj;
            if (Objects.equal(this.uuid, provisionableEvent.uuid) && Objects.equal(this.eventData, provisionableEvent.eventData)) {
                return true;
            }
        }
        return false;
    }

    public T getEventData() {
        return this.eventData;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Objects.hashCode(this.uuid, this.eventData);
    }
}
