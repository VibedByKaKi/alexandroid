package com.amazon.alexa.accessory.transport.queue;

import com.amazon.alexa.accessory.transport.operations.TransportOperation;
import com.amazon.alexa.accessory.transport.operations.TransportOperationSequence;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface TransportOperationQueue {
    void abort(String str);

    TransportOperation dequeue();

    void enqueue(TransportOperationSequence transportOperationSequence);
}
