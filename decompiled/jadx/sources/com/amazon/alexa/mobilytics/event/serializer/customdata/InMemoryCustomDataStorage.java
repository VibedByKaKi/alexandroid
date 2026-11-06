package com.amazon.alexa.mobilytics.event.serializer.customdata;

import com.fasterxml.jackson.databind.node.ObjectNode;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class InMemoryCustomDataStorage implements CustomDataStorage {
    private volatile ObjectNode customDataObjectNode;
    private final Object lock = new Object();

    @Override // com.amazon.alexa.mobilytics.event.serializer.customdata.CustomDataStorage
    public ObjectNode read() {
        ObjectNode objectNode;
        synchronized (this.lock) {
            objectNode = this.customDataObjectNode;
        }
        return objectNode;
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.customdata.CustomDataStorage
    public void write(ObjectNode objectNode) {
        synchronized (this.lock) {
            this.customDataObjectNode = objectNode;
        }
    }
}
