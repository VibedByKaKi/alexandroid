package com.amazon.alexa.accessory.repositories.fitness;

import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.repositories.Producer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface FitnessProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleGetFitnessData(byte[] bArr, Producer.Result<FitnessDataSource> result);

        void handleSetFitnessSession(FitnessSession fitnessSession, Producer.Result<CompletableResult.Value> result);

        void handleStartLiveFitnessData(List<Integer> list, Producer.Result<CompletableResult.Value> result);

        void handleStopLiveFitnessData(List<Integer> list, Producer.Result<CompletableResult.Value> result);
    }
}
