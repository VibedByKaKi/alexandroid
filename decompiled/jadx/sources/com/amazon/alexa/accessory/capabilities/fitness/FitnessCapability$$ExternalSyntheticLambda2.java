package com.amazon.alexa.accessory.capabilities.fitness;

import com.amazon.alexa.accessory.repositories.fitness.FitnessProvider;
import com.amazon.alexa.accessory.streams.control.ControlStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class FitnessCapability$$ExternalSyntheticLambda2 implements FitnessProvider.OnSuccessListener, FitnessProvider.OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ControlStream f$0;

    public /* synthetic */ FitnessCapability$$ExternalSyntheticLambda2(ControlStream controlStream, int i) {
        this.$r8$classId = i;
        this.f$0 = controlStream;
    }

    @Override // com.amazon.alexa.accessory.repositories.fitness.FitnessProvider.OnFailureListener
    public void onFailure() {
        FitnessCapability.lambda$buildSyncFitnessSessionHandler$3(this.f$0);
    }

    @Override // com.amazon.alexa.accessory.repositories.fitness.FitnessProvider.OnSuccessListener
    public void onSuccess() {
        int i = this.$r8$classId;
        ControlStream controlStream = this.f$0;
        switch (i) {
            case 0:
                FitnessCapability.lambda$buildIncomingStopLiveFitnessDataHandler$7(controlStream);
                break;
            case 1:
                FitnessCapability.lambda$buildLiveFitnessDataHandler$5(controlStream);
                break;
            case 2:
                FitnessCapability.lambda$buildNotifyFitnessDataAvailableHandler$0(controlStream);
                break;
            default:
                FitnessCapability.lambda$buildSyncFitnessSessionHandler$2(controlStream);
                break;
        }
    }
}
