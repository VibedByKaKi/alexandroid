package com.amazon.alexa.accessory.repositories.ambient;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryAmbientContextRepository$$ExternalSyntheticLambda3 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryAmbientContextRepository f$0;

    public /* synthetic */ MemoryAmbientContextRepository$$ExternalSyntheticLambda3(MemoryAmbientContextRepository memoryAmbientContextRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryAmbientContextRepository;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        int i = this.$r8$classId;
        MemoryAmbientContextRepository memoryAmbientContextRepository = this.f$0;
        switch (i) {
            case 0:
                memoryAmbientContextRepository.lambda$getSupportedSignals$4(result);
                break;
            default:
                memoryAmbientContextRepository.lambda$getSubscribedSignals$3(result);
                break;
        }
    }
}
