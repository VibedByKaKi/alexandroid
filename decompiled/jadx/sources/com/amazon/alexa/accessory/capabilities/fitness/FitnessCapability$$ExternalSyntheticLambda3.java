package com.amazon.alexa.accessory.capabilities.fitness;

import com.amazon.alexa.accessory.capabilities.fitness.GetFitnessDataTask;
import com.amazon.alexa.accessory.capabilities.fitness.SetFitnessSessionTask;
import com.amazon.alexa.accessory.streams.fitness.FitnessStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FitnessCapability$$ExternalSyntheticLambda3 implements GetFitnessDataTask.Callback, SetFitnessSessionTask.Callback, FitnessStream.Callback {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FitnessCapability$$ExternalSyntheticLambda3(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.accessory.streams.fitness.FitnessStream.Callback
    public void onComplete() {
        ((GetFitnessDataTask) this.f$0).lambda$extractFitnessDataSource$1();
    }

    @Override // com.amazon.alexa.accessory.capabilities.fitness.GetFitnessDataTask.Callback
    public void onDisposed(GetFitnessDataTask getFitnessDataTask) {
        ((FitnessCapability) this.f$0).lambda$handleGetFitnessData$9(getFitnessDataTask);
    }

    @Override // com.amazon.alexa.accessory.capabilities.fitness.SetFitnessSessionTask.Callback
    public void onDisposed(SetFitnessSessionTask setFitnessSessionTask) {
        ((FitnessCapability) this.f$0).lambda$handleSetFitnessSession$10(setFitnessSessionTask);
    }
}
