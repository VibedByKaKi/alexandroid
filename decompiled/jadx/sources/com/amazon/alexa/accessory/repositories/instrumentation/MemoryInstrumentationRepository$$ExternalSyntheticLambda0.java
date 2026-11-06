package com.amazon.alexa.accessory.repositories.instrumentation;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryInstrumentationRepository$$ExternalSyntheticLambda0 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryInstrumentationRepository f$0;

    public /* synthetic */ MemoryInstrumentationRepository$$ExternalSyntheticLambda0(MemoryInstrumentationRepository memoryInstrumentationRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryInstrumentationRepository;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        int i = this.$r8$classId;
        MemoryInstrumentationRepository memoryInstrumentationRepository = this.f$0;
        switch (i) {
            case 0:
                memoryInstrumentationRepository.lambda$issueRemoteRestart$1(result);
                break;
            case 1:
                memoryInstrumentationRepository.lambda$issueRemoteClearPairing$3(result);
                break;
            default:
                memoryInstrumentationRepository.lambda$issueRemoteReset$2(result);
                break;
        }
    }
}
