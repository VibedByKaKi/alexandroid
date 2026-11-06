package com.amazon.alexa.accessory.transport.codecs;

import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.transport.TransportData;
import com.amazon.alexa.accessory.transport.TransportTransaction;
import com.amazon.alexa.accessory.transport.operations.TransportOperationSequence;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface TransportCodec {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        TransportCodec create(AccessoryTransport accessoryTransport) throws IOException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OperationSequenceEncoder {
        void encoded(TransportOperationSequence transportOperationSequence) throws IOException;
    }

    TransportData decode(OperationSequenceEncoder operationSequenceEncoder) throws IOException;

    TransportOperationSequence encode(TransportTransaction transportTransaction) throws IOException;
}
