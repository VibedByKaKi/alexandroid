package com.amazon.alexa.accessory.repositories.cloudpairing;

import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.protocol.Cloudpairing;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface CloudPairingProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetCloudPairingAttributes(Producer.Result<Cloudpairing.CloudPairingAttributes> result);

        void handleGetCloudPairingStatus(Cloudpairing.Seed seed, Producer.Result<Cloudpairing.CloudPairingStatus> result);

        void handleRemoveCloudPairingKeys(Cloudpairing.Seed seed, Producer.Result<CompletableResult.Value> result);

        void handleReplaceCloudPairingKeys(Cloudpairing.Seed seed, Cloudpairing.CloudPairingKeys cloudPairingKeys, Producer.Result<CompletableResult.Value> result);

        void handleSetCloudPairingKeys(Cloudpairing.CloudPairingKeys cloudPairingKeys, Producer.Result<CompletableResult.Value> result);
    }
}
