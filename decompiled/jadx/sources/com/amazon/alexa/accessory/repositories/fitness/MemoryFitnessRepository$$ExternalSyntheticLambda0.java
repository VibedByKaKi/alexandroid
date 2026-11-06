package com.amazon.alexa.accessory.repositories.fitness;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryFitnessRepository$$ExternalSyntheticLambda0 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryFitnessRepository f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ MemoryFitnessRepository$$ExternalSyntheticLambda0(MemoryFitnessRepository memoryFitnessRepository, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryFitnessRepository;
        this.f$1 = list;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$stopLiveFitnessData$4(this.f$1, result);
                break;
            default:
                this.f$0.lambda$startLiveFitnessData$3(this.f$1, result);
                break;
        }
    }
}
