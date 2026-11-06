package com.amazon.alexa.accessory.transport.operations;

import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.transport.TransportPriority;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class FlushTransportOperation implements TransportOperation {
    private final String key;
    private final TransportPriority priority;
    private final AccessoryTransport transport;

    public FlushTransportOperation(String str, AccessoryTransport accessoryTransport, TransportPriority transportPriority) {
        Preconditions.notNull(str, "key");
        Preconditions.notNull(accessoryTransport, "transport");
        Preconditions.notNull(transportPriority, "priority");
        this.key = str;
        this.transport = accessoryTransport;
        this.priority = transportPriority;
    }

    @Override // com.amazon.alexa.accessory.transport.operations.TransportOperation
    public void execute() throws IOException {
        this.transport.sink().flush();
    }

    @Override // com.amazon.alexa.accessory.transport.operations.TransportOperation
    public String getKey() {
        return this.key;
    }

    @Override // com.amazon.alexa.accessory.transport.operations.TransportOperation
    public TransportPriority getPriority() {
        return this.priority;
    }
}
